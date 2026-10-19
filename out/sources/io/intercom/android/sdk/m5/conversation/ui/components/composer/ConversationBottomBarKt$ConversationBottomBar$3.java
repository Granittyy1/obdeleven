package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ConversationBottomBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBottomBarKt$ConversationBottomBar$3 implements Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r> {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Ia.l<String, p293xa.r> $navigateToAnotherConversation;
    final /* synthetic */ Ia.a<p293xa.r> $onGifInputSelected;
    final /* synthetic */ Ia.l<ComposerInputType, p293xa.r> $onInputChange;
    final /* synthetic */ Ia.a<p293xa.r> $onMediaInputSelected;
    final /* synthetic */ Ia.a<p293xa.r> $onNewConversationClicked;
    final /* synthetic */ Ia.a<p293xa.r> $onPrivacyNoticeDismissed;
    final /* synthetic */ Ia.p<String, TextInputSource, p293xa.r> $onSendMessage;
    final /* synthetic */ Ia.a<p293xa.r> $onTyping;
    final /* synthetic */ float $topSpacing;
    final /* synthetic */ Ia.l<MetricData, p293xa.r> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationBottomBarKt$ConversationBottomBar$3(float f10, BottomBarUiState bottomBarUiState, Ia.p<? super String, ? super TextInputSource, p293xa.r> pVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.l<? super ComposerInputType, p293xa.r> lVar, Ia.l<? super MetricData, p293xa.r> lVar2, Ia.a<p293xa.r> aVar3, Ia.a<p293xa.r> aVar4, Ia.l<? super String, p293xa.r> lVar3, Ia.a<p293xa.r> aVar5) {
        this.$topSpacing = f10;
        this.$bottomBarUiState = bottomBarUiState;
        this.$onSendMessage = pVar;
        this.$onGifInputSelected = aVar;
        this.$onMediaInputSelected = aVar2;
        this.$onInputChange = lVar;
        this.$trackMetric = lVar2;
        this.$onTyping = aVar3;
        this.$onNewConversationClicked = aVar4;
        this.$navigateToAnotherConversation = lVar3;
        this.$onPrivacyNoticeDismissed = aVar5;
    }

    private static final KeyboardState invoke$lambda$0(N0<KeyboardState> n10) {
        return n10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$13$lambda$12$lambda$11(p013b0.c density, int i10) {
        kotlin.jvm.internal.i.e(density, "$density");
        return -density.e1(40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(Ia.l navigateToAnotherConversation, ComposerState.ConversationEnded.ConversationEndedCta it) {
        kotlin.jvm.internal.i.e(navigateToAnotherConversation, "$navigateToAnotherConversation");
        kotlin.jvm.internal.i.e(it, "$it");
        navigateToAnotherConversation.invoke(it.getLinkedConversationId());
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$13$lambda$6(BottomBarUiState bottomBarUiState, ReactionListener reactionListener, Context it) {
        kotlin.jvm.internal.i.e(bottomBarUiState, "$bottomBarUiState");
        kotlin.jvm.internal.i.e(reactionListener, "$reactionListener");
        kotlin.jvm.internal.i.e(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it);
        reactionInputView.setUpReactions(((ComposerState.Reactions) bottomBarUiState.getComposerState()).getReactionReply(), true, reactionListener);
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$13$lambda$8$lambda$7(N0 keyboardAsState$delegate) {
        kotlin.jvm.internal.i.e(keyboardAsState$delegate, "$keyboardAsState$delegate");
        return invoke$lambda$0(keyboardAsState$delegate).isDismissed();
    }

    private static final boolean invoke$lambda$13$lambda$9(N0<Boolean> n10) {
        return n10.getValue().booleanValue();
    }

    @Override // Ia.q
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC0950j, interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010b  */
    /* JADX WARN: Code duplicated, block: B:33:0x012e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:36:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    /* JADX WARN: Code duplicated, block: B:44:0x017d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0186  */
    /* JADX WARN: Code duplicated, block: B:47:0x018a  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0202  */
    /* JADX WARN: Code duplicated, block: B:69:0x0207  */
    /* JADX WARN: Code duplicated, block: B:71:0x0213  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:91:0x0302  */
    /* JADX WARN: Code duplicated, block: B:93:0x0310  */
    /* JADX WARN: Code duplicated, block: B:97:0x0347  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [Ia.l, androidx.compose.animation.core.c0] */
    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        Ia.a<p293xa.r> aVar;
        Context context;
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar;
        C0955o c0955o;
        ComposerState composerState;
        O0 o10;
        C0955o c0955o2;
        ?? r13;
        Ia.l<MetricData, p293xa.r> lVar;
        M0 m7;
        Object objF;
        Object obj;
        final p013b0.c cVar;
        boolean zK;
        Object objF2;
        androidx.compose.ui.layout.E eD;
        int iF;
        InterfaceC1089h0 interfaceC1089h0Z;
        androidx.compose.ui.h hVarC;
        C0953m c0953mA;
        int iF2;
        InterfaceC1089h0 interfaceC1089h0Z2;
        androidx.compose.ui.h hVarC2;
        final ComposerState.ConversationEnded.ConversationEndedCta cta;
        Ia.a<p293xa.r> aVar2;
        String linkedConversationId;
        Ia.a<p293xa.r> aVar3;
        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (interfaceC1084f.K(BoxWithConstraints) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap = androidx.compose.foundation.layout.c0.f10254v;
        androidx.compose.foundation.layout.c0 c0VarC = androidx.compose.foundation.layout.c0.a.c(interfaceC1084f);
        O0 o11 = CompositionLocalsKt.f14847h;
        float fX = Na.l.x((BoxWithConstraints.i() - this.$topSpacing) - ((p013b0.c) interfaceC1084f.x(o11)).u(c0VarC.f10261g.e().f46852b), 0);
        Context context2 = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        final N0<KeyboardState> n0KeyboardAsState = KeyboardStateKt.keyboardAsState(interfaceC1084f, 0);
        androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarA = ComposedModifierKt.a(androidx.compose.foundation.layout.W.g(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), 0.0f, fX, 1), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
        final BottomBarUiState bottomBarUiState = this.$bottomBarUiState;
        Ia.p<String, TextInputSource, p293xa.r> pVar2 = this.$onSendMessage;
        Ia.a<p293xa.r> aVar5 = this.$onGifInputSelected;
        Ia.a<p293xa.r> aVar6 = this.$onMediaInputSelected;
        Ia.l<ComposerInputType, p293xa.r> lVar2 = this.$onInputChange;
        Ia.l<MetricData, p293xa.r> lVar3 = this.$trackMetric;
        Ia.a<p293xa.r> aVar7 = this.$onTyping;
        Ia.a<p293xa.r> aVar8 = this.$onNewConversationClicked;
        final Ia.l<String, p293xa.r> lVar4 = this.$navigateToAnotherConversation;
        Ia.a<p293xa.r> aVar9 = this.$onPrivacyNoticeDismissed;
        C0945e.k kVar = C0945e.f10286c;
        androidx.compose.ui.f.a aVar10 = androidx.compose.ui.d.a.f13346m;
        C0953m c0953mA2 = C0952l.a(kVar, aVar10, interfaceC1084f, 0);
        int iF3 = interfaceC1084f.F();
        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f.z();
        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f, hVarA);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar11 = ComposeUiNode.Companion.f14333b;
        if (interfaceC1084f.u() == null) {
            I.b.k();
            throw null;
        }
        interfaceC1084f.r();
        if (interfaceC1084f.m()) {
            interfaceC1084f.v(aVar11);
        } else {
            interfaceC1084f.A();
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar3 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar3, interfaceC1084f, c0953mA2);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar4 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar4, interfaceC1084f, interfaceC1089h0Z3);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
        if (!interfaceC1084f.m()) {
            aVar = aVar5;
            context = context2;
            if (!kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF3))) {
            }
            pVar = ComposeUiNode.Companion.f14335d;
            R0.a(pVar, interfaceC1084f, hVarC3);
            c0955o = C0955o.f10310a;
            composerState = bottomBarUiState.getComposerState();
            if (composerState instanceof ComposerState.ConversationEnded) {
                interfaceC1084f.L(517533693);
                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                iF = interfaceC1084f.F();
                c0955o2 = c0955o;
                interfaceC1089h0Z = interfaceC1084f.z();
                o10 = o11;
                hVarC = ComposedModifierKt.c(interfaceC1084f, aVar4);
                if (interfaceC1084f.u() != null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar11);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar3, interfaceC1084f, eD);
                R0.a(pVar4, interfaceC1084f, interfaceC1089h0Z);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar5);
                }
                R0.a(pVar, interfaceC1084f, hVarC);
                androidx.compose.ui.h hVarF = C0949i.f10304a.f(aVar4, androidx.compose.ui.d.a.f13339e);
                c0953mA = C0952l.a(kVar, aVar10, interfaceC1084f, 0);
                iF2 = interfaceC1084f.F();
                interfaceC1089h0Z2 = interfaceC1084f.z();
                hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarF);
                if (interfaceC1084f.u() != null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar11);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar3, interfaceC1084f, c0953mA);
                R0.a(pVar4, interfaceC1084f, interfaceC1089h0Z2);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar5);
                }
                R0.a(pVar, interfaceC1084f, hVarC2);
                IntercomDividerKt.IntercomDivider(null, interfaceC1084f, 0, 1);
                cta = ((ComposerState.ConversationEnded) bottomBarUiState.getComposerState()).getCta();
                if (cta != null) {
                    linkedConversationId = cta.getLinkedConversationId();
                    if (linkedConversationId != null || linkedConversationId.length() == 0) {
                        aVar3 = aVar8;
                    } else {
                        aVar3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.A
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(lVar4, cta);
                            }
                        };
                    }
                    aVar2 = aVar3;
                } else {
                    aVar2 = null;
                }
                ConversationEndedCardKt.ConversationEndedCard(null, aVar2, (ComposerState.ConversationEnded) bottomBarUiState.getComposerState(), interfaceC1084f, StringProvider.$stable << 6, 1);
                interfaceC1084f.J();
                interfaceC1084f.J();
                interfaceC1084f.D();
                lVar = lVar3;
                r13 = 0;
            } else {
                o10 = o11;
                c0955o2 = c0955o;
                if (composerState instanceof ComposerState.Hidden) {
                    interfaceC1084f.L(518499870);
                    if (((ComposerState.Hidden) bottomBarUiState.getComposerState()).getHideKeyboard() && (m7 = (M0) interfaceC1084f.x(CompositionLocalsKt.f14854p)) != null) {
                        m7.b();
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                    interfaceC1084f.D();
                } else if (!(composerState instanceof ComposerState.TextInput) || kotlin.jvm.internal.i.a(composerState, ComposerState.VoiceInput.INSTANCE)) {
                    interfaceC1084f.L(518800663);
                    float f10 = 16;
                    r13 = 0;
                    lVar = lVar3;
                    MessageComposerKt.MessageComposer(PaddingKt.j(aVar4, f10, 0.0f, f10, 8, 2), pVar2, bottomBarUiState, aVar, aVar6, lVar2, lVar3, aVar7, interfaceC1084f, 518, 0);
                    interfaceC1084f.D();
                } else {
                    if (!(composerState instanceof ComposerState.Reactions)) {
                        interfaceC1084f.L(1956356443);
                        interfaceC1084f.D();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC1084f.L(519434923);
                    final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.CONVERSATION, ((ComposerState.Reactions) bottomBarUiState.getComposerState()).getLastPartId(), ((ComposerState.Reactions) bottomBarUiState.getComposerState()).getConversationId(), Injector.get().getApi(), Injector.get().getMetricTracker());
                    AndroidView_androidKt.b(new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.B
                        @Override // Ia.l
                        public final Object invoke(Object obj2) {
                            return ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$6(bottomBarUiState, conversationReactionListener, (Context) obj2);
                        }
                    }, PaddingKt.f(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), 24), null, interfaceC1084f, 48, 4);
                    interfaceC1084f.D();
                }
                lVar = lVar3;
                r13 = 0;
            }
            interfaceC1084f.L(1956456104);
            if (!kotlin.jvm.internal.i.a(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
                interfaceC1084f.L(1956457655);
                objF = interfaceC1084f.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = J0.d(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.C
                        @Override // Ia.a
                        public final Object invoke() {
                            return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$8$lambda$7(n0KeyboardAsState));
                        }
                    });
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                cVar = (p013b0.c) interfaceC1084f.x(o10);
                C0955o c0955o3 = c0955o2;
                androidx.compose.ui.h hVarB = c0955o3.b(aVar4, androidx.compose.ui.d.a.f13347n);
                boolean zInvoke$lambda$13$lambda$9 = invoke$lambda$13$lambda$9((N0) objF);
                interfaceC1084f.L(1956471136);
                zK = interfaceC1084f.K(cVar);
                objF2 = interfaceC1084f.f();
                if (zK || objF2 == obj) {
                    objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.D
                        @Override // Ia.l
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$12$lambda$11(cVar, ((Integer) obj2).intValue()));
                        }
                    };
                    interfaceC1084f.E(objF2);
                }
                interfaceC1084f.D();
                AnimatedVisibilityKt.d(c0955o3, zInvoke$lambda$13$lambda$9, hVarB, EnterExitTransitionKt.n((Ia.l) objF2).b(EnterExitTransitionKt.d(androidx.compose.ui.d.a.j, 13)).b(EnterExitTransitionKt.e(r13, 0.3f, 1)), EnterExitTransitionKt.q(r13, 3).b(EnterExitTransitionKt.k()).b(EnterExitTransitionKt.f(r13, 3)), null, androidx.compose.runtime.internal.a.b(-184436761, new ConversationBottomBarKt$ConversationBottomBar$3$1$4(bottomBarUiState, aVar9, c0955o3, lVar, context), interfaceC1084f), interfaceC1084f, 1597446, 16);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
        aVar = aVar5;
        context = context2;
        androidx.compose.animation.k.b(iF3, interfaceC1084f, iF3, pVar5);
        pVar = ComposeUiNode.Companion.f14335d;
        R0.a(pVar, interfaceC1084f, hVarC3);
        c0955o = C0955o.f10310a;
        composerState = bottomBarUiState.getComposerState();
        if (composerState instanceof ComposerState.ConversationEnded) {
            interfaceC1084f.L(517533693);
            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            iF = interfaceC1084f.F();
            c0955o2 = c0955o;
            interfaceC1089h0Z = interfaceC1084f.z();
            o10 = o11;
            hVarC = ComposedModifierKt.c(interfaceC1084f, aVar4);
            if (interfaceC1084f.u() != null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar11);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar3, interfaceC1084f, eD);
            R0.a(pVar4, interfaceC1084f, interfaceC1089h0Z);
            if (interfaceC1084f.m()) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar5);
            } else {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar5);
            }
            R0.a(pVar, interfaceC1084f, hVarC);
            androidx.compose.ui.h hVarF2 = C0949i.f10304a.f(aVar4, androidx.compose.ui.d.a.f13339e);
            c0953mA = C0952l.a(kVar, aVar10, interfaceC1084f, 0);
            iF2 = interfaceC1084f.F();
            interfaceC1089h0Z2 = interfaceC1084f.z();
            hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarF2);
            if (interfaceC1084f.u() != null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar11);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar3, interfaceC1084f, c0953mA);
            R0.a(pVar4, interfaceC1084f, interfaceC1089h0Z2);
            if (interfaceC1084f.m()) {
                androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar5);
            } else {
                androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar5);
            }
            R0.a(pVar, interfaceC1084f, hVarC2);
            IntercomDividerKt.IntercomDivider(null, interfaceC1084f, 0, 1);
            cta = ((ComposerState.ConversationEnded) bottomBarUiState.getComposerState()).getCta();
            if (cta != null) {
                linkedConversationId = cta.getLinkedConversationId();
                if (linkedConversationId != null) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar8;
                }
                aVar2 = aVar3;
            } else {
                aVar2 = null;
            }
            ConversationEndedCardKt.ConversationEndedCard(null, aVar2, (ComposerState.ConversationEnded) bottomBarUiState.getComposerState(), interfaceC1084f, StringProvider.$stable << 6, 1);
            interfaceC1084f.J();
            interfaceC1084f.J();
            interfaceC1084f.D();
            lVar = lVar3;
            r13 = 0;
        } else {
            o10 = o11;
            c0955o2 = c0955o;
            if (composerState instanceof ComposerState.Hidden) {
                interfaceC1084f.L(518499870);
                if (((ComposerState.Hidden) bottomBarUiState.getComposerState()).getHideKeyboard()) {
                    m7.b();
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
                interfaceC1084f.D();
            } else {
                if (composerState instanceof ComposerState.TextInput) {
                }
                interfaceC1084f.L(518800663);
                float f11 = 16;
                r13 = 0;
                lVar = lVar3;
                MessageComposerKt.MessageComposer(PaddingKt.j(aVar4, f11, 0.0f, f11, 8, 2), pVar2, bottomBarUiState, aVar, aVar6, lVar2, lVar3, aVar7, interfaceC1084f, 518, 0);
                interfaceC1084f.D();
            }
            lVar = lVar3;
            r13 = 0;
        }
        interfaceC1084f.L(1956456104);
        if (!kotlin.jvm.internal.i.a(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
            interfaceC1084f.L(1956457655);
            objF = interfaceC1084f.f();
            obj = InterfaceC1084f.a.f12980a;
            if (objF == obj) {
                objF = J0.d(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.C
                    @Override // Ia.a
                    public final Object invoke() {
                        return Boolean.valueOf(ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$8$lambda$7(n0KeyboardAsState));
                    }
                });
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            cVar = (p013b0.c) interfaceC1084f.x(o10);
            C0955o c0955o4 = c0955o2;
            androidx.compose.ui.h hVarB2 = c0955o4.b(aVar4, androidx.compose.ui.d.a.f13347n);
            boolean zInvoke$lambda$13$lambda$10 = invoke$lambda$13$lambda$9((N0) objF);
            interfaceC1084f.L(1956471136);
            zK = interfaceC1084f.K(cVar);
            objF2 = interfaceC1084f.f();
            if (zK) {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.D
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$12$lambda$11(cVar, ((Integer) obj2).intValue()));
                    }
                };
                interfaceC1084f.E(objF2);
            } else {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.D
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$12$lambda$11(cVar, ((Integer) obj2).intValue()));
                    }
                };
                interfaceC1084f.E(objF2);
            }
            interfaceC1084f.D();
            AnimatedVisibilityKt.d(c0955o4, zInvoke$lambda$13$lambda$10, hVarB2, EnterExitTransitionKt.n((Ia.l) objF2).b(EnterExitTransitionKt.d(androidx.compose.ui.d.a.j, 13)).b(EnterExitTransitionKt.e(r13, 0.3f, 1)), EnterExitTransitionKt.q(r13, 3).b(EnterExitTransitionKt.k()).b(EnterExitTransitionKt.f(r13, 3)), null, androidx.compose.runtime.internal.a.b(-184436761, new ConversationBottomBarKt$ConversationBottomBar$3$1$4(bottomBarUiState, aVar9, c0955o4, lVar, context), interfaceC1084f), interfaceC1084f, 1597446, 16);
        }
        interfaceC1084f.D();
        interfaceC1084f.J();
    }
}
