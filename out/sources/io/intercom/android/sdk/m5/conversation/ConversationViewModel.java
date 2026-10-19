package io.intercom.android.sdk.m5.conversation;

import Aa.c;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.reducers.InitialStateReducerKt;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import io.intercom.android.sdk.m5.conversation.usecase.Action;
import io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState;
import io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.MarkUserContentAsSeenByAdmin;
import io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.UpdateFloatingIndicatorUseCase;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import kotlinx.coroutines.flow.z;
import p014b1.a;
import p014b1.f;
import p293xa.d;
import p293xa.r;

/* JADX INFO: compiled from: ConversationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationViewModel extends Y {
    private static final long DEBOUNCE_DELAY_MS = 500;
    private final p<ConversationUiEffect> _uiEffect;
    private InterfaceC2694i0 adminIsTypingJob;
    private final ShowAdminIsTypingUseCase adminIsTypingUseCase;
    private final ArticleMetadata articleMetadata;
    private final ChangeInputUseCase changeInputUseCase;
    private final q<ConversationClientState> clientState;
    private final ConversationReducer conversationReducer;
    private final ConversationRepository conversationRepository;
    private final String decodedInitialMessage;
    private final AbstractC2712w dispatcher;
    private final FallbackPollingUseCase fallbackPollingUseCase;
    private final FinStreamingUseCase finStreamingUseCase;
    private final q<SearchQuery> gifQueryStateFlow;
    private final String initialConversationId;
    private final LaunchMode launchMode;
    private final LoadGifUseCase loadGifUseCase;
    private final MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin;
    private final MetricTracker metricTracker;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;
    private final A nexusCoroutineScope;
    private final OpenConversationUseCase openConversationUseCase;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
    private final q<Boolean> resumedState;
    private final SendGifUseCase sendGifUseCase;
    private final SendMediaUseCase sendMediaUseCase;
    private final SendMessageUseCase sendMessageUseCase;
    private final SendQuickReplyUseCase sendQuickReplyUseCase;
    private final SendSuggestionUseCase sendSuggestionUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final SoundPlayer soundPlayer;
    private final SubmitAttributeUseCase submitAttributeUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;
    private final u<ConversationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.A<ConversationUiState> uiState;
    private final UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1", f = "ConversationViewModel.kt", l = {201}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = ConversationViewModel.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final A a10 = (A) this.L$0;
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent> interfaceC2686c2 = new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = interfaceC2687d;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0075 A[RETURN] */
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (i.a(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId())) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping = conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping ? (ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) conversationNexusEvent : null;
                                    if (adminIsTyping != null && ConversationViewModelKt.isFastFinTyping(adminIsTyping, (ConversationClientState) this.this$0.clientState.getValue())) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d, conversationViewModel), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
                InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.1.2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: ConversationViewModel.kt */
                    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1", f = "ConversationViewModel.kt", l = {205}, m = "invokeSuspend")
                    public static final class C04131 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04131(ConversationViewModel conversationViewModel, ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super C04131> cVar) {
                            super(2, cVar);
                            this.this$0 = conversationViewModel;
                            this.$it = conversationNexusEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new C04131(this.this$0, this.$it, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                b.b(obj);
                                RefreshConversationUseCase refreshConversationUseCase = this.this$0.refreshConversationUseCase;
                                q<ConversationClientState> qVar = this.this$0.clientState;
                                GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                                this.label = 1;
                                if (refreshConversationUseCase.invoke(qVar, getConversationReason, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj);
                            }
                            this.this$0.soundEffectsUseCase.invoke$intercom_sdk_base_release(n.S(((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getCreatedByUser()) ? Action.OPERATOR_MESSAGE_RECEIVED : Action.ADMIN_MESSAGE_RECEIVED);
                            return r.f47939a;
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                            return ((C04131) create(a10, cVar)).invokeSuspend(r.f47939a);
                        }
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: ConversationViewModel.kt */
                    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2", f = "ConversationViewModel.kt", l = {220}, m = "invokeSuspend")
                    public static final class C04142 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04142(ConversationViewModel conversationViewModel, ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super C04142> cVar) {
                            super(2, cVar);
                            this.this$0 = conversationViewModel;
                            this.$it = conversationNexusEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new C04142(this.this$0, this.$it, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                b.b(obj);
                                ShowAdminIsTypingUseCase showAdminIsTypingUseCase = this.this$0.adminIsTypingUseCase;
                                q<ConversationClientState> qVar = this.this$0.clientState;
                                Avatar avatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getAvatar();
                                boolean zIsBot = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).isBot();
                                boolean showAvatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getShowAvatar();
                                this.label = 1;
                                if (showAdminIsTypingUseCase.invoke(qVar, avatar, zIsBot, showAvatar, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj);
                            }
                            return r.f47939a;
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                            return ((C04142) create(a10, cVar)).invokeSuspend(r.f47939a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super r> cVar) {
                        if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
                            C2680e.c(a10, null, null, new C04131(conversationViewModel2, conversationNexusEvent, null), 3);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) {
                            InterfaceC2694i0 interfaceC2694i0 = conversationViewModel2.adminIsTypingJob;
                            if (interfaceC2694i0 != null) {
                                interfaceC2694i0.i(null);
                            }
                            ConversationViewModel conversationViewModel3 = conversationViewModel2;
                            conversationViewModel3.adminIsTypingJob = C2680e.c(a10, null, null, new C04142(conversationViewModel3, conversationNexusEvent, null), 3);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin) {
                            conversationViewModel2.markUserContentAsSeenByAdmin.invoke(conversationViewModel2.clientState);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.FinStreaming) {
                            Object objInvoke = conversationViewModel2.finStreamingUseCase.invoke(conversationViewModel2.clientState, (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) conversationNexusEvent, cVar);
                            return objInvoke == CoroutineSingletons.f43038b ? objInvoke : r.f47939a;
                        }
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
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$2", f = "ConversationViewModel.kt", l = {249}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                FallbackPollingUseCase fallbackPollingUseCase = ConversationViewModel.this.fallbackPollingUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                this.label = 1;
                if (fallbackPollingUseCase.invoke(qVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3", f = "ConversationViewModel.kt", l = {261}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: ConversationViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.q<ParsedNexusEvent.ConversationNexusEvent, Boolean, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(3, cVar);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z10, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z10;
                return anonymousClass2.invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }

            @Override // Ia.q
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent> cVar) {
                return invoke(conversationNexusEvent, bool.booleanValue(), cVar);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ConversationViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3", f = "ConversationViewModel.kt", l = {262}, m = "invokeSuspend")
        public static final class C04153 extends SuspendLambda implements Ia.p<ParsedNexusEvent.ConversationNexusEvent, kotlin.coroutines.c<? super r>, Object> {
            int label;
            final /* synthetic */ ConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04153(ConversationViewModel conversationViewModel, kotlin.coroutines.c<? super C04153> cVar) {
                super(2, cVar);
                this.this$0 = conversationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C04153(this.this$0, cVar);
            }

            @Override // Ia.p
            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super r> cVar) {
                return ((C04153) create(conversationNexusEvent, cVar)).invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    b.b(obj);
                    RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = this.this$0.refreshUnreadConversationsCountUseCase;
                    q<ConversationClientState> qVar = this.this$0.clientState;
                    this.label = 1;
                    if (refreshUnreadConversationsCountUseCase.invoke(qVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return r.f47939a;
            }
        }

        public AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new AnonymousClass3(cVar);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new o(new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = interfaceC2687d;
                            this.this$0 = conversationViewModel;
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (!i.a(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId()) && (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d, conversationViewModel), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                }, ConversationViewModel.this.resumedState, new AnonymousClass2(null)));
                C04153 c04153 = new C04153(ConversationViewModel.this, null);
                this.label = 1;
                if (C2688e.e(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c04153, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4", f = "ConversationViewModel.kt", l = {270}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new AnonymousClass4(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.NexusConnected) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.4.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.NexusConnected) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(ParsedNexusEvent.NexusConnected nexusConnected, kotlin.coroutines.c<? super r> cVar) {
                        Object objInvoke = conversationViewModel.refreshConversationUseCase.invoke(conversationViewModel.clientState, GetConversationReason.NEXUS_CONNECTED, cVar);
                        return objInvoke == CoroutineSingletons.f43038b ? objInvoke : r.f47939a;
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
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass4) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2, reason: invalid class name */
        /* JADX INFO: compiled from: ConversationViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.q<ParsedNexusEvent.ConversationNexusEvent, Boolean, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(3, cVar);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z10, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z10;
                return anonymousClass2.invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }

            @Override // Ia.q
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, kotlin.coroutines.c<? super ParsedNexusEvent.ConversationNexusEvent> cVar) {
                return invoke(conversationNexusEvent, bool.booleanValue(), cVar);
            }
        }

        public AnonymousClass5(kotlin.coroutines.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new AnonymousClass5(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
            final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements InterfaceC2687d {
                    final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                            b.b(obj2);
                            InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                            if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                anonymousClass1.label = 1;
                                if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b.b(obj2);
                        }
                        return r.f47939a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2686c
                public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                    Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                    return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                }
            };
            new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements InterfaceC2687d {
                    final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                            b.b(obj2);
                            InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                            if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
                                anonymousClass1.label = 1;
                                if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b.b(obj2);
                        }
                        return r.f47939a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2686c
                public Object collect(InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d, kotlin.coroutines.c cVar) {
                    Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d), cVar);
                    return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                }
            };
            q unused = ConversationViewModel.this.resumedState;
            new AnonymousClass2(null);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass5) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6", f = "ConversationViewModel.kt", l = {291}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ GetNetworkState $getNetworkState;
        int label;
        final /* synthetic */ ConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(GetNetworkState getNetworkState, ConversationViewModel conversationViewModel, kotlin.coroutines.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
            this.$getNetworkState = getNetworkState;
            this.this$0 = conversationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass6(this.$getNetworkState, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                InterfaceC2686c interfaceC2686cH = C2688e.h(this.$getNetworkState.invoke());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                if (interfaceC2686cH.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass6) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: ConversationViewModel.kt */
        public static final class AnonymousClass1<T> implements InterfaceC2687d {
            final /* synthetic */ ConversationViewModel this$0;

            public AnonymousClass1(ConversationViewModel conversationViewModel) {
                this.this$0 = conversationViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(NetworkState networkState, kotlin.coroutines.c<? super r> cVar) {
                ConversationViewModel$6$1$emit$1 conversationViewModel$6$1$emit$1;
                AnonymousClass1<T> anonymousClass1;
                Object value;
                ConversationClientState conversationClientState;
                NetworkState networkState2 = networkState;
                if (cVar instanceof ConversationViewModel$6$1$emit$1) {
                    conversationViewModel$6$1$emit$1 = (ConversationViewModel$6$1$emit$1) cVar;
                    int i10 = conversationViewModel$6$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        conversationViewModel$6$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(this, cVar);
                    }
                } else {
                    conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(this, cVar);
                }
                Object obj = conversationViewModel$6$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i11 = conversationViewModel$6$1$emit$1.label;
                if (i11 == 0) {
                    b.b(obj);
                    if (i.a(networkState2, NetworkState.Reconnected.INSTANCE)) {
                        OpenConversationUseCase openConversationUseCase = this.this$0.openConversationUseCase;
                        q<ConversationClientState> qVar = this.this$0.clientState;
                        GetConversationReason getConversationReason = GetConversationReason.NETWORK_CONNECTED;
                        conversationViewModel$6$1$emit$1.L$0 = this;
                        conversationViewModel$6$1$emit$1.L$1 = networkState2;
                        conversationViewModel$6$1$emit$1.label = 1;
                        if (openConversationUseCase.invoke(qVar, getConversationReason, conversationViewModel$6$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    anonymousClass1 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    networkState2 = (NetworkState) conversationViewModel$6$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) conversationViewModel$6$1$emit$1.L$0;
                    b.b(obj);
                }
                q qVar2 = anonymousClass1.this$0.clientState;
                do {
                    value = qVar2.getValue();
                    conversationClientState = (ConversationClientState) value;
                } while (!qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : networkState2, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
                return r.f47939a;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                return emit((NetworkState) obj, (kotlin.coroutines.c<? super r>) cVar);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7", f = "ConversationViewModel.kt", l = {312}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: ConversationViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<String, kotlin.coroutines.c<? super String>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return n.p0((String) this.L$0).toString();
            }

            @Override // Ia.p
            public final Object invoke(String str, kotlin.coroutines.c<? super String> cVar) {
                return ((AnonymousClass2) create(str, cVar)).invokeSuspend(r.f47939a);
            }
        }

        public AnonymousClass7(kotlin.coroutines.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new AnonymousClass7(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final q qVar = ConversationViewModel.this.gifQueryStateFlow;
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof SearchQuery.Query) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = qVar.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                InterfaceC2686c interfaceC2686cH = C2688e.h(C2688e.m(new AnonymousClass2(null), C2688e.g(new InterfaceC2686c<String>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                String value = ((SearchQuery.Query) obj).getValue();
                                anonymousClass1.label = 1;
                                if (interfaceC2687d.emit(value, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super String> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                }, ConversationViewModel.DEBOUNCE_DELAY_MS)));
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.7.3
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((String) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(String str, kotlin.coroutines.c<? super r> cVar) {
                        Object objInvoke = conversationViewModel.loadGifUseCase.invoke(conversationViewModel.clientState, str, cVar);
                        return objInvoke == CoroutineSingletons.f43038b ? objInvoke : r.f47939a;
                    }
                };
                this.label = 1;
                if (interfaceC2686cH.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass7) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: ConversationViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ ConversationViewModel create$default(Companion companion, c0 c0Var, String str, String str2, ArticleMetadata articleMetadata, LaunchMode launchMode, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i10 & 8) != 0) {
                articleMetadata = null;
            }
            return companion.create(c0Var, str, str3, articleMetadata, launchMode);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1] */
        private final ConversationViewModel$Companion$factory$1 factory(final String str, final String str2, final ArticleMetadata articleMetadata, final LaunchMode launchMode) {
            return new a0.c() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, a aVar) {
                    return super.create(cls, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    return new ConversationViewModel(str, launchMode, articleMetadata, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483632, null);
                }
            };
        }

        public final ConversationViewModel create(c0 owner, String str, String initialMessage, ArticleMetadata articleMetadata, LaunchMode launchMode) {
            i.e(owner, "owner");
            i.e(initialMessage, "initialMessage");
            i.e(launchMode, "launchMode");
            ConversationViewModel$Companion$factory$1 factory = factory(str, initialMessage, articleMetadata, launchMode);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(ConversationViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (ConversationViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1", f = "ConversationViewModel.kt", l = {572}, m = "invokeSuspend")
    public static final class C23091 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C23091(kotlin.coroutines.c<? super C23091> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23091(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                q qVar = ConversationViewModel.this.clientState;
                this.label = 1;
                if (OpenConversationUseCase.invoke$default(openConversationUseCase, qVar, null, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23091) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2", f = "ConversationViewModel.kt", l = {479}, m = "invokeSuspend")
    public static final class C23102 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C23102(kotlin.coroutines.c<? super C23102> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23102(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                LoadGifUseCase loadGifUseCase = ConversationViewModel.this.loadGifUseCase;
                q qVar = ConversationViewModel.this.clientState;
                this.label = 1;
                if (LoadGifUseCase.invoke$default(loadGifUseCase, qVar, null, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23102) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C23111 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ ComposerInputType $inputType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23111(ComposerInputType composerInputType, kotlin.coroutines.c<? super C23111> cVar) {
            super(2, cVar);
            this.$inputType = composerInputType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23111(this.$inputType, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            ConversationViewModel.this.changeInputUseCase.invoke(ConversationViewModel.this.clientState, this.$inputType);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23111) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1", f = "ConversationViewModel.kt", l = {384}, m = "invokeSuspend")
    public static final class C23121 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ ReplyOption $replyOption;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23121(ReplyOption replyOption, kotlin.coroutines.c<? super C23121> cVar) {
            super(2, cVar);
            this.$replyOption = replyOption;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23121(this.$replyOption, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                Conversation conversation = ((ConversationClientState) ConversationViewModel.this.clientState.getValue()).getConversation();
                if (conversation != null) {
                    ConversationViewModel conversationViewModel = ConversationViewModel.this;
                    ReplyOption replyOption = this.$replyOption;
                    SendQuickReplyUseCase sendQuickReplyUseCase = conversationViewModel.sendQuickReplyUseCase;
                    q<ConversationClientState> qVar = conversationViewModel.clientState;
                    Part part = (Part) kotlin.collections.q.V(conversation.parts());
                    this.label = 1;
                    if (sendQuickReplyUseCase.invoke(qVar, replyOption, part, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23121) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2", f = "ConversationViewModel.kt", l = {492}, m = "invokeSuspend")
    public static final class C23132 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C23132(kotlin.coroutines.c<? super C23132> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23132(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                q qVar = ConversationViewModel.this.clientState;
                this.label = 1;
                if (OpenConversationUseCase.invoke$default(openConversationUseCase, qVar, null, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23132) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1", f = "ConversationViewModel.kt", l = {545}, m = "invokeSuspend")
    public static final class C23141 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23141(PendingMessage.FailedImageUploadData failedImageUploadData, kotlin.coroutines.c<? super C23141> cVar) {
            super(2, cVar);
            this.$failedImageUploadData = failedImageUploadData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23141(this.$failedImageUploadData, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                p<ConversationUiEffect> pVar = ConversationViewModel.this._uiEffect;
                MediaData.Media imageData = this.$failedImageUploadData.getImageData();
                String clientAssignedUUID = this.$failedImageUploadData.getClientAssignedUUID();
                this.label = 1;
                if (sendMediaUseCase.invoke(qVar, pVar, imageData, clientAssignedUUID, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23141) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1", f = "ConversationViewModel.kt", l = {534}, m = "invokeSuspend")
    public static final class C23151 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Part $part;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23151(Part part, kotlin.coroutines.c<? super C23151> cVar) {
            super(2, cVar);
            this.$part = part;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23151(this.$part, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                List<Block> blocks = this.$part.getBlocks();
                i.d(blocks, "getBlocks(...)");
                List<Block> list = blocks;
                ArrayList arrayList = new ArrayList(m.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Block) it.next()).toBuilder());
                }
                String uuid = this.$part.getUuid();
                i.d(uuid, "getUuid(...)");
                boolean zIsFromVoiceDictation = this.$part.isFromVoiceDictation();
                this.label = 1;
                if (sendMessageUseCase.invoke(qVar, arrayList, uuid, zIsFromVoiceDictation, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23151) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1", f = "ConversationViewModel.kt", l = {500}, m = "invokeSuspend")
    public static final class C23161 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Attribute $attribute;
        final /* synthetic */ String $partId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23161(Attribute attribute, String str, kotlin.coroutines.c<? super C23161> cVar) {
            super(2, cVar);
            this.$attribute = attribute;
            this.$partId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23161(this.$attribute, this.$partId, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SubmitAttributeUseCase submitAttributeUseCase = ConversationViewModel.this.submitAttributeUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                Attribute attribute = this.$attribute;
                String str = this.$partId;
                this.label = 1;
                if (submitAttributeUseCase.invoke(qVar, attribute, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23161) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1", f = "ConversationViewModel.kt", l = {374}, m = "invokeSuspend")
    public static final class C23171 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ ReplySuggestion $suggestion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23171(ReplySuggestion replySuggestion, kotlin.coroutines.c<? super C23171> cVar) {
            super(2, cVar);
            this.$suggestion = replySuggestion;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23171(this.$suggestion, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendSuggestionUseCase sendSuggestionUseCase = ConversationViewModel.this.sendSuggestionUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                ReplySuggestion replySuggestion = this.$suggestion;
                this.label = 1;
                if (sendSuggestionUseCase.invoke(qVar, replySuggestion, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23171) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1", f = "ConversationViewModel.kt", l = {467}, m = "invokeSuspend")
    public static final class C23181 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ MediaData.Gif $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23181(MediaData.Gif gif, kotlin.coroutines.c<? super C23181> cVar) {
            super(2, cVar);
            this.$mediaData = gif;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23181(this.$mediaData, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendGifUseCase sendGifUseCase = ConversationViewModel.this.sendGifUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                MediaData.Gif gif = this.$mediaData;
                this.label = 1;
                if (sendGifUseCase.invoke(qVar, gif, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23181) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1", f = "ConversationViewModel.kt", l = {506}, m = "invokeSuspend")
    public static final class C23191 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ MediaData.Media $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23191(MediaData.Media media, kotlin.coroutines.c<? super C23191> cVar) {
            super(2, cVar);
            this.$mediaData = media;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23191(this.$mediaData, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                q qVar = ConversationViewModel.this.clientState;
                p pVar = ConversationViewModel.this._uiEffect;
                MediaData.Media media = this.$mediaData;
                this.label = 1;
                if (SendMediaUseCase.invoke$default(sendMediaUseCase, qVar, pVar, media, null, this, 8, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23191) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ConversationViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1", f = "ConversationViewModel.kt", l = {364}, m = "invokeSuspend")
    public static final class C23201 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ String $messageText;
        final /* synthetic */ TextInputSource $textInputSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23201(String str, TextInputSource textInputSource, kotlin.coroutines.c<? super C23201> cVar) {
            super(2, cVar);
            this.$messageText = str;
            this.$textInputSource = textInputSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ConversationViewModel.this.new C23201(this.$messageText, this.$textInputSource, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                q<ConversationClientState> qVar = ConversationViewModel.this.clientState;
                String str = this.$messageText;
                TextInputSource textInputSource = this.$textInputSource;
                this.label = 1;
                if (sendMessageUseCase.invoke(qVar, str, textInputSource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23201) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, A a10, ConversationRepository conversationRepository, ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase showAdminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, AbstractC2712w abstractC2712w, MetricTracker metricTracker, int i10, e eVar) {
        MetricTracker metricTracker2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        String str3 = (i10 & 1) != 0 ? null : str;
        ArticleMetadata articleMetadata2 = (i10 & 4) != 0 ? null : articleMetadata;
        NetworkConnectivityMonitor networkConnectivityMonitor2 = (i10 & 16) != 0 ? new NetworkConnectivityMonitor() : networkConnectivityMonitor;
        SoundPlayer soundPlayer2 = (i10 & 32) != 0 ? new SoundPlayer() : soundPlayer;
        A a11 = (i10 & 64) != 0 ? B.a(N.f43200c) : a10;
        ConversationRepository conversationRepository2 = (i10 & 128) != 0 ? new ConversationRepository(null, null, null, null, null, a11, 31, null) : conversationRepository;
        ConversationReducer conversationReducer2 = (i10 & 256) != 0 ? new ConversationReducer(null, null, null, null, 15, null) : conversationReducer;
        int i11 = 3;
        TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2 = (i10 & 512) != 0 ? new TrackLastReceivedPartsUseCase(metricTracker2, objArr5 == true ? 1 : 0, i11, objArr4 == true ? 1 : 0) : trackLastReceivedPartsUseCase;
        RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2 = (i10 & 1024) != 0 ? new RecordOpenedInteractionUseCase(conversationRepository2) : recordOpenedInteractionUseCase;
        SoundEffectsUseCase soundEffectsUseCase2 = (i10 & 2048) != 0 ? new SoundEffectsUseCase(null, soundPlayer2, 1, null) : soundEffectsUseCase;
        SendSuggestionUseCase sendSuggestionUseCase2 = (i10 & 4096) != 0 ? new SendSuggestionUseCase(conversationRepository2, soundEffectsUseCase2, null, null, 12, null) : sendSuggestionUseCase;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (i10 & 8192) != 0 ? new RefreshUnreadConversationsCountUseCase(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0) : refreshUnreadConversationsCountUseCase;
        RefreshConversationUseCase refreshConversationUseCase2 = (i10 & 16384) != 0 ? new RefreshConversationUseCase(conversationRepository2, null, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, 2, null) : refreshConversationUseCase;
        OpenConversationUseCase openConversationUseCase2 = (32768 & i10) != 0 ? new OpenConversationUseCase(refreshConversationUseCase2, refreshUnreadConversationsCountUseCase2, null, 4, null) : openConversationUseCase;
        SendMessageUseCase sendMessageUseCase2 = (65536 & i10) != 0 ? new SendMessageUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, null, null, 56, null) : sendMessageUseCase;
        SendQuickReplyUseCase sendQuickReplyUseCase2 = (131072 & i10) != 0 ? new SendQuickReplyUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, 8, null) : sendQuickReplyUseCase;
        LoadGifUseCase loadGifUseCase2 = (262144 & i10) != 0 ? new LoadGifUseCase(conversationRepository2) : loadGifUseCase;
        ChangeInputUseCase changeInputUseCase2 = (524288 & i10) != 0 ? new ChangeInputUseCase() : changeInputUseCase;
        this(str3, launchMode, articleMetadata2, str2, networkConnectivityMonitor2, soundPlayer2, a11, conversationRepository2, conversationReducer2, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, soundEffectsUseCase2, sendSuggestionUseCase2, refreshUnreadConversationsCountUseCase2, refreshConversationUseCase2, openConversationUseCase2, sendMessageUseCase2, sendQuickReplyUseCase2, loadGifUseCase2, changeInputUseCase2, (1048576 & i10) != 0 ? new SendGifUseCase(sendMessageUseCase2, changeInputUseCase2) : sendGifUseCase, (2097152 & i10) != 0 ? new SendMediaUseCase(sendMessageUseCase2, conversationRepository2, null, null, null, 28, null) : sendMediaUseCase, (4194304 & i10) != 0 ? new UpdateFloatingIndicatorUseCase() : updateFloatingIndicatorUseCase, (8388608 & i10) != 0 ? new GetNetworkState(networkConnectivityMonitor2) : getNetworkState, (16777216 & i10) != 0 ? new ShowAdminIsTypingUseCase() : showAdminIsTypingUseCase, (33554432 & i10) != 0 ? new SubmitAttributeUseCase(conversationRepository2) : submitAttributeUseCase, (67108864 & i10) != 0 ? new FallbackPollingUseCase(null, null, refreshConversationUseCase2, 3, null) : fallbackPollingUseCase, (134217728 & i10) != 0 ? new MarkUserContentAsSeenByAdmin() : markUserContentAsSeenByAdmin, (268435456 & i10) != 0 ? new FinStreamingUseCase() : finStreamingUseCase, (536870912 & i10) != 0 ? N.f43200c : abstractC2712w, (i10 & 1073741824) != 0 ? Injector.get().getMetricTracker() : metricTracker);
    }

    private final String getConversationContext() {
        return this.clientState.getValue().getConversationId() == null ? "new_conversation" : MetricTracker.Context.EXISTING_CONVERSATION;
    }

    private final void loadConversation() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C23091(null), 2);
    }

    private final void sendGif(MediaData.Gif gif) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C23181(gif, null), 2);
    }

    private final void sendMedia(MediaData.Media media) {
        C2680e.c(Z.a(this), this.dispatcher, null, new C23191(media, null), 2);
    }

    public final String getConversationId() {
        return this.clientState.getValue().getConversationId();
    }

    public final u<ConversationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.A<ConversationUiState> getUiState() {
        return this.uiState;
    }

    public final void loadGifs() {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        q<ConversationClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
            conversationClientState = value;
        } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : new BottomSheetState.GifSearch(EmptyList.f42983b), (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        C2680e.c(Z.a(this), this.dispatcher, null, new C23102(null), 2);
    }

    @Override // androidx.lifecycle.Y
    public void onCleared() {
        super.onCleared();
        B.c(this.nexusCoroutineScope, null);
    }

    public final void onConversationScrolled(ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        i.e(conversationScrolledState, "conversationScrolledState");
        q<ConversationClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
            conversationClientState = value;
        } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : conversationScrolledState.getScrolled(), (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        this.updateFloatingIndicatorUseCase.invoke(this.clientState, conversationScrolledState);
    }

    public final void onGifSearchQueryChange(String searchQuery) {
        i.e(searchQuery, "searchQuery");
        this.gifQueryStateFlow.setValue(new SearchQuery.Query(searchQuery));
    }

    public final void onInputChange(ComposerInputType inputType) {
        i.e(inputType, "inputType");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23111(inputType, null), 2);
    }

    public final void onJumpToBottomButtonClicked(int i10, int i11) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        FloatingIndicatorState floatingIndicatorState = this.clientState.getValue().getFloatingIndicatorState();
        if (floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            q<ConversationClientState> qVar = this.clientState;
            do {
                value = qVar.getValue();
                conversationClientState = value;
            } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : ((FloatingIndicatorState.JumpToBottomIndicator) floatingIndicatorState).copy(new JumpToBottomButtonState(0, i10, i11)), (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        }
    }

    public final void onNetworkMessageDismissed() {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        if (i.a(this.clientState.getValue().getNetworkState(), NetworkState.Reconnected.INSTANCE)) {
            q<ConversationClientState> qVar = this.clientState;
            do {
                value = qVar.getValue();
                conversationClientState = value;
            } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : NetworkState.Connected.INSTANCE, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        }
    }

    public final void onPause(Context context) {
        i.e(context, "context");
        this.networkConnectivityMonitor.stopListening(context);
        this.soundPlayer.release();
        this.resumedState.setValue(Boolean.FALSE);
    }

    public final void onPrivacyNoticeDismissed() {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        q<ConversationClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
            conversationClientState = value;
        } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : true)));
        this.conversationRepository.dismissPrivacyPolicy();
    }

    public final void onReplyOptionClicked(ReplyOption replyOption) {
        i.e(replyOption, "replyOption");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23121(replyOption, null), 2);
    }

    public final void onResume(Context context) {
        i.e(context, "context");
        this.networkConnectivityMonitor.startListening(context);
        this.soundPlayer.loadSounds(context);
        this.resumedState.setValue(Boolean.TRUE);
    }

    public final void onRetryClick() {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        q<ConversationClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
            conversationClientState = value;
        } while (!qVar.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        C2680e.c(Z.a(this), this.dispatcher, null, new C23132(null), 2);
    }

    public final void onRetryMediaClicked(PendingMessage.FailedImageUploadData failedImageUploadData) {
        i.e(failedImageUploadData, "failedImageUploadData");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23141(failedImageUploadData, null), 2);
    }

    public final void onRetryMessageClicked(Part part) {
        i.e(part, "part");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23151(part, null), 2);
    }

    public final void onSubmitAttribute(Attribute attribute, String partId) {
        i.e(attribute, "attribute");
        i.e(partId, "partId");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23161(attribute, partId, null), 2);
    }

    public final void onSuggestionClick(ReplySuggestion suggestion) {
        i.e(suggestion, "suggestion");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23171(suggestion, null), 2);
    }

    public final void onTyping() {
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId != null) {
            this.conversationRepository.nexusEventsRepository().userTyping(conversationId);
        }
    }

    public final void sendAfterPreview(MediaData mediaData) {
        i.e(mediaData, "mediaData");
        if (mediaData instanceof MediaData.Media) {
            sendMedia((MediaData.Media) mediaData);
        } else {
            if (!(mediaData instanceof MediaData.Gif)) {
                throw new NoWhenBranchMatchedException();
            }
            sendGif((MediaData.Gif) mediaData);
        }
    }

    public final void sendMessage(String messageText, TextInputSource textInputSource) {
        i.e(messageText, "messageText");
        i.e(textInputSource, "textInputSource");
        C2680e.c(Z.a(this), this.dispatcher, null, new C23201(messageText, textInputSource, null), 2);
    }

    @d
    public final void trackClickedInput(String input) {
        i.e(input, "input");
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.clickedInput(conversationId, input);
    }

    public final void trackMetric(MetricData metricData) {
        i.e(metricData, "metricData");
        if (metricData instanceof MetricData.SpeechRecognitionStarted) {
            MetricTracker metricTracker = this.metricTracker;
            String conversationId = this.clientState.getValue().getConversationId();
            metricTracker.trackFinDictation(MetricTracker.Action.VOICE_RECOGNITION_STARTED, conversationId != null ? conversationId : "", y.p());
            return;
        }
        if (metricData instanceof MetricData.SpeechRecognitionEnded) {
            MetricTracker metricTracker2 = this.metricTracker;
            String conversationId2 = this.clientState.getValue().getConversationId();
            metricTracker2.trackFinDictation(MetricTracker.Action.VOICE_RECOGNITION_ENDED, conversationId2 != null ? conversationId2 : "", x.o(new Pair(InAppMessageBase.DURATION, String.valueOf(((MetricData.SpeechRecognitionEnded) metricData).getDuration()))));
            return;
        }
        if (metricData instanceof MetricData.MoreMenuClicked) {
            this.metricTracker.moreMenuClicked(getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.ConversationsInMoreMenuClicked) {
            this.metricTracker.conversationsInMoreMenuClicked(((MetricData.ConversationsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.NewConversationInMoreMenuClicked) {
            this.metricTracker.newConversationInMoreMenuClicked(((MetricData.NewConversationInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.TicketsInMoreMenuClicked) {
            this.metricTracker.ticketsInMoreMenuClicked(((MetricData.TicketsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData.equals(MetricData.HelpInMoreMenuClicked.INSTANCE)) {
            this.metricTracker.helpInMoreMenuClicked(getConversationContext());
            return;
        }
        if (metricData.equals(MetricData.PoweredByClicked.INSTANCE)) {
            this.metricTracker.clickedPoweredBy("conversation");
        } else {
            if (!(metricData instanceof MetricData.ComposerInputClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            MetricTracker metricTracker3 = this.metricTracker;
            String conversationId3 = this.clientState.getValue().getConversationId();
            metricTracker3.clickedInput(conversationId3 != null ? conversationId3 : "", ((MetricData.ComposerInputClicked) metricData).getInput());
        }
    }

    public final void updateBottomSheet(BottomSheetState bottomSheetState) {
        i.e(bottomSheetState, "bottomSheetState");
        q<ConversationClientState> qVar = this.clientState;
        while (true) {
            ConversationClientState value = qVar.getValue();
            ConversationClientState conversationClientState = value;
            q<ConversationClientState> qVar2 = qVar;
            if (qVar2.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : bottomSheetState, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false))) {
                return;
            } else {
                qVar = qVar2;
            }
        }
    }

    public ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String initialMessage, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, A nexusCoroutineScope, ConversationRepository conversationRepository, final ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase adminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, AbstractC2712w dispatcher, MetricTracker metricTracker) {
        i.e(launchMode, "launchMode");
        i.e(initialMessage, "initialMessage");
        i.e(networkConnectivityMonitor, "networkConnectivityMonitor");
        i.e(soundPlayer, "soundPlayer");
        i.e(nexusCoroutineScope, "nexusCoroutineScope");
        i.e(conversationRepository, "conversationRepository");
        i.e(conversationReducer, "conversationReducer");
        i.e(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        i.e(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        i.e(soundEffectsUseCase, "soundEffectsUseCase");
        i.e(sendSuggestionUseCase, "sendSuggestionUseCase");
        i.e(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        i.e(refreshConversationUseCase, "refreshConversationUseCase");
        i.e(openConversationUseCase, "openConversationUseCase");
        i.e(sendMessageUseCase, "sendMessageUseCase");
        i.e(sendQuickReplyUseCase, "sendQuickReplyUseCase");
        i.e(loadGifUseCase, "loadGifUseCase");
        i.e(changeInputUseCase, "changeInputUseCase");
        i.e(sendGifUseCase, "sendGifUseCase");
        i.e(sendMediaUseCase, "sendMediaUseCase");
        i.e(updateFloatingIndicatorUseCase, "updateFloatingIndicatorUseCase");
        i.e(getNetworkState, "getNetworkState");
        i.e(adminIsTypingUseCase, "adminIsTypingUseCase");
        i.e(submitAttributeUseCase, "submitAttributeUseCase");
        i.e(fallbackPollingUseCase, "fallbackPollingUseCase");
        i.e(markUserContentAsSeenByAdmin, "markUserContentAsSeenByAdmin");
        i.e(finStreamingUseCase, "finStreamingUseCase");
        i.e(dispatcher, "dispatcher");
        i.e(metricTracker, "metricTracker");
        this.initialConversationId = str;
        this.launchMode = launchMode;
        this.articleMetadata = articleMetadata;
        this.networkConnectivityMonitor = networkConnectivityMonitor;
        this.soundPlayer = soundPlayer;
        this.nexusCoroutineScope = nexusCoroutineScope;
        this.conversationRepository = conversationRepository;
        this.conversationReducer = conversationReducer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.sendSuggestionUseCase = sendSuggestionUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.openConversationUseCase = openConversationUseCase;
        this.sendMessageUseCase = sendMessageUseCase;
        this.sendQuickReplyUseCase = sendQuickReplyUseCase;
        this.loadGifUseCase = loadGifUseCase;
        this.changeInputUseCase = changeInputUseCase;
        this.sendGifUseCase = sendGifUseCase;
        this.sendMediaUseCase = sendMediaUseCase;
        this.updateFloatingIndicatorUseCase = updateFloatingIndicatorUseCase;
        this.adminIsTypingUseCase = adminIsTypingUseCase;
        this.submitAttributeUseCase = submitAttributeUseCase;
        this.fallbackPollingUseCase = fallbackPollingUseCase;
        this.markUserContentAsSeenByAdmin = markUserContentAsSeenByAdmin;
        this.finStreamingUseCase = finStreamingUseCase;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        String decodedInitialMessage = Uri.decode(initialMessage);
        this.decodedInitialMessage = decodedInitialMessage;
        i.d(decodedInitialMessage, "decodedInitialMessage");
        final StateFlowImpl stateFlowImplA = kotlinx.coroutines.flow.B.a(new ConversationClientState(null, null, str, null, new ComposerState.TextInput(decodedInitialMessage, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, 4, null), null, launchMode, null, articleMetadata, null, null, null, null, null, 0, 0, null, null, false, false, 1048235, null));
        this.clientState = stateFlowImplA;
        this.uiState = C2688e.q(new InterfaceC2686c<ConversationUiState>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements InterfaceC2687d {
                final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                final /* synthetic */ ConversationReducer receiver$inlined;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @c(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2", f = "ConversationViewModel.kt", l = {219}, m = "emit")
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

                public AnonymousClass2(InterfaceC2687d interfaceC2687d, ConversationReducer conversationReducer) {
                    this.$this_unsafeFlow = interfaceC2687d;
                    this.receiver$inlined = conversationReducer;
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
                        b.b(obj2);
                        InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                        ConversationUiState conversationUiStateComputeUiState$intercom_sdk_base_release = this.receiver$inlined.computeUiState$intercom_sdk_base_release((ConversationClientState) obj);
                        anonymousClass1.label = 1;
                        if (interfaceC2687d.emit(conversationUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.b(obj2);
                    }
                    return r.f47939a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2686c
            public Object collect(InterfaceC2687d<? super ConversationUiState> interfaceC2687d, kotlin.coroutines.c cVar) {
                Object objCollect = stateFlowImplA.collect(new AnonymousClass2(interfaceC2687d, conversationReducer), cVar);
                return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
            }
        }, Z.a(this), z.a.a(2, 5000L), InitialStateReducerKt.reduceInitialState(((ConversationClientState) stateFlowImplA.getValue()).getLaunchMode()));
        this.gifQueryStateFlow = kotlinx.coroutines.flow.B.a(SearchQuery.None.INSTANCE);
        v vVarB = w.b(0, 0, null, 7);
        this._uiEffect = vVarB;
        this.uiEffect = C2688e.p(vVarB, Z.a(this));
        this.resumedState = kotlinx.coroutines.flow.B.a(Boolean.FALSE);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass1(null), 2);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass2(null), 2);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass3(null), 2);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass4(null), 2);
        C2680e.c(Z.a(this), null, null, new AnonymousClass5(null), 3);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass6(getNetworkState, this, null), 2);
        C2680e.c(Z.a(this), dispatcher, null, new AnonymousClass7(null), 2);
        if (str == null) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
        loadConversation();
    }
}
