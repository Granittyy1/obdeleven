package io.intercom.android.sdk.m5.home;

import Aa.c;
import androidx.lifecycle.C1366i;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.reducers.HomeReducer;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OpenToSpace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import kotlinx.coroutines.flow.z;
import me.zhanghai.android.materialprogressbar.R;
import p014b1.a;
import p014b1.f;
import p293xa.r;

/* JADX INFO: compiled from: HomeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeViewModel extends Y {
    private final p<HomeUiEffects> _effect;
    private final q<HomeClientState> clientState;
    private final CommonRepository commonRepository;
    private final AbstractC2712w dispatcher;
    private final u<HomeUiEffects> effect;
    private boolean hasConversationScreenOpenedDirectlyFromHome;
    private final HomeReducer homeReducer;
    private final HomeRepository homeRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final A<HomeUiState> uiState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: HomeViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HomeViewModel.kt */
        @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C04271 extends SuspendLambda implements Ia.p<AppConfig, kotlin.coroutines.c<? super r>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04271(HomeViewModel homeViewModel, kotlin.coroutines.c<? super C04271> cVar) {
                super(2, cVar);
                this.this$0 = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C04271 c04271 = new C04271(this.this$0, cVar);
                c04271.L$0 = obj;
                return c04271;
            }

            @Override // Ia.p
            public final Object invoke(AppConfig appConfig, kotlin.coroutines.c<? super r> cVar) {
                return ((C04271) create(appConfig, cVar)).invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                this.this$0.onConfig((AppConfig) this.L$0);
                return r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lifecycle = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HomeViewModel.this.new AnonymousClass1(this.$lifecycle, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                A<AppConfig> config = HomeViewModel.this.intercomDataLayer.getConfig();
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = Lifecycle.State.f17749b;
                CallbackFlowBuilder callbackFlowBuilderA = C1366i.a(config, lifecycle);
                C04271 c04271 = new C04271(HomeViewModel.this, null);
                this.label = 1;
                if (C2688e.e(callbackFlowBuilderA, c04271, this) == coroutineSingletons) {
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: HomeViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Lifecycle lifecycle, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$lifecycle = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HomeViewModel.this.new AnonymousClass2(this.$lifecycle, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = HomeViewModel.this.homeRepository.realTimeEvents();
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = Lifecycle.State.f17749b;
                final CallbackFlowBuilder callbackFlowBuilderA = C1366i.a(interfaceC2686cRealTimeEvents, lifecycle);
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "HomeViewModel.kt", l = {219}, m = "emit")
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
                        Object objCollect = callbackFlowBuilderA.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent> interfaceC2686c2 = new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModel.kt", l = {219}, m = "emit")
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
                final HomeViewModel homeViewModel = HomeViewModel.this;
                InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, kotlin.coroutines.c<? super r> cVar) {
                        homeViewModel.fetchHomeData();
                        return r.f47939a;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (kotlin.coroutines.c<? super r>) cVar);
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: HomeViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1] */
        private final HomeViewModel$Companion$factory$1 factory(final Lifecycle lifecycle) {
            return new a0.c() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, a aVar) {
                    return super.create(cls, aVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HomeRepository homeRepository = new HomeRepository(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    i.d(messengerApi, "getMessengerApi(...)");
                    i.b(dataLayer);
                    return new HomeViewModel(lifecycle, homeRepository, new CommonRepository(messengerApi, dataLayer), null, dataLayer, null, 40, null);
                }
            };
        }

        public final HomeViewModel create(c0 owner, Lifecycle lifecycle) {
            i.e(owner, "owner");
            i.e(lifecycle, "lifecycle");
            HomeViewModel$Companion$factory$1 factory = factory(lifecycle);
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            f fVar = new f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(HomeViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (HomeViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: HomeViewModel.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenToSpace.values().length];
            try {
                iArr[OpenToSpace.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenToSpace.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenToSpace.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HomeViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass}, m = "invokeSuspend")
    public static final class C24211 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C24211(kotlin.coroutines.c<? super C24211> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            C24211 c24211 = HomeViewModel.this.new C24211(cVar);
            c24211.L$0 = obj;
            return c24211;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        /* JADX WARN: Code duplicated, block: B:25:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[LOOP:2: B:29:0x00b0->B:31:0x00b6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x00a6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0098 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.A a10;
            NetworkResponse networkResponse;
            OpenMessengerResponse openMessengerResponse;
            q qVar;
            Object value;
            ArrayList arrayList;
            HomeViewModel homeViewModel;
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a10 = (kotlinx.coroutines.A) this.L$0;
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    NetworkResponse networkResponse2 = (NetworkResponse) this.L$0;
                    b.b(obj);
                    networkResponse = networkResponse2;
                }
                openMessengerResponse = (OpenMessengerResponse) obj;
                qVar = HomeViewModel.this.clientState;
                do {
                    value = qVar.getValue();
                } while (!qVar.d(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
                if (networkResponse instanceof NetworkResponse.Success) {
                    List<HomeCards> cards = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                    arrayList = new ArrayList();
                    for (Object obj2 : cards) {
                        if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                            arrayList.add(obj2);
                        }
                    }
                    homeViewModel = HomeViewModel.this;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) it.next()).getConversations());
                    }
                }
                return r.f47939a;
            }
            b.b(obj);
            a10 = (kotlinx.coroutines.A) this.L$0;
            G gA = C2680e.a(a10, null, new HomeViewModel$fetchHomeData$1$homeResponse$1(HomeViewModel.this, null), 3);
            this.L$0 = a10;
            this.label = 1;
            obj = gA.D(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            NetworkResponse networkResponse3 = (NetworkResponse) obj;
            G gA2 = C2680e.a(a10, null, new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(HomeViewModel.this, null), 3);
            this.L$0 = networkResponse3;
            this.label = 2;
            Object objD = gA2.D(this);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            networkResponse = networkResponse3;
            obj = objD;
            openMessengerResponse = (OpenMessengerResponse) obj;
            qVar = HomeViewModel.this.clientState;
            do {
                value = qVar.getValue();
            } while (!qVar.d(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, openMessengerResponse, false, 4, null)));
            if (networkResponse instanceof NetworkResponse.Success) {
                List<HomeCards> cards2 = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                        arrayList.add(obj2);
                    }
                }
                homeViewModel = HomeViewModel.this;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) it.next()).getConversations());
                }
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24211) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HomeViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1", f = "HomeViewModel.kt", l = {85}, m = "invokeSuspend")
    public static final class C24221 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C24221(kotlin.coroutines.c<? super C24221> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HomeViewModel.this.new C24221(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                p pVar = HomeViewModel.this._effect;
                HomeUiEffects.NavigateToMessages navigateToMessages = HomeUiEffects.NavigateToMessages.INSTANCE;
                this.label = 1;
                if (pVar.emit(navigateToMessages, this) == coroutineSingletons) {
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24221) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HomeViewModel.kt */
    @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle, R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
    public static final class C24232 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public C24232(kotlin.coroutines.c<? super C24232> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return HomeViewModel.this.new C24232(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> openInboundConversations;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                HomeViewModel.this.hasConversationScreenOpenedDirectlyFromHome = true;
                return r.f47939a;
            }
            b.b(obj);
            CommonRepository commonRepository = HomeViewModel.this.commonRepository;
            this.label = 1;
            obj = commonRepository.openMessenger(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
            if (openMessengerResponse == null || (openInboundConversations = openMessengerResponse.getOpenInboundConversations()) == null) {
                openInboundConversations = EmptyList.f42983b;
            }
            HomeViewModel.this.fetchHomeData();
            p pVar = HomeViewModel.this._effect;
            HomeUiEffects navigateToConversation = !openInboundConversations.isEmpty() ? new HomeUiEffects.NavigateToConversation((String) kotlin.collections.q.O(openInboundConversations)) : HomeUiEffects.NavigateToNewConversation.INSTANCE;
            this.label = 2;
            if (pVar.emit(navigateToConversation, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            HomeViewModel.this.hasConversationScreenOpenedDirectlyFromHome = true;
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24232) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeViewModel(Lifecycle lifecycle, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, AbstractC2712w abstractC2712w, int i10, e eVar) {
        this(lifecycle, homeRepository, commonRepository, (i10 & 8) != 0 ? new HomeReducer(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : homeReducer, intercomDataLayer, (i10 & 32) != 0 ? N.f43200c : abstractC2712w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchHomeData() {
        C2680e.c(Z.a(this), this.dispatcher, null, new C24211(null), 2);
    }

    private final void handleOpening(OpenToSpace openToSpace) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[openToSpace.ordinal()];
        if (i10 == 1) {
            fetchHomeData();
            return;
        }
        if (i10 == 2) {
            C2680e.c(Z.a(this), null, null, new C24221(null), 3);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.hasConversationScreenOpenedDirectlyFromHome) {
                return;
            }
            C2680e.c(Z.a(this), null, null, new C24232(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfig(AppConfig appConfig) {
        OpenToSpace openTo;
        HomeConfig home;
        OpenConfig openConfig;
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (openTo = openConfig.getOpenTo()) == null) {
            openTo = OpenToSpace.HOME;
        }
        handleOpening(openTo);
    }

    public final u<HomeUiEffects> getEffect() {
        return this.effect;
    }

    public final A<HomeUiState> getUiState() {
        return this.uiState;
    }

    public final void onHeaderImageLoaded() {
        HomeClientState value;
        q<HomeClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
        } while (!qVar.d(value, HomeClientState.copy$default(value, null, null, true, 3, null)));
    }

    public final void onRetryClicked() {
        HomeClientState value;
        q<HomeClientState> qVar = this.clientState;
        do {
            value = qVar.getValue();
        } while (!qVar.d(value, HomeClientState.copy$default(value, null, null, false, 6, null)));
        fetchHomeData();
    }

    public HomeViewModel(Lifecycle lifecycle, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, AbstractC2712w dispatcher) {
        i.e(lifecycle, "lifecycle");
        i.e(homeRepository, "homeRepository");
        i.e(commonRepository, "commonRepository");
        i.e(homeReducer, "homeReducer");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(dispatcher, "dispatcher");
        this.homeRepository = homeRepository;
        this.commonRepository = commonRepository;
        this.homeReducer = homeReducer;
        this.intercomDataLayer = intercomDataLayer;
        this.dispatcher = dispatcher;
        v vVarB = w.b(0, 0, null, 7);
        this._effect = vVarB;
        this.effect = C2688e.p(vVarB, Z.a(this));
        final StateFlowImpl stateFlowImplA = B.a(new HomeClientState(null, null, false, 7, null));
        this.clientState = stateFlowImplA;
        this.uiState = C2688e.q(new InterfaceC2686c<HomeUiState>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements InterfaceC2687d {
                final /* synthetic */ InterfaceC2687d $this_unsafeFlow;
                final /* synthetic */ HomeViewModel this$0;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2", f = "HomeViewModel.kt", l = {219}, m = "emit")
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

                public AnonymousClass2(InterfaceC2687d interfaceC2687d, HomeViewModel homeViewModel) {
                    this.$this_unsafeFlow = interfaceC2687d;
                    this.this$0 = homeViewModel;
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
                        HomeUiState homeUiStateComputeUiState$intercom_sdk_base_release = this.this$0.homeReducer.computeUiState$intercom_sdk_base_release((HomeClientState) obj, new HomeViewModel$uiState$1$1(this.this$0));
                        anonymousClass1.label = 1;
                        if (interfaceC2687d.emit(homeUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1) == coroutineSingletons) {
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
            public Object collect(InterfaceC2687d<? super HomeUiState> interfaceC2687d, kotlin.coroutines.c cVar) {
                Object objCollect = stateFlowImplA.collect(new AnonymousClass2(interfaceC2687d, this), cVar);
                return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
            }
        }, Z.a(this), z.a.a(2, 5000L), new HomeUiState.Loading(null));
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(lifecycle, null), 3);
        C2680e.c(Z.a(this), null, null, new AnonymousClass2(lifecycle, null), 3);
    }
}
