package io.intercom.android.sdk.helpcenter.articles;

import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ArticleViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleViewModel extends Y implements ArticleWebViewListener {
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;
    private final kotlinx.coroutines.flow.q<ArticleViewState> _state;
    private final AppConfig appConfig;
    private String articleContentId;
    private String articleId;
    private final String baseUrl;
    private final CommonRepository commonRepository;
    private final AbstractC2712w dispatcher;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private final boolean isSystemInDarkTheme;
    private final MetricTracker metricTracker;
    private final Ia.l<Integer, p293xa.r> scrollTo;
    private final boolean shouldHideReactions;
    private final A<ArticleViewState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ArticleViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1", f = "ArticleViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final kotlinx.coroutines.flow.u<IntercomEvent> event = ArticleViewModel.this.intercomDataLayer.getEvent();
                InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleViewModel.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                            this.$this_unsafeFlow = interfaceC2687d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof IntercomEvent.NewConversation) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return p293xa.r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = event.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                    }
                };
                final ArticleViewModel articleViewModel = ArticleViewModel.this;
                InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel.1.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        articleViewModel.updateTeamPresence(newConversation.getConversation());
                        return p293xa.r.f47939a;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((IntercomEvent.NewConversation) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                    }
                };
                this.label = 1;
                if (interfaceC2686c.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: compiled from: ArticleViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r8v0, types: [io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1] */
        public final ArticleViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str, final String str2, final boolean z10, final boolean z11, final Ia.l<? super Integer, p293xa.r> lVar, final boolean z12) {
            return new a0.c() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, p014b1.a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, p014b1.a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    kotlin.jvm.internal.i.e(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    kotlin.jvm.internal.i.d(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
                    kotlin.jvm.internal.i.b(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    kotlin.jvm.internal.i.d(messengerApi, "getMessengerApi(...)");
                    return new ArticleViewModel(helpCenterApi, str, appConfig2, metricTracker, str2, z10, z11, null, dataLayer, new CommonRepository(messengerApi, dataLayer), lVar, z12, 128, null);
                }
            };
        }

        public final ArticleViewModel create(c0 owner, HelpCenterApi helpCenterApi, String baseUrl, String metricPlace, boolean z10, boolean z11, Ia.l<? super Integer, p293xa.r> scrollTo, boolean z12) {
            kotlin.jvm.internal.i.e(owner, "owner");
            kotlin.jvm.internal.i.e(helpCenterApi, "helpCenterApi");
            kotlin.jvm.internal.i.e(baseUrl, "baseUrl");
            kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
            kotlin.jvm.internal.i.e(scrollTo, "scrollTo");
            ArticleViewModel$Companion$factory$1 factory = factory(helpCenterApi, baseUrl, metricPlace, z10, z11, scrollTo, z12);
            kotlin.jvm.internal.i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            kotlin.jvm.internal.i.e(store, "store");
            kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(ArticleViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (ArticleViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ArticleViewModel.kt */
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1", f = "ArticleViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend")
    public static final class C22571 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $articleId;
        final /* synthetic */ ArticleViewState.Content $defaultState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22571(String str, ArticleViewState.Content content, kotlin.coroutines.c<? super C22571> cVar) {
            super(2, cVar);
            this.$articleId = str;
            this.$defaultState = content;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleViewModel.this.new C22571(this.$articleId, this.$defaultState, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objFetchArticle$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                this.label = 1;
                objFetchArticle$default = HelpCenterApi.DefaultImpls.fetchArticle$default(helpCenterApi, str, null, this, 2, null);
                if (objFetchArticle$default == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                objFetchArticle$default = obj;
            }
            NetworkResponse networkResponse = (NetworkResponse) objFetchArticle$default;
            if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                ArticleViewModel.this._state.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, null, ArticleViewState.WebViewStatus.Idle, null, null, 27, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                String relatedConversationId = ((ArticleResponse) success.getBody()).getArticle().getRelatedConversationId();
                ArticleViewState.TeamPresenceState defaultTeamPresenceState = null;
                if (relatedConversationId != null) {
                    ArticleViewState.TeamPresenceState defaultTeamPresenceState2 = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                    defaultTeamPresenceState = defaultTeamPresenceState2.copy((511 & 1) != 0 ? defaultTeamPresenceState2.articleMetadata : null, (511 & 2) != 0 ? defaultTeamPresenceState2.conversationState : new ArticleViewState.ConversationState(relatedConversationId, 0, 2, null), (511 & 4) != 0 ? defaultTeamPresenceState2.subtitleText : null, (511 & 8) != 0 ? defaultTeamPresenceState2.messageButtonText : 0, (511 & 16) != 0 ? defaultTeamPresenceState2.messageButtonIcon : 0, (511 & 32) != 0 ? defaultTeamPresenceState2.messageButtonColor : 0, (511 & 64) != 0 ? defaultTeamPresenceState2.metricPlace : null, (511 & 128) != 0 ? defaultTeamPresenceState2.metricContext : null, (511 & 256) != 0 ? defaultTeamPresenceState2.isFromSearchBrowse : false, (511 & 512) != 0 ? defaultTeamPresenceState2.ctaData : null);
                }
                kotlinx.coroutines.flow.q qVar = ArticleViewModel.this._state;
                ArticleViewState.WebViewStatus webViewStatus = ArticleViewState.WebViewStatus.Idle;
                if (defaultTeamPresenceState == null) {
                    defaultTeamPresenceState = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                }
                ArticleMetadata articleMetadata = new ArticleMetadata(((ArticleResponse) success.getBody()).getArticle().getCard().getArticleId(), ((ArticleResponse) success.getBody()).getArticle().getCard().getTitle());
                qVar.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, articleMetadata, webViewStatus, null, defaultTeamPresenceState, 9, null));
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((C22571) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1", f = "ArticleViewModel.kt", l = {198}, m = "invokeSuspend")
    public static final class C22581 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C22581(kotlin.coroutines.c<? super C22581> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleViewModel.this.new C22581(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOpenMessenger;
            int i10;
            ArticleViewState.Content content;
            ArticleViewState.TeamPresenceState teamPresenceStateCopy;
            int i11;
            kotlinx.coroutines.flow.q qVar;
            int i12;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i13 = this.label;
            if (i13 == 0) {
                kotlin.b.b(obj);
                ArticleViewState articleViewState = (ArticleViewState) ArticleViewModel.this._state.getValue();
                if (articleViewState instanceof ArticleViewState.Content) {
                    kotlinx.coroutines.flow.q qVar2 = ArticleViewModel.this._state;
                    ArticleViewModel articleViewModel = ArticleViewModel.this;
                    ArticleViewState.Content content2 = (ArticleViewState.Content) articleViewState;
                    articleViewModel.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_SAD, Boolean.valueOf(articleViewModel.appConfig.isInboundMessages()), articleViewModel.isFromSearchBrowse);
                    articleViewModel.sendReactionToServer(articleViewModel.articleId, articleViewModel.articleContentId, 2);
                    int i14 = io.intercom.android.sdk.R.id.sad_end;
                    boolean zShouldAddSendMessageRow = articleViewModel.shouldAddSendMessageRow();
                    int i15 = zShouldAddSendMessageRow ? 0 : 8;
                    ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(content2.getArticleMetadata(), content2.getTeamPresenceState(), articleViewModel.intercomDataLayer.getTeamPresence().getValue(), articleViewModel.appConfig, "article", articleViewModel.isFromSearchBrowse);
                    CommonRepository commonRepository = articleViewModel.commonRepository;
                    this.L$0 = content2;
                    this.L$1 = teamPresenceStateComputeViewState;
                    this.L$2 = qVar2;
                    this.I$0 = i14;
                    this.I$1 = i15;
                    this.I$2 = zShouldAddSendMessageRow ? 1 : 0;
                    this.label = 1;
                    objOpenMessenger = commonRepository.openMessenger(this);
                    if (objOpenMessenger == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i10 = zShouldAddSendMessageRow ? 1 : 0;
                    content = content2;
                    teamPresenceStateCopy = teamPresenceStateComputeViewState;
                    i11 = i14;
                    qVar = qVar2;
                    i12 = i15;
                } else if (!kotlin.jvm.internal.i.a(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                return p293xa.r.f47939a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$2;
            int i16 = this.I$1;
            int i17 = this.I$0;
            kotlinx.coroutines.flow.q qVar3 = (kotlinx.coroutines.flow.q) this.L$2;
            ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) this.L$1;
            ArticleViewState.Content content3 = (ArticleViewState.Content) this.L$0;
            kotlin.b.b(obj);
            i12 = i16;
            qVar = qVar3;
            teamPresenceStateCopy = teamPresenceState;
            content = content3;
            i11 = i17;
            objOpenMessenger = obj;
            OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) objOpenMessenger;
            if ((openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null) != null) {
                teamPresenceStateCopy = teamPresenceStateCopy.copy((511 & 1) != 0 ? teamPresenceStateCopy.articleMetadata : null, (511 & 2) != 0 ? teamPresenceStateCopy.conversationState : null, (511 & 4) != 0 ? teamPresenceStateCopy.subtitleText : null, (511 & 8) != 0 ? teamPresenceStateCopy.messageButtonText : 0, (511 & 16) != 0 ? teamPresenceStateCopy.messageButtonIcon : 0, (511 & 32) != 0 ? teamPresenceStateCopy.messageButtonColor : 0, (511 & 64) != 0 ? teamPresenceStateCopy.metricPlace : null, (511 & 128) != 0 ? teamPresenceStateCopy.metricContext : null, (511 & 256) != 0 ? teamPresenceStateCopy.isFromSearchBrowse : false, (511 & 512) != 0 ? teamPresenceStateCopy.ctaData : openMessengerResponse.getNewConversationData().getCta());
            }
            qVar.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, i11, ArticleViewState.Reaction.Sad, i12, i10 != 0, 1, null), teamPresenceStateCopy, 7, null));
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((C22581) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1", f = "ArticleViewModel.kt", l = {270}, m = "invokeSuspend")
    public static final class C22591 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $articleContentId;
        final /* synthetic */ String $articleId;
        final /* synthetic */ int $reactionIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22591(String str, int i10, String str2, kotlin.coroutines.c<? super C22591> cVar) {
            super(2, cVar);
            this.$articleId = str;
            this.$reactionIndex = i10;
            this.$articleContentId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleViewModel.this.new C22591(this.$articleId, this.$reactionIndex, this.$articleContentId, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                int i11 = this.$reactionIndex;
                String str2 = this.$articleContentId;
                String str3 = ArticleViewModel.this.isFromSearchBrowse ? "search_browse" : null;
                this.label = 1;
                if (HelpCenterApi.DefaultImpls.reactToArticle$default(helpCenterApi, str, i11, str2, false, str3, null, this, 40, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((C22591) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleViewModel(HelpCenterApi helpCenterApi, String baseUrl, AppConfig appConfig, MetricTracker metricTracker, String metricPlace, boolean z10, boolean z11, AbstractC2712w dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, Ia.l<? super Integer, p293xa.r> scrollTo, boolean z12) {
        kotlin.jvm.internal.i.e(helpCenterApi, "helpCenterApi");
        kotlin.jvm.internal.i.e(baseUrl, "baseUrl");
        kotlin.jvm.internal.i.e(appConfig, "appConfig");
        kotlin.jvm.internal.i.e(metricTracker, "metricTracker");
        kotlin.jvm.internal.i.e(metricPlace, "metricPlace");
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(intercomDataLayer, "intercomDataLayer");
        kotlin.jvm.internal.i.e(commonRepository, "commonRepository");
        kotlin.jvm.internal.i.e(scrollTo, "scrollTo");
        this.helpCenterApi = helpCenterApi;
        this.baseUrl = baseUrl;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z10;
        this.shouldHideReactions = z11;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.scrollTo = scrollTo;
        this.isSystemInDarkTheme = z12;
        StateFlowImpl stateFlowImplA = B.a(ArticleViewState.Initial.INSTANCE);
        this._state = stateFlowImplA;
        this.state = C2688e.b(stateFlowImplA);
        this.articleContentId = "";
        this.articleId = "";
        if (!metricPlace.equals(MetricTracker.Place.COLLECTION_LIST)) {
            if (!metricPlace.equals("article")) {
                metricTracker.openedNativeHelpCenter(metricPlace, metricPlace.equals(MetricTracker.Place.API) ? "article" : MetricTracker.Context.NO_CONTEXT);
            }
        }
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass1(null), 2);
    }

    private final void sendFailedMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "article", num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    public static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        articleViewModel.sendFailedMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReactionToServer(String str, String str2, int i10) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C22591(str, i10, str2, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.appConfig.getArticleAutoReactionEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTeamPresence(Conversation conversation) {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            if (content.getReactionState().getTransitionState() == io.intercom.android.sdk.R.id.sad_end) {
                kotlinx.coroutines.flow.q<ArticleViewState> qVar = this._state;
                ArticleViewState.TeamPresenceState teamPresenceState = content.getTeamPresenceState();
                qVar.setValue(ArticleViewState.Content.copy$default(content, null, null, null, null, teamPresenceState.copy((511 & 1) != 0 ? teamPresenceState.articleMetadata : null, (511 & 2) != 0 ? teamPresenceState.conversationState : new ArticleViewState.ConversationState(conversation.getId(), 0, 2, null), (511 & 4) != 0 ? teamPresenceState.subtitleText : null, (511 & 8) != 0 ? teamPresenceState.messageButtonText : 0, (511 & 16) != 0 ? teamPresenceState.messageButtonIcon : 0, (511 & 32) != 0 ? teamPresenceState.messageButtonColor : 0, (511 & 64) != 0 ? teamPresenceState.metricPlace : null, (511 & 128) != 0 ? teamPresenceState.metricContext : null, (511 & 256) != 0 ? teamPresenceState.isFromSearchBrowse : false, (511 & 512) != 0 ? teamPresenceState.ctaData : null), 15, null));
            }
        }
    }

    public final void articleContentIdFetched(String str) {
        if (str != null) {
            this.articleContentId = str;
            ArticleViewState value = this._state.getValue();
            if (value instanceof ArticleViewState.Content) {
                ArticleViewState.Content content = (ArticleViewState.Content) value;
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), this.shouldHideReactions ? 8 : 0, 0, null, 0, false, 30, null), null, 23, null));
            } else if (!kotlin.jvm.internal.i.a(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        sendFailedMetric(404);
        this._state.setValue(new ArticleViewState.Error(io.intercom.android.sdk.R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void fragmentLoaded(String articleId) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        this.articleId = articleId;
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        String str = "dark";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "light";
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!this.isSystemInDarkTheme) {
                    str = "light";
                }
            }
        }
        ArticleViewState.Content content = new ArticleViewState.Content(this.baseUrl + "/articles/" + articleId + "?theme=" + str, new ArticleMetadata(articleId, null, 2, null), ArticleViewState.WebViewStatus.Loading, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState());
        this._state.setValue(content);
        C2680e.c(Z.a(this), this.dispatcher, null, new C22571(articleId, content, null), 2);
    }

    public final A<ArticleViewState> getState() {
        return this.state;
    }

    public final void happyReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (!kotlin.jvm.internal.i.a(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kotlinx.coroutines.flow.q<ArticleViewState> qVar = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_HAPPY, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 0);
            qVar.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, io.intercom.android.sdk.R.id.happy_end, ArticleViewState.Reaction.Happy, 8, false, 1, null), null, 23, null));
        }
    }

    public final void neutralReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (!kotlin.jvm.internal.i.a(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kotlinx.coroutines.flow.q<ArticleViewState> qVar = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_NEUTRAL, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 1);
            qVar.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, io.intercom.android.sdk.R.id.neutral_end, ArticleViewState.Reaction.Neutral, 8, false, 1, null), null, 23, null));
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", null, this.isFromSearchBrowse);
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Ready, null, null, 27, null));
        } else if (!kotlin.jvm.internal.i.a(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        sendFailedMetric$default(this, null, 1, null);
        this._state.setValue(new ArticleViewState.Error(io.intercom.android.sdk.R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Loading, null, null, 27, null));
        } else if (!kotlin.jvm.internal.i.a(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void sadReactionTapped() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C22581(null), 2);
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int i10) {
        this.scrollTo.invoke(Integer.valueOf(i10));
    }

    public ArticleViewModel(HelpCenterApi helpCenterApi, String str, AppConfig appConfig, MetricTracker metricTracker, String str2, boolean z10, boolean z11, AbstractC2712w abstractC2712w, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, Ia.l lVar, boolean z12, int i10, kotlin.jvm.internal.e eVar) {
        this(helpCenterApi, str, appConfig, metricTracker, str2, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? N.f43200c : abstractC2712w, intercomDataLayer, commonRepository, lVar, (i10 & 2048) != 0 ? false : z12);
    }
}
