package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1050e;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.components.C2289k0;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.conversation.ui.components.J;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.collections.EmptyList;
import p037cb.C1532j0;

/* JADX INFO: compiled from: BrowseAllHelpTopicsComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BrowseAllHelpTopicsComponentKt {
    @IntercomPreviews
    private static final void BrowseAllHelpTopicsASItemPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1268619456);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m279getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsASItemPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BrowseAllHelpTopicsASItemPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void BrowseAllHelpTopicsAsItem(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final androidx.compose.ui.h hVar2;
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-384199751);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar3 = i13 != 0 ? aVar : hVar2;
            float f10 = 16;
            androidx.compose.ui.h hVarJ = PaddingKt.j(ClickableKt.c(W.d(hVar3, 1.0f), false, null, new J(1, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), 7), f10, f10, 0.0f, 0.0f, 12);
            C0945e.k kVar = C0945e.f10286c;
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar, aVar2, c1086gP, 0);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            androidx.compose.ui.h hVar4 = hVar3;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            C0953m c0953mA2 = C0952l.a(kVar, aVar2, c1086gP, 0);
            int i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA2);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                J4.i.d(i16, c1086gP, i16, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC3);
            TextKt.b(S4.o.p(c1086gP, R.string.intercom_browse_all_help_topics), null, 0L, 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), c1086gP, 196608, 0, 65502);
            c1086gP.T(true);
            IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar, 22, 0.0f, 2), c1086gP, 6, 0);
            c1086gP.T(true);
            c1086gP.T(true);
            hVar2 = hVar4;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem$lambda$6(hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsAsItem$lambda$2(Context context) {
        kotlin.jvm.internal.i.e(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, EmptyList.f42983b, MetricTracker.Place.COLLECTION_LIST);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsAsItem$lambda$6(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        BrowseAllHelpTopicsAsItem(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void BrowseAllHelpTopicsComponent(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        int i13 = 3;
        C1086g c1086gP = interfaceC1084f.p(-1332059523);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVar3 = i14 != 0 ? androidx.compose.ui.h.a.f13984b : hVar2;
            Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            N n10 = C1051f.f12444a;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            C1050e c1050eF = C1051f.f(intercomTheme.getColors(c1086gP, i15).m621getBackground0d7_KjU(), intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), c1086gP);
            C0937i c0937iA = C1787c0.a(1, H.b(0.12f, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU()));
            float f10 = 16;
            float f11 = 8;
            ButtonKt.b(new C1532j0(i13, context), hVar3, false, null, c1050eF, null, c0937iA, new N(f10, f11, f10, f11), null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m277getLambda1$intercom_sdk_base_release(), c1086gP, ((i12 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 817889280, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
            hVar2 = hVar3;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.helpcenter.ui.e(hVar2, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsComponent$lambda$0(Context context) {
        kotlin.jvm.internal.i.e(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, EmptyList.f42983b, MetricTracker.Place.COLLECTION_LIST);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsComponent$lambda$1(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        BrowseAllHelpTopicsComponent(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void BrowseAllHelpTopicsComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1843811940);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m278getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BrowseAllHelpTopicsComponentPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BrowseAllHelpTopicsComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
