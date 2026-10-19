package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.r0;
import io.intercom.android.sdk.m5.conversation.ui.C2326c;
import io.intercom.android.sdk.m5.conversation.ui.C2389d;
import io.intercom.android.sdk.m5.conversation.ui.C2410z;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: TicketsDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: TicketsDestination.kt */
    public static final class AnonymousClass7 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: TicketsDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1", f = "TicketsDestination.kt", l = {R.styleable.AppCompatTheme_panelBackground}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ androidx.paging.compose.b<TicketRowData> $lazyPagingItems;
            final /* synthetic */ TicketsScreenViewModel $viewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TicketsScreenViewModel ticketsScreenViewModel, androidx.paging.compose.b<TicketRowData> bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$viewModel = ticketsScreenViewModel;
                this.$lazyPagingItems = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass1(this.$viewModel, this.$lazyPagingItems, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.u<TicketsScreenEffects> effect = this.$viewModel.getEffect();
                    final androidx.paging.compose.b<TicketRowData> bVar = this.$lazyPagingItems;
                    InterfaceC2687d<? super TicketsScreenEffects> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.ticketsDestination.7.1.1
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                            return emit((TicketsScreenEffects) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                        }

                        public final Object emit(TicketsScreenEffects ticketsScreenEffects, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            if (!kotlin.jvm.internal.i.a(ticketsScreenEffects, TicketsScreenEffects.RefreshTickets.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.d();
                            return p293xa.r.f47939a;
                        }
                    };
                    this.label = 1;
                    if (effect.collect(interfaceC2687d, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5, reason: invalid class name */
        /* JADX INFO: compiled from: TicketsDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5", f = "TicketsDestination.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass5 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            int label;

            public AnonymousClass5(kotlin.coroutines.c<? super AnonymousClass5> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass5(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                Injector.get().getMetricTracker().viewedSpace("tickets");
                return p293xa.r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass5) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }
        }

        public AnonymousClass7(ComponentActivity componentActivity, p141l2.H h8) {
            this.$rootActivity = componentActivity;
            this.$navController = h8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.A invoke$lambda$2(final InterfaceC1376t lifecycleOwner, final androidx.paging.compose.b lazyPagingItems, androidx.compose.runtime.B DisposableEffect) {
            kotlin.jvm.internal.i.e(lifecycleOwner, "$lifecycleOwner");
            kotlin.jvm.internal.i.e(lazyPagingItems, "$lazyPagingItems");
            kotlin.jvm.internal.i.e(DisposableEffect, "$this$DisposableEffect");
            final androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: io.intercom.android.sdk.m5.navigation.Z
                @Override // androidx.lifecycle.r
                public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                    TicketsDestinationKt.AnonymousClass7.invoke$lambda$2$lambda$0(lazyPagingItems, interfaceC1376t, event);
                }
            };
            lifecycleOwner.getLifecycle().a(rVar);
            return new androidx.compose.runtime.A() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$invoke$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.A
                public void dispose() {
                    lifecycleOwner.getLifecycle().c(rVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2$lambda$0(androidx.paging.compose.b lazyPagingItems, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            kotlin.jvm.internal.i.e(lazyPagingItems, "$lazyPagingItems");
            kotlin.jvm.internal.i.e(interfaceC1376t, "<unused var>");
            kotlin.jvm.internal.i.e(event, "event");
            if (event == Lifecycle.Event.ON_RESUME && (lazyPagingItems.c().f19339a instanceof androidx.paging.m.c)) {
                lazyPagingItems.d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4(p141l2.H navController, ComponentActivity rootActivity) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
            if (navController.b() == null) {
                rootActivity.finish();
            } else {
                navController.e();
            }
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5(boolean z10, p141l2.H navController, String ticketId) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, MetricTracker.Context.FROM_TICKETS_SPACE, z10 ? new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_DOWN, EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT) : new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
            return p293xa.r.f47939a;
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            kotlin.jvm.internal.i.e(composable, "$this$composable");
            kotlin.jvm.internal.i.e(it, "it");
            TicketsScreenViewModel.Companion companion = TicketsScreenViewModel.Companion;
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
            if (c0VarA == null) {
                c0VarA = this.$rootActivity;
            }
            TicketsScreenViewModel ticketsScreenViewModelCreate = companion.create(c0VarA);
            Bundle bundleA = it.f44305i.a();
            final boolean z10 = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            final androidx.paging.compose.b bVarA = androidx.paging.compose.c.a(ticketsScreenViewModelCreate.getPagerFlow(), interfaceC1084f);
            TicketsScreenUiState ticketsScreenUiStateReduceToTicketsScreenUiState = TicketsListReducerKt.reduceToTicketsScreenUiState(bVarA, null, interfaceC1084f, 8, 1);
            androidx.compose.runtime.E.d(new AnonymousClass1(ticketsScreenViewModelCreate, bVarA, null), interfaceC1084f, null);
            final InterfaceC1376t interfaceC1376t = (InterfaceC1376t) interfaceC1084f.x(Z0.b.f7676a);
            androidx.compose.runtime.E.a(interfaceC1376t, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.a0
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$2(interfaceC1376t, bVarA, (androidx.compose.runtime.B) obj);
                }
            }, interfaceC1084f);
            interfaceC1084f.L(834702382);
            p141l2.H h8 = this.$navController;
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                if (h8.b() == null) {
                    i11 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_close;
                } else {
                    i11 = z10 ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down : io.intercom.android.sdk.ui.R.drawable.intercom_ic_back;
                }
                objF = new C1081d0(i11);
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            final p141l2.H h10 = this.$navController;
            final ComponentActivity componentActivity = this.$rootActivity;
            TicketsScreenKt.TicketsScreen(ticketsScreenUiStateReduceToTicketsScreenUiState, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.b0
                @Override // Ia.a
                public final Object invoke() {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$4(h10, componentActivity);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.c0
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$5(z10, h10, (String) obj);
                }
            }, ((androidx.compose.runtime.V) objF).o(), interfaceC1084f, 0, 0);
            androidx.compose.runtime.E.d(new AnonymousClass5(null), interfaceC1084f, "");
        }
    }

    public static final void ticketsDestination(p141l2.F f10, p141l2.H navController, ComponentActivity rootActivity) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        androidx.navigation.compose.u.a(f10, "TICKETS?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", kotlin.collections.l.s(L4.b.e(new C2410z(2), "transitionArgs"), L4.b.e(new p050db.y(3), "isLaunchedProgrammatically")), new L(1), new r0(4), new C2326c(2), new C2389d(4), new ComposableLambdaImpl(true, 655582181, new AnonymousClass7(rootActivity, navController)), 132);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketsDestination$lambda$0(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketsDestination$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketsDestination$lambda$2(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketsDestination$lambda$3(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketsDestination$lambda$4(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketsDestination$lambda$5(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
