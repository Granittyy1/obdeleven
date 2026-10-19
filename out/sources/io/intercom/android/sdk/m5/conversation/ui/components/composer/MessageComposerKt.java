package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material3.C1061m;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.conversation.ui.components.C2387y;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: MessageComposer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageComposerKt {
    private static final float ComposerHalfSize;
    private static final float ComposerMinSize;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$11, reason: invalid class name */
    /* JADX INFO: compiled from: MessageComposer.kt */
    public static final class AnonymousClass11 implements Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ long $actionContrastWhiteColor;
        final /* synthetic */ androidx.compose.runtime.X<androidx.compose.ui.graphics.H> $borderColor$delegate;
        final /* synthetic */ BottomBarUiState $bottomBarUiState;
        final /* synthetic */ long $defaultColor;
        final /* synthetic */ androidx.compose.runtime.X<androidx.compose.ui.graphics.H> $disableColor$delegate;
        final /* synthetic */ StringProvider $hintText;
        final /* synthetic */ boolean $isDisabled;
        final /* synthetic */ Ia.a<p293xa.r> $onGifInputSelected;
        final /* synthetic */ Ia.a<p293xa.r> $onMediaInputSelected;
        final /* synthetic */ Ia.p<String, TextInputSource, p293xa.r> $onSendMessage;
        final /* synthetic */ p270w.f $shape;
        final /* synthetic */ SpeechRecognizerState $speechRecognizerState;
        final /* synthetic */ androidx.compose.runtime.X<TextFieldValue> $textFieldValue$delegate;
        final /* synthetic */ androidx.compose.runtime.X<TextInputSource> $textInputSource$delegate;
        final /* synthetic */ Ia.l<MetricData, p293xa.r> $trackMetric;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(p270w.f fVar, androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x10, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState, boolean z10, long j, Ia.p<? super String, ? super TextInputSource, p293xa.r> pVar, androidx.compose.runtime.X<TextFieldValue> x11, StringProvider stringProvider, long j10, Ia.l<? super MetricData, p293xa.r> lVar, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x12, androidx.compose.runtime.X<TextInputSource> x13) {
            this.$shape = fVar;
            this.$borderColor$delegate = x10;
            this.$bottomBarUiState = bottomBarUiState;
            this.$speechRecognizerState = speechRecognizerState;
            this.$isDisabled = z10;
            this.$actionContrastWhiteColor = j;
            this.$onSendMessage = pVar;
            this.$textFieldValue$delegate = x11;
            this.$hintText = stringProvider;
            this.$defaultColor = j10;
            this.$trackMetric = lVar;
            this.$onGifInputSelected = aVar;
            this.$onMediaInputSelected = aVar2;
            this.$disableColor$delegate = x12;
            this.$textInputSource$delegate = x13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5$lambda$1(SpeechRecognizerState speechRecognizerState, Ia.l lVar, Ia.a aVar) {
            kotlin.jvm.internal.i.e(speechRecognizerState, "$speechRecognizerState");
            speechRecognizerState.stopListening();
            lVar.invoke(new MetricData.ComposerInputClicked(MetricTracker.Object.GIF_INPUT));
            aVar.invoke();
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5$lambda$2(SpeechRecognizerState speechRecognizerState, Ia.a aVar) {
            kotlin.jvm.internal.i.e(speechRecognizerState, "$speechRecognizerState");
            speechRecognizerState.stopListening();
            aVar.invoke();
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$5$lambda$4$lambda$3(Ia.p onSendMessage, androidx.compose.runtime.X textFieldValue$delegate, androidx.compose.runtime.X textInputSource$delegate) {
            kotlin.jvm.internal.i.e(onSendMessage, "$onSendMessage");
            kotlin.jvm.internal.i.e(textFieldValue$delegate, "$textFieldValue$delegate");
            kotlin.jvm.internal.i.e(textInputSource$delegate, "$textInputSource$delegate");
            onSendMessage.invoke(MessageComposerKt.MessageComposer$lambda$7(textFieldValue$delegate).f15491a.f15408c, MessageComposerKt.MessageComposer$lambda$10(textInputSource$delegate));
            MessageComposerKt.MessageComposer$lambda$8(textFieldValue$delegate, new TextFieldValue(6, 0L, ""));
            MessageComposerKt.MessageComposer$lambda$11(textInputSource$delegate, TextInputSource.KEYBOARD);
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0104  */
        /* JADX WARN: Code duplicated, block: B:35:0x013b  */
        /* JADX WARN: Code duplicated, block: B:37:0x0144  */
        /* JADX WARN: Code duplicated, block: B:38:0x0148  */
        /* JADX WARN: Code duplicated, block: B:43:0x0165  */
        /* JADX WARN: Code duplicated, block: B:46:0x017f  */
        /* JADX WARN: Code duplicated, block: B:48:0x0187  */
        /* JADX WARN: Code duplicated, block: B:50:0x0198  */
        /* JADX WARN: Code duplicated, block: B:52:0x0203  */
        /* JADX WARN: Code duplicated, block: B:55:0x0258  */
        /* JADX WARN: Code duplicated, block: B:58:0x0282  */
        /* JADX WARN: Code duplicated, block: B:59:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:68:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:71:0x0323  */
        /* JADX WARN: Code duplicated, block: B:76:0x035a  */
        /* JADX WARN: Code duplicated, block: B:80:0x0382  */
        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            Ia.a<p293xa.r> aVar;
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar;
            float f10;
            androidx.compose.ui.layout.E eD;
            int iF;
            InterfaceC1089h0 interfaceC1089h0Z;
            androidx.compose.ui.h hVarC;
            Ia.p<String, TextInputSource, p293xa.r> pVar2;
            boolean z10;
            boolean z11;
            androidx.compose.runtime.X<TextFieldValue> x10;
            boolean zShouldShowButtons;
            boolean zShouldShowVoiceInput;
            int i12;
            IntercomTheme intercomTheme;
            boolean z12;
            C1061m c1061m;
            long j;
            androidx.compose.material3.L l10;
            final Ia.p<String, TextInputSource, p293xa.r> pVar3;
            final androidx.compose.runtime.X<TextFieldValue> x11;
            boolean zK;
            Object objF;
            String strP;
            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC1084f.k(innerTextField) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(aVar2, 1.0f);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarB = C0932d.b(hVarD, intercomTheme2.getColors(interfaceC1084f, i13).m637getInputAlt0d7_KjU(), this.$shape);
            C0937i c0937iA = C1787c0.a((float) 1.5d, MessageComposerKt.MessageComposer$lambda$18(this.$borderColor$delegate));
            androidx.compose.ui.h hVarB2 = C0935g.b(hVarB, c0937iA.f10065a, c0937iA.f10066b, this.$shape);
            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
            BottomBarUiState bottomBarUiState = this.$bottomBarUiState;
            final SpeechRecognizerState speechRecognizerState = this.$speechRecognizerState;
            boolean z13 = this.$isDisabled;
            long j10 = this.$actionContrastWhiteColor;
            Ia.p<String, TextInputSource, p293xa.r> pVar4 = this.$onSendMessage;
            androidx.compose.runtime.X<TextFieldValue> x12 = this.$textFieldValue$delegate;
            StringProvider stringProvider = this.$hintText;
            long j11 = this.$defaultColor;
            final Ia.l<MetricData, p293xa.r> lVar = this.$trackMetric;
            Ia.a<p293xa.r> aVar3 = this.$onGifInputSelected;
            final Ia.a<p293xa.r> aVar4 = this.$onMediaInputSelected;
            androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x13 = this.$disableColor$delegate;
            final androidx.compose.runtime.X<TextInputSource> x14 = this.$textInputSource$delegate;
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f, 48);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarB2);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar5);
            } else {
                interfaceC1084f.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, interfaceC1084f, tA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, interfaceC1084f, interfaceC1089h0Z2);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
            if (!interfaceC1084f.m()) {
                aVar = aVar3;
                if (!kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                }
                pVar = ComposeUiNode.Companion.f14335d;
                R0.a(pVar, interfaceC1084f, hVarC2);
                Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.q(aVar2, 16));
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                f10 = 8;
                androidx.compose.ui.h hVarH = PaddingKt.h(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), 0.0f, f10, 1);
                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                iF = interfaceC1084f.F();
                interfaceC1089h0Z = interfaceC1084f.z();
                hVarC = ComposedModifierKt.c(interfaceC1084f, hVarH);
                if (interfaceC1084f.u() != null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar5);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar5, interfaceC1084f, eD);
                R0.a(pVar6, interfaceC1084f, interfaceC1089h0Z);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar7);
                }
                R0.a(pVar, interfaceC1084f, hVarC);
                interfaceC1084f.L(-598928926);
                if (MessageComposerKt.MessageComposer$lambda$7(x12).f15491a.f15408c.length() == 0) {
                    if (bottomBarUiState.getComposerState() instanceof ComposerState.TextInput) {
                        interfaceC1084f.L(-1386777821);
                        strP = stringProvider.getText(interfaceC1084f, StringProvider.$stable);
                        interfaceC1084f.D();
                    } else {
                        interfaceC1084f.L(-1386689595);
                        strP = S4.o.p(interfaceC1084f, R.string.intercom_listening);
                        interfaceC1084f.D();
                    }
                    z10 = true;
                    z11 = false;
                    x10 = x12;
                    pVar2 = pVar4;
                    TextKt.b(strP, null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(interfaceC1084f, i13).getType04(), interfaceC1084f, 0, 0, 65530);
                } else {
                    pVar2 = pVar4;
                    z10 = true;
                    z11 = false;
                    x10 = x12;
                }
                interfaceC1084f.D();
                innerTextField.invoke(interfaceC1084f, Integer.valueOf(i11 & 14));
                interfaceC1084f.J();
                zShouldShowButtons = MessageComposerKt.shouldShowButtons(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c, bottomBarUiState, speechRecognizerState);
                zShouldShowVoiceInput = MessageComposerKt.shouldShowVoiceInput(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c, bottomBarUiState, speechRecognizerState);
                interfaceC1084f.L(1697407475);
                if (zShouldShowButtons) {
                    final Ia.a<p293xa.r> aVar6 = aVar;
                    BottomBarButtonComponentKt.BottomBarButtonComponent(null, bottomBarUiState.getButtons(), !z13, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.W
                        @Override // Ia.a
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$1(speechRecognizerState, lVar, aVar6);
                        }
                    }, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.X
                        @Override // Ia.a
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$2(speechRecognizerState, aVar4);
                        }
                    }, interfaceC1084f, 64, 1);
                }
                interfaceC1084f.D();
                interfaceC1084f.L(1697430527);
                if (zShouldShowVoiceInput) {
                    i12 = i13;
                    intercomTheme = intercomTheme2;
                    VoiceInputLayoutKt.m206VoiceInputLayoutDenoh9s(null, !r17, intercomTheme2.getColors(interfaceC1084f, i13).m630getDescriptionText0d7_KjU(), intercomTheme2.getColors(interfaceC1084f, i13).m640getOnActionContrastWhite0d7_KjU(), androidx.compose.ui.graphics.H.f13503k, j10, speechRecognizerState, interfaceC1084f, 2121728, 1);
                } else {
                    i12 = i13;
                    intercomTheme = intercomTheme2;
                }
                interfaceC1084f.D();
                interfaceC1084f.L(1697448993);
                if (!zShouldShowButtons && !zShouldShowVoiceInput) {
                    androidx.compose.ui.h hVarI = androidx.compose.foundation.layout.W.m(PaddingKt.f(N0.a(aVar2, "send_button"), f10), 32).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13345l));
                    if (kotlin.text.n.S(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c) && r17 == 0) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    int i14 = i12;
                    IntercomTheme intercomTheme3 = intercomTheme;
                    long jM640getOnActionContrastWhite0d7_KjU = intercomTheme3.getColors(interfaceC1084f, i14).m640getOnActionContrastWhite0d7_KjU();
                    long jMessageComposer$lambda$21 = MessageComposerKt.MessageComposer$lambda$21(x13);
                    long jM640getOnActionContrastWhite0d7_KjU2 = intercomTheme3.getColors(interfaceC1084f, i14).m640getOnActionContrastWhite0d7_KjU();
                    c1061m = (C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a);
                    j = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f12125a)).f13506a;
                    l10 = c1061m.f12614Q;
                    if (l10 == null) {
                        long j12 = androidx.compose.ui.graphics.H.f13503k;
                        l10 = new androidx.compose.material3.L(j12, j, j12, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1061m.f12614Q = l10;
                    }
                    androidx.compose.material3.L lA = l10.a(j10, jM640getOnActionContrastWhite0d7_KjU, jMessageComposer$lambda$21, jM640getOnActionContrastWhite0d7_KjU2);
                    interfaceC1084f.L(1697459456);
                    pVar3 = pVar2;
                    x11 = x10;
                    zK = interfaceC1084f.K(pVar3) | interfaceC1084f.K(x11);
                    objF = interfaceC1084f.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.Y
                            @Override // Ia.a
                            public final Object invoke() {
                                return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$4$lambda$3(pVar3, x11, x14);
                            }
                        };
                        interfaceC1084f.E(objF);
                    }
                    interfaceC1084f.D();
                    IconButtonKt.a((Ia.a) objF, hVarI, z12, null, lA, null, ComposableSingletons$MessageComposerKt.INSTANCE.m201getLambda1$intercom_sdk_base_release(), interfaceC1084f, 1572864, 40);
                }
                interfaceC1084f.D();
                interfaceC1084f.J();
            }
            aVar = aVar3;
            androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar7);
            pVar = ComposeUiNode.Companion.f14335d;
            R0.a(pVar, interfaceC1084f, hVarC2);
            Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.q(aVar2, 16));
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            f10 = 8;
            androidx.compose.ui.h hVarH2 = PaddingKt.h(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), 0.0f, f10, 1);
            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            iF = interfaceC1084f.F();
            interfaceC1089h0Z = interfaceC1084f.z();
            hVarC = ComposedModifierKt.c(interfaceC1084f, hVarH2);
            if (interfaceC1084f.u() != null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar5);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar5, interfaceC1084f, eD);
            R0.a(pVar6, interfaceC1084f, interfaceC1089h0Z);
            if (interfaceC1084f.m()) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar7);
            } else {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar7);
            }
            R0.a(pVar, interfaceC1084f, hVarC);
            interfaceC1084f.L(-598928926);
            if (MessageComposerKt.MessageComposer$lambda$7(x12).f15491a.f15408c.length() == 0) {
                if (bottomBarUiState.getComposerState() instanceof ComposerState.TextInput) {
                    interfaceC1084f.L(-1386777821);
                    strP = stringProvider.getText(interfaceC1084f, StringProvider.$stable);
                    interfaceC1084f.D();
                } else {
                    interfaceC1084f.L(-1386689595);
                    strP = S4.o.p(interfaceC1084f, R.string.intercom_listening);
                    interfaceC1084f.D();
                }
                z10 = true;
                z11 = false;
                x10 = x12;
                pVar2 = pVar4;
                TextKt.b(strP, null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(interfaceC1084f, i13).getType04(), interfaceC1084f, 0, 0, 65530);
            } else {
                pVar2 = pVar4;
                z10 = true;
                z11 = false;
                x10 = x12;
            }
            interfaceC1084f.D();
            innerTextField.invoke(interfaceC1084f, Integer.valueOf(i11 & 14));
            interfaceC1084f.J();
            zShouldShowButtons = MessageComposerKt.shouldShowButtons(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c, bottomBarUiState, speechRecognizerState);
            zShouldShowVoiceInput = MessageComposerKt.shouldShowVoiceInput(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c, bottomBarUiState, speechRecognizerState);
            interfaceC1084f.L(1697407475);
            if (zShouldShowButtons) {
                final Ia.a aVar7 = aVar;
                BottomBarButtonComponentKt.BottomBarButtonComponent(null, bottomBarUiState.getButtons(), !z13, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.W
                    @Override // Ia.a
                    public final Object invoke() {
                        return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$1(speechRecognizerState, lVar, aVar7);
                    }
                }, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.X
                    @Override // Ia.a
                    public final Object invoke() {
                        return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$2(speechRecognizerState, aVar4);
                    }
                }, interfaceC1084f, 64, 1);
            }
            interfaceC1084f.D();
            interfaceC1084f.L(1697430527);
            if (zShouldShowVoiceInput) {
                i12 = i13;
                intercomTheme = intercomTheme2;
                VoiceInputLayoutKt.m206VoiceInputLayoutDenoh9s(null, !r17, intercomTheme2.getColors(interfaceC1084f, i13).m630getDescriptionText0d7_KjU(), intercomTheme2.getColors(interfaceC1084f, i13).m640getOnActionContrastWhite0d7_KjU(), androidx.compose.ui.graphics.H.f13503k, j10, speechRecognizerState, interfaceC1084f, 2121728, 1);
            } else {
                i12 = i13;
                intercomTheme = intercomTheme2;
            }
            interfaceC1084f.D();
            interfaceC1084f.L(1697448993);
            if (!zShouldShowButtons) {
                androidx.compose.ui.h hVarI2 = androidx.compose.foundation.layout.W.m(PaddingKt.f(N0.a(aVar2, "send_button"), f10), 32).i(new VerticalAlignElement(androidx.compose.ui.d.a.f13345l));
                if (kotlin.text.n.S(MessageComposerKt.MessageComposer$lambda$7(x10).f15491a.f15408c)) {
                    z12 = z11;
                } else {
                    z12 = z11;
                }
                int i15 = i12;
                IntercomTheme intercomTheme4 = intercomTheme;
                long jM640getOnActionContrastWhite0d7_KjU3 = intercomTheme4.getColors(interfaceC1084f, i15).m640getOnActionContrastWhite0d7_KjU();
                long jMessageComposer$lambda$22 = MessageComposerKt.MessageComposer$lambda$21(x13);
                long jM640getOnActionContrastWhite0d7_KjU4 = intercomTheme4.getColors(interfaceC1084f, i15).m640getOnActionContrastWhite0d7_KjU();
                c1061m = (C1061m) interfaceC1084f.x(ColorSchemeKt.f12087a);
                j = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f12125a)).f13506a;
                l10 = c1061m.f12614Q;
                if (l10 == null) {
                    long j13 = androidx.compose.ui.graphics.H.f13503k;
                    l10 = new androidx.compose.material3.L(j13, j, j13, androidx.compose.ui.graphics.H.b(0.38f, j));
                    c1061m.f12614Q = l10;
                }
                androidx.compose.material3.L lA2 = l10.a(j10, jM640getOnActionContrastWhite0d7_KjU3, jMessageComposer$lambda$22, jM640getOnActionContrastWhite0d7_KjU4);
                interfaceC1084f.L(1697459456);
                pVar3 = pVar2;
                x11 = x10;
                zK = interfaceC1084f.K(pVar3) | interfaceC1084f.K(x11);
                objF = interfaceC1084f.f();
                if (zK) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.Y
                        @Override // Ia.a
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$4$lambda$3(pVar3, x11, x14);
                        }
                    };
                    interfaceC1084f.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.Y
                        @Override // Ia.a
                        public final Object invoke() {
                            return MessageComposerKt.AnonymousClass11.invoke$lambda$5$lambda$4$lambda$3(pVar3, x11, x14);
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                IconButtonKt.a((Ia.a) objF, hVarI2, z12, null, lA2, null, ComposableSingletons$MessageComposerKt.INSTANCE.m201getLambda1$intercom_sdk_base_release(), interfaceC1084f, 1572864, 40);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$7, reason: invalid class name */
    /* JADX INFO: compiled from: MessageComposer.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$7", f = "MessageComposer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ androidx.compose.ui.focus.n $focusManager;
        final /* synthetic */ androidx.compose.runtime.N0<KeyboardState> $keyboardAsState$delegate;
        final /* synthetic */ SpeechRecognizerState $speechRecognizerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(SpeechRecognizerState speechRecognizerState, androidx.compose.ui.focus.n nVar, androidx.compose.runtime.N0<KeyboardState> n10, kotlin.coroutines.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
            this.$speechRecognizerState = speechRecognizerState;
            this.$focusManager = nVar;
            this.$keyboardAsState$delegate = n10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass7(this.$speechRecognizerState, this.$focusManager, this.$keyboardAsState$delegate, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            if (MessageComposerKt.MessageComposer$lambda$25(this.$keyboardAsState$delegate).isDismissed() && !this.$speechRecognizerState.isListening()) {
                this.$focusManager.u(false);
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass7) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    static {
        float f10 = 48;
        ComposerMinSize = f10;
        ComposerHalfSize = f10 / 2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 ??, still in use, count: 1, list:
          (r3v6 ?? I:java.lang.Object) from 0x0192: INVOKE (r0v3 ?? I:androidx.compose.runtime.g), (r3v6 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.g.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:403)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void MessageComposer(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 ??, still in use, count: 1, list:
          (r3v6 ?? I:java.lang.Object) from 0x0192: INVOKE (r0v3 ?? I:androidx.compose.runtime.g), (r3v6 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.g.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:403)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r71v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputSource MessageComposer$lambda$10(androidx.compose.runtime.X<TextInputSource> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$11(androidx.compose.runtime.X<TextInputSource> x10, TextInputSource textInputSource) {
        x10.setValue(textInputSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageComposer$lambda$13(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$14(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$16$lambda$15(Ia.l lVar, M0 m7, Ia.l lVar2, androidx.compose.runtime.X shouldRequestFocus$delegate, androidx.compose.runtime.X textInputSource$delegate, androidx.compose.runtime.X textFieldValue$delegate, SpeechRecognizerState.SpeechState it) {
        kotlin.jvm.internal.i.e(shouldRequestFocus$delegate, "$shouldRequestFocus$delegate");
        kotlin.jvm.internal.i.e(textInputSource$delegate, "$textInputSource$delegate");
        kotlin.jvm.internal.i.e(textFieldValue$delegate, "$textFieldValue$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.equals(SpeechRecognizerState.SpeechState.Listening.INSTANCE)) {
            lVar.invoke(ComposerInputType.VOICE);
            MessageComposer$lambda$14(shouldRequestFocus$delegate, true);
            if (m7 != null) {
                m7.b();
            }
            lVar2.invoke(MetricData.SpeechRecognitionStarted.INSTANCE);
            textInputSource$delegate.setValue(TextInputSource.VOICE_ONLY);
        } else if (it instanceof SpeechRecognizerState.SpeechState.SpeechEnded) {
            TextFieldValue textFieldValueMessageComposer$lambda$7 = MessageComposer$lambda$7(textFieldValue$delegate);
            SpeechRecognizerState.SpeechState.SpeechEnded speechEnded = (SpeechRecognizerState.SpeechState.SpeechEnded) it;
            String message = speechEnded.getMessage();
            int length = speechEnded.getMessage().length();
            textFieldValue$delegate.setValue(TextFieldValue.b(textFieldValueMessageComposer$lambda$7, message, O.h.b(length, length), 4));
            lVar.invoke(ComposerInputType.TEXT);
            if (m7 != null) {
                m7.a();
            }
            MessageComposer$lambda$14(shouldRequestFocus$delegate, true);
            lVar2.invoke(new MetricData.SpeechRecognitionEnded(speechEnded.getDuration()));
        } else if (it instanceof SpeechRecognizerState.SpeechState.SpeechInProgress) {
            TextFieldValue textFieldValueMessageComposer$lambda$8 = MessageComposer$lambda$7(textFieldValue$delegate);
            SpeechRecognizerState.SpeechState.SpeechInProgress speechInProgress = (SpeechRecognizerState.SpeechState.SpeechInProgress) it;
            String message2 = speechInProgress.getMessage();
            int length2 = speechInProgress.getMessage().length();
            textFieldValue$delegate.setValue(TextFieldValue.b(textFieldValueMessageComposer$lambda$8, message2, O.h.b(length2, length2), 4));
        } else if (!it.equals(SpeechRecognizerState.SpeechState.SpeechStarted.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$18(androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x10) {
        return x10.getValue().f13506a;
    }

    private static final void MessageComposer$lambda$19(androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x10, long j) {
        x10.setValue(new androidx.compose.ui.graphics.H(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$2(ComposerInputType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$21(androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x10) {
        return x10.getValue().f13506a;
    }

    private static final void MessageComposer$lambda$22(androidx.compose.runtime.X<androidx.compose.ui.graphics.H> x10, long j) {
        x10.setValue(new androidx.compose.ui.graphics.H(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageComposer$lambda$25(androidx.compose.runtime.N0<KeyboardState> n10) {
        return n10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$26(long j, long j10, long j11, long j12, SpeechRecognizerState speechRecognizerState, M0 m7, androidx.compose.runtime.X borderColor$delegate, androidx.compose.runtime.X disableColor$delegate, androidx.compose.ui.focus.y focused) {
        kotlin.jvm.internal.i.e(speechRecognizerState, "$speechRecognizerState");
        kotlin.jvm.internal.i.e(borderColor$delegate, "$borderColor$delegate");
        kotlin.jvm.internal.i.e(disableColor$delegate, "$disableColor$delegate");
        kotlin.jvm.internal.i.e(focused, "focused");
        if (!focused.b()) {
            j = j10;
        }
        MessageComposer$lambda$19(borderColor$delegate, j);
        if (!focused.b()) {
            j11 = j12;
        }
        MessageComposer$lambda$22(disableColor$delegate, j11);
        if (speechRecognizerState.isListening() && m7 != null) {
            m7.b();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$28(Ia.a aVar, SpeechRecognizerState speechRecognizerState, Ia.p onSendMessage, androidx.compose.runtime.X textFieldValue$delegate, androidx.compose.runtime.X textInputSource$delegate, TextFieldValue it) {
        TextInputSource textInputSource;
        kotlin.jvm.internal.i.e(speechRecognizerState, "$speechRecognizerState");
        kotlin.jvm.internal.i.e(onSendMessage, "$onSendMessage");
        kotlin.jvm.internal.i.e(textFieldValue$delegate, "$textFieldValue$delegate");
        kotlin.jvm.internal.i.e(textInputSource$delegate, "$textInputSource$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        aVar.invoke();
        C1260a c1260a = it.f15491a;
        if (kotlin.jvm.internal.i.a(c1260a.f15408c, MessageComposer$lambda$7(textFieldValue$delegate).f15491a.f15408c)) {
            if (!androidx.compose.ui.text.E.a(it.f15492b, MessageComposer$lambda$7(textFieldValue$delegate).f15492b)) {
                speechRecognizerState.stopListening();
            }
        }
        if (!kotlin.jvm.internal.i.a(c1260a.f15408c, MessageComposer$lambda$7(textFieldValue$delegate).f15491a.f15408c) && (MessageComposer$lambda$10(textInputSource$delegate) == TextInputSource.VOICE_ONLY || MessageComposer$lambda$10(textInputSource$delegate) == TextInputSource.EDITED_VOICE_INPUT)) {
            if (c1260a.f15408c.length() == 0) {
                String str = c1260a.f15408c;
                textInputSource = TextInputSource.CLEARED_VOICE_INPUT;
                onSendMessage.invoke(str, textInputSource);
            } else {
                textInputSource = TextInputSource.EDITED_VOICE_INPUT;
            }
            textInputSource$delegate.setValue(textInputSource);
        }
        if (!kotlin.jvm.internal.i.a(c1260a.f15408c, MessageComposer$lambda$7(textFieldValue$delegate).f15491a.f15408c) && MessageComposer$lambda$10(textInputSource$delegate) == TextInputSource.CLEARED_VOICE_INPUT) {
            textInputSource$delegate.setValue(TextInputSource.KEYBOARD);
        }
        textFieldValue$delegate.setValue(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$29(androidx.compose.ui.h hVar, Ia.p onSendMessage, BottomBarUiState bottomBarUiState, Ia.a aVar, Ia.a aVar2, Ia.l lVar, Ia.l lVar2, Ia.a aVar3, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(onSendMessage, "$onSendMessage");
        kotlin.jvm.internal.i.e(bottomBarUiState, "$bottomBarUiState");
        MessageComposer(hVar, onSendMessage, bottomBarUiState, aVar, aVar2, lVar, lVar2, aVar3, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposer$lambda$3(MetricData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.X MessageComposer$lambda$6$lambda$5(String initialMessage) {
        kotlin.jvm.internal.i.e(initialMessage, "$initialMessage");
        int length = initialMessage.length();
        return J0.f(new TextFieldValue(4, O.h.b(length, length), initialMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue MessageComposer$lambda$7(androidx.compose.runtime.X<TextFieldValue> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$8(androidx.compose.runtime.X<TextFieldValue> x10, TextFieldValue textFieldValue) {
        x10.setValue(textFieldValue);
    }

    @IntercomPreviews
    public static final void TextComposerPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-609144377);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AvatarWrapper avatarWrapper = null;
            MessageComposer(null, new M(), new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, 4, null), new CurrentlyTypingState(avatarWrapper, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), null, false, null, 56, null), null, null, null, null, null, c1086gP, 560, 249);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerPreview$lambda$30(String str, TextInputSource textInputSource) {
        kotlin.jvm.internal.i.e(str, "<unused var>");
        kotlin.jvm.internal.i.e(textInputSource, "<unused var>");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerPreview$lambda$31(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextComposerPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextComposerWithButtonsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        int i11 = 0;
        C1086g c1086gP = interfaceC1084f.p(1468421996);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            MessageComposer(null, new N(), new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, 4, null), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), kotlin.collections.l.s(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), false, null, 48, null), null, null, null, null, null, c1086gP, 560, 249);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithButtonsPreview$lambda$32(String str, TextInputSource textInputSource) {
        kotlin.jvm.internal.i.e(str, "<unused var>");
        kotlin.jvm.internal.i.e(textInputSource, "<unused var>");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithButtonsPreview$lambda$33(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextComposerWithButtonsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextComposerWithFinDictationPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2094324481);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AvatarWrapper avatarWrapper = null;
            MessageComposer(null, new C2387y(1), new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, 4, null), new CurrentlyTypingState(avatarWrapper, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), null, true, null, 40, null), null, null, null, null, null, c1086gP, 560, 249);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithFinDictationPreview$lambda$36(String str, TextInputSource textInputSource) {
        kotlin.jvm.internal.i.e(str, "<unused var>");
        kotlin.jvm.internal.i.e(textInputSource, "<unused var>");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithFinDictationPreview$lambda$37(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextComposerWithFinDictationPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextComposerWithInitialTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-986390788);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            AvatarWrapper avatarWrapper = null;
            MessageComposer(null, new L(), new BottomBarUiState(new ComposerState.TextInput("Initial message with\nNew line\nAnd another very long new line", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, 4, null), new CurrentlyTypingState(avatarWrapper, false, null, TypingIndicatorType.NONE, 7, null), InputTypeState.Companion.getDEFAULT(), M1.k(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), false, null, 48, null), null, null, null, null, null, c1086gP, 560, 249);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithInitialTextPreview$lambda$34(String str, TextInputSource textInputSource) {
        kotlin.jvm.internal.i.e(str, "<unused var>");
        kotlin.jvm.internal.i.e(textInputSource, "<unused var>");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextComposerWithInitialTextPreview$lambda$35(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextComposerWithInitialTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final float getComposerHalfSize() {
        return ComposerHalfSize;
    }

    public static final float getComposerMinSize() {
        return ComposerMinSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowButtons(String str, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState) {
        return (str.length() != 0 || bottomBarUiState.getButtons().isEmpty() || speechRecognizerState.isListening()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowVoiceInput(String str, BottomBarUiState bottomBarUiState, SpeechRecognizerState speechRecognizerState) {
        return bottomBarUiState.getFinDictationEnabled() && (str.length() == 0 || speechRecognizerState.isListening());
    }
}
