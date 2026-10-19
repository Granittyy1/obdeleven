package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.InterfaceC1376t;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import p141l2.C2749t;

/* JADX INFO: compiled from: HomeScreenDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: HomeScreenDestination.kt */
    public static final class AnonymousClass1 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;
        final /* synthetic */ kotlinx.coroutines.A $scope;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12, reason: invalid class name */
        /* JADX INFO: compiled from: HomeScreenDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12", f = "HomeScreenDestination.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass12 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            int label;

            public AnonymousClass12(kotlin.coroutines.c<? super AnonymousClass12> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass12(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                Injector.get().getMetricTracker().viewedSpace("home");
                return p293xa.r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass12) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }
        }

        public AnonymousClass1(ComponentActivity componentActivity, p141l2.H h8, kotlinx.coroutines.A a10) {
            this.$rootActivity = componentActivity;
            this.$navController = h8;
            this.$scope = a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$0(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            Injector.get().getMetricTracker().clickedSpace("messages");
            IntercomRouterKt.openMessages$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            Injector.get().getMetricTracker().clickedSpace("help");
            IntercomRouterKt.openHelpCenter$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), false, 2, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$12(p141l2.H navController, String conversationId) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(conversationId, "conversationId");
            invoke$openConversation(navController, conversationId, Fa.d.e(new C2430d(1)), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$12$lambda$11(p141l2.K navOptions) {
            kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
            navOptions.a(new D(0), "HOME");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$12$lambda$11$lambda$10(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = false;
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$13(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation("home");
            IntercomRouterKt.openNewConversation$default(navController, false, null, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), 3, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$14(p141l2.H navController, Conversation it) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(it, "it");
            invoke$openConversation$default(navController, it.getId(), null, null, 12, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$15(kotlinx.coroutines.A scope, ComponentActivity rootActivity) {
            kotlin.jvm.internal.i.e(scope, "$scope");
            kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
            C2680e.c(scope, null, null, new HomeScreenDestinationKt$homeScreen$1$10$1(rootActivity, null), 3);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$16(p141l2.H navController, TicketType it) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(it, "it");
            IntercomRouterKt.openCreateTicketsScreen(navController, it, null, MetricTracker.Context.HOME_SCREEN);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            IntercomRouterKt.openTicketList$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3(p141l2.H navController, String ticketId) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, "home", new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$6(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            navController.c(new C2446u(0), "MESSAGES");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$6$lambda$5(p141l2.K navigate) {
            kotlin.jvm.internal.i.e(navigate, "$this$navigate");
            navigate.a(new C2429c(1), "HOME");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$6$lambda$5$lambda$4(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = true;
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            IntercomRouterKt.openNewConversation(navController, false, Fa.d.e(new C(0)), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9$lambda$8(p141l2.K navOptions) {
            kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
            navOptions.a(new B(0), "HOME");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9$lambda$8$lambda$7(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = false;
            return p293xa.r.f47939a;
        }

        private static final void invoke$openConversation(p141l2.H h8, String str, p141l2.J j, TransitionArgs transitionArgs) {
            Injector.get().getMetricTracker().viewedConversation("home", str);
            IntercomRouterKt.openConversation$default(h8, str, null, false, null, j, transitionArgs, 14, null);
        }

        public static /* synthetic */ void invoke$openConversation$default(p141l2.H h8, String str, p141l2.J j, TransitionArgs transitionArgs, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j = null;
            }
            if ((i10 & 8) != 0) {
                transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
            }
            invoke$openConversation(h8, str, j, transitionArgs);
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(composable, "$this$composable");
            kotlin.jvm.internal.i.e(it, "it");
            InterfaceC1376t interfaceC1376t = (InterfaceC1376t) interfaceC1084f.x(Z0.b.f7676a);
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
            if (c0VarA == null) {
                c0VarA = this.$rootActivity;
            }
            HomeViewModel homeViewModelCreate = HomeViewModel.Companion.create(c0VarA, interfaceC1376t.getLifecycle());
            final p141l2.H h8 = this.$navController;
            C2432f c2432f = new C2432f(h8, 1);
            Ia.a aVar = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.F
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$1(h8);
                }
            };
            Ia.a aVar2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.G
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$2(h8);
                }
            };
            Ia.l lVar = new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.H
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$3(h8, (String) obj);
                }
            };
            Ia.a aVar3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.v
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$6(h8);
                }
            };
            Ia.a aVar4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.w
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9(h8);
                }
            };
            Ia.l lVar2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.x
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12(h8, (String) obj);
                }
            };
            Ia.a aVar5 = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.y
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$13(h8);
                }
            };
            Ia.l lVar3 = new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.z
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$14(h8, (Conversation) obj);
                }
            };
            final kotlinx.coroutines.A a10 = this.$scope;
            final ComponentActivity componentActivity = this.$rootActivity;
            HomeScreenKt.HomeScreen(homeViewModelCreate, c2432f, aVar, aVar2, lVar, aVar3, aVar4, lVar2, aVar5, lVar3, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.A
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$15(a10, componentActivity);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.E
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$16(h8, (TicketType) obj);
                }
            }, interfaceC1084f, 8, 0);
            androidx.compose.runtime.E.d(new AnonymousClass12(null), interfaceC1084f, "");
        }
    }

    public static final void homeScreen(p141l2.F f10, p141l2.H navController, ComponentActivity rootActivity, kotlinx.coroutines.A scope) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        kotlin.jvm.internal.i.e(scope, "scope");
        androidx.navigation.compose.u.a(f10, "HOME", null, null, null, null, null, new ComposableLambdaImpl(true, 1180315695, new AnonymousClass1(rootActivity, navController, scope)), 254);
    }
}
