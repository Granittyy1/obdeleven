package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.r0;
import io.intercom.android.sdk.m5.conversation.ui.C2326c;
import io.intercom.android.sdk.m5.conversation.ui.C2389d;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: MessagesDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessagesDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: MessagesDestination.kt */
    public static final class AnonymousClass7 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5, reason: invalid class name */
        /* JADX INFO: compiled from: MessagesDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5", f = "MessagesDestination.kt", l = {}, m = "invokeSuspend")
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
                Injector.get().getMetricTracker().viewedSpace("messages");
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
        public static final p293xa.r invoke$lambda$3(p141l2.H navController, boolean z10) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation("messages");
            IntercomRouterKt.openNewConversation$default(navController, z10, Fa.d.e(new O(0)), null, 4, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3$lambda$2(p141l2.K navOptions) {
            kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
            navOptions.a(new M(), "CONVERSATION");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3$lambda$2$lambda$1(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = true;
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            p141l2.w.d(navController, "HELP_CENTER", null, 6);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5(p141l2.H navController, ComponentActivity rootActivity) {
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
        public static final p293xa.r invoke$lambda$8(boolean z10, p141l2.H navController, InboxUiEffects.NavigateToConversation it) {
            TransitionArgs transitionArgs;
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(it, "it");
            Injector.get().getMetricTracker().viewedConversation("messages", it.getConversation().getId());
            if (z10) {
                transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
            } else {
                transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
            }
            IntercomRouterKt.openConversation$default(navController, it.getConversation().getId(), null, z10, null, Fa.d.e(new U(0)), transitionArgs, 10, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$8$lambda$7(p141l2.K navOptions) {
            kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
            navOptions.a(new N(0), "CONVERSATION");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$8$lambda$7$lambda$6(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = true;
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
            InboxViewModel.Companion companion = InboxViewModel.Companion;
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
            if (c0VarA == null) {
                c0VarA = this.$rootActivity;
            }
            InboxViewModel inboxViewModelCreate = companion.create(c0VarA);
            Bundle bundleA = it.f44305i.a();
            final boolean z10 = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            interfaceC1084f.L(596908281);
            p141l2.H h8 = this.$navController;
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                if (h8.b() == null) {
                    i11 = R.drawable.intercom_ic_close;
                } else {
                    i11 = z10 ? R.drawable.intercom_ic_chevron_down : R.drawable.intercom_ic_back;
                }
                objF = new C1081d0(i11);
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            final p141l2.H h10 = this.$navController;
            Ia.a aVar = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.P
                @Override // Ia.a
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$3(h10, z10);
                }
            };
            Ia.a aVar2 = new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.Q
                @Override // Ia.a
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$4(h10);
                }
            };
            final ComponentActivity componentActivity = this.$rootActivity;
            InboxScreenKt.InboxScreen(inboxViewModelCreate, aVar, aVar2, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.S
                @Override // Ia.a
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$5(h10, componentActivity);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.T
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8(z10, h10, (InboxUiEffects.NavigateToConversation) obj);
                }
            }, ((androidx.compose.runtime.V) objF).o(), interfaceC1084f, 8);
            androidx.compose.runtime.E.d(new AnonymousClass5(null), interfaceC1084f, "");
        }
    }

    public static final void messagesDestination(p141l2.F f10, p141l2.H navController, ComponentActivity rootActivity) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        androidx.navigation.compose.u.a(f10, "MESSAGES?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", kotlin.collections.l.s(L4.b.e(new p050db.y(2), "transitionArgs"), L4.b.e(new L(0), "isLaunchedProgrammatically")), new r0(3), new C2326c(1), new C2389d(3), new io.intercom.android.sdk.m5.components.N(4), new ComposableLambdaImpl(true, 559331213, new AnonymousClass7(rootActivity, navController)), 132);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r messagesDestination$lambda$0(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r messagesDestination$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m messagesDestination$lambda$2(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o messagesDestination$lambda$3(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m messagesDestination$lambda$4(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o messagesDestination$lambda$5(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
