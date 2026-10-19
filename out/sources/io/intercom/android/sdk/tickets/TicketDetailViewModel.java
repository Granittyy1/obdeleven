package io.intercom.android.sdk.tickets;

import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketDetailViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailViewModel extends Y {
    private final kotlinx.coroutines.flow.q<TicketDetailState> _stateFlow;
    private final AbstractC2712w dispatcher;
    private final IntercomDataLayer intercomDataLayer;
    private final TicketLaunchedFrom launchedFrom;
    private boolean metricSent;
    private final MetricTracker metricTracker;
    private final TicketRepository repository;
    private final A<TicketDetailState> stateFlow;
    private String ticketId;
    private final UserIdentity user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2", f = "TicketDetailViewModel.kt", l = {R.styleable.AppCompatTheme_panelBackground}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return TicketDetailViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = TicketDetailViewModel.this.repository.realTimeEvents();
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketDetailViewModel.kt", l = {219}, m = "emit")
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
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
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
                        Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel = TicketDetailViewModel.this;
                InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2686c2 = new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                        final /* synthetic */ TicketDetailViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketDetailViewModel.kt", l = {219}, m = "emit")
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

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d, TicketDetailViewModel ticketDetailViewModel) {
                            this.$this_unsafeFlow = interfaceC2687d;
                            this.this$0 = ticketDetailViewModel;
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
                                ParsedNexusEvent.ConversationNexusEvent.NewComment newComment = (ParsedNexusEvent.ConversationNexusEvent.NewComment) obj;
                                String ticketId = newComment.getTicketId();
                                if (ticketId != null && !kotlin.text.n.S(ticketId) && kotlin.jvm.internal.i.a(newComment.getTicketId(), this.this$0.ticketId)) {
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
                    public Object collect(InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d, ticketDetailViewModel), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel2 = TicketDetailViewModel.this;
                InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel.2.2
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        TicketDetailViewModel ticketDetailViewModel3 = ticketDetailViewModel2;
                        String str = ticketDetailViewModel3.ticketId;
                        kotlin.jvm.internal.i.b(str);
                        ticketDetailViewModel3.fetchTicketDetail$intercom_sdk_base_release(str);
                        return p293xa.r.f47939a;
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
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1] */
        private final TicketDetailViewModel$Companion$factory$1 factory(final TicketLaunchedFrom ticketLaunchedFrom) {
            return new a0.c() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1
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
                    return new TicketDetailViewModel(ticketLaunchedFrom, null, null, null, null, null, 62, null);
                }
            };
        }

        public final TicketDetailViewModel create(c0 owner, TicketLaunchedFrom launchedFrom) {
            kotlin.jvm.internal.i.e(owner, "owner");
            kotlin.jvm.internal.i.e(launchedFrom, "launchedFrom");
            TicketDetailViewModel$Companion$factory$1 factory = factory(launchedFrom);
            kotlin.jvm.internal.i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            kotlin.jvm.internal.i.e(store, "store");
            kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(TicketDetailViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (TicketDetailViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1, reason: invalid class name */
    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1", f = "TicketDetailViewModel.kt", l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Ticket $ticket;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ticket ticket, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$ticket = ticket;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return TicketDetailViewModel.this.new AnonymousClass1(this.$ticket, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                TicketRepository ticketRepository = TicketDetailViewModel.this.repository;
                String id = this.$ticket.getId();
                this.label = 1;
                if (ticketRepository.markAsRead(id, this) == coroutineSingletons) {
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

    public TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker, TicketRepository ticketRepository, AbstractC2712w abstractC2712w, IntercomDataLayer intercomDataLayer, int i10, kotlin.jvm.internal.e eVar) {
        this(ticketLaunchedFrom, (i10 & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 4) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 8) != 0 ? new TicketRepository(null, null, null, null, 15, null) : ticketRepository, (i10 & 16) != 0 ? N.f43200c : abstractC2712w, (i10 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireMetricIfNecessary(Ticket ticket) {
        if (this.metricSent) {
            return;
        }
        MetricTracker metricTracker = this.metricTracker;
        Integer numValueOf = Integer.valueOf(ticket.getTicketTypeId());
        String conversationId = ticket.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.viewedTicketDetails(numValueOf, conversationId, ticket.getCurrentStatus().getType(), this.launchedFrom.getFrom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(builtActiveAdmins, 10));
        for (Participant participant : builtActiveAdmins) {
            Avatar avatar = participant.getAvatar();
            kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
            Boolean boolIsBot = participant.isBot();
            kotlin.jvm.internal.i.d(boolIsBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markAsReadIfNecessary(Ticket ticket) {
        if (kotlin.jvm.internal.i.a(ticket.isRead(), Boolean.FALSE)) {
            C2680e.c(Z.a(this), this.dispatcher, null, new AnonymousClass1(ticket, null), 2);
        }
    }

    public final void fetchTicketDetail$intercom_sdk_base_release(String ticketId) {
        kotlin.jvm.internal.i.e(ticketId, "ticketId");
        if (kotlin.text.n.S(ticketId)) {
            this._stateFlow.setValue(new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(io.intercom.android.sdk.R.string.intercom_error_loading_ticket), 3, null)));
        } else {
            C2680e.c(Z.a(this), this.dispatcher, null, new TicketDetailViewModel$fetchTicketDetail$1(this, ticketId, null), 2);
        }
    }

    public final A<TicketDetailState> getStateFlow() {
        return this.stateFlow;
    }

    public TicketDetailViewModel(TicketLaunchedFrom launchedFrom, UserIdentity user, MetricTracker metricTracker, TicketRepository repository, AbstractC2712w dispatcher, IntercomDataLayer intercomDataLayer) {
        kotlin.jvm.internal.i.e(launchedFrom, "launchedFrom");
        kotlin.jvm.internal.i.e(user, "user");
        kotlin.jvm.internal.i.e(metricTracker, "metricTracker");
        kotlin.jvm.internal.i.e(repository, "repository");
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(intercomDataLayer, "intercomDataLayer");
        this.launchedFrom = launchedFrom;
        this.user = user;
        this.metricTracker = metricTracker;
        this.repository = repository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        StateFlowImpl stateFlowImplA = B.a(TicketDetailState.Initial.INSTANCE);
        this._stateFlow = stateFlowImplA;
        this.stateFlow = stateFlowImplA;
        if (launchedFrom instanceof TicketLaunchedFrom.Conversation) {
            TicketLaunchedFrom.Conversation conversation = (TicketLaunchedFrom.Conversation) launchedFrom;
            fireMetricIfNecessary(conversation.getTicket());
            markAsReadIfNecessary(conversation.getTicket());
            Ticket ticket = conversation.getTicket();
            this.ticketId = ticket.getId();
            stateFlowImplA.setValue(TicketDetailReducerKt.computeTicketViewState(ticket, user, getActiveAdminsAvatars(), launchedFrom));
        } else {
            if (!(launchedFrom instanceof TicketLaunchedFrom.Other)) {
                throw new NoWhenBranchMatchedException();
            }
            fetchTicketDetail$intercom_sdk_base_release(((TicketLaunchedFrom.Other) launchedFrom).getTicketId());
        }
        C2680e.c(Z.a(this), null, null, new AnonymousClass2(null), 3);
    }
}
