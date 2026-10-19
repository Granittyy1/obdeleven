package io.intercom.android.sdk.m5.inbox;

import Aa.c;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.paging.C1426b;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import androidx.paging.v;
import androidx.paging.w;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.m5.inbox.data.InboxRepository;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.u;
import me.zhanghai.android.materialprogressbar.R;
import p014b1.f;
import p293xa.r;

/* JADX INFO: compiled from: InboxViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxViewModel extends Y {
    private final p<InboxUiEffects> _effect;
    private final CommonRepository commonRepository;
    private final AbstractC2712w dispatcher;
    private final u<InboxUiEffects> effect;
    private EmptyState emptyState;
    private final InterfaceC2686c<PagingData<Conversation>> inboxPagingData;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: InboxViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1", f = "InboxViewModel.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return InboxViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = InboxViewModel.this.inboxRepository.realTimeEvents();
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InboxViewModel.kt", l = {219}, m = "emit")
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
                InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent> interfaceC2686c2 = new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "InboxViewModel.kt", l = {219}, m = "emit")
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
                final InboxViewModel inboxViewModel = InboxViewModel.this;
                InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel.1.2
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super r> cVar) {
                        Object objEmit = inboxViewModel._effect.emit(InboxUiEffects.RefreshInbox.INSTANCE, cVar);
                        return objEmit == CoroutineSingletons.f43038b ? objEmit : r.f47939a;
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

    /* JADX INFO: compiled from: InboxViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1] */
        private final InboxViewModel$Companion$factory$1 factory() {
            return new a0.c() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1
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
                    i.e(modelClass, "modelClass");
                    return new InboxViewModel(null, null, null, null, 15, null);
                }
            };
        }

        public final InboxViewModel create(c0 owner) {
            i.e(owner, "owner");
            InboxViewModel$Companion$factory$1 factory = factory();
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(InboxViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (InboxViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InboxViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1", f = "InboxViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
    public static final class C24261 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Conversation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24261(Conversation conversation, kotlin.coroutines.c<? super C24261> cVar) {
            super(2, cVar);
            this.$it = conversation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return InboxViewModel.this.new C24261(this.$it, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                p pVar = InboxViewModel.this._effect;
                InboxUiEffects.NavigateToConversation navigateToConversation = new InboxUiEffects.NavigateToConversation(this.$it);
                this.label = 1;
                if (pVar.emit(navigateToConversation, this) == coroutineSingletons) {
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
            return ((C24261) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public InboxViewModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource inboxPagingData$lambda$0(InboxViewModel this$0) {
        i.e(this$0, "this$0");
        return new InboxPagingSource(this$0.inboxRepository, this$0.intercomDataLayer, new InboxViewModel$inboxPagingData$1$1(this$0, null));
    }

    public final u<InboxUiEffects> getEffect() {
        return this.effect;
    }

    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    public final InterfaceC2686c<PagingData<Conversation>> getInboxPagingData() {
        return this.inboxPagingData;
    }

    public final void onConversationClick(Conversation it) {
        i.e(it, "it");
        C2680e.c(Z.a(this), this.dispatcher, null, new C24261(it, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxViewModel(InboxRepository inboxRepository, AbstractC2712w abstractC2712w, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i10, e eVar) {
        if ((i10 & 1) != 0) {
            inboxRepository = new InboxRepository(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        abstractC2712w = (i10 & 2) != 0 ? N.f43200c : abstractC2712w;
        intercomDataLayer = (i10 & 4) != 0 ? Injector.get().getDataLayer() : intercomDataLayer;
        if ((i10 & 8) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            i.d(messengerApi, "getMessengerApi(...)");
            commonRepository = new CommonRepository(messengerApi, intercomDataLayer);
        }
        this(inboxRepository, abstractC2712w, intercomDataLayer, commonRepository);
    }

    public InboxViewModel(InboxRepository inboxRepository, AbstractC2712w dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        i.e(inboxRepository, "inboxRepository");
        i.e(dispatcher, "dispatcher");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(commonRepository, "commonRepository");
        this.inboxRepository = inboxRepository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.emptyState = EmptyState.Companion.getNULL();
        v vVar = new v(new w(20), new a(0, this));
        this.inboxPagingData = C1426b.a(vVar.f19431a, Z.a(this));
        kotlinx.coroutines.flow.v vVarB = kotlinx.coroutines.flow.w.b(0, 0, null, 7);
        this._effect = vVarB;
        this.effect = C2688e.p(vVarB, Z.a(this));
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
