package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.h0;
import io.intercom.android.sdk.m5.conversation.ui.components.C2365n;
import io.intercom.android.sdk.m5.conversation.ui.components.C2366o;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: CreateTicketDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketDestinationKt {
    public static final String CONVERSATION_ID = "conversation_id";
    public static final String TICKET_TYPE_ID = "ticket_type_id";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4, reason: invalid class name */
    /* JADX INFO: compiled from: CreateTicketDestination.kt */
    public static final class AnonymousClass4 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: CreateTicketDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1", f = "CreateTicketDestination.kt", l = {R.styleable.AppCompatTheme_switchStyle}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            final /* synthetic */ androidx.compose.runtime.X<AnswerClickData> $answerClickedData;
            final /* synthetic */ p141l2.H $navController;
            final /* synthetic */ kotlinx.coroutines.A $scope;
            final /* synthetic */ CreateTicketViewModel $viewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreateTicketViewModel createTicketViewModel, p141l2.H h8, kotlinx.coroutines.A a10, androidx.compose.runtime.X<AnswerClickData> x10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$viewModel = createTicketViewModel;
                this.$navController = h8;
                this.$scope = a10;
                this.$answerClickedData = x10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass1(this.$viewModel, this.$navController, this.$scope, this.$answerClickedData, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.u<CreateTicketViewModel.TicketSideEffect> effect = this.$viewModel.getEffect();
                    final p141l2.H h8 = this.$navController;
                    final kotlinx.coroutines.A a10 = this.$scope;
                    final androidx.compose.runtime.X<AnswerClickData> x10 = this.$answerClickedData;
                    InterfaceC2687d<? super CreateTicketViewModel.TicketSideEffect> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt.createTicketDestination.4.1.1
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                            return emit((CreateTicketViewModel.TicketSideEffect) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                        }

                        public final Object emit(CreateTicketViewModel.TicketSideEffect ticketSideEffect, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            if (kotlin.jvm.internal.i.a(ticketSideEffect, CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE)) {
                                h8.e();
                                IntercomRouterKt.openTicketDetailScreen$default(h8, true, null, false, 6, null);
                            } else {
                                if (!(ticketSideEffect instanceof CreateTicketViewModel.TicketSideEffect.AnswerClicked)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AnonymousClass4.invoke$showSheet(a10, x10, ((CreateTicketViewModel.TicketSideEffect.AnswerClicked) ticketSideEffect).getAnswerClickData());
                            }
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

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$3, reason: invalid class name */
        /* JADX INFO: compiled from: CreateTicketDestination.kt */
        public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
            final /* synthetic */ p141l2.H $navController;
            final /* synthetic */ ComponentActivity $rootActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(p141l2.H h8, ComponentActivity componentActivity) {
                super(0, kotlin.jvm.internal.i.a.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                this.$navController = h8;
                this.$rootActivity = componentActivity;
            }

            @Override // Ia.a
            public /* bridge */ /* synthetic */ p293xa.r invoke() {
                invoke2();
                return p293xa.r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$5, reason: invalid class name */
        /* JADX INFO: compiled from: CreateTicketDestination.kt */
        public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
            final /* synthetic */ p141l2.H $navController;
            final /* synthetic */ ComponentActivity $rootActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(p141l2.H h8, ComponentActivity componentActivity) {
                super(0, kotlin.jvm.internal.i.a.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                this.$navController = h8;
                this.$rootActivity = componentActivity;
            }

            @Override // Ia.a
            public /* bridge */ /* synthetic */ p293xa.r invoke() {
                invoke2();
                return p293xa.r.f47939a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
            }
        }

        public AnonymousClass4(ComponentActivity componentActivity, p141l2.H h8) {
            this.$rootActivity = componentActivity;
            this.$navController = h8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$dismissSheet(kotlinx.coroutines.A a10, androidx.compose.runtime.X<AnswerClickData> x10) {
            C2680e.c(a10, null, null, new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(x10, null), 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2$lambda$1(kotlinx.coroutines.A scope, androidx.compose.runtime.X answerClickedData) {
            kotlin.jvm.internal.i.e(scope, "$scope");
            kotlin.jvm.internal.i.e(answerClickedData, "$answerClickedData");
            invoke$dismissSheet(scope, answerClickedData);
            return p293xa.r.f47939a;
        }

        private static final CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$3(N0<? extends CreateTicketViewModel.CreateTicketFormUiState> n10) {
            return n10.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4(CreateTicketViewModel viewModel, kotlinx.coroutines.A scope) {
            kotlin.jvm.internal.i.e(viewModel, "$viewModel");
            kotlin.jvm.internal.i.e(scope, "$scope");
            viewModel.createTicket(scope);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5(CreateTicketViewModel viewModel, String it) {
            kotlin.jvm.internal.i.e(viewModel, "$viewModel");
            kotlin.jvm.internal.i.e(it, "it");
            viewModel.onAnswerUpdated(it);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$6(CreateTicketViewModel viewModel, AnswerClickData it) {
            kotlin.jvm.internal.i.e(viewModel, "$viewModel");
            kotlin.jvm.internal.i.e(it, "it");
            viewModel.onAnswerClicked(it);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$showSheet(kotlinx.coroutines.A a10, androidx.compose.runtime.X<AnswerClickData> x10, AnswerClickData answerClickData) {
            C2680e.c(a10, null, null, new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(x10, answerClickData, null), 3);
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(InterfaceC0900c composable, C2749t navBackStackEntry, InterfaceC1084f interfaceC1084f, int i10) {
            String string;
            kotlinx.coroutines.A a10;
            kotlin.jvm.internal.i.e(composable, "$this$composable");
            kotlin.jvm.internal.i.e(navBackStackEntry, "navBackStackEntry");
            p163n2.c cVar = navBackStackEntry.f44305i;
            Bundle bundleA = cVar.a();
            Integer numValueOf = bundleA != null ? Integer.valueOf(bundleA.getInt(CreateTicketDestinationKt.TICKET_TYPE_ID)) : null;
            Bundle bundleA2 = cVar.a();
            String string2 = bundleA2 != null ? bundleA2.getString(CreateTicketDestinationKt.CONVERSATION_ID) : null;
            Bundle bundleA3 = cVar.a();
            if (bundleA3 == null || (string = bundleA3.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
                string = "conversation";
            }
            if (numValueOf == null) {
                return;
            }
            CreateTicketViewModel.Companion companion = CreateTicketViewModel.Companion;
            androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
            if (c0VarA == null) {
                c0VarA = this.$rootActivity;
            }
            final CreateTicketViewModel createTicketViewModelCreate = companion.create(c0VarA, numValueOf.intValue(), string2, string.equals("conversation") ? CreateTicketLaunchedFrom.Conversation : CreateTicketLaunchedFrom.Home);
            interfaceC1084f.L(-693655600);
            Object objF = interfaceC1084f.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(null);
                interfaceC1084f.E(objF);
            }
            final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF;
            interfaceC1084f.D();
            SheetState sheetStateF = ModalBottomSheetKt.f(6, 2, interfaceC1084f, true);
            Object objF2 = interfaceC1084f.f();
            if (objF2 == c0153a) {
                objF2 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, interfaceC1084f);
                interfaceC1084f.E(objF2);
            }
            final kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) objF2;
            androidx.compose.runtime.E.d(new AnonymousClass1(createTicketViewModelCreate, this.$navController, a11, x10, null), interfaceC1084f, "");
            AnswerClickData answerClickData = (AnswerClickData) x10.getValue();
            interfaceC1084f.L(-693618191);
            if (answerClickData == null) {
                a10 = a11;
            } else {
                interfaceC1084f.L(-693614197);
                long jM621getBackground0d7_KjU = answerClickData.getClickedItem().getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success ? androidx.compose.ui.graphics.H.f13495b : IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU();
                interfaceC1084f.D();
                a10 = a11;
                ModalBottomSheetKt.a(new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.l
                    @Override // Ia.a
                    public final Object invoke() {
                        return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$2$lambda$1(a11, x10);
                    }
                }, null, sheetStateF, 0.0f, h0.f13629a, jM621getBackground0d7_KjU, 0L, 0.0f, 0L, null, null, null, androidx.compose.runtime.internal.a.b(60091801, new CreateTicketDestinationKt$createTicketDestination$4$2$2(answerClickData, createTicketViewModelCreate, a11, x10), interfaceC1084f), interfaceC1084f, 805330944, 384, 3530);
                p293xa.r rVar = p293xa.r.f47939a;
            }
            interfaceC1084f.D();
            final kotlinx.coroutines.A a12 = a10;
            CreateTicketContentScreenKt.CreateTicketScreen(invoke$lambda$3(J0.b(createTicketViewModelCreate.getUiState(), CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE, null, interfaceC1084f, 56, 2)), new AnonymousClass3(this.$navController, this.$rootActivity), new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.m
                @Override // Ia.a
                public final Object invoke() {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$4(createTicketViewModelCreate, a12);
                }
            }, new AnonymousClass5(this.$navController, this.$rootActivity), new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.n
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$5(createTicketViewModelCreate, (String) obj);
                }
            }, new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.o
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$6(createTicketViewModelCreate, (AnswerClickData) obj);
                }
            }, interfaceC1084f, 0);
        }
    }

    public static final void createTicketDestination(p141l2.F f10, p141l2.H navController, ComponentActivity rootActivity) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        androidx.navigation.compose.u.a(f10, "CREATE_TICKET/{ticket_type_id}?conversation_id={conversation_id}?from={from}", kotlin.collections.l.s(L4.b.e(new C2365n(1), TICKET_TYPE_ID), L4.b.e(new C2366o(1), CONVERSATION_ID), L4.b.e(new Q9.b(1), TicketDetailDestinationKt.LAUNCHED_FROM)), IntercomTransitionsKt.getSlideUpEnterTransition(), IntercomTransitionsKt.getSlideDownExitTransition(), null, null, new ComposableLambdaImpl(true, -521503931, new AnonymousClass4(rootActivity, navController)), 228);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r createTicketDestination$lambda$0(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.IntType);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r createTicketDestination$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r createTicketDestination$lambda$2(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTicketDestination$navigateUp(p141l2.H h8, ComponentActivity componentActivity) {
        if (h8.e()) {
            return;
        }
        componentActivity.finish();
    }
}
