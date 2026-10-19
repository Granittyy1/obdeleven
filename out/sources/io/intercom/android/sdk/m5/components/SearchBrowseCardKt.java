package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
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
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: SearchBrowseCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchBrowseCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: SearchBrowseCard.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ boolean $accessToTeammateEnabled;
        final /* synthetic */ List<AvatarWrapper> $avatars;
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeHelpCenterData $helpCenterData;
        final /* synthetic */ boolean $isSearchFirstEnabled;
        final /* synthetic */ MetricTracker $metricTracker;

        public AnonymousClass1(boolean z10, HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z11, List<AvatarWrapper> list, MetricTracker metricTracker, Context context) {
            this.$isSearchFirstEnabled = z10;
            this.$helpCenterData = homeHelpCenterData;
            this.$accessToTeammateEnabled = z11;
            this.$avatars = list;
            this.$metricTracker = metricTracker;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$0(MetricTracker metricTracker, Context context) {
            kotlin.jvm.internal.i.e(metricTracker, "$metricTracker");
            kotlin.jvm.internal.i.e(context, "$context");
            metricTracker.clickedSearchBrowseCard();
            context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, true));
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$6$lambda$5$lambda$3(MetricTracker metricTracker, SuggestedArticle it, Context context) {
            kotlin.jvm.internal.i.e(metricTracker, "$metricTracker");
            kotlin.jvm.internal.i.e(it, "$it");
            kotlin.jvm.internal.i.e(context, "$context");
            metricTracker.clickedArticleSuggestion(it.getId());
            context.startActivity(IntercomArticleActivity.Companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(it.getId(), "search_browse_card", true, false, 8, null)));
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.h] */
        /* JADX WARN: Type inference failed for: r7v10, types: [int] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v9 */
        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            float f10;
            int i12;
            float f11;
            int i13;
            float f12;
            int i14;
            ?? r10;
            InterfaceC1084f interfaceC1084f2;
            float f13;
            androidx.compose.ui.h.a aVar;
            ?? r11;
            final MetricTracker metricTracker;
            String str;
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            boolean z10 = this.$isSearchFirstEnabled || !this.$helpCenterData.getSuggestedArticles().isEmpty();
            HomeCards.HomeHelpCenterData homeHelpCenterData = this.$helpCenterData;
            boolean z11 = this.$isSearchFirstEnabled;
            boolean z12 = this.$accessToTeammateEnabled;
            List<AvatarWrapper> list = this.$avatars;
            final MetricTracker metricTracker2 = this.$metricTracker;
            final Context context = this.$context;
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            C0945e.k kVar = C0945e.f10286c;
            androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar, aVar3, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar2);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, interfaceC1084f, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, interfaceC1084f, hVarC);
            if (z10) {
                f10 = 8;
                i11 = 0;
            } else {
                i11 = 0;
                f10 = 0;
            }
            float f14 = i11;
            if (z10) {
                i12 = 8;
                f11 = 8;
            } else {
                i12 = 8;
                f11 = f14;
            }
            androidx.compose.ui.h hVarI = PaddingKt.i(aVar2, f11, f10, z10 ? i12 : f14, f14);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarR = A8.p.r(hVarI, intercomTheme.getShapes(interfaceC1084f, i15).f12430b);
            interfaceC1084f.L(343614555);
            long jB = z10 ? androidx.compose.ui.graphics.H.b(0.05f, intercomTheme.getColors(interfaceC1084f, i15).m645getPrimaryText0d7_KjU()) : androidx.compose.ui.graphics.H.f13503k;
            interfaceC1084f.D();
            androidx.compose.ui.h hVarC2 = ClickableKt.c(C0932d.b(hVarR, jB, androidx.compose.ui.graphics.h0.f13629a), false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.components.G0
                @Override // Ia.a
                public final Object invoke() {
                    return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$7$lambda$0(metricTracker2, context);
                }
            }, 7);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f, hVarC2);
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar, interfaceC1084f, eD);
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar3);
            }
            R0.a(pVar4, interfaceC1084f, hVarC3);
            androidx.compose.ui.h hVarG = PaddingKt.g(z10 ? 8 : 16, z10 ? 12 : 20, androidx.compose.foundation.layout.W.d(aVar2, 1.0f));
            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10290g, bVar, interfaceC1084f, 54);
            int iF3 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f, hVarG);
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar, interfaceC1084f, tA);
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z3);
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF3))) {
                androidx.compose.animation.k.b(iF3, interfaceC1084f, iF3, pVar3);
            }
            R0.a(pVar4, interfaceC1084f, hVarC4);
            androidx.compose.ui.f.b bVar2 = bVar;
            Context context2 = context;
            TextKt.b(S4.o.p(interfaceC1084f, R.string.intercom_search_for_help), null, 0L, 0L, null, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f, 196608, 0, 131038);
            int i16 = R.drawable.intercom_gif_search_icon;
            float f15 = 16;
            androidx.compose.ui.h.a aVar5 = aVar2;
            InterfaceC1084f interfaceC1084f3 = interfaceC1084f;
            boolean z13 = false;
            IconKt.a(U.c.a(i16, interfaceC1084f3, 0), null, androidx.compose.ui.platform.N0.a(androidx.compose.foundation.layout.W.m(aVar5, f15), String.valueOf(i16)), intercomTheme.getColors(interfaceC1084f3, i15).m616getActionContrastWhite0d7_KjU(), interfaceC1084f, 56, 0);
            interfaceC1084f.J();
            interfaceC1084f.J();
            List<SuggestedArticle> suggestedArticles = homeHelpCenterData.getSuggestedArticles();
            interfaceC1084f3.L(343677614);
            List<SuggestedArticle> list2 = suggestedArticles;
            float f16 = 0.0f;
            int i17 = 2;
            int i18 = 6;
            if (list2.isEmpty()) {
                i13 = 6;
                f12 = 0.0f;
                i14 = 2;
                r10 = 0;
                interfaceC1084f2 = interfaceC1084f3;
                f13 = f15;
                aVar = aVar5;
                r11 = 0;
            } else {
                C0953m c0953mA2 = C0952l.a(kVar, aVar3, interfaceC1084f3, 0);
                int iF4 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z4 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f3, aVar5);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f3.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar, interfaceC1084f3, c0953mA2);
                R0.a(pVar2, interfaceC1084f3, interfaceC1089h0Z4);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF4))) {
                    androidx.compose.animation.k.b(iF4, interfaceC1084f3, iF4, pVar3);
                }
                R0.a(pVar4, interfaceC1084f3, hVarC5);
                interfaceC1084f3.L(-562735688);
                if (list2.isEmpty()) {
                    metricTracker = metricTracker2;
                    str = null;
                } else {
                    metricTracker = metricTracker2;
                    str = null;
                    androidx.compose.runtime.E.d(new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(metricTracker, suggestedArticles, null), interfaceC1084f3, "");
                }
                interfaceC1084f.D();
                interfaceC1084f3.L(-562721890);
                int i19 = 0;
                for (Object obj : suggestedArticles) {
                    int i20 = i19 + 1;
                    if (i19 < 0) {
                        ?? r12 = str;
                        kotlin.collections.l.x();
                        throw r12;
                    }
                    final SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
                    interfaceC1084f3.L(-562722059);
                    if (i19 == 0) {
                        Lb.a.a(interfaceC1084f3, androidx.compose.foundation.layout.W.e(aVar5, 4));
                    }
                    interfaceC1084f.D();
                    final Context context3 = context2;
                    androidx.compose.ui.h.a aVar6 = aVar5;
                    float f17 = 4;
                    androidx.compose.ui.h hVarA = androidx.compose.ui.platform.N0.a(PaddingKt.j(ClickableKt.c(androidx.compose.foundation.layout.W.d(aVar5, 1.0f), z13, str, new Ia.a() { // from class: io.intercom.android.sdk.m5.components.H0
                        @Override // Ia.a
                        public final Object invoke() {
                            return SearchBrowseCardKt.AnonymousClass1.invoke$lambda$7$lambda$6$lambda$5$lambda$3(metricTracker, suggestedArticle, context3);
                        }
                    }, 7), f15, f17, 0.0f, f17, 4), "suggested article");
                    androidx.compose.ui.f.b bVar3 = bVar2;
                    androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar3, interfaceC1084f3, 48);
                    int iF5 = interfaceC1084f.F();
                    InterfaceC1089h0 interfaceC1089h0Z5 = interfaceC1084f.z();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f.r();
                    if (interfaceC1084f.m()) {
                        interfaceC1084f3.v(aVar7);
                    } else {
                        interfaceC1084f.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA2);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z5);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF5))) {
                        androidx.compose.animation.k.b(iF5, interfaceC1084f3, iF5, pVar5);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC6);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    float f18 = f15;
                    TextKt.b(suggestedArticle.getTitle(), new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), 0L, 0L, null, androidx.compose.ui.text.font.l.f15442g, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, interfaceC1084f, 196608, 3120, 120796);
                    IntercomChevronKt.IntercomChevron(PaddingKt.h(aVar6, 20, 0.0f, 2), interfaceC1084f, 6, 0);
                    interfaceC1084f.J();
                    Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.e(aVar6, f18));
                    f15 = f18;
                    aVar5 = aVar6;
                    f16 = 0.0f;
                    i17 = 2;
                    interfaceC1084f3 = interfaceC1084f;
                    z13 = false;
                    i18 = 6;
                    i19 = i20;
                    context2 = context3;
                    bVar2 = bVar3;
                    metricTracker = metricTracker;
                    str = null;
                }
                r11 = str;
                i13 = i18;
                f12 = f16;
                i14 = i17;
                r10 = z13;
                interfaceC1084f2 = interfaceC1084f3;
                f13 = f15;
                aVar = aVar5;
                interfaceC1084f.D();
                interfaceC1084f.J();
            }
            interfaceC1084f.D();
            interfaceC1084f2.L(343755978);
            if (z11 && z12) {
                interfaceC1084f2.L(343758114);
                if (!list2.isEmpty()) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.h(aVar, f13, f12, i14), interfaceC1084f2, i13, r10);
                }
                interfaceC1084f.D();
                TeamPresenceRowKt.TeamPresenceRow(r11, list, interfaceC1084f2, 64, 1);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowse(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1546858090);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m110getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewSearchBrowse$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewSearchBrowse(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSearchFirst(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-678171621);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m112getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewSearchBrowseNoSearchFirst$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewSearchBrowseNoSearchFirst(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestions(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1745562356);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m111getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewSearchBrowseNoSuggestions$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewSearchBrowseNoSuggestions(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(354688977);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m113getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewSearchBrowseNoSuggestionsNoSearchFirst(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SearchBrowseCard(final HomeCards.HomeHelpCenterData helpCenterData, final boolean z10, final List<AvatarWrapper> avatars, final boolean z11, final MetricTracker metricTracker, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(helpCenterData, "helpCenterData");
        kotlin.jvm.internal.i.e(avatars, "avatars");
        kotlin.jvm.internal.i.e(metricTracker, "metricTracker");
        C1086g c1086gP = interfaceC1084f.p(382156573);
        IntercomCardKt.IntercomCard(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), null, androidx.compose.runtime.internal.a.b(-1020132823, new AnonymousClass1(z10, helpCenterData, z11, avatars, metricTracker, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), c1086gP), c1086gP, 390, 2);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.F0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SearchBrowseCardKt.SearchBrowseCard$lambda$0(helpCenterData, z10, avatars, z11, metricTracker, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData helpCenterData, boolean z10, List avatars, boolean z11, MetricTracker metricTracker, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(helpCenterData, "$helpCenterData");
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        kotlin.jvm.internal.i.e(metricTracker, "$metricTracker");
        SearchBrowseCard(helpCenterData, z10, avatars, z11, metricTracker, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
