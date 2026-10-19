package io.intercom.android.sdk.helpcenter.articles;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.compose.animation.D;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.V;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.v0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: IntercomArticleActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {
    private static final String ARTICLE_ID = "ARTICLE_ID";
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    private static final String METRIC_PLACE = "METRIC_PLACE";
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";
    private final p293xa.g arguments$delegate = kotlin.a.a(new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.j
        @Override // Ia.a
        public final Object invoke() {
            return IntercomArticleActivity.arguments_delegate$lambda$0(this.f38084b);
        }
    });
    private final V scrollBy = new C1081d0(0);
    private final p293xa.g viewModel$delegate = kotlin.a.a(new k(0, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: IntercomArticleActivity.kt */
    public static final class ArticleActivityArguments {
        public static final int $stable = 0;
        private final String articleId;
        private final boolean isFromSearchBrowse;
        private final String metricPlace;
        private final boolean shouldHideReactions;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String articleId, String metricPlace) {
            this(articleId, metricPlace, false, false, 12, null);
            kotlin.jvm.internal.i.e(articleId, "articleId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
        }

        public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = articleActivityArguments.articleId;
            }
            if ((i10 & 2) != 0) {
                str2 = articleActivityArguments.metricPlace;
            }
            if ((i10 & 4) != 0) {
                z10 = articleActivityArguments.isFromSearchBrowse;
            }
            if ((i10 & 8) != 0) {
                z11 = articleActivityArguments.shouldHideReactions;
            }
            return articleActivityArguments.copy(str, str2, z10, z11);
        }

        public final String component1() {
            return this.articleId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final boolean component3() {
            return this.isFromSearchBrowse;
        }

        public final boolean component4() {
            return this.shouldHideReactions;
        }

        public final ArticleActivityArguments copy(String articleId, String metricPlace, boolean z10, boolean z11) {
            kotlin.jvm.internal.i.e(articleId, "articleId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            return new ArticleActivityArguments(articleId, metricPlace, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleActivityArguments)) {
                return false;
            }
            ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) obj;
            return kotlin.jvm.internal.i.a(this.articleId, articleActivityArguments.articleId) && kotlin.jvm.internal.i.a(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions;
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final boolean getShouldHideReactions() {
            return this.shouldHideReactions;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldHideReactions) + D.b(B1.a.b(this.metricPlace, this.articleId.hashCode() * 31, 31), 31, this.isFromSearchBrowse);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArticleActivityArguments(articleId=");
            sb2.append(this.articleId);
            sb2.append(", metricPlace=");
            sb2.append(this.metricPlace);
            sb2.append(", isFromSearchBrowse=");
            sb2.append(this.isFromSearchBrowse);
            sb2.append(", shouldHideReactions=");
            return Z3.o.d(sb2, this.shouldHideReactions, ')');
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String articleId, String metricPlace, boolean z10) {
            this(articleId, metricPlace, z10, false, 8, null);
            kotlin.jvm.internal.i.e(articleId, "articleId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
        }

        public ArticleActivityArguments(String articleId, String metricPlace, boolean z10, boolean z11) {
            kotlin.jvm.internal.i.e(articleId, "articleId");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            this.articleId = articleId;
            this.metricPlace = metricPlace;
            this.isFromSearchBrowse = z10;
            this.shouldHideReactions = z11;
        }

        public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z10, boolean z11, int i10, kotlin.jvm.internal.e eVar) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    /* JADX INFO: compiled from: IntercomArticleActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(articleActivityArguments, "articleActivityArguments");
            Intent intent = new Intent(context, (Class<?>) IntercomArticleActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
            intent.putExtra(IntercomArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
            intent.putExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
            intent.putExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
            return intent;
        }

        public final ArticleActivityArguments getArguments(Intent intent) {
            kotlin.jvm.internal.i.e(intent, "intent");
            String stringExtra = intent.getStringExtra(IntercomArticleActivity.ARTICLE_ID);
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = intent.getStringExtra(IntercomArticleActivity.METRIC_PLACE);
            return new ArticleActivityArguments(stringExtra, stringExtra2 != null ? stringExtra2 : "", intent.getBooleanExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        Companion companion = Companion;
        Intent intent = this$0.getIntent();
        kotlin.jvm.internal.i.d(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
        return Companion.buildIntent(context, articleActivityArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleActivityArguments getArguments() {
        return (ArticleActivityArguments) this.arguments$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        kotlin.jvm.internal.i.d(encryptedUserId, "getEncryptedUserId(...)");
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(IntercomArticleActivity this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        boolean z10 = (this$0.getResources().getConfiguration().uiMode & 48) == 32;
        ArticleViewModel.Companion companion = ArticleViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        kotlin.jvm.internal.i.d(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(this$0, helpCenterApi, ((AppConfig) Z3.o.b()).getHelpCenterUrl(), this$0.getArguments().getMetricPlace(), this$0.getArguments().isFromSearchBrowse(), this$0.getArguments().getShouldHideReactions(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.m(1, this$0), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity this$0, int i10) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.scrollBy.m(i10);
        return p293xa.r.f47939a;
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        androidx.activity.r.b(this);
        super.onCreate(bundle);
        androidx.activity.compose.d.a(this, new ComposableLambdaImpl(true, 1674700077, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else {
                    final IntercomArticleActivity intercomArticleActivity = IntercomArticleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-199442729, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: IntercomArticleActivity.kt */
                        @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1", f = "IntercomArticleActivity.kt", l = {}, m = "invokeSuspend")
                        public static final class C04051 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;
                            final /* synthetic */ IntercomArticleActivity this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C04051(IntercomArticleActivity intercomArticleActivity, kotlin.coroutines.c<? super C04051> cVar) {
                                super(2, cVar);
                                this.this$0 = intercomArticleActivity;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new C04051(this.this$0, cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                this.this$0.getViewModel().fragmentLoaded(this.this$0.getArguments().getArticleId());
                                return p293xa.r.f47939a;
                            }

                            @Override // Ia.p
                            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((C04051) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: IntercomArticleActivity.kt */
                        public static final class AnonymousClass2 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            public AnonymousClass2(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$0(IntercomArticleActivity this$0) {
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                this$0.finish();
                                return p293xa.r.f47939a;
                            }

                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                                invoke(interfaceC1084f, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                                    interfaceC1084f.w();
                                    return;
                                }
                                int i11 = R.drawable.intercom_ic_close;
                                final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                IntercomTopBarIcon intercomTopBarIcon = new IntercomTopBarIcon(i11, null, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.l
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass2.invoke$lambda$0(intercomArticleActivity);
                                    }
                                });
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i12 = IntercomTheme.$stable;
                                IntercomTopBarKt.m542IntercomTopBarbogVsAg(null, null, intercomTopBarIcon, null, intercomTheme.getColors(interfaceC1084f, i12).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f, i12).m645getPrimaryText0d7_KjU(), null, null, interfaceC1084f, IntercomTopBarIcon.$stable << 6, 203);
                            }
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3, reason: invalid class name */
                        /* JADX INFO: compiled from: IntercomArticleActivity.kt */
                        public static final class AnonymousClass3 implements Ia.q<L, InterfaceC1084f, Integer, p293xa.r> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            public AnonymousClass3(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final WebView invoke$lambda$7$lambda$2(String articleUrl, IntercomArticleActivity this$0, Map headers, Context it) {
                                kotlin.jvm.internal.i.e(articleUrl, "$articleUrl");
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                kotlin.jvm.internal.i.e(headers, "$headers");
                                kotlin.jvm.internal.i.e(it, "it");
                                WebView webView = new WebView(it);
                                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                ArticleWebViewClient articleWebViewClient = new ArticleWebViewClient(articleUrl, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(this$0, webView), ((AppConfig) Z3.o.b()).getHelpCenterUrls());
                                webView.getSettings().setJavaScriptEnabled(true);
                                webView.setWebViewClient(articleWebViewClient);
                                this$0.setCookies();
                                webView.loadUrl(articleUrl, headers);
                                return webView;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$7$lambda$3(WebView it) {
                                kotlin.jvm.internal.i.e(it, "it");
                                return p293xa.r.f47939a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$7$lambda$4(IntercomArticleActivity this$0) {
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                this$0.getViewModel().sadReactionTapped();
                                return p293xa.r.f47939a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$7$lambda$5(IntercomArticleActivity this$0) {
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                this$0.getViewModel().neutralReactionTapped();
                                return p293xa.r.f47939a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$7$lambda$6(IntercomArticleActivity this$0) {
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                this$0.getViewModel().happyReactionTapped();
                                return p293xa.r.f47939a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final p293xa.r invoke$lambda$8(IntercomArticleActivity this$0) {
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                this$0.getViewModel().fragmentLoaded(this$0.getArguments().getArticleId());
                                return p293xa.r.f47939a;
                            }

                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(L l10, InterfaceC1084f interfaceC1084f, Integer num) {
                                invoke(l10, interfaceC1084f, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f, int i10) {
                                int i11;
                                ErrorState withoutCTA;
                                kotlin.jvm.internal.i.e(paddingValues, "paddingValues");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (interfaceC1084f.K(paddingValues) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                                    interfaceC1084f.w();
                                    return;
                                }
                                ArticleViewState articleViewState = (ArticleViewState) J0.a(this.this$0.getViewModel().getState(), interfaceC1084f, 8).getValue();
                                boolean z10 = articleViewState instanceof ArticleViewState.Initial;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                if (z10) {
                                    interfaceC1084f.L(2087911002);
                                    LoadingScreenKt.LoadingScreen(PaddingKt.e(aVar, paddingValues), io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state, interfaceC1084f, 0, 0);
                                    interfaceC1084f.D();
                                    return;
                                }
                                if (!(articleViewState instanceof ArticleViewState.Content)) {
                                    if (!(articleViewState instanceof ArticleViewState.Error)) {
                                        interfaceC1084f.L(344449645);
                                        interfaceC1084f.D();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    interfaceC1084f.L(2093971533);
                                    ArticleViewState.Error error = (ArticleViewState.Error) articleViewState;
                                    boolean z11 = error.getRetryButtonVisibility() == 0;
                                    androidx.compose.ui.h hVarE = PaddingKt.e(aVar, paddingValues);
                                    if (z11) {
                                        int message = error.getMessage();
                                        final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                        withoutCTA = new ErrorState.WithCTA(0, message, null, 0, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.r
                                            @Override // Ia.a
                                            public final Object invoke() {
                                                return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass3.invoke$lambda$8(intercomArticleActivity);
                                            }
                                        }, 13, null);
                                    } else {
                                        withoutCTA = new ErrorState.WithoutCTA(0, error.getMessage(), null, 5, null);
                                    }
                                    IntercomErrorScreenKt.IntercomErrorScreen(withoutCTA, hVarE, interfaceC1084f, 0, 0);
                                    interfaceC1084f.D();
                                    return;
                                }
                                interfaceC1084f.L(2088410288);
                                androidx.compose.ui.h hVarB = C0932d.b(ScrollKt.b(PaddingKt.e(aVar, paddingValues), ScrollKt.a(0, interfaceC1084f, 0, 1), false, 14).i(W.f10226c), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                                final IntercomArticleActivity intercomArticleActivity2 = this.this$0;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
                                int iF = interfaceC1084f.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarB);
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
                                ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                                final String articleUrl = content.getArticleUrl();
                                final Map mapS = y.s(new Pair("MobileClientDisplayType", "AndroidIntercomHeaderless"), new Pair("MobileClient", "AndroidIntercomWebView"), new Pair("MobileClientReactionsHidden", "true"));
                                AndroidView_androidKt.b(new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.articles.m
                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass3.invoke$lambda$7$lambda$2(articleUrl, intercomArticleActivity2, mapS, (Context) obj);
                                    }
                                }, null, new n(), interfaceC1084f, 384, 2);
                                ArticleViewState.ReactionState reactionState = content.getReactionState();
                                boolean z12 = reactionState.getReactionComponentVisibility() == 0;
                                interfaceC1084f.L(-286419031);
                                if (z12) {
                                    ReactionsComponentKt.ReactionsComponent(W.d(aVar, 1.0f), reactionState, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.o
                                        @Override // Ia.a
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass3.invoke$lambda$7$lambda$4(intercomArticleActivity2);
                                        }
                                    }, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.p
                                        @Override // Ia.a
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass3.invoke$lambda$7$lambda$5(intercomArticleActivity2);
                                        }
                                    }, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.articles.q
                                        @Override // Ia.a
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C04041.AnonymousClass3.invoke$lambda$7$lambda$6(intercomArticleActivity2);
                                        }
                                    }, interfaceC1084f, 6, 0);
                                    if (content.getReactionState().getTeamHelpVisibility() == 0) {
                                        TeamPresenceComponentKt.TeamPresenceComponent(content.getTeamPresenceState(), false, null, interfaceC1084f, 0, 6);
                                    }
                                }
                                interfaceC1084f.D();
                                interfaceC1084f.J();
                                interfaceC1084f.D();
                            }
                        }

                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                            v0.e cVar;
                            if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Window window = intercomArticleActivity.getWindow();
                            androidx.core.view.D d10 = new androidx.core.view.D(intercomArticleActivity.getWindow().getDecorView());
                            if (Build.VERSION.SDK_INT >= 30) {
                                v0.d dVar = new v0.d(window.getInsetsController(), d10);
                                dVar.f16996b = window;
                                cVar = dVar;
                            } else {
                                cVar = new v0.c(window, d10);
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            cVar.c(ColorExtensionsKt.m665isLightColor8_81llA(intercomTheme.getColors(interfaceC1084f2, i12).m621getBackground0d7_KjU()));
                            E.d(new C04051(intercomArticleActivity, null), interfaceC1084f2, p293xa.r.f47939a);
                            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, intercomTheme.getColors(interfaceC1084f2, i12).m621getBackground0d7_KjU(), h0.f13629a);
                            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                            ScaffoldKt.a(WindowInsetsPaddingKt.c(hVarB, c0.a.c(interfaceC1084f2).f10256b), androidx.compose.runtime.internal.a.b(547021723, new AnonymousClass2(intercomArticleActivity), interfaceC1084f2), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(-494666138, new AnonymousClass3(intercomArticleActivity), interfaceC1084f2), interfaceC1084f2, 805306416, 508);
                        }
                    }, interfaceC1084f), interfaceC1084f, 3072, 7);
                }
            }
        }));
    }
}
