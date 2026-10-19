package io.intercom.android.sdk.helpcenter.search;

import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ArticleSearchViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleSearchViewModel extends Y {
    private final q<ArticleSearchState> _state;
    private final AppConfig appConfig;
    private final CommonRepository commonRepository;
    private final AbstractC2712w dispatcher;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private String lastSearchedInput;
    private final MetricTracker metricTracker;
    private final p<String> searchInput;
    private final A<ArticleSearchState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1", f = "ArticleSearchViewModel.kt", l = {R.styleable.AppCompatTheme_windowActionBarOverlay}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleSearchViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                p pVar = ArticleSearchViewModel.this.searchInput;
                ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, ArticleSearchViewModel.this);
                int i11 = kotlinx.coroutines.flow.k.f43411a;
                final ChannelFlowTransformLatest channelFlowTransformLatest = new ChannelFlowTransformLatest(articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1, pVar, EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                final InterfaceC2686c<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> interfaceC2686c = new InterfaceC2686c<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ArticleSearchViewModel.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = interfaceC2687d;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
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
                                Pair pair = (Pair) obj;
                                this.this$0.lastSearchedInput = (String) pair.d();
                                Object objC = pair.c();
                                anonymousClass1.label = 1;
                                if (interfaceC2687d.emit(objC, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = channelFlowTransformLatest.collect(new AnonymousClass2(interfaceC2687d, articleSearchViewModel), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel2 = ArticleSearchViewModel.this;
                InterfaceC2686c<ArticleSearchState> interfaceC2686c2 = new InterfaceC2686c<ArticleSearchState>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2", f = "ArticleSearchViewModel.kt", l = {234, 245, 219}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            Object L$2;
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

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = interfaceC2687d;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:43:0x0104  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0109  */
                        /* JADX WARN: Code duplicated, block: B:46:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:54:0x015c A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            InterfaceC2687d interfaceC2687d;
                            ArticleSearchState noResultsNoTeamHelp;
                            AnonymousClass2<T> anonymousClass2;
                            ArticleViewState.TeamPresenceState teamPresenceStateCopy;
                            InterfaceC2687d interfaceC2687d2;
                            InterfaceC2687d interfaceC2687d3;
                            OpenMessengerResponse openMessengerResponse;
                            OpenMessengerResponse.NewConversationData newConversationData;
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
                                interfaceC2687d = this.$this_unsafeFlow;
                                NetworkResponse networkResponse = (NetworkResponse) obj;
                                if (networkResponse instanceof NetworkResponse.ServerError) {
                                    this.this$0.sendFailedSearchMetric(new Integer(((NetworkResponse.ServerError) networkResponse).getCode()));
                                    noResultsNoTeamHelp = ArticleSearchState.Error.INSTANCE;
                                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                                    ArticleSearchViewModel.sendFailedSearchMetric$default(this.this$0, null, 1, null);
                                    noResultsNoTeamHelp = ArticleSearchState.Error.INSTANCE;
                                } else {
                                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    List list = (List) ((NetworkResponse.Success) networkResponse).getBody();
                                    if (!list.isEmpty()) {
                                        ArticleSearchViewModel articleSearchViewModel = this.this$0;
                                        anonymousClass1.L$0 = interfaceC2687d;
                                        anonymousClass1.label = 1;
                                        Object objTransformToUiModel = articleSearchViewModel.transformToUiModel(list, anonymousClass1);
                                        if (objTransformToUiModel == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        interfaceC2687d3 = interfaceC2687d;
                                        obj2 = objTransformToUiModel;
                                        ArticleSearchState content = new ArticleSearchState.Content((List) obj2);
                                        interfaceC2687d = interfaceC2687d3;
                                        noResultsNoTeamHelp = content;
                                    } else if (this.this$0.shouldAddSendMessageRow()) {
                                        ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this.this$0.intercomDataLayer.getTeamPresence().getValue(), this.this$0.appConfig, MetricTracker.Place.SEARCH_RESULTS, this.this$0.isFromSearchBrowse);
                                        CommonRepository commonRepository = this.this$0.commonRepository;
                                        anonymousClass1.L$0 = this;
                                        anonymousClass1.L$1 = interfaceC2687d;
                                        anonymousClass1.L$2 = teamPresenceStateComputeViewState;
                                        anonymousClass1.label = 2;
                                        Object objOpenMessenger = commonRepository.openMessenger(anonymousClass1);
                                        if (objOpenMessenger == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        anonymousClass2 = this;
                                        teamPresenceStateCopy = teamPresenceStateComputeViewState;
                                        interfaceC2687d2 = interfaceC2687d;
                                        obj2 = objOpenMessenger;
                                        openMessengerResponse = (OpenMessengerResponse) obj2;
                                        if (openMessengerResponse != null) {
                                            newConversationData = openMessengerResponse.getNewConversationData();
                                        } else {
                                            newConversationData = null;
                                        }
                                        if (newConversationData != null) {
                                            teamPresenceStateCopy = teamPresenceStateCopy.copy((511 & 1) != 0 ? teamPresenceStateCopy.articleMetadata : null, (511 & 2) != 0 ? teamPresenceStateCopy.conversationState : null, (511 & 4) != 0 ? teamPresenceStateCopy.subtitleText : null, (511 & 8) != 0 ? teamPresenceStateCopy.messageButtonText : 0, (511 & 16) != 0 ? teamPresenceStateCopy.messageButtonIcon : 0, (511 & 32) != 0 ? teamPresenceStateCopy.messageButtonColor : 0, (511 & 64) != 0 ? teamPresenceStateCopy.metricPlace : null, (511 & 128) != 0 ? teamPresenceStateCopy.metricContext : null, (511 & 256) != 0 ? teamPresenceStateCopy.isFromSearchBrowse : false, (511 & 512) != 0 ? teamPresenceStateCopy.ctaData : openMessengerResponse.getNewConversationData().getCta());
                                        }
                                        noResultsNoTeamHelp = new ArticleSearchState.NoResults(teamPresenceStateCopy, anonymousClass2.this$0.lastSearchedInput);
                                        interfaceC2687d = interfaceC2687d2;
                                    } else {
                                        noResultsNoTeamHelp = new ArticleSearchState.NoResultsNoTeamHelp(this.this$0.lastSearchedInput);
                                    }
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.label = 3;
                                if (interfaceC2687d.emit(noResultsNoTeamHelp, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i11 == 1) {
                                interfaceC2687d3 = (InterfaceC2687d) anonymousClass1.L$0;
                                kotlin.b.b(obj2);
                                ArticleSearchState content2 = new ArticleSearchState.Content((List) obj2);
                                interfaceC2687d = interfaceC2687d3;
                                noResultsNoTeamHelp = content2;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.label = 3;
                                if (interfaceC2687d.emit(noResultsNoTeamHelp, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i11 == 2) {
                                ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) anonymousClass1.L$2;
                                interfaceC2687d2 = (InterfaceC2687d) anonymousClass1.L$1;
                                anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                                kotlin.b.b(obj2);
                                teamPresenceStateCopy = teamPresenceState;
                                openMessengerResponse = (OpenMessengerResponse) obj2;
                                if (openMessengerResponse != null) {
                                    newConversationData = openMessengerResponse.getNewConversationData();
                                } else {
                                    newConversationData = null;
                                }
                                if (newConversationData != null) {
                                    teamPresenceStateCopy = teamPresenceStateCopy.copy((511 & 1) != 0 ? teamPresenceStateCopy.articleMetadata : null, (511 & 2) != 0 ? teamPresenceStateCopy.conversationState : null, (511 & 4) != 0 ? teamPresenceStateCopy.subtitleText : null, (511 & 8) != 0 ? teamPresenceStateCopy.messageButtonText : 0, (511 & 16) != 0 ? teamPresenceStateCopy.messageButtonIcon : 0, (511 & 32) != 0 ? teamPresenceStateCopy.messageButtonColor : 0, (511 & 64) != 0 ? teamPresenceStateCopy.metricPlace : null, (511 & 128) != 0 ? teamPresenceStateCopy.metricContext : null, (511 & 256) != 0 ? teamPresenceStateCopy.isFromSearchBrowse : false, (511 & 512) != 0 ? teamPresenceStateCopy.ctaData : openMessengerResponse.getNewConversationData().getCta());
                                }
                                noResultsNoTeamHelp = new ArticleSearchState.NoResults(teamPresenceStateCopy, anonymousClass2.this$0.lastSearchedInput);
                                interfaceC2687d = interfaceC2687d2;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.label = 3;
                                if (interfaceC2687d.emit(noResultsNoTeamHelp, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super ArticleSearchState> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d, articleSearchViewModel2), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel3 = ArticleSearchViewModel.this;
                InterfaceC2687d<? super ArticleSearchState> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.1.4
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ArticleSearchState) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(ArticleSearchState articleSearchState, kotlin.coroutines.c<? super r> cVar) {
                        articleSearchViewModel3._state.setValue(articleSearchState);
                        return r.f47939a;
                    }
                };
                this.label = 1;
                if (interfaceC2686c2.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2", f = "ArticleSearchViewModel.kt", l = {R.styleable.AppCompatTheme_windowNoTitle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleSearchViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final u<IntercomEvent> event = ArticleSearchViewModel.this.intercomDataLayer.getEvent();
                InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleSearchViewModel.kt", l = {219}, m = "emit")
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
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = event.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.2.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, kotlin.coroutines.c<? super r> cVar) {
                        Object objUpdateTeammateHelpRow = articleSearchViewModel.updateTeammateHelpRow(cVar);
                        return objUpdateTeammateHelpRow == CoroutineSingletons.f43038b ? objUpdateTeammateHelpRow : r.f47939a;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((IntercomEvent.NewConversation) obj2, (kotlin.coroutines.c<? super r>) cVar);
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
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1] */
        private final ArticleSearchViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final boolean z10) {
            return new a0.c() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1
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
                    HelpCenterApi helpCenterApi2 = helpCenterApi;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    kotlin.jvm.internal.i.d(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
                    boolean z11 = z10;
                    kotlin.jvm.internal.i.b(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    kotlin.jvm.internal.i.d(messengerApi, "getMessengerApi(...)");
                    return new ArticleSearchViewModel(helpCenterApi2, appConfig2, metricTracker, z11, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 16, null);
                }
            };
        }

        public final ArticleSearchViewModel create(c0 owner, HelpCenterApi helpCenterApi, boolean z10) {
            kotlin.jvm.internal.i.e(owner, "owner");
            kotlin.jvm.internal.i.e(helpCenterApi, "helpCenterApi");
            ArticleSearchViewModel$Companion$factory$1 factory = factory(helpCenterApi, z10);
            kotlin.jvm.internal.i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            kotlin.jvm.internal.i.e(store, "store");
            kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(ArticleSearchViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (ArticleSearchViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1", f = "ArticleSearchViewModel.kt", l = {183, 185}, m = "invokeSuspend")
    public static final class C22601 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C22601(kotlin.coroutines.c<? super C22601> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleSearchViewModel.this.new C22601(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArticleSearchState articleSearchState;
            ArticleSearchState.Content content;
            Collection collection;
            q qVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    articleSearchState = (ArticleSearchState) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.L$2;
                    content = (ArticleSearchState.Content) this.L$1;
                    qVar = (q) this.L$0;
                    kotlin.b.b(obj);
                }
                qVar.setValue(content.copy(kotlin.collections.q.d0(collection, obj)));
                return r.f47939a;
            }
            kotlin.b.b(obj);
            ArticleSearchViewModel.this.hasClickedAtLeastOneArticle = true;
            if (ArticleSearchViewModel.this.shouldAddSendMessageRow()) {
                articleSearchState = (ArticleSearchState) ArticleSearchViewModel.this._state.getValue();
                if (articleSearchState instanceof ArticleSearchState.Content) {
                    List<ArticleSearchResultRow> searchResults = ((ArticleSearchState.Content) articleSearchState).getSearchResults();
                    if (!(searchResults instanceof Collection) || !searchResults.isEmpty()) {
                        Iterator<T> it = searchResults.iterator();
                        while (it.hasNext()) {
                            if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                            }
                        }
                    }
                    this.L$0 = articleSearchState;
                    this.label = 1;
                    if (I.b(2000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return r.f47939a;
            q qVar2 = ArticleSearchViewModel.this._state;
            content = (ArticleSearchState.Content) articleSearchState;
            List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
            ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
            this.L$0 = qVar2;
            this.L$1 = content;
            this.L$2 = searchResults2;
            this.label = 2;
            Object objTeammateHelpRow = articleSearchViewModel.teammateHelpRow(this);
            if (objTeammateHelpRow == coroutineSingletons) {
                return coroutineSingletons;
            }
            collection = searchResults2;
            qVar = qVar2;
            obj = objTeammateHelpRow;
            qVar.setValue(content.copy(kotlin.collections.q.d0(collection, obj)));
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C22601) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1", f = "ArticleSearchViewModel.kt", l = {136}, m = "invokeSuspend")
    public static final class C22611 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ InterfaceC2686c<String> $textChanged;
        int label;
        final /* synthetic */ ArticleSearchViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
        @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C04061 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super String>, kotlin.coroutines.c<? super r>, Object> {
            int label;
            final /* synthetic */ ArticleSearchViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04061(ArticleSearchViewModel articleSearchViewModel, kotlin.coroutines.c<? super C04061> cVar) {
                super(2, cVar);
                this.this$0 = articleSearchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04061(this.this$0, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.this$0.metricTracker.searchedNativeHelpCenter(this.this$0.isFromSearchBrowse);
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(InterfaceC2687d<? super String> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
                return ((C04061) create(interfaceC2687d, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22611(InterfaceC2686c<String> interfaceC2686c, ArticleSearchViewModel articleSearchViewModel, kotlin.coroutines.c<? super C22611> cVar) {
            super(2, cVar);
            this.$textChanged = interfaceC2686c;
            this.this$0 = articleSearchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new C22611(this.$textChanged, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C04061(this.this$0, null), C2688e.g(this.$textChanged, 400L));
                final ArticleSearchViewModel articleSearchViewModel = this.this$0;
                InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.searchForArticles.1.2
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((String) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(String str, kotlin.coroutines.c<? super r> cVar) {
                        if (str.length() == 0) {
                            articleSearchViewModel._state.setValue(ArticleSearchState.Initial.INSTANCE);
                            return r.f47939a;
                        }
                        articleSearchViewModel._state.setValue(ArticleSearchState.Loading.INSTANCE);
                        Object objEmit = articleSearchViewModel.searchInput.emit(str, cVar);
                        return objEmit == CoroutineSingletons.f43038b ? objEmit : r.f47939a;
                    }
                };
                this.label = 1;
                if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C22611) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C22621 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C22621(kotlin.coroutines.c<? super C22621> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ArticleSearchViewModel.this.new C22621(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            if (ArticleSearchViewModel.this._state.getValue() instanceof ArticleSearchState.Content) {
                ArticleSearchViewModel.this.metricTracker.openedNativeHelpCenterSearchResult(ArticleSearchViewModel.this.isFromSearchBrowse, ArticleSearchViewModel.this.lastSearchedInput);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C22621) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$teammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {240}, m = "teammateHelpRow")
    public static final class C22631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22631(kotlin.coroutines.c<? super C22631> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.teammateHelpRow(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$transformToUiModel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {226}, m = "transformToUiModel")
    public static final class C22641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22641(kotlin.coroutines.c<? super C22641> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.transformToUiModel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$updateTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ArticleSearchViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {152}, m = "updateTeammateHelpRow")
    public static final class C22651 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C22651(kotlin.coroutines.c<? super C22651> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.updateTeammateHelpRow(this);
        }
    }

    public ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z10, AbstractC2712w dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        kotlin.jvm.internal.i.e(helpCenterApi, "helpCenterApi");
        kotlin.jvm.internal.i.e(appConfig, "appConfig");
        kotlin.jvm.internal.i.e(metricTracker, "metricTracker");
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(intercomDataLayer, "intercomDataLayer");
        kotlin.jvm.internal.i.e(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z10;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        StateFlowImpl stateFlowImplA = B.a(ArticleSearchState.Initial.INSTANCE);
        this._state = stateFlowImplA;
        this.state = C2688e.b(stateFlowImplA);
        this.lastSearchedInput = "";
        this.searchInput = w.b(0, 0, null, 7);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass1(null), 2);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass2(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSearchMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.SEARCH_RESULTS, num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    public static /* synthetic */ void sendFailedSearchMetric$default(ArticleSearchViewModel articleSearchViewModel, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        articleSearchViewModel.sendFailedSearchMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object teammateHelpRow(kotlin.coroutines.c<? super ArticleSearchResultRow.TeammateHelpRow> cVar) {
        C22631 c22631;
        ArticleViewState.TeamPresenceState teamPresenceStateCopy;
        if (cVar instanceof C22631) {
            c22631 = (C22631) cVar;
            int i10 = c22631.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c22631.label = i10 - Integer.MIN_VALUE;
            } else {
                c22631 = new C22631(cVar);
            }
        } else {
            c22631 = new C22631(cVar);
        }
        Object obj = c22631.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = c22631.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this.intercomDataLayer.getTeamPresence().getValue(), this.appConfig, MetricTracker.Place.SEARCH_RESULTS, this.isFromSearchBrowse);
            CommonRepository commonRepository = this.commonRepository;
            c22631.L$0 = teamPresenceStateComputeViewState;
            c22631.label = 1;
            Object objOpenMessenger = commonRepository.openMessenger(c22631);
            if (objOpenMessenger == coroutineSingletons) {
                return coroutineSingletons;
            }
            teamPresenceStateCopy = teamPresenceStateComputeViewState;
            obj = objOpenMessenger;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            teamPresenceStateCopy = (ArticleViewState.TeamPresenceState) c22631.L$0;
            kotlin.b.b(obj);
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        if ((openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null) != null) {
            teamPresenceStateCopy = teamPresenceStateCopy.copy((511 & 1) != 0 ? teamPresenceStateCopy.articleMetadata : null, (511 & 2) != 0 ? teamPresenceStateCopy.conversationState : null, (511 & 4) != 0 ? teamPresenceStateCopy.subtitleText : null, (511 & 8) != 0 ? teamPresenceStateCopy.messageButtonText : 0, (511 & 16) != 0 ? teamPresenceStateCopy.messageButtonIcon : 0, (511 & 32) != 0 ? teamPresenceStateCopy.messageButtonColor : 0, (511 & 64) != 0 ? teamPresenceStateCopy.metricPlace : null, (511 & 128) != 0 ? teamPresenceStateCopy.metricContext : null, (511 & 256) != 0 ? teamPresenceStateCopy.isFromSearchBrowse : false, (511 & 512) != 0 ? teamPresenceStateCopy.ctaData : openMessengerResponse.getNewConversationData().getCta());
        }
        return new ArticleSearchResultRow.TeammateHelpRow(teamPresenceStateCopy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transformToUiModel(List<HelpCenterArticleSearchResponse> list, kotlin.coroutines.c<? super List<? extends ArticleSearchResultRow>> cVar) {
        C22641 c22641;
        Collection collectionP0;
        Collection collection;
        if (cVar instanceof C22641) {
            c22641 = (C22641) cVar;
            int i10 = c22641.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c22641.label = i10 - Integer.MIN_VALUE;
            } else {
                c22641 = new C22641(cVar);
            }
        } else {
            c22641 = new C22641(cVar);
        }
        Object objTeammateHelpRow = c22641.result;
        Object obj = CoroutineSingletons.f43038b;
        int i11 = c22641.label;
        if (i11 == 0) {
            kotlin.b.b(objTeammateHelpRow);
            List<HelpCenterArticleSearchResponse> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
            for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list2) {
                HelpCenterArticleSearchResponse.Highlight highlight = helpCenterArticleSearchResponse.getHighlight();
                String articleId = helpCenterArticleSearchResponse.getArticleId();
                String title = highlight.getTitle();
                if (title.length() == 0) {
                    title = helpCenterArticleSearchResponse.getTitle();
                }
                arrayList.add(new ArticleSearchResultRow.ArticleResultRow(articleId, title, highlight.getSummary(), highlight.getSummary().length() == 0 ? 8 : 0));
            }
            collectionP0 = kotlin.collections.q.p0(arrayList);
            if (!shouldAddSendMessageRow() || !this.hasClickedAtLeastOneArticle) {
                return collectionP0;
            }
            c22641.L$0 = collectionP0;
            c22641.L$1 = collectionP0;
            c22641.label = 1;
            objTeammateHelpRow = teammateHelpRow(c22641);
            if (objTeammateHelpRow == obj) {
                return obj;
            }
            collection = collectionP0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collectionP0 = (Collection) c22641.L$1;
            collection = (List) c22641.L$0;
            kotlin.b.b(objTeammateHelpRow);
        }
        collectionP0.add(objTeammateHelpRow);
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateTeammateHelpRow(kotlin.coroutines.c<? super r> cVar) {
        C22651 c22651;
        ArticleSearchState.Content content;
        Collection collection;
        q<ArticleSearchState> qVar;
        if (cVar instanceof C22651) {
            c22651 = (C22651) cVar;
            int i10 = c22651.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c22651.label = i10 - Integer.MIN_VALUE;
            } else {
                c22651 = new C22651(cVar);
            }
        } else {
            c22651 = new C22651(cVar);
        }
        Object obj = c22651.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = c22651.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            ArticleSearchState value = this._state.getValue();
            if (!shouldAddSendMessageRow()) {
                q<ArticleSearchState> qVar2 = this._state;
                if (value instanceof ArticleSearchState.Content) {
                    ArticleSearchState.Content content2 = (ArticleSearchState.Content) value;
                    List<ArticleSearchResultRow> searchResults = content2.getSearchResults();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : searchResults) {
                        if (!(((ArticleSearchResultRow) obj3) instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                            arrayList.add(obj3);
                        }
                    }
                    value = content2.copy(arrayList);
                } else if (value instanceof ArticleSearchState.NoResults) {
                    value = new ArticleSearchState.NoResultsNoTeamHelp(((ArticleSearchState.NoResults) value).getSearchTerm());
                }
                qVar2.setValue(value);
            } else if (value instanceof ArticleSearchState.Content) {
                content = (ArticleSearchState.Content) value;
                List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
                if (!(searchResults2 instanceof Collection) || !searchResults2.isEmpty()) {
                    Iterator<T> it = searchResults2.iterator();
                    while (it.hasNext()) {
                        if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                        }
                    }
                }
                q<ArticleSearchState> qVar3 = this._state;
                List<ArticleSearchResultRow> searchResults3 = content.getSearchResults();
                c22651.L$0 = qVar3;
                c22651.L$1 = content;
                c22651.L$2 = searchResults3;
                c22651.label = 1;
                Object objTeammateHelpRow = teammateHelpRow(c22651);
                if (objTeammateHelpRow == obj2) {
                    return obj2;
                }
                collection = searchResults3;
                qVar = qVar3;
                obj = objTeammateHelpRow;
            }
            return r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        collection = (Collection) c22651.L$2;
        content = (ArticleSearchState.Content) c22651.L$1;
        qVar = (q) c22651.L$0;
        kotlin.b.b(obj);
        qVar.setValue(content.copy(kotlin.collections.q.d0(collection, obj)));
        return r.f47939a;
    }

    public final void addTeammateHelpRow() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C22601(null), 2);
    }

    public final A<ArticleSearchState> getState() {
        return this.state;
    }

    public final void searchForArticles(InterfaceC2686c<String> textChanged) {
        kotlin.jvm.internal.i.e(textChanged, "textChanged");
        C2680e.c(Z.a(this), this.dispatcher, null, new C22611(textChanged, this, null), 2);
    }

    public final void sendClickOnSearchResultMetric() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C22621(null), 2);
    }

    public ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z10, AbstractC2712w abstractC2712w, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, kotlin.jvm.internal.e eVar) {
        this(helpCenterApi, appConfig, metricTracker, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? N.f43200c : abstractC2712w, intercomDataLayer, commonRepository);
    }
}
