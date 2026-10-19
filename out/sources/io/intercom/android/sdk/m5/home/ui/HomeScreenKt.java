package io.intercom.android.sdk.m5.home.ui;

import Ia.l;
import Ia.p;
import Ia.q;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.k;
import androidx.compose.animation.o;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.U;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1235n0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.core.view.D;
import androidx.core.view.v0;
import androidx.lifecycle.O;
import androidx.navigation.compose.C1414g;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.ThemeUtils;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.u;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenKt {
    private static final int ANIMATION_DURATION = 600;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: HomeScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1", f = "HomeScreen.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ HomeViewModel $homeViewModel;
        final /* synthetic */ l<String, r> $navigateToExistingConversation;
        final /* synthetic */ Ia.a<r> $navigateToMessages;
        final /* synthetic */ Ia.a<r> $navigateToNewConversation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HomeViewModel homeViewModel, Ia.a<r> aVar, Ia.a<r> aVar2, l<? super String, r> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$homeViewModel = homeViewModel;
            this.$navigateToMessages = aVar;
            this.$navigateToNewConversation = aVar2;
            this.$navigateToExistingConversation = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$homeViewModel, this.$navigateToMessages, this.$navigateToNewConversation, this.$navigateToExistingConversation, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                u<HomeUiEffects> effect = this.$homeViewModel.getEffect();
                final Ia.a<r> aVar = this.$navigateToMessages;
                final Ia.a<r> aVar2 = this.$navigateToNewConversation;
                final l<String, r> lVar = this.$navigateToExistingConversation;
                InterfaceC2687d<? super HomeUiEffects> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt.HomeScreen.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((HomeUiEffects) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(HomeUiEffects homeUiEffects, kotlin.coroutines.c<? super r> cVar) {
                        if (i.a(homeUiEffects, HomeUiEffects.NavigateToMessages.INSTANCE)) {
                            aVar.invoke();
                        } else if (i.a(homeUiEffects, HomeUiEffects.NavigateToNewConversation.INSTANCE)) {
                            aVar2.invoke();
                        } else {
                            if (!(homeUiEffects instanceof HomeUiEffects.NavigateToConversation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lVar.invoke(((HomeUiEffects.NavigateToConversation) homeUiEffects).getConversationId());
                        }
                        return r.f47939a;
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
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HomeScreen(final HomeViewModel homeViewModel, final Ia.a<r> onMessagesClicked, final Ia.a<r> onHelpClicked, final Ia.a<r> onTicketsClicked, final l<? super String, r> onTicketItemClicked, final Ia.a<r> navigateToMessages, final Ia.a<r> navigateToNewConversation, final l<? super String, r> navigateToExistingConversation, final Ia.a<r> onNewConversationClicked, final l<? super Conversation, r> onConversationClicked, final Ia.a<r> onCloseClick, final l<? super TicketType, r> onTicketLinkClicked, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final C0949i c0949i;
        boolean z10;
        i.e(homeViewModel, "homeViewModel");
        i.e(onMessagesClicked, "onMessagesClicked");
        i.e(onHelpClicked, "onHelpClicked");
        i.e(onTicketsClicked, "onTicketsClicked");
        i.e(onTicketItemClicked, "onTicketItemClicked");
        i.e(navigateToMessages, "navigateToMessages");
        i.e(navigateToNewConversation, "navigateToNewConversation");
        i.e(navigateToExistingConversation, "navigateToExistingConversation");
        i.e(onNewConversationClicked, "onNewConversationClicked");
        i.e(onConversationClicked, "onConversationClicked");
        i.e(onCloseClick, "onCloseClick");
        i.e(onTicketLinkClicked, "onTicketLinkClicked");
        C1086g c1086gP = interfaceC1084f.p(1138475448);
        final X xA = J0.a(homeViewModel.getUiState(), c1086gP, 8);
        ScrollState scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
        c1086gP.L(853956844);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = new C1079c0(0.0f);
            c1086gP.E(objF);
        }
        final U u10 = (U) objF;
        c1086gP.T(false);
        E.d(new AnonymousClass1(homeViewModel, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, null), c1086gP, null);
        Activity activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
        Window window = activity != null ? activity.getWindow() : null;
        c1086gP.L(853971796);
        if (window != null) {
            c1086gP.l(new C1414g(window, 1, xA));
            r rVar = r.f47939a;
        }
        c1086gP.T(false);
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        C0949i c0949i2 = C0949i.f10304a;
        AnimatedVisibilityKt.e(xA.getValue() instanceof HomeUiState.Content, null, EnterExitTransitionKt.e(C0907g.d(ANIMATION_DURATION, 0, null, 6), 0.0f, 2), EnterExitTransitionKt.f(C0907g.d(ANIMATION_DURATION, 0, null, 6), 2), null, androidx.compose.runtime.internal.a.b(750386582, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: HomeScreen.kt */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Ia.a<r> {
                public AnonymousClass2(Object obj) {
                    super(0, obj, HomeViewModel.class, "onHeaderImageLoaded", "onHeaderImageLoaded()V", 0);
                }

                @Override // Ia.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HomeViewModel) this.receiver).onHeaderImageLoaded();
                }
            }

            @Override // Ia.q
            public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i13) {
                i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                HomeUiState value = xA.getValue();
                if (value instanceof HomeUiState.Content) {
                    HomeUiState.Content content = (HomeUiState.Content) value;
                    HomeHeaderBackdropKt.m323HomeHeaderBackdropAjpBEmI(((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).v(u10.j()), content.getHeader().getHeaderBackdropStyle(), content.getHeader().getHeaderBackdropStyleDark(), new AnonymousClass2(homeViewModel), interfaceC1084f2, 0, 0);
                }
            }
        }, c1086gP), c1086gP, 200064, 18);
        final HomeUiState homeUiState = (HomeUiState) xA.getValue();
        FillElement fillElement = W.f10226c;
        l<C1235n0, r> lVar = InspectableValueKt.f14929a;
        androidx.compose.ui.h hVarB = ScrollKt.b(ComposedModifierKt.a(fillElement, lVar, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                num.intValue();
                interfaceC1084f3.L(359872873);
                WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                c0 c0VarC = c0.a.c(interfaceC1084f3);
                boolean zK = interfaceC1084f3.K(c0VarC);
                Object objF2 = interfaceC1084f3.f();
                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                    objF2 = new InsetsPaddingModifier(c0VarC.f10264k);
                    interfaceC1084f3.E(objF2);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF2;
                interfaceC1084f3.D();
                return insetsPaddingModifier;
            }
        }), scrollStateA, false, 14);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        C0955o c0955o = C0955o.f10310a;
        AnimatedVisibilityKt.d(c0955o, homeUiState instanceof HomeUiState.Error, c0955o.a(true), null, null, null, androidx.compose.runtime.internal.a.b(-1537640308, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$2$1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i14) {
                i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                HomeUiState homeUiState2 = homeUiState;
                if (homeUiState2 instanceof HomeUiState.Error) {
                    Ia.a<r> aVar3 = onCloseClick;
                    androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                    C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f2, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar5);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA2);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar5 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        k.b(iF, interfaceC1084f2, iF, pVar5);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC3);
                    HomeUiState.Error error = (HomeUiState.Error) homeUiState2;
                    HomeHeaderKt.HomeErrorHeader(null, error.getHeader(), aVar3, interfaceC1084f2, 0, 1);
                    HomeErrorContentKt.HomeErrorContent(error.getErrorState(), null, interfaceC1084f2, 0, 2);
                    interfaceC1084f2.J();
                }
            }
        }, c1086gP), c1086gP, 1572870, 28);
        AnimatedVisibilityKt.d(c0955o, homeUiState instanceof HomeUiState.Loading, null, null, o.f9659a, null, ComposableSingletons$HomeScreenKt.INSTANCE.m301getLambda1$intercom_sdk_base_release(), c1086gP, 1572870, 22);
        boolean z11 = homeUiState instanceof HomeUiState.Content;
        AnimatedVisibilityKt.d(c0955o, z11, null, EnterExitTransitionKt.e(C0907g.d(ANIMATION_DURATION, ANIMATION_DURATION, null, 4), 0.0f, 2), EnterExitTransitionKt.f(C0907g.d(ANIMATION_DURATION, 0, null, 6), 2), null, androidx.compose.runtime.internal.a.b(21007876, new HomeScreenKt$HomeScreen$3$2$2(homeUiState, scrollStateA, u10, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, onNewConversationClicked, onConversationClicked, onTicketLinkClicked), c1086gP), c1086gP, 1600518, 18);
        Lb.a.a(c1086gP, W.e(aVar, 100));
        c1086gP.T(true);
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        final PoweredBy poweredBy = ((HomeUiState) xA.getValue()).getPoweredBy();
        c1086gP.L(748845672);
        if (poweredBy == null) {
            c0949i = c0949i2;
        } else {
            androidx.compose.ui.h hVarF = c0949i2.f(ComposedModifierKt.a(aVar, lVar, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(359872873);
                    WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                    c0 c0VarC = c0.a.c(interfaceC1084f3);
                    boolean zK = interfaceC1084f3.K(c0VarC);
                    Object objF2 = interfaceC1084f3.f();
                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                        objF2 = new InsetsPaddingModifier(c0VarC.f10264k);
                        interfaceC1084f3.E(objF2);
                    }
                    InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF2;
                    interfaceC1084f3.D();
                    return insetsPaddingModifier;
                }
            }), androidx.compose.ui.d.a.f13342h);
            String text = poweredBy.getText();
            PoweredBy.PoweredByIconType icon = poweredBy.getIcon();
            Ia.a aVar3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.home.ui.f
                @Override // Ia.a
                public final Object invoke() {
                    return HomeScreenKt.HomeScreen$lambda$11$lambda$5$lambda$4(poweredBy, context);
                }
            };
            c0949i = c0949i2;
            PoweredByBadgeKt.m128PoweredByBadgewBJOh4Y(text, icon, aVar3, hVarF, 0L, 0L, c1086gP, 0, 48);
            r rVar2 = r.f47939a;
        }
        c1086gP.T(false);
        c1086gP.L(748866706);
        if (z11) {
            final HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor = ((HomeUiState.Content) homeUiState).getHeader().getCloseButtonColor();
            c1086gP.L(748872462);
            String foregroundColor = (!ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6) || closeButtonColor.getForegroundColorDark() == null) ? closeButtonColor.getForegroundColor() : closeButtonColor.getForegroundColorDark();
            c1086gP.T(false);
            androidx.compose.ui.h hVarM = W.m(A8.p.r(c0949i.f(OffsetKt.b(-16, 14, ComposedModifierKt.a(aVar, lVar, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(359872873);
                    WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                    c0 c0VarC = c0.a.c(interfaceC1084f3);
                    boolean zK = interfaceC1084f3.K(c0VarC);
                    Object objF2 = interfaceC1084f3.f();
                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                        objF2 = new InsetsPaddingModifier(c0VarC.f10264k);
                        interfaceC1084f3.E(objF2);
                    }
                    InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF2;
                    interfaceC1084f3.D();
                    return insetsPaddingModifier;
                }
            })), androidx.compose.ui.d.a.f13337c), p270w.g.f47680a), 30);
            c1086gP.L(-1050611816);
            boolean z12 = (((i11 & 14) ^ 6) > 4 && c1086gP.K(onCloseClick)) || (i11 & 6) == 4;
            Object objF2 = c1086gP.f();
            if (z12 || objF2 == c0153a) {
                objF2 = new O(2, onCloseClick);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC3 = ClickableKt.c(hVarM, false, null, (Ia.a) objF2, 7);
            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarC3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD2);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC4);
            AnimatedVisibilityKt.e(((double) scrollStateA.f9824a.o()) > ((double) u10.j()) * 0.6d, null, EnterExitTransitionKt.e(null, 0.0f, 3), EnterExitTransitionKt.f(null, 3), null, androidx.compose.runtime.internal.a.b(-1722206090, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$4$2$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i15) {
                    i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    BoxKt.a(C0932d.b(c0949i.f(W.f10226c, androidx.compose.ui.d.a.f13339e), ColorExtensionsKt.toComposeColor(closeButtonColor.getBackgroundColor(), closeButtonColor.getBackgroundOpacity()), h0.f13629a), interfaceC1084f2, 0);
                }
            }, c1086gP), c1086gP, 200064, 18);
            IconKt.b(p306z.d.a(), S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), c0949i.f(aVar, androidx.compose.ui.d.a.f13339e), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), c1086gP, 0, 0);
            z10 = true;
            c1086gP.T(true);
            r rVar3 = r.f47939a;
        } else {
            z10 = true;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, z10);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.g
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeScreenKt.HomeScreen$lambda$12(homeViewModel, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, onNewConversationClicked, onConversationClicked, onCloseClick, onTicketLinkClicked, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeScreen$lambda$11$lambda$10$lambda$8$lambda$7(Ia.a onCloseClick) {
        i.e(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeScreen$lambda$11$lambda$5$lambda$4(PoweredBy poweredBy, Context context) {
        i.e(poweredBy, "$poweredBy");
        i.e(context, "$context");
        Injector.get().getMetricTracker().clickedPoweredBy("home");
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeScreen$lambda$12(HomeViewModel homeViewModel, Ia.a onMessagesClicked, Ia.a onHelpClicked, Ia.a onTicketsClicked, l onTicketItemClicked, Ia.a navigateToMessages, Ia.a navigateToNewConversation, l navigateToExistingConversation, Ia.a onNewConversationClicked, l onConversationClicked, Ia.a onCloseClick, l onTicketLinkClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(homeViewModel, "$homeViewModel");
        i.e(onMessagesClicked, "$onMessagesClicked");
        i.e(onHelpClicked, "$onHelpClicked");
        i.e(onTicketsClicked, "$onTicketsClicked");
        i.e(onTicketItemClicked, "$onTicketItemClicked");
        i.e(navigateToMessages, "$navigateToMessages");
        i.e(navigateToNewConversation, "$navigateToNewConversation");
        i.e(navigateToExistingConversation, "$navigateToExistingConversation");
        i.e(onNewConversationClicked, "$onNewConversationClicked");
        i.e(onConversationClicked, "$onConversationClicked");
        i.e(onCloseClick, "$onCloseClick");
        i.e(onTicketLinkClicked, "$onTicketLinkClicked");
        HomeScreen(homeViewModel, onMessagesClicked, onHelpClicked, onTicketsClicked, onTicketItemClicked, navigateToMessages, navigateToNewConversation, navigateToExistingConversation, onNewConversationClicked, onConversationClicked, onCloseClick, onTicketLinkClicked, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeScreen$lambda$2$lambda$1(Window it, N0 uiState) {
        v0.e cVar;
        i.e(it, "$it");
        i.e(uiState, "$uiState");
        D d10 = new D(it.getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(it.getInsetsController(), d10);
            dVar.f16996b = it;
            cVar = dVar;
        } else {
            cVar = new v0.c(it, d10);
        }
        cVar.c(isDarkContentEnabled((HomeUiState) uiState.getValue()));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHeaderContentOpacity(int i10, float f10) {
        return Na.l.C((f10 - i10) / f10, 0.0f, 1.0f);
    }

    private static final boolean isDarkContentEnabled(HomeUiState homeUiState) {
        if (homeUiState instanceof HomeUiState.Content) {
            return ColorExtensionsKt.m664isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Content) homeUiState).getHeader().getIntro().getTextColorLight(), 0.0f, 1, null));
        }
        if (homeUiState instanceof HomeUiState.Error) {
            return ColorExtensionsKt.m664isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Error) homeUiState).getHeader().getForegroundColor(), 0.0f, 1, null));
        }
        return true;
    }
}
