package io.intercom.android.sdk.helpcenter.search;

import Ia.p;
import Z3.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.D;
import androidx.core.view.v0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p037cb.C1518c0;
import p293xa.r;

/* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleSearchActivity extends IntercomHelpCenterBaseActivity {
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";
    private IntercomActivityArticleSearchBinding _binding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final p293xa.g viewModel$delegate = kotlin.a.a(new io.intercom.android.sdk.b(1, this));
    private final p293xa.g args$delegate = kotlin.a.a(new C1518c0(3, this));

    /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
    public static final class ArticleSearchArgs {
        public static final int $stable = 0;
        private final boolean isFromSearchBrowse;

        public ArticleSearchArgs() {
            this(false, 1, null);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(z10);
        }

        public final boolean component1() {
            return this.isFromSearchBrowse;
        }

        public final ArticleSearchArgs copy(boolean z10) {
            return new ArticleSearchArgs(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArticleSearchArgs) && this.isFromSearchBrowse == ((ArticleSearchArgs) obj).isFromSearchBrowse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromSearchBrowse);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return o.d(new StringBuilder("ArticleSearchArgs(isFromSearchBrowse="), this.isFromSearchBrowse, ')');
        }

        public ArticleSearchArgs(boolean z10) {
            this.isFromSearchBrowse = z10;
        }

        public /* synthetic */ ArticleSearchArgs(boolean z10, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final Intent buildIntent(Context context, boolean z10) {
            kotlin.jvm.internal.i.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomArticleSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, z10);
            return intent;
        }

        public final ArticleSearchArgs getArguments(Intent intent) {
            kotlin.jvm.internal.i.e(intent, "intent");
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
    public static final class AnonymousClass1 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ Ia.a<r> $onBackClick;
        final /* synthetic */ Ia.l<q<String>, r> $onTextChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ia.a<r> aVar, Ia.l<? super q<String>, r> lVar) {
            this.$onBackClick = aVar;
            this.$onTextChanged = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$0(String it) {
            kotlin.jvm.internal.i.e(it, "it");
            return r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(this.$onBackClick, this.$onTextChanged, new g(), interfaceC1084f, 384);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$2, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
    public static final class AnonymousClass2 implements Ia.q<L, InterfaceC1084f, Integer, r> {
        final /* synthetic */ ArticleSearchState $articleSearchState;
        final /* synthetic */ Ia.l<String, r> $onArticleClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ArticleSearchState articleSearchState, Ia.l<? super String, r> lVar) {
            this.$articleSearchState = articleSearchState;
            this.$onArticleClicked = lVar;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(l10, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(paddingValues, "paddingValues");
            if ((i10 & 14) == 0) {
                i10 |= interfaceC1084f.K(paddingValues) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarE = PaddingKt.e(C0932d.b(W.f10226c, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a), paddingValues);
            ArticleSearchState articleSearchState = this.$articleSearchState;
            Ia.l<String, r> lVar = this.$onArticleClicked;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarE);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar);
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
            IntercomArticleSearchScreenKt.IntercomArticleSearchScreen(articleSearchState, new h(), lVar, interfaceC1084f, 48);
            interfaceC1084f.J();
        }
    }

    /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SearchScreenContent(final ArticleSearchState articleSearchState, final Ia.a<r> aVar, final Ia.l<? super q<String>, r> lVar, final Ia.l<? super String, r> lVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(865873108);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(articleSearchState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(lVar2) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            ScaffoldKt.a(null, androidx.compose.runtime.internal.a.b(-1018273896, new AnonymousClass1(aVar, lVar), c1086gP), null, null, null, 0, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), 0L, null, androidx.compose.runtime.internal.a.b(955713763, new AnonymousClass2(articleSearchState, lVar2), c1086gP), c1086gP, 805306416, 445);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.helpcenter.search.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomArticleSearchActivity.SearchScreenContent$lambda$3(this.f38125b, articleSearchState, aVar, lVar, lVar2, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SearchScreenContent$lambda$3(IntercomArticleSearchActivity tmp0_rcvr, ArticleSearchState articleSearchState, Ia.a onBackClick, Ia.l onTextChanged, Ia.l onArticleClicked, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(tmp0_rcvr, "$tmp0_rcvr");
        kotlin.jvm.internal.i.e(articleSearchState, "$articleSearchState");
        kotlin.jvm.internal.i.e(onBackClick, "$onBackClick");
        kotlin.jvm.internal.i.e(onTextChanged, "$onTextChanged");
        kotlin.jvm.internal.i.e(onArticleClicked, "$onArticleClicked");
        tmp0_rcvr.SearchScreenContent(articleSearchState, onBackClick, onTextChanged, onArticleClicked, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchArgs args_delegate$lambda$1(IntercomArticleSearchActivity this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        Companion companion = Companion;
        Intent intent = this$0.getIntent();
        kotlin.jvm.internal.i.d(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, boolean z10) {
        return Companion.buildIntent(context, z10);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs) this.args$delegate.getValue();
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel) this.viewModel$delegate.getValue();
    }

    private final void setupInsets() {
        v0.e cVar;
        androidx.activity.r.b(this);
        Window window = getWindow();
        D d10 = new D(getWindow().getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(window.getInsetsController(), d10);
            dVar.f16996b = window;
            cVar = dVar;
        } else {
            cVar = new v0.c(window, d10);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = true;
            } else if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        cVar.c(z10);
    }

    private final void subscribeToStates() {
        getBinding().articleSearchComposeView.setContent(new ComposableLambdaImpl(true, -779899693, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.subscribeToStates.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: IntercomArticleSearchActivity.kt */
            public static final class C04071 implements p<InterfaceC1084f, Integer, r> {
                final /* synthetic */ IntercomArticleSearchActivity this$0;

                public C04071(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    this.this$0 = intercomArticleSearchActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$0(IntercomArticleSearchActivity this$0) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    this$0.onBackPressed();
                    return r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$1(IntercomArticleSearchActivity this$0, q textFlow) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(textFlow, "textFlow");
                    this$0.getViewModel().searchForArticles(textFlow);
                    return r.f47939a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final r invoke$lambda$2(IntercomArticleSearchActivity this$0, String it) {
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(it, "it");
                    this$0.getViewModel().addTeammateHelpRow();
                    this$0.getViewModel().sendClickOnSearchResultMetric();
                    this$0.startActivity(IntercomArticleActivity.Companion.buildIntent(this$0, new IntercomArticleActivity.ArticleActivityArguments(it, MetricTracker.Place.SEARCH_RESULTS, false, false, 12, null)));
                    return r.f47939a;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(interfaceC1084f, num.intValue());
                    return r.f47939a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                    if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    X xA = J0.a(this.this$0.getViewModel().getState(), interfaceC1084f, 8);
                    IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
                    ArticleSearchState articleSearchState = (ArticleSearchState) xA.getValue();
                    final IntercomArticleSearchActivity intercomArticleSearchActivity2 = this.this$0;
                    intercomArticleSearchActivity.SearchScreenContent(articleSearchState, new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.search.i
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomArticleSearchActivity.C22661.C04071.invoke$lambda$0(intercomArticleSearchActivity2);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.search.j
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchActivity.C22661.C04071.invoke$lambda$1(intercomArticleSearchActivity2, (q) obj);
                        }
                    }, new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.search.k
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return IntercomArticleSearchActivity.C22661.C04071.invoke$lambda$2(intercomArticleSearchActivity2, (String) obj);
                        }
                    }, interfaceC1084f, 32768);
                }
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                kotlin.jvm.internal.i.d(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, androidx.compose.runtime.internal.a.b(-1191058574, new C04071(IntercomArticleSearchActivity.this), interfaceC1084f), interfaceC1084f, 56);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchViewModel viewModel_delegate$lambda$0(IntercomArticleSearchActivity this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ArticleSearchViewModel.Companion companion = ArticleSearchViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        kotlin.jvm.internal.i.d(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(this$0, helpCenterApi, this$0.getArgs().isFromSearchBrowse());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(io.intercom.android.sdk.R.anim.intercom_donothing, io.intercom.android.sdk.R.anim.intercom_fade_out);
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this._binding = IntercomActivityArticleSearchBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getRoot());
        setupInsets();
        subscribeToStates();
        overridePendingTransition(io.intercom.android.sdk.R.anim.intercom_fade_in, io.intercom.android.sdk.R.anim.intercom_donothing);
    }
}
