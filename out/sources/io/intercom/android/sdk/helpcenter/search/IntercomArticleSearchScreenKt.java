package io.intercom.android.sdk.helpcenter.search;

import Ia.p;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.v;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import p005a4.o;
import p293xa.r;

/* JADX INFO: compiled from: IntercomArticleSearchScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleSearchScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomArticleSearchScreen.kt */
    public static final class AnonymousClass1 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ia.l<String, r> $onArticleClicked;
        final /* synthetic */ Ia.a<r> $onClearSearchClick;
        final /* synthetic */ ArticleSearchState $state;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ArticleSearchState articleSearchState, Ia.l<? super String, r> lVar, Ia.a<r> aVar, Context context) {
            this.$state = articleSearchState;
            this.$onArticleClicked = lVar;
            this.$onClearSearchClick = aVar;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$1$lambda$0(final ArticleSearchState state, final Ia.l onArticleClicked, androidx.compose.foundation.lazy.p LazyColumn) {
            kotlin.jvm.internal.i.e(state, "$state");
            kotlin.jvm.internal.i.e(onArticleClicked, "$onArticleClicked");
            kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
            LazyColumn.g(((ArticleSearchState.Content) state).getSearchResults().size(), null, new Ia.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    ((Number) obj).intValue();
                    return null;
                }
            }, new ComposableLambdaImpl(true, 1308683973, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1
                @Override // Ia.r
                public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                    invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
                    return r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.lazy.b items, int i10, InterfaceC1084f interfaceC1084f, int i11) {
                    kotlin.jvm.internal.i.e(items, "$this$items");
                    if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                        i11 |= interfaceC1084f.h(i10) ? 32 : 16;
                    }
                    if ((i11 & 721) == 144 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    ArticleSearchResultRow articleSearchResultRow = ((ArticleSearchState.Content) state).getSearchResults().get(i10);
                    if (articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow) {
                        interfaceC1084f.L(-1577698623);
                        ArticleResultRowComponentKt.ArticleResultRowComponent((ArticleSearchResultRow.ArticleResultRow) articleSearchResultRow, onArticleClicked, null, interfaceC1084f, 0, 4);
                        interfaceC1084f.D();
                    } else {
                        if (!(articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                            interfaceC1084f.L(-1577703168);
                            interfaceC1084f.D();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC1084f.L(-1577693088);
                        TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchResultRow.TeammateHelpRow) articleSearchResultRow).getTeamPresenceState(), false, null, interfaceC1084f, 0, 6);
                        interfaceC1084f.D();
                    }
                }
            }));
            return r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            String searchTerm;
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            ArticleSearchState articleSearchState = this.$state;
            boolean z10 = articleSearchState instanceof ArticleSearchState.Content;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            if (z10) {
                interfaceC1084f.L(484447755);
                androidx.compose.ui.h hVarB = C0932d.b(aVar, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                interfaceC1084f.L(154178788);
                boolean zK = interfaceC1084f.K(this.$state) | interfaceC1084f.K(this.$onArticleClicked);
                final ArticleSearchState articleSearchState2 = this.$state;
                final Ia.l<String, r> lVar = this.$onArticleClicked;
                Object objF = interfaceC1084f.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.search.m
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0(articleSearchState2, lVar, (androidx.compose.foundation.lazy.p) obj);
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                LazyDslKt.a(hVarB, null, null, false, null, null, null, false, null, (Ia.l) objF, interfaceC1084f, 0, 510);
                interfaceC1084f.D();
                return;
            }
            if (kotlin.jvm.internal.i.a(articleSearchState, ArticleSearchState.Error.INSTANCE)) {
                interfaceC1084f.L(485142124);
                HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), W.f10226c, interfaceC1084f, 48, 0);
                interfaceC1084f.D();
                return;
            }
            if (kotlin.jvm.internal.i.a(articleSearchState, ArticleSearchState.Initial.INSTANCE)) {
                interfaceC1084f.L(485341516);
                interfaceC1084f.D();
                this.$onClearSearchClick.invoke();
                return;
            }
            if (kotlin.jvm.internal.i.a(articleSearchState, ArticleSearchState.Loading.INSTANCE)) {
                interfaceC1084f.L(485420287);
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(W.f10226c, interfaceC1084f, 6, 0);
                interfaceC1084f.D();
                return;
            }
            if (!(articleSearchState instanceof ArticleSearchState.NoResults) && !(articleSearchState instanceof ArticleSearchState.NoResultsNoTeamHelp)) {
                interfaceC1084f.L(154175038);
                interfaceC1084f.D();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC1084f.L(485632916);
            ArticleSearchState articleSearchState3 = this.$state;
            if (articleSearchState3 instanceof ArticleSearchState.NoResults) {
                searchTerm = ((ArticleSearchState.NoResults) articleSearchState3).getSearchTerm();
            } else {
                searchTerm = articleSearchState3 instanceof ArticleSearchState.NoResultsNoTeamHelp ? ((ArticleSearchState.NoResultsNoTeamHelp) articleSearchState3).getSearchTerm() : "";
            }
            Context context = this.$context;
            ArticleSearchState articleSearchState4 = this.$state;
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
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            float f10 = 20;
            TextKt.c(IntercomArticleSearchScreenKt.getNoResultsMessage(context, searchTerm), PaddingKt.j(W.d(aVar, 1.0f), f10, 32, f10, 0.0f, 8), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), G0.a.g(16), null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, null, interfaceC1084f, 3072, 0, 261616);
            interfaceC1084f.L(145075595);
            if (articleSearchState4 instanceof ArticleSearchState.NoResults) {
                TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchState.NoResults) articleSearchState4).getTeamPresenceState(), false, null, interfaceC1084f, 0, 6);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
            interfaceC1084f.D();
        }
    }

    public static final void IntercomArticleSearchScreen(final ArticleSearchState state, final Ia.a<r> onClearSearchClick, final Ia.l<? super String, r> onArticleClicked, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(onClearSearchClick, "onClearSearchClick");
        kotlin.jvm.internal.i.e(onArticleClicked, "onArticleClicked");
        C1086g c1086gP = interfaceC1084f.p(-1211464960);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onClearSearchClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onArticleClicked) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            SurfaceKt.a(null, null, intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU(), intercomTheme.getColors(c1086gP, i12).m645getPrimaryText0d7_KjU(), 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1420291739, new AnonymousClass1(state, onArticleClicked, onClearSearchClick, context), c1086gP), c1086gP, 12582912, R.styleable.AppCompatTheme_tooltipFrameBackground);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.helpcenter.search.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomArticleSearchScreenKt.IntercomArticleSearchScreen$lambda$0(state, onClearSearchClick, onArticleClicked, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r IntercomArticleSearchScreen$lambda$0(ArticleSearchState state, Ia.a onClearSearchClick, Ia.l onArticleClicked, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onClearSearchClick, "$onClearSearchClick");
        kotlin.jvm.internal.i.e(onArticleClicked, "$onArticleClicked");
        IntercomArticleSearchScreen(state, onClearSearchClick, onArticleClicked, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1260a getNoResultsMessage(Context context, String str) {
        String strC = o.c('\'', "'", str);
        String string = context.getString(io.intercom.android.sdk.R.string.intercom_no_results_for_searchterm);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        String strG = kotlin.text.m.G(string, "{searchTerm}", strC);
        C1260a.b bVar = new C1260a.b();
        int iQ = n.Q(strG, strC, 0, false, 6);
        String strSubstring = strG.substring(0, iQ);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        bVar.c(strSubstring);
        int iH = bVar.h(new v(0L, 0L, androidx.compose.ui.text.font.l.j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
        try {
            String strSubstring2 = strG.substring(iQ, strC.length() + iQ);
            kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
            bVar.c(strSubstring2);
            r rVar = r.f47939a;
            bVar.e(iH);
            String strSubstring3 = strG.substring(strC.length() + iQ);
            kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
            bVar.c(strSubstring3);
            return bVar.i();
        } catch (Throwable th) {
            bVar.e(iH);
            throw th;
        }
    }
}
