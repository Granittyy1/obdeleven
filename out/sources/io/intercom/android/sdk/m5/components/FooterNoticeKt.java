package io.intercom.android.sdk.m5.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: FooterNotice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNoticeKt {
    private static final float HandoverPillBottomPadding = 10;

    public static final void ExpandedFooterNotice(androidx.compose.ui.h hVar, final String title, final String subtitle, final List<AvatarWrapper> avatars, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(subtitle, "subtitle");
        kotlin.jvm.internal.i.e(avatars, "avatars");
        C1086g c1086gP = interfaceC1084f.p(-1076553086);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        FooterTitle(title, avatars, c1086gP, ((i10 >> 3) & 14) | 64);
        c1086gP.L(2043466329);
        if (subtitle.length() > 0) {
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 8));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            TextKt.b(subtitle, null, intercomTheme.getColors(c1086gP, i14).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i14).getType04Point5(), c1086gP, (i10 >> 6) & 14, 0, 65018);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.h0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i15 = i10;
                    int i16 = i11;
                    return FooterNoticeKt.ExpandedFooterNotice$lambda$6(hVar3, title, subtitle, avatars, i15, i16, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedFooterNotice$lambda$6(androidx.compose.ui.h hVar, String title, String subtitle, List avatars, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(subtitle, "$subtitle");
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        ExpandedFooterNotice(hVar, title, subtitle, avatars, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void ExpandedFooterNoticePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1644521079);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m85getLambda1$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2287j0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedFooterNoticePreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedFooterNoticePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ExpandedFooterNoticePreviewMultipleAvatars(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(419901737);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m86getLambda2$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedFooterNoticePreviewMultipleAvatars(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ExpandedTitleOnlyFooterNoticePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-385296499);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m87getLambda3$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedTitleOnlyFooterNoticePreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExpandedTitleOnlyFooterNoticePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void FooterNoticePill(androidx.compose.ui.h hVar, final String title, final List<AvatarWrapper> avatars, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(avatars, "avatars");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(2116373339);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-2063426416);
        Object objF = c1086gP.f();
        Object obj = objF;
        if (objF == InterfaceC1084f.a.f12980a) {
            androidx.compose.animation.core.K k10 = new androidx.compose.animation.core.K(Boolean.FALSE);
            k10.f(Boolean.TRUE);
            c1086gP.E(k10);
            obj = k10;
        }
        c1086gP.T(false);
        AnimatedVisibilityKt.b((androidx.compose.animation.core.K) obj, null, TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(HandoverPillBottomPadding)), null, null, androidx.compose.runtime.internal.a.b(-1063955783, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$FooterNoticePill$1$1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i13) {
                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                FooterNoticeKt.FooterNoticePillWithoutAnimation(title, avatars, onClick, interfaceC1084f2, 64);
            }
        }, c1086gP), c1086gP, 196608, 26);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.c0
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i13 = i10;
                    int i14 = i11;
                    return FooterNoticeKt.FooterNoticePill$lambda$4(hVar3, title, avatars, onClick, i13, i14, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FooterNoticePill$lambda$4(androidx.compose.ui.h hVar, String title, List avatars, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        FooterNoticePill(hVar, title, avatars, onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void FooterNoticePillMultipleAvatarsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(961872365);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m89getLambda5$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FooterNoticePillMultipleAvatarsPreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FooterNoticePillMultipleAvatarsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void FooterNoticePillPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(615648759);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m88getLambda4$intercom_sdk_base_release(), c1086gP, 12582912, 127);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FooterNoticePillPreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FooterNoticePillPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterNoticePillWithoutAnimation(final String str, final List<AvatarWrapper> list, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2078164816);
        IntercomCardKt.IntercomCard(aVar, PaddingKt.f(androidx.compose.ui.h.a.f13984b, HandoverPillBottomPadding), false, IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12433e, 0L, 0L, 0.0f, null, 0L, c1086gP, IntercomCardStyle.$stable << 18, 62), null, androidx.compose.runtime.internal.a.b(-1065463783, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt.FooterNoticePillWithoutAnimation.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i11) {
                kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                if ((i11 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                androidx.compose.ui.h hVarG = PaddingKt.g(10, 12, androidx.compose.ui.h.a.f13984b);
                String str2 = str;
                List<AvatarWrapper> list2 = list;
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar2);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, eD);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                FooterNoticeKt.FooterTitle(str2, list2, interfaceC1084f2, 64);
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, ((i10 >> 6) & 14) | 196656 | (IntercomCardStyle.Style.$stable << 9), 20);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.d0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FooterNoticeKt.FooterNoticePillWithoutAnimation$lambda$7(str, list, aVar, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FooterNoticePillWithoutAnimation$lambda$7(String title, List avatars, Ia.a onClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        FooterNoticePillWithoutAnimation(title, avatars, onClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterTitle(final String str, final List<AvatarWrapper> list, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-973759395);
        C0945e.c cVar = C0945e.f10288e;
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, c1086gP, 54);
        int i11 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(1829795659);
        if (!list.isEmpty()) {
            AvatarGroupKt.m59AvatarGroupJ8mCjc(list, null, 16, G0.a.g(10), c1086gP, 3464, 2);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, 8));
        }
        c1086gP.T(false);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        TextKt.b(str, null, intercomTheme.getColors(c1086gP, i12).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i12).getType04Point5(), c1086gP, i10 & 14, 0, 65018);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.i0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FooterNoticeKt.FooterTitle$lambda$9(str, list, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FooterTitle$lambda$9(String title, List avatars, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        FooterTitle(title, avatars, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final float getHandoverPillBottomPadding() {
        return HandoverPillBottomPadding;
    }
}
