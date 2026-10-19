package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.C1059k;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConversationEndedCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationEndedCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationEndedCardKt$ConversationEndedCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: ConversationEndedCard.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ ComposerState.ConversationEnded $conversationEndedUiState;
        final /* synthetic */ Ia.a<p293xa.r> $onButtonClick;

        public AnonymousClass1(ComposerState.ConversationEnded conversationEnded, Ia.a<p293xa.r> aVar) {
            this.$conversationEndedUiState = conversationEnded;
            this.$onButtonClick = aVar;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(Card, "$this$Card");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarF = PaddingKt.f(androidx.compose.foundation.layout.W.d(aVar, 1.0f), 20);
            C0945e.c cVar = C0945e.f10288e;
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13347n;
            ComposerState.ConversationEnded conversationEnded = this.$conversationEndedUiState;
            Ia.a<p293xa.r> aVar3 = this.$onButtonClick;
            C0953m c0953mA = C0952l.a(cVar, aVar2, interfaceC1084f, 54);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarF);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            StringProvider message = conversationEnded.getMessage();
            int i11 = StringProvider.$stable;
            TextKt.b(message.getText(interfaceC1084f, i11), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType04(), interfaceC1084f, 0, 0, 65534);
            interfaceC1084f.L(-1044601143);
            if (conversationEnded.getCta() != null) {
                Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.e(aVar, 12));
                IntercomPrimaryButtonKt.IntercomPrimaryButton(conversationEnded.getCta().getTitle().getText(interfaceC1084f, i11), androidx.compose.ui.platform.N0.a(aVar, "start-new-conversation-button"), Integer.valueOf(conversationEnded.getCta().getTrailingIcon()), aVar3 == null ? new M() : aVar3, interfaceC1084f, 48, 0);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void ConversationEndedCard(androidx.compose.ui.h hVar, Ia.a<p293xa.r> aVar, ComposerState.ConversationEnded conversationEndedUiState, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.a<p293xa.r> aVar2;
        int i13;
        androidx.compose.ui.h hVar3;
        Ia.a<p293xa.r> aVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(conversationEndedUiState, "conversationEndedUiState");
        C1086g c1086gP = interfaceC1084f.p(-517544614);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                aVar2 = aVar;
                i12 |= c1086gP.k(aVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                if (c1086gP.K(conversationEndedUiState)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                CardKt.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), androidx.compose.ui.graphics.h0.f13629a, C1059k.a(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), 0L, c1086gP, 0, 14), null, null, androidx.compose.runtime.internal.a.b(-676087732, new AnonymousClass1(conversationEndedUiState, aVar3), c1086gP), c1086gP, 196656, 24);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                aVar3 = aVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new K(hVar3, aVar3, conversationEndedUiState, i10, i11, 0);
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (c1086gP.K(conversationEndedUiState)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            CardKt.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), androidx.compose.ui.graphics.h0.f13629a, C1059k.a(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), 0L, c1086gP, 0, 14), null, null, androidx.compose.runtime.internal.a.b(-676087732, new AnonymousClass1(conversationEndedUiState, aVar3), c1086gP), c1086gP, 196656, 24);
        } else {
            if (i14 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i15 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            CardKt.b(androidx.compose.foundation.layout.W.d(hVar3, 1.0f), androidx.compose.ui.graphics.h0.f13629a, C1059k.a(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), 0L, c1086gP, 0, 14), null, null, androidx.compose.runtime.internal.a.b(-676087732, new AnonymousClass1(conversationEndedUiState, aVar3), c1086gP), c1086gP, 196656, 24);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new K(hVar3, aVar3, conversationEndedUiState, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationEndedCard$lambda$0(androidx.compose.ui.h hVar, Ia.a aVar, ComposerState.ConversationEnded conversationEndedUiState, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(conversationEndedUiState, "$conversationEndedUiState");
        ConversationEndedCard(hVar, aVar, conversationEndedUiState, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-172245026);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m69getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationEndedCardPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConversationEndedCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonBotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-317527071);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m71getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationEndedCardWithButtonBotPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConversationEndedCardWithButtonBotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ConversationEndedCardWithButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1576691098);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m70getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationEndedCardWithButtonPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConversationEndedCardWithButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ConversationMergedCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-233275222);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.m72getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationMergedCardPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConversationMergedCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
