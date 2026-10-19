package io.intercom.android.sdk.m5.inbox.ui;

import Ia.p;
import Ia.q;
import S4.o;
import android.view.View;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.u;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InboxScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: InboxScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2", f = "InboxScreen.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ androidx.paging.compose.b<Conversation> $lazyPagingItems;
        final /* synthetic */ Ia.l<InboxUiEffects.NavigateToConversation, r> $onConversationClicked;
        final /* synthetic */ InboxViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(InboxViewModel inboxViewModel, Ia.l<? super InboxUiEffects.NavigateToConversation, r> lVar, androidx.paging.compose.b<Conversation> bVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$viewModel = inboxViewModel;
            this.$onConversationClicked = lVar;
            this.$lazyPagingItems = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$viewModel, this.$onConversationClicked, this.$lazyPagingItems, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                u<InboxUiEffects> effect = this.$viewModel.getEffect();
                final Ia.l<InboxUiEffects.NavigateToConversation, r> lVar = this.$onConversationClicked;
                final androidx.paging.compose.b<Conversation> bVar = this.$lazyPagingItems;
                InterfaceC2687d<? super InboxUiEffects> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((InboxUiEffects) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(InboxUiEffects inboxUiEffects, kotlin.coroutines.c<? super r> cVar) {
                        if (inboxUiEffects instanceof InboxUiEffects.NavigateToConversation) {
                            lVar.invoke(inboxUiEffects);
                        } else {
                            if (!(inboxUiEffects instanceof InboxUiEffects.RefreshInbox)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.d();
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
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5, reason: invalid class name */
    /* JADX INFO: compiled from: InboxScreen.kt */
    public static final class AnonymousClass5 implements q<L, InterfaceC1084f, Integer, r> {
        final /* synthetic */ Ia.a<r> $onBrowseHelpCenterButtonClick;
        final /* synthetic */ Ia.a<r> $onSendMessageButtonClick;
        final /* synthetic */ InboxUiState $uiState;
        final /* synthetic */ InboxViewModel $viewModel;

        public AnonymousClass5(InboxUiState inboxUiState, InboxViewModel inboxViewModel, Ia.a<r> aVar, Ia.a<r> aVar2) {
            this.$uiState = inboxUiState;
            this.$viewModel = inboxViewModel;
            this.$onSendMessageButtonClick = aVar;
            this.$onBrowseHelpCenterButtonClick = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$2(final InboxUiState uiState, final InboxViewModel viewModel, final Ia.a onSendMessageButtonClick, final Ia.a onBrowseHelpCenterButtonClick, androidx.compose.foundation.lazy.p LazyColumn) {
            kotlin.jvm.internal.i.e(uiState, "$uiState");
            kotlin.jvm.internal.i.e(viewModel, "$viewModel");
            kotlin.jvm.internal.i.e(onSendMessageButtonClick, "$onSendMessageButtonClick");
            kotlin.jvm.internal.i.e(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
            kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
            if (uiState instanceof InboxUiState.Content) {
                InboxUiState.Content content = (InboxUiState.Content) uiState;
                InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, content.getInboxConversations(), new Ia.l() { // from class: io.intercom.android.sdk.m5.inbox.ui.n
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return InboxScreenKt.AnonymousClass5.invoke$lambda$2$lambda$0(viewModel, (Conversation) obj);
                    }
                });
                final ErrorState errorState = content.getErrorState();
                if (errorState != null) {
                    androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, -61243482, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$2$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                            invoke(bVar, interfaceC1084f, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                            kotlin.jvm.internal.i.e(item, "$this$item");
                            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                                interfaceC1084f.w();
                            } else {
                                InboxScreenKt.InboxErrorRow(errorState, interfaceC1084f, 0);
                            }
                        }
                    }), 3);
                }
                if (content.isLoadingMore()) {
                    androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$InboxScreenKt.INSTANCE.m335getLambda2$intercom_sdk_base_release(), 3);
                }
            } else if (uiState instanceof InboxUiState.Empty) {
                androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, -2100853483, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$3

                    /* JADX INFO: compiled from: InboxScreen.kt */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ActionType.values().length];
                            try {
                                iArr[ActionType.MESSAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ActionType.HELP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(bVar, interfaceC1084f, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                        Ia.a<r> aVar;
                        kotlin.jvm.internal.i.e(item, "$this$item");
                        if ((i10 & 14) == 0) {
                            i10 |= interfaceC1084f.K(item) ? 4 : 2;
                        }
                        if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                            return;
                        }
                        EmptyState emptyState = ((InboxUiState.Empty) uiState).getEmptyState();
                        boolean showActionButton = ((InboxUiState.Empty) uiState).getShowActionButton();
                        int i11 = WhenMappings.$EnumSwitchMapping$0[((InboxUiState.Empty) uiState).getEmptyState().getAction().getType().ordinal()];
                        if (i11 == 1) {
                            aVar = onSendMessageButtonClick;
                        } else {
                            if (i11 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = onBrowseHelpCenterButtonClick;
                        }
                        InboxEmptyScreenKt.InboxEmptyScreen(emptyState, showActionButton, aVar, item.c(1.0f), interfaceC1084f, 0, 0);
                    }
                }), 3);
            } else if (uiState instanceof InboxUiState.Error) {
                androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, 1129146582, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$4
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                        invoke(bVar, interfaceC1084f, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                        kotlin.jvm.internal.i.e(item, "$this$item");
                        if ((i10 & 14) == 0) {
                            i10 |= interfaceC1084f.K(item) ? 4 : 2;
                        }
                        if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                            interfaceC1084f.w();
                        } else {
                            InboxErrorScreenKt.InboxErrorScreen(((InboxUiState.Error) uiState).getErrorState(), item.c(1.0f), interfaceC1084f, 0, 0);
                        }
                    }
                }), 3);
            } else if ((uiState instanceof InboxUiState.Initial) || (uiState instanceof InboxUiState.Loading)) {
                androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$InboxScreenKt.INSTANCE.m336getLambda3$intercom_sdk_base_release(), 3);
            }
            return r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$2$lambda$0(InboxViewModel viewModel, Conversation conversation) {
            kotlin.jvm.internal.i.e(viewModel, "$viewModel");
            kotlin.jvm.internal.i.e(conversation, "conversation");
            viewModel.onConversationClick(conversation);
            return r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(l10, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            kotlin.jvm.internal.i.e(paddingValues, "paddingValues");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC1084f.K(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarA = WindowInsetsPaddingKt.a(W.f10226c, paddingValues);
            androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
            final InboxUiState inboxUiState = this.$uiState;
            final InboxViewModel inboxViewModel = this.$viewModel;
            final Ia.a<r> aVar2 = this.$onSendMessageButtonClick;
            final Ia.a<r> aVar3 = this.$onBrowseHelpCenterButtonClick;
            LazyDslKt.a(hVarA, null, paddingValues, false, null, aVar, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.inbox.ui.m
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return InboxScreenKt.AnonymousClass5.invoke$lambda$2(inboxUiState, inboxViewModel, aVar2, aVar3, (androidx.compose.foundation.lazy.p) obj);
                }
            }, interfaceC1084f, ((i11 << 6) & 896) | 196608, 474);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxErrorRow(final ErrorState errorState, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-126725909);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(errorState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD = W.d(PaddingKt.h(aVar, 0.0f, 16, 1), 1.0f);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, eD);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            TextKt.b(o.p(c1086gP, errorState.getMessageResId()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
            c1086gP.L(-868882283);
            if (errorState instanceof ErrorState.WithCTA) {
                ButtonKt.c(((ErrorState.WithCTA) errorState).getOnCtaClick(), null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-282010049, new q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxErrorRow$1$1$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f2, int i14) {
                        kotlin.jvm.internal.i.e(TextButton, "$this$TextButton");
                        if ((i14 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(o.p(interfaceC1084f2, ((ErrorState.WithCTA) errorState).getCtaResId()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), c1086gP, 805306368, 510);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.inbox.ui.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxScreenKt.InboxErrorRow$lambda$8(errorState, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxErrorRow$lambda$8(ErrorState errorState, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(errorState, "$errorState");
        InboxErrorRow(errorState, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxLoadingRow(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1843849504);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarD = W.d(PaddingKt.h(androidx.compose.ui.h.a.f13984b, 0.0f, 16, 1), 1.0f);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            ProgressIndicatorKt.a(null, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0, c1086gP, 29);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxLoadingRow$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InboxLoadingRow(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void InboxScreen(InboxViewModel viewModel, final Ia.a<r> onSendMessageButtonClick, Ia.a<r> onBrowseHelpCenterButtonClick, final Ia.a<r> onBackButtonClick, Ia.l<? super InboxUiEffects.NavigateToConversation, r> onConversationClicked, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(viewModel, "viewModel");
        kotlin.jvm.internal.i.e(onSendMessageButtonClick, "onSendMessageButtonClick");
        kotlin.jvm.internal.i.e(onBrowseHelpCenterButtonClick, "onBrowseHelpCenterButtonClick");
        kotlin.jvm.internal.i.e(onBackButtonClick, "onBackButtonClick");
        kotlin.jvm.internal.i.e(onConversationClicked, "onConversationClicked");
        C1086g c1086gP = interfaceC1084f.p(988563388);
        androidx.paging.compose.b bVarA = androidx.paging.compose.c.a(viewModel.getInboxPagingData(), c1086gP);
        final InboxUiState inboxUiStateReduceToInboxUiState = InboxPagingItemsReducerKt.reduceToInboxUiState(bVarA, viewModel.getEmptyState(), null, i10, c1086gP, 8 | ((i11 >> 6) & 7168), 2);
        InterfaceC1376t interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
        androidx.compose.runtime.E.a(interfaceC1376t, new l(interfaceC1376t, 0, bVarA), c1086gP);
        androidx.compose.runtime.E.d(new AnonymousClass2(viewModel, onConversationClicked, bVarA, null), c1086gP, null);
        androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
        ScaffoldKt.a(WindowInsetsPaddingKt.c(hVarB, c0.a.c(c1086gP).f10256b), androidx.compose.runtime.internal.a.b(-682199168, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.3
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                String title = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getTitle();
                if (title == null) {
                    title = "";
                }
                String str = title;
                Ia.a<r> aVar = onBackButtonClick;
                Integer navIcon = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getNavIcon();
                H hM503getBackgroundColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m503getBackgroundColorQN2ZGVo();
                interfaceC1084f2.L(1816943643);
                long jM635getHeader0d7_KjU = hM503getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m635getHeader0d7_KjU() : hM503getBackgroundColorQN2ZGVo.f13506a;
                interfaceC1084f2.D();
                H hM504getContentColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m504getContentColorQN2ZGVo();
                interfaceC1084f2.L(1816947066);
                long jM642getOnHeader0d7_KjU = hM504getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m642getOnHeader0d7_KjU() : hM504getContentColorQN2ZGVo.f13506a;
                interfaceC1084f2.D();
                TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar, navIcon, false, jM635getHeader0d7_KjU, jM642getOnHeader0d7_KjU, 0L, null, null, interfaceC1084f2, 0, 0, 7325);
            }
        }, c1086gP), null, null, androidx.compose.runtime.internal.a.b(958560707, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.4
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                InboxUiState inboxUiState = inboxUiStateReduceToInboxUiState;
                if ((inboxUiState instanceof InboxUiState.Content) && ((InboxUiState.Content) inboxUiState).getShowSendMessageFab()) {
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i13 = IntercomTheme.$stable;
                    FloatingActionButtonKt.a(onSendMessageButtonClick, PaddingKt.j(androidx.compose.ui.h.a.f13984b, 0.0f, 0.0f, 0.0f, 16, 7), p270w.g.f47680a, intercomTheme.getColors(interfaceC1084f2, i13).m615getAction0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i13).m639getOnAction0d7_KjU(), null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m334getLambda1$intercom_sdk_base_release(), interfaceC1084f2, 12582960, 96);
                }
            }
        }, c1086gP), 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(-1682074485, new AnonymousClass5(inboxUiStateReduceToInboxUiState, viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick), c1086gP), c1086gP, 805330992, 492);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.helpcenter.ui.k(viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.A InboxScreen$lambda$2(final InterfaceC1376t lifecycleOwner, final androidx.paging.compose.b lazyPagingItems, B DisposableEffect) {
        kotlin.jvm.internal.i.e(lifecycleOwner, "$lifecycleOwner");
        kotlin.jvm.internal.i.e(lazyPagingItems, "$lazyPagingItems");
        kotlin.jvm.internal.i.e(DisposableEffect, "$this$DisposableEffect");
        final androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: io.intercom.android.sdk.m5.inbox.ui.k
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                InboxScreenKt.InboxScreen$lambda$2$lambda$0(lazyPagingItems, interfaceC1376t, event);
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return new androidx.compose.runtime.A() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.A
            public void dispose() {
                lifecycleOwner.getLifecycle().c(rVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxScreen$lambda$2$lambda$0(androidx.paging.compose.b lazyPagingItems, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(lazyPagingItems, "$lazyPagingItems");
        kotlin.jvm.internal.i.e(interfaceC1376t, "<unused var>");
        kotlin.jvm.internal.i.e(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && (lazyPagingItems.c().f19339a instanceof androidx.paging.m.c)) {
            lazyPagingItems.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxScreen$lambda$3(InboxViewModel viewModel, Ia.a onSendMessageButtonClick, Ia.a onBrowseHelpCenterButtonClick, Ia.a onBackButtonClick, Ia.l onConversationClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(viewModel, "$viewModel");
        kotlin.jvm.internal.i.e(onSendMessageButtonClick, "$onSendMessageButtonClick");
        kotlin.jvm.internal.i.e(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
        kotlin.jvm.internal.i.e(onBackButtonClick, "$onBackButtonClick");
        kotlin.jvm.internal.i.e(onConversationClicked, "$onConversationClicked");
        InboxScreen(viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i10, interfaceC1084f, L4.b.l(i11 | 1));
        return r.f47939a;
    }
}
