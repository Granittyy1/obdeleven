package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.ui.C2398m;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.C2388z;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: ConversationDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationDestinationKt {

    /* JADX INFO: compiled from: ConversationDestination.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationDestination.kt */
    public static final class AnonymousClass11 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        public AnonymousClass11(ComponentActivity componentActivity, p141l2.H h8) {
            this.$rootActivity = componentActivity;
            this.$navController = h8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1(p141l2.H navController, ComponentActivity rootActivity) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
            if (navController.b() == null) {
                rootActivity.getOnBackPressedDispatcher().c();
            } else {
                navController.e();
            }
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2(p141l2.H navController) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation(MetricTracker.Context.FROM_CONVERSATION);
            IntercomRouterKt.openNewConversation$default(navController, false, null, null, 7, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3(p141l2.H navController, Ref$BooleanRef isLaunchedProgrammatically) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            IntercomRouterKt.openTicketDetailScreen$default(navController, false, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.element, 1, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4(p141l2.H navController, Ref$BooleanRef isLaunchedProgrammatically, String ticketId) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen(navController, ticketId, MetricTracker.Context.HOME_SCREEN, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), isLaunchedProgrammatically.element);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5(p141l2.H navController, ConversationViewModel conversationViewModel, TicketType ticketType) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(conversationViewModel, "$conversationViewModel");
            kotlin.jvm.internal.i.e(ticketType, "ticketType");
            IntercomRouterKt.openCreateTicketsScreen(navController, ticketType, conversationViewModel.getConversationId(), MetricTracker.Context.FROM_CONVERSATION);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$6(p141l2.H navController, Ref$BooleanRef isLaunchedProgrammatically, HeaderMenuItem headerMenuItem) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            kotlin.jvm.internal.i.e(headerMenuItem, "headerMenuItem");
            if (headerMenuItem instanceof HeaderMenuItem.Messages) {
                IntercomRouterKt.openMessages(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.element);
            } else if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
                IntercomRouterKt.openNewConversation$default(navController, isLaunchedProgrammatically.element, null, null, 6, null);
            } else if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
                IntercomRouterKt.openTicketList(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_OUT_LEFT, EnterTransitionStyle.SLIDE_IN_RIGHT, ExitTransitionStyle.SLIDE_DOWN), true);
            } else {
                if (!(headerMenuItem instanceof HeaderMenuItem.Help)) {
                    throw new NoWhenBranchMatchedException();
                }
                IntercomRouterKt.openHelpCenter(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), true);
            }
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9(p141l2.H navController, Ref$BooleanRef isLaunchedProgrammatically, String it) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            kotlin.jvm.internal.i.e(it, "it");
            boolean z10 = isLaunchedProgrammatically.element;
            IntercomRouterKt.openConversation$default(navController, it, null, z10, null, z10 ? Fa.d.e(new C2429c(0)) : null, null, 42, null);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9$lambda$8(p141l2.K navOptions) {
            kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
            navOptions.a(new C2430d(0), "CONVERSATION");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$9$lambda$8$lambda$7(p141l2.T popUpTo) {
            kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
            popUpTo.f44280a = true;
            return p293xa.r.f47939a;
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0900c composable, C2749t backStackEntry, InterfaceC1084f interfaceC1084f, int i10) {
            String articleId;
            String articleTitle;
            String str;
            String encodedInitialMessage;
            kotlin.jvm.internal.i.e(composable, "$this$composable");
            kotlin.jvm.internal.i.e(backStackEntry, "backStackEntry");
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Intent intent = this.$rootActivity.getIntent();
            kotlin.jvm.internal.i.d(intent, "getIntent(...)");
            IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
            IntercomRootActivityArgs.ConversationScreenArgs conversationScreenArgs = argsForIntent instanceof IntercomRootActivityArgs.ConversationScreenArgs ? (IntercomRootActivityArgs.ConversationScreenArgs) argsForIntent : null;
            p163n2.c cVar = backStackEntry.f44305i;
            Bundle bundleA = cVar.a();
            if (bundleA != null && bundleA.containsKey("conversationId")) {
                Bundle bundleA2 = cVar.a();
                String string = bundleA2 != null ? bundleA2.getString("conversationId") : null;
                Bundle bundleA3 = cVar.a();
                encodedInitialMessage = bundleA3 != null ? bundleA3.getString("initialMessage") : null;
                Bundle bundleA4 = cVar.a();
                articleId = bundleA4 != null ? bundleA4.getString("articleId") : null;
                Bundle bundleA5 = cVar.a();
                articleTitle = bundleA5 != null ? bundleA5.getString("articleTitle") : null;
                Bundle bundleA6 = cVar.a();
                ref$BooleanRef.element = bundleA6 != null ? bundleA6.getBoolean("isLaunchedProgrammatically") : false;
                str = string;
            } else if (conversationScreenArgs != null) {
                String conversationId = conversationScreenArgs.getConversationId();
                encodedInitialMessage = conversationScreenArgs.getEncodedInitialMessage();
                ref$BooleanRef.element = conversationScreenArgs.isLaunchedProgrammatically();
                articleId = conversationScreenArgs.getArticleId();
                articleTitle = conversationScreenArgs.getArticleTitle();
                str = conversationId;
            } else {
                articleId = null;
                articleTitle = null;
                str = null;
                encodedInitialMessage = "";
            }
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
            if (c0VarA == null) {
                c0VarA = this.$rootActivity;
            }
            final ConversationViewModel conversationViewModel = ConversationDestinationKt.getConversationViewModel(c0VarA, str, encodedInitialMessage == null ? "" : encodedInitialMessage, ref$BooleanRef.element, articleId != null ? new ArticleMetadata(articleId, articleTitle) : null, interfaceC1084f, 8, 0);
            FillElement fillElement = androidx.compose.foundation.layout.W.f10226c;
            final p141l2.H h8 = this.$navController;
            final ComponentActivity componentActivity = this.$rootActivity;
            ConversationScreenKt.ConversationScreen(conversationViewModel, fillElement, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.e
                @Override // Ia.a
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$1(h8, componentActivity);
                }
            }, new C2432f(h8, 0), new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.g
                @Override // Ia.a
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$3(h8, ref$BooleanRef);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.h
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$4(h8, ref$BooleanRef, (String) obj);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.i
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$5(h8, conversationViewModel, (TicketType) obj);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.j
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$6(h8, ref$BooleanRef, (HeaderMenuItem) obj);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.k
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9(h8, ref$BooleanRef, (String) obj);
                }
            }, interfaceC1084f, 56, 0);
        }
    }

    public static final void conversationDestination(p141l2.F f10, p141l2.H navController, ComponentActivity rootActivity) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        androidx.navigation.compose.u.a(f10, "CONVERSATION?conversationId={conversationId}&initialMessage={initialMessage}&articleId={articleId}&articleTitle={articleTitle}&isLaunchedProgrammatically={isLaunchedProgrammatically}&transitionArgs={transitionArgs}", kotlin.collections.l.s(L4.b.e(new C2398m(3), "conversationId"), L4.b.e(new C2399n(3), "initialMessage"), L4.b.e(new p011ab.k(5), "articleId"), L4.b.e(new androidx.navigation.compose.y(6), "articleTitle"), L4.b.e(new io.intercom.android.sdk.m5.conversation.ui.M(2), "isLaunchedProgrammatically"), L4.b.e(new coil.compose.r(2), "transitionArgs")), new B(1), new C(1), new C2388z(2), new U(1), new ComposableLambdaImpl(true, -1198092933, new AnonymousClass11(rootActivity, navController)), 132);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$0(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$2(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$3(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$4(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.f44296a.f44293b = false;
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r conversationDestination$lambda$5(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f44296a.f44293b = false;
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m conversationDestination$lambda$6(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o conversationDestination$lambda$7(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m conversationDestination$lambda$8(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o conversationDestination$lambda$9(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationViewModel getConversationViewModel(androidx.lifecycle.c0 c0Var, String str, String str2, boolean z10, ArticleMetadata articleMetadata, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(-1203114984);
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            articleMetadata = null;
        }
        ArticleMetadata articleMetadata2 = articleMetadata;
        final InterfaceC1376t interfaceC1376t = (InterfaceC1376t) interfaceC1084f.x(Z0.b.f7676a);
        final Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        final ConversationViewModel conversationViewModelCreate = ConversationViewModel.Companion.create(c0Var, str, str3, articleMetadata2, z10 ? LaunchMode.PROGRAMMATIC : LaunchMode.CLASSIC);
        androidx.compose.runtime.E.a(interfaceC1376t, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.a
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.getConversationViewModel$lambda$12(interfaceC1376t, conversationViewModelCreate, context, (androidx.compose.runtime.B) obj);
            }
        }, interfaceC1084f);
        interfaceC1084f.D();
        return conversationViewModelCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.A getConversationViewModel$lambda$12(final InterfaceC1376t lifecycleOwner, final ConversationViewModel viewModel, final Context context, androidx.compose.runtime.B DisposableEffect) {
        kotlin.jvm.internal.i.e(lifecycleOwner, "$lifecycleOwner");
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(DisposableEffect, "$this$DisposableEffect");
        final androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: io.intercom.android.sdk.m5.navigation.b
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                ConversationDestinationKt.getConversationViewModel$lambda$12$lambda$10(viewModel, context, interfaceC1376t, event);
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return new androidx.compose.runtime.A() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.A
            public void dispose() {
                lifecycleOwner.getLifecycle().c(rVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConversationViewModel$lambda$12$lambda$10(ConversationViewModel viewModel, Context context, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(interfaceC1376t, "<unused var>");
        kotlin.jvm.internal.i.e(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            viewModel.onResume(context);
        } else {
            if (i10 != 2) {
                return;
            }
            viewModel.onPause(context);
        }
    }
}
