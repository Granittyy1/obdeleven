package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.u;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: ExternalLinkCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExternalLinkCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$ExternalLinkCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExternalLinkCard.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeExternalLinkData $homeExternalLinkData;

        public AnonymousClass1(HomeCards.HomeExternalLinkData homeExternalLinkData, Context context) {
            this.$homeExternalLinkData = homeExternalLinkData;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3$lambda$2$lambda$0(Link item, Context context) {
            kotlin.jvm.internal.i.e(item, "$item");
            kotlin.jvm.internal.i.e(context, "$context");
            Injector.get().getMetricTracker().clickedExternalLinkCard();
            LinkOpener.handleUrl(item.getUrl(), context, Injector.get().getApi());
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeExternalLinkData homeExternalLinkData = this.$homeExternalLinkData;
            Context context = this.$context;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            interfaceC1084f.L(-433115947);
            String cardTitle = homeExternalLinkData.getCardTitle();
            if (cardTitle != null && !kotlin.text.n.S(cardTitle)) {
                TextKt.b(homeExternalLinkData.getCardTitle(), PaddingKt.j(PaddingKt.h(aVar, 16, 0.0f, 2), 0.0f, 12, 0.0f, 4, 5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType04SemiBold(), interfaceC1084f, 48, 0, 65532);
            }
            interfaceC1084f.D();
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            interfaceC1084f2.L(-433100991);
            int i11 = 0;
            for (Object obj : homeExternalLinkData.getLinks()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                final Link link = (Link) obj;
                androidx.compose.ui.h.a aVar3 = aVar;
                final Context context2 = context;
                float f10 = 16;
                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 12, ClickableKt.c(W.d(aVar3, 1.0f), false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.home.ui.components.g
                    @Override // Ia.a
                    public final Object invoke() {
                        return ExternalLinkCardKt.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$0(link, context2);
                    }
                }, 7));
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, interfaceC1084f2, 48);
                int iF2 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f2.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z2);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                int i13 = i11;
                TextKt.b(link.getLabel(), new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), 0L, 0L, null, androidx.compose.ui.text.font.l.f15442g, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, interfaceC1084f, 196608, 3120, 120796);
                Lb.a.a(interfaceC1084f, W.q(aVar3, f10));
                IconKt.a(U.c.a(R.drawable.intercom_open_help_center, interfaceC1084f, 0), null, W.m(aVar3, f10), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU(), interfaceC1084f, 440, 0);
                interfaceC1084f.J();
                interfaceC1084f.L(-433061728);
                if (i13 != homeExternalLinkData.getLinks().size() - 1) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.h(W.d(aVar3, 1.0f), f10, 0.0f, 2), interfaceC1084f, 6, 0);
                }
                interfaceC1084f.D();
                aVar = aVar3;
                interfaceC1084f2 = interfaceC1084f;
                context = context2;
                i11 = i12;
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    public static final void ExternalLinkCard(final HomeCards.HomeExternalLinkData homeExternalLinkData, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(homeExternalLinkData, "homeExternalLinkData");
        C1086g c1086gP = interfaceC1084f.p(-1463768637);
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.a.b(1810723127, new AnonymousClass1(homeExternalLinkData, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), c1086gP), c1086gP, 384, 3);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ExternalLinkCardKt.ExternalLinkCard$lambda$0(homeExternalLinkData, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData homeExternalLinkData, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(homeExternalLinkData, "$homeExternalLinkData");
        ExternalLinkCard(homeExternalLinkData, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ExternalLinkCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-144974605);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExternalLinkCardKt.INSTANCE.m302getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new u(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExternalLinkCardPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ExternalLinkCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
