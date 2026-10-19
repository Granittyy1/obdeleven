package io.intercom.android.sdk.m5.data;

import Aa.c;
import Ia.l;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.flow.w;
import p186p0.a;
import p293xa.r;

/* JADX INFO: compiled from: IntercomDataLayer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomDataLayer {
    public static final int $stable = 8;
    private final q<String> _botBehaviourId;
    private final q<BotIntro> _botIntro;
    private final q<AppConfig> _config;
    private final q<List<Conversation>> _conversations;
    private final p<IntercomEvent> _event;
    private final q<HostAppState> _hostAppState;
    private final q<OverlayState> _overlayState;
    private final q<SurveyData> _surveyData;
    private final q<TeamPresence> _teamPresence;
    private final q<Ticket> _ticket;
    private final q<Set<String>> _unreadConversationIds;
    private final A applicationScope;
    private final kotlinx.coroutines.flow.A<String> botBehaviourId;
    private final kotlinx.coroutines.flow.A<BotIntro> botIntro;
    private final kotlinx.coroutines.flow.A<AppConfig> config;
    private final Context context;
    private final kotlinx.coroutines.flow.A<List<Conversation>> conversations;
    private final u<IntercomEvent> event;
    private List<? extends HomeCards> homeCards;
    private final kotlinx.coroutines.flow.A<HostAppState> hostAppState;
    private OpenMessengerResponse openResponse;
    private final kotlinx.coroutines.flow.A<OverlayState> overlayState;
    private final kotlinx.coroutines.flow.A<SurveyData> surveyData;
    private final kotlinx.coroutines.flow.A<TeamPresence> teamPresence;
    private final kotlinx.coroutines.flow.A<Ticket> ticket;
    private final kotlinx.coroutines.flow.A<Set<String>> unreadConversationIds;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1", f = "IntercomDataLayer.kt", l = {375}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ l<AppConfig, r> $onNewAppConfig;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: IntercomDataLayer.kt */
        @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$configUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C04201 extends SuspendLambda implements Ia.p<AppConfig, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ l<AppConfig, r> $onNewAppConfig;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04201(l<? super AppConfig, r> lVar, kotlin.coroutines.c<? super C04201> cVar) {
                super(2, cVar);
                this.$onNewAppConfig = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C04201 c04201 = new C04201(this.$onNewAppConfig, cVar);
                c04201.L$0 = obj;
                return c04201;
            }

            @Override // Ia.p
            public final Object invoke(AppConfig appConfig, kotlin.coroutines.c<? super r> cVar) {
                return ((C04201) create(appConfig, cVar)).invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                this.$onNewAppConfig.invoke((AppConfig) this.L$0);
                return r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super AppConfig, r> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onNewAppConfig = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomDataLayer.this.new AnonymousClass1(this.$onNewAppConfig, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                kotlinx.coroutines.flow.A<AppConfig> config = IntercomDataLayer.this.getConfig();
                C04201 c04201 = new C04201(this.$onNewAppConfig, null);
                this.label = 1;
                if (C2688e.e(config, c04201, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2, reason: invalid class name */
    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2", f = "IntercomDataLayer.kt", l = {412}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ IntercomEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IntercomEvent intercomEvent, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$event = intercomEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomDataLayer.this.new AnonymousClass2(this.$event, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                IntercomDataLayer intercomDataLayer = IntercomDataLayer.this;
                IntercomEvent intercomEvent = this.$event;
                this.label = 1;
                if (intercomDataLayer.emitEvent(intercomEvent, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$listenToEvents$1", f = "IntercomDataLayer.kt", l = {424}, m = "invokeSuspend")
    public static final class C24121 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ l<IntercomEvent, r> $onNewEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24121(l<? super IntercomEvent, r> lVar, kotlin.coroutines.c<? super C24121> cVar) {
            super(2, cVar);
            this.$onNewEvent = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomDataLayer.this.new C24121(this.$onNewEvent, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                u<IntercomEvent> event = IntercomDataLayer.this.getEvent();
                final l<IntercomEvent, r> lVar = this.$onNewEvent;
                InterfaceC2687d<? super IntercomEvent> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer.listenToEvents.1.1
                    public final Object emit(IntercomEvent intercomEvent, kotlin.coroutines.c<? super r> cVar) {
                        lVar.invoke(intercomEvent);
                        return r.f47939a;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((IntercomEvent) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }
                };
                this.label = 1;
                if (event.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C24121) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1", f = "IntercomDataLayer.kt", l = {387}, m = "invokeSuspend")
    public static final class C24131 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ l<OverlayState, r> $onNewOverlyState;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: IntercomDataLayer.kt */
        @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C04221 extends SuspendLambda implements Ia.p<OverlayState, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ l<OverlayState, r> $onNewOverlyState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04221(l<? super OverlayState, r> lVar, kotlin.coroutines.c<? super C04221> cVar) {
                super(2, cVar);
                this.$onNewOverlyState = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C04221 c04221 = new C04221(this.$onNewOverlyState, cVar);
                c04221.L$0 = obj;
                return c04221;
            }

            @Override // Ia.p
            public final Object invoke(OverlayState overlayState, kotlin.coroutines.c<? super r> cVar) {
                return ((C04221) create(overlayState, cVar)).invokeSuspend(r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                this.$onNewOverlyState.invoke((OverlayState) this.L$0);
                return r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24131(l<? super OverlayState, r> lVar, kotlin.coroutines.c<? super C24131> cVar) {
            super(2, cVar);
            this.$onNewOverlyState = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomDataLayer.this.new C24131(this.$onNewOverlyState, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                kotlinx.coroutines.flow.A<OverlayState> overlayState = IntercomDataLayer.this.getOverlayState();
                C04221 c04221 = new C04221(this.$onNewOverlyState, null);
                this.label = 1;
                if (C2688e.e(overlayState, c04221, this) == coroutineSingletons) {
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
            return ((C24131) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: IntercomDataLayer.kt */
    @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1", f = "IntercomDataLayer.kt", l = {399}, m = "invokeSuspend")
    public static final class C24141 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ l<Set<String>, r> $onNewUnreadConversationsIdsState;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: IntercomDataLayer.kt */
        @c(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
        public static final class C04231 extends SuspendLambda implements Ia.p<Set<? extends String>, kotlin.coroutines.c<? super r>, Object> {
            final /* synthetic */ l<Set<String>, r> $onNewUnreadConversationsIdsState;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04231(l<? super Set<String>, r> lVar, kotlin.coroutines.c<? super C04231> cVar) {
                super(2, cVar);
                this.$onNewUnreadConversationsIdsState = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                C04231 c04231 = new C04231(this.$onNewUnreadConversationsIdsState, cVar);
                c04231.L$0 = obj;
                return c04231;
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, kotlin.coroutines.c<? super r> cVar) {
                return invoke2((Set<String>) set, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                this.$onNewUnreadConversationsIdsState.invoke((Set) this.L$0);
                return r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Set<String> set, kotlin.coroutines.c<? super r> cVar) {
                return ((C04231) create(set, cVar)).invokeSuspend(r.f47939a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24141(l<? super Set<String>, r> lVar, kotlin.coroutines.c<? super C24141> cVar) {
            super(2, cVar);
            this.$onNewUnreadConversationsIdsState = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return IntercomDataLayer.this.new C24141(this.$onNewUnreadConversationsIdsState, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                kotlinx.coroutines.flow.A<Set<String>> unreadConversationIds = IntercomDataLayer.this.getUnreadConversationIds();
                C04231 c04231 = new C04231(this.$onNewUnreadConversationsIdsState, null);
                this.label = 1;
                if (C2688e.e(unreadConversationIds, c04231, this) == coroutineSingletons) {
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
            return ((C24141) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public IntercomDataLayer(Context context, A applicationScope) {
        i.e(context, "context");
        i.e(applicationScope, "applicationScope");
        this.context = context;
        this.applicationScope = applicationScope;
        EmptyList emptyList = EmptyList.f42983b;
        StateFlowImpl stateFlowImplA = B.a(emptyList);
        this._conversations = stateFlowImplA;
        this.conversations = C2688e.b(stateFlowImplA);
        StateFlowImpl stateFlowImplA2 = B.a(BotIntro.NULL);
        this._botIntro = stateFlowImplA2;
        this.botIntro = C2688e.b(stateFlowImplA2);
        StateFlowImpl stateFlowImplA3 = B.a(null);
        this._botBehaviourId = stateFlowImplA3;
        this.botBehaviourId = C2688e.b(stateFlowImplA3);
        StateFlowImpl stateFlowImplA4 = B.a(TeamPresence.NULL);
        this._teamPresence = stateFlowImplA4;
        this.teamPresence = C2688e.b(stateFlowImplA4);
        StateFlowImpl stateFlowImplA5 = B.a(Ticket.Companion.getNULL());
        this._ticket = stateFlowImplA5;
        this.ticket = C2688e.b(stateFlowImplA5);
        StateFlowImpl stateFlowImplA6 = B.a(SurveyData.Companion.getNULL());
        this._surveyData = stateFlowImplA6;
        this.surveyData = C2688e.b(stateFlowImplA6);
        StateFlowImpl stateFlowImplA7 = B.a(OverlayState.NULL);
        this._overlayState = stateFlowImplA7;
        this.overlayState = C2688e.b(stateFlowImplA7);
        StateFlowImpl stateFlowImplA8 = B.a(HostAppState.NULL);
        this._hostAppState = stateFlowImplA8;
        this.hostAppState = C2688e.b(stateFlowImplA8);
        StateFlowImpl stateFlowImplA9 = B.a(EmptySet.f42985b);
        this._unreadConversationIds = stateFlowImplA9;
        this.unreadConversationIds = C2688e.b(stateFlowImplA9);
        v vVarB = w.b(0, 0, null, 7);
        this._event = vVarB;
        this.event = vVarB;
        this.homeCards = emptyList;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        i.b(sharedPreferences);
        StateFlowImpl stateFlowImplA10 = B.a(AppConfigKt.getAppConfig(sharedPreferences, a.b.a(context, R.color.intercom_main_blue), new NexusConfig()));
        this._config = stateFlowImplA10;
        this.config = C2688e.b(stateFlowImplA10);
    }

    public static /* synthetic */ void emitEvent$default(IntercomDataLayer intercomDataLayer, A a10, IntercomEvent intercomEvent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = intercomDataLayer.applicationScope;
        }
        intercomDataLayer.emitEvent(a10, intercomEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[ADDED_TO_REGION, REMOVE] */
    private final void updateAppConfig(AppConfig appConfig) {
        CustomizationModel customization;
        String themeMode;
        ThemeMode themeMode2;
        if (i.a(appConfig, this._config.getValue())) {
            return;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        i.b(sharedPreferences);
        AppConfigKt.setAppConfig(sharedPreferences, appConfig);
        this._config.setValue(appConfig);
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (customization = configModules.getCustomization()) == null || (themeMode = customization.getThemeMode()) == null) {
            return;
        }
        String lowerCase = themeMode.toLowerCase(Locale.ROOT);
        i.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -887328209) {
            if (iHashCode != 3075958) {
                if (iHashCode == 102970646 && !lowerCase.equals("light")) {
                    themeMode2 = ThemeMode.LIGHT;
                } else {
                    themeMode2 = ThemeMode.LIGHT;
                }
            } else if (lowerCase.equals("dark")) {
                themeMode2 = ThemeMode.DARK;
            } else {
                themeMode2 = ThemeMode.LIGHT;
            }
        } else if (lowerCase.equals("system")) {
            themeMode2 = ThemeMode.SYSTEM;
        } else {
            themeMode2 = ThemeMode.LIGHT;
        }
        ThemeManager.INSTANCE.updateServerTheme(themeMode2);
    }

    public final void activityPaused(Activity activity) {
        OverlayState value;
        OverlayState overlayState;
        i.e(activity, "activity");
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : activity)));
    }

    public final void activityReadyForViewAttachment(Activity activity) {
        OverlayState value;
        OverlayState overlayState;
        i.e(activity, "activity");
        if (!ActivityUtils.isHostActivity(activity)) {
            activity = null;
        }
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : activity, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void activityStopped(Activity activity) {
        OverlayState value;
        OverlayState overlayState;
        i.e(activity, "activity");
        Activity pausedHostActivity = activity.equals(this.overlayState.getValue().getPausedHostActivity()) ? null : this.overlayState.getValue().getPausedHostActivity();
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : pausedHostActivity)));
    }

    public final void addConversations(List<Conversation> newConversations) {
        List<Conversation> value;
        ArrayList arrayList;
        i.e(newConversations, "newConversations");
        q<List<Conversation>> qVar = this._conversations;
        do {
            value = qVar.getValue();
            List listH0 = kotlin.collections.q.h0(kotlin.collections.q.c0(newConversations, value), new Comparator() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t8, T t10) {
                    return Cb.a.e(Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t10)), Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t8)));
                }
            });
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : listH0) {
                if (hashSet.add(((Conversation) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!qVar.d(value, arrayList));
    }

    public final void appEnteredBackground(long j) {
        OverlayState value;
        OverlayState overlayState;
        HostAppState value2;
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
        q<HostAppState> qVar2 = this._hostAppState;
        do {
            value2 = qVar2.getValue();
        } while (!qVar2.d(value2, HostAppState.copy$default(value2, true, false, j, 2, null)));
    }

    public final void appEnteredForeground() {
        HostAppState value;
        q<HostAppState> qVar = this._hostAppState;
        do {
            value = qVar.getValue();
        } while (!qVar.d(value, HostAppState.copy$default(value, false, false, 0L, 4, null)));
    }

    public final void clearCarousel() {
        OverlayState value;
        OverlayState overlayState;
        Carousel NULL;
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
            NULL = Carousel.NULL;
            i.d(NULL, "NULL");
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : NULL, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void clearOpenResponse() {
        this.openResponse = null;
    }

    public final void clearSurveyData() {
        OverlayState value;
        OverlayState overlayState;
        q<SurveyData> qVar = this._surveyData;
        while (!qVar.d(qVar.getValue(), SurveyData.Companion.getNULL())) {
        }
        q<OverlayState> qVar2 = this._overlayState;
        do {
            value = qVar2.getValue();
            overlayState = value;
        } while (!qVar2.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : SurveyData.Companion.getNULL(), (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void clearUserData() {
        OverlayState value;
        OverlayState overlayState;
        SurveyData surveyData;
        Carousel NULL;
        q<List<Conversation>> qVar = this._conversations;
        while (!qVar.d(qVar.getValue(), EmptyList.f42983b)) {
        }
        q<BotIntro> qVar2 = this._botIntro;
        while (!qVar2.d(qVar2.getValue(), BotIntro.NULL)) {
        }
        q<String> qVar3 = this._botBehaviourId;
        while (!qVar3.d(qVar3.getValue(), null)) {
        }
        q<TeamPresence> qVar4 = this._teamPresence;
        while (!qVar4.d(qVar4.getValue(), TeamPresence.NULL)) {
        }
        q<Ticket> qVar5 = this._ticket;
        while (!qVar5.d(qVar5.getValue(), Ticket.Companion.getNULL())) {
        }
        q<SurveyData> qVar6 = this._surveyData;
        while (!qVar6.d(qVar6.getValue(), SurveyData.Companion.getNULL())) {
        }
        q<OverlayState> qVar7 = this._overlayState;
        do {
            value = qVar7.getValue();
            overlayState = value;
            surveyData = SurveyData.Companion.getNULL();
            NULL = Carousel.NULL;
            i.d(NULL, "NULL");
        } while (!qVar7.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : surveyData, (127 & 2) != 0 ? overlayState.carousel : NULL, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : EmptyList.f42983b, (127 & 64) != 0 ? overlayState.dismissedPartIds : EmptySet.f42985b, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
        q<Set<String>> qVar8 = this._unreadConversationIds;
        while (!qVar8.d(qVar8.getValue(), EmptySet.f42985b)) {
        }
        this.openResponse = null;
        this.homeCards = EmptyList.f42983b;
    }

    public final void configUpdates(A coroutineScope, l<? super AppConfig, r> onNewAppConfig) {
        i.e(coroutineScope, "coroutineScope");
        i.e(onNewAppConfig, "onNewAppConfig");
        C2680e.c(coroutineScope, null, null, new AnonymousClass1(onNewAppConfig, null), 3);
    }

    public final void emitEvent(IntercomEvent event) {
        i.e(event, "event");
        emitEvent$default(this, null, event, 1, null);
    }

    public final void fetchConversationSuccess(Conversation conversation) {
        Set<String> value;
        ArrayList arrayList;
        i.e(conversation, "conversation");
        Set<String> value2 = this.unreadConversationIds.getValue();
        if (!conversation.isRead()) {
            q<Set<String>> qVar = this._unreadConversationIds;
            while (!qVar.d(qVar.getValue(), kotlin.collections.B.B(value2, conversation.getId()))) {
            }
            return;
        }
        q<Set<String>> qVar2 = this._unreadConversationIds;
        do {
            value = qVar2.getValue();
            arrayList = new ArrayList();
            for (Object obj : value2) {
                if (!i.a((String) obj, conversation.getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!qVar2.d(value, kotlin.collections.q.s0(arrayList)));
    }

    public final kotlinx.coroutines.flow.A<String> getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public final kotlinx.coroutines.flow.A<BotIntro> getBotIntro() {
        return this.botIntro;
    }

    public final kotlinx.coroutines.flow.A<AppConfig> getConfig() {
        return this.config;
    }

    public final kotlinx.coroutines.flow.A<List<Conversation>> getConversations() {
        return this.conversations;
    }

    public final u<IntercomEvent> getEvent() {
        return this.event;
    }

    public final kotlinx.coroutines.flow.A<HostAppState> getHostAppState() {
        return this.hostAppState;
    }

    public final OpenMessengerResponse getOpenResponse() {
        return this.openResponse;
    }

    public final kotlinx.coroutines.flow.A<OverlayState> getOverlayState() {
        return this.overlayState;
    }

    public final kotlinx.coroutines.flow.A<SurveyData> getSurveyData() {
        return this.surveyData;
    }

    public final kotlinx.coroutines.flow.A<TeamPresence> getTeamPresence() {
        return this.teamPresence;
    }

    public final kotlinx.coroutines.flow.A<Ticket> getTicket() {
        return this.ticket;
    }

    public final kotlinx.coroutines.flow.A<Set<String>> getUnreadConversationIds() {
        return this.unreadConversationIds;
    }

    public final void hardReset() {
        HostAppState value;
        resetConfig();
        q<HostAppState> qVar = this._hostAppState;
        do {
            value = qVar.getValue();
        } while (!qVar.d(value, HostAppState.copy$default(value, false, false, 0L, 5, null)));
    }

    public final void listenToEvents(A coroutineScope, l<? super IntercomEvent, r> onNewEvent) {
        i.e(coroutineScope, "coroutineScope");
        i.e(onNewEvent, "onNewEvent");
        C2680e.c(coroutineScope, null, null, new C24121(onNewEvent, null), 3);
    }

    public final void markConversationAsRead(String conversationId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Set<String> value2;
        ArrayList arrayList2;
        i.e(conversationId, "conversationId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                if (!i.a(((Conversation) obj).getId(), conversationId)) {
                    arrayList.add(obj);
                }
            }
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : arrayList, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
        Set<String> value3 = this.unreadConversationIds.getValue();
        q<Set<String>> qVar2 = this._unreadConversationIds;
        do {
            value2 = qVar2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : value3) {
                if (!i.a((String) obj2, conversationId)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!qVar2.d(value2, kotlin.collections.q.s0(arrayList2)));
    }

    public final void markConversationPartAsDismissed(String partId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        i.e(partId, "partId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        LinkedHashSet linkedHashSetB = kotlin.collections.B.B(this.overlayState.getValue().getDismissedPartIds(), partId);
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                if (!linkedHashSetB.isEmpty()) {
                    Iterator it = linkedHashSetB.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!i.a((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList.add(obj);
            }
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : arrayList, (127 & 64) != 0 ? overlayState.dismissedPartIds : linkedHashSetB, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void overlayStateUpdates(A coroutineScope, l<? super OverlayState, r> onNewOverlyState) {
        i.e(coroutineScope, "coroutineScope");
        i.e(onNewOverlyState, "onNewOverlyState");
        C2680e.c(coroutineScope, null, null, new C24131(onNewOverlyState, null), 3);
    }

    public final void resetConfig() {
        AppConfig value = this.config.getValue();
        updateAppConfig(value.copy(((-541065217) & 1) != 0 ? value.name : null, ((-541065217) & 2) != 0 ? value.primaryColor : 0, ((-541065217) & 4) != 0 ? value.secondaryColor : 0, ((-541065217) & 8) != 0 ? value.secondaryColorDark : 0, ((-541065217) & 16) != 0 ? value.isPrimaryColorRenderDarkText : false, ((-541065217) & 32) != 0 ? value.isSecondaryColorRenderDarkText : false, ((-541065217) & 64) != 0 ? value.isInboundMessages : false, ((-541065217) & 128) != 0 ? value.rateLimitCount : 0, ((-541065217) & 256) != 0 ? value.rateLimitPeriodMs : 0L, ((-541065217) & 512) != 0 ? value.userUpdateCacheMaxAgeMs : 0L, ((-541065217) & 1024) != 0 ? value.newSessionThresholdMs : 0L, ((-541065217) & 2048) != 0 ? value.softResetTimeoutMs : 0L, ((-541065217) & 4096) != 0 ? value.isMetricsEnabled : false, ((-541065217) & 8192) != 0 ? value.isAudioEnabled : false, ((-541065217) & 16384) != 0 ? value.locale : null, ((-541065217) & 32768) != 0 ? value.helpCenterLocale : null, ((-541065217) & 65536) != 0 ? value.isReceivedFromServer : false, ((-541065217) & 131072) != 0 ? value.isBackgroundRequestsEnabled : false, ((-541065217) & 262144) != 0 ? value.helpCenterUrl : null, ((-541065217) & 524288) != 0 ? value.helpCenterUrls : null, ((-541065217) & 1048576) != 0 ? value.features : null, ((-541065217) & 2097152) != 0 ? value.launcherLogoUrl : null, ((-541065217) & 4194304) != 0 ? value.teamGreeting : "", ((-541065217) & 8388608) != 0 ? value.isIdentityVerificationEnabled : false, ((-541065217) & 16777216) != 0 ? value.isAccessToTeammateEnabled : false, ((-541065217) & 33554432) != 0 ? value.isHelpCenterRequireSearchEnabled : false, ((-541065217) & 67108864) != 0 ? value.isPreventMultipleInboundConversationsEnabled : false, ((-541065217) & 134217728) != 0 ? value.hasOpenConversations : false, ((-541065217) & 268435456) != 0 ? value.configModules : null, ((-541065217) & 536870912) != 0 ? value.realTimeConfig : new NexusConfig(), ((-541065217) & 1073741824) != 0 ? value.attachmentSettings : null, ((-541065217) & Integer.MIN_VALUE) != 0 ? value.articleAutoReactionEnabled : false, (3 & 1) != 0 ? value.finDictationUiEnabled : false, (3 & 2) != 0 ? value.conversationStateSyncSettings : null));
    }

    public final void unreadConversationIdsUpdates(A coroutineScope, l<? super Set<String>, r> onNewUnreadConversationsIdsState) {
        i.e(coroutineScope, "coroutineScope");
        i.e(onNewUnreadConversationsIdsState, "onNewUnreadConversationsIdsState");
        C2680e.c(coroutineScope, null, null, new C24141(onNewUnreadConversationsIdsState, null), 3);
    }

    public final void updateBotBehaviourId(String str) {
        q<String> qVar = this._botBehaviourId;
        while (!qVar.d(qVar.getValue(), str)) {
        }
    }

    public final void updateBotIntro(BotIntro botIntro) {
        i.e(botIntro, "botIntro");
        q<BotIntro> qVar = this._botIntro;
        while (!qVar.d(qVar.getValue(), botIntro)) {
        }
    }

    public final void updateBottomPadding(int i10) {
        OverlayState value;
        OverlayState overlayState;
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : i10, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateCarousel(Carousel carousel) {
        OverlayState value;
        OverlayState overlayState;
        i.e(carousel, "carousel");
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : i.a(overlayState.getCarousel(), Carousel.NULL) ? carousel : overlayState.getCarousel(), (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateConfig(Config config) {
        i.e(config, "config");
        if (config.equals(Config.Companion.getNULL())) {
            return;
        }
        updateAppConfig(AppConfigKt.getAppConfig(config, this._config.getValue().getPrimaryColor()));
    }

    public final void updateInAppNotificationsVisibility(Intercom.Visibility visibility) {
        OverlayState value;
        OverlayState overlayState;
        i.e(visibility, "visibility");
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : visibility, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateLauncherVisibility(Intercom.Visibility visibility) {
        OverlayState value;
        OverlayState overlayState;
        i.e(visibility, "visibility");
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : visibility, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateOpenResponse(OpenMessengerResponse response) {
        i.e(response, "response");
        this.openResponse = response;
    }

    public final void updateOverlayConversations(List<Conversation> conversations) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        i.e(conversations, "conversations");
        Set<String> dismissedPartIds = this.overlayState.getValue().getDismissedPartIds();
        q<OverlayState> qVar = this._overlayState;
        do {
            value = qVar.getValue();
            overlayState = value;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                Set<String> set = dismissedPartIds;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!i.a((String) it.next(), conversation.lastPart().getId()));
                }
                arrayList2.add(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((Conversation) obj2).lastPart().getDeliveryOption() != DeliveryOption.BADGE) {
                    arrayList.add(obj2);
                }
            }
        } while (!qVar.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : null, (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : arrayList, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateSessionStarted() {
        HostAppState value;
        q<HostAppState> qVar = this._hostAppState;
        do {
            value = qVar.getValue();
        } while (!qVar.d(value, HostAppState.copy$default(value, false, true, 0L, 5, null)));
    }

    public final void updateSurveyData(SurveyData surveyData) {
        OverlayState value;
        OverlayState overlayState;
        i.e(surveyData, "surveyData");
        q<SurveyData> qVar = this._surveyData;
        while (!qVar.d(qVar.getValue(), surveyData)) {
        }
        q<OverlayState> qVar2 = this._overlayState;
        do {
            value = qVar2.getValue();
            overlayState = value;
        } while (!qVar2.d(value, overlayState.copy((127 & 1) != 0 ? overlayState.surveyData : i.a(overlayState.getSurveyData(), SurveyData.Companion.getNULL()) ? surveyData : overlayState.getSurveyData(), (127 & 2) != 0 ? overlayState.carousel : null, (127 & 4) != 0 ? overlayState.bottomPadding : 0, (127 & 8) != 0 ? overlayState.launcherVisibility : null, (127 & 16) != 0 ? overlayState.inAppNotificationsVisibility : null, (127 & 32) != 0 ? overlayState.conversations : null, (127 & 64) != 0 ? overlayState.dismissedPartIds : null, (127 & 128) != 0 ? overlayState.resumedHostActivity : null, (127 & 256) != 0 ? overlayState.pausedHostActivity : null)));
    }

    public final void updateTeamPresence(TeamPresence teamPresence) {
        i.e(teamPresence, "teamPresence");
        q<TeamPresence> qVar = this._teamPresence;
        while (!qVar.d(qVar.getValue(), teamPresence)) {
        }
    }

    public final void updateTicket(Ticket ticket) {
        i.e(ticket, "ticket");
        q<Ticket> qVar = this._ticket;
        while (!qVar.d(qVar.getValue(), ticket)) {
        }
    }

    public final void updateUnreadConversationIds(Set<String> unreadConversationIds) {
        i.e(unreadConversationIds, "unreadConversationIds");
        q<Set<String>> qVar = this._unreadConversationIds;
        while (!qVar.d(qVar.getValue(), unreadConversationIds)) {
        }
    }

    public final Object emitEvent(IntercomEvent intercomEvent, kotlin.coroutines.c<? super r> cVar) {
        Object objEmit = this._event.emit(intercomEvent, cVar);
        return objEmit == CoroutineSingletons.f43038b ? objEmit : r.f47939a;
    }

    public final void emitEvent(A coroutineScope, IntercomEvent event) {
        i.e(coroutineScope, "coroutineScope");
        i.e(event, "event");
        C2680e.c(coroutineScope, null, null, new AnonymousClass2(event, null), 3);
    }
}
