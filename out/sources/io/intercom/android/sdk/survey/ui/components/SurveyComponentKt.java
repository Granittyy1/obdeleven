package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import Ia.p;
import Ia.q;
import S4.o;
import android.content.Context;
import android.view.View;
import androidx.compose.animation.D;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.w;
import androidx.navigation.compose.y;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.C2277e0;
import io.intercom.android.sdk.m5.conversation.ui.C2397l;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.m5.conversation.ui.C2400o;
import io.intercom.android.sdk.m5.conversation.ui.C2402q;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.m5.conversation.ui.components.row.C2370b;
import io.intercom.android.sdk.m5.conversation.ui.components.row.C2373e;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SurveyComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyComponentKt {
    private static final AppConfig emptyAppConfig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: SurveyComponent.kt */
    public static final class AnonymousClass1 implements q<InterfaceC0950j, InterfaceC1084f, Integer, r> {
        final /* synthetic */ A $coroutineScope;
        final /* synthetic */ l<String, r> $onAnswerUpdated;
        final /* synthetic */ l<A, r> $onContinue;
        final /* synthetic */ l<SurveyState.Content.SecondaryCta, r> $onSecondaryCtaClicked;
        final /* synthetic */ SurveyState.Content $state;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SurveyState.Content content, l<? super SurveyState.Content.SecondaryCta, r> lVar, l<? super String, r> lVar2, l<? super A, r> lVar3, A a10) {
            this.$state = content;
            this.$onSecondaryCtaClicked = lVar;
            this.$onAnswerUpdated = lVar2;
            this.$onContinue = lVar3;
            this.$coroutineScope = a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$8$lambda$6$lambda$5$lambda$4(CharSequence charSequence, w semantics) {
            kotlin.jvm.internal.i.e(semantics, "$this$semantics");
            t.g(charSequence.toString(), semantics);
            return r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$8$lambda$7(l onContinue, A coroutineScope) {
            kotlin.jvm.internal.i.e(onContinue, "$onContinue");
            kotlin.jvm.internal.i.e(coroutineScope, "$coroutineScope");
            onContinue.invoke(coroutineScope);
            return r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0950j, interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f, int i10) {
            String strP;
            kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((i10 & 14) == 0 ? i10 | (interfaceC1084f.K(BoxWithConstraints) ? 4 : 2) : i10) & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            float fI = BoxWithConstraints.i();
            ScrollState scrollStateA = ScrollKt.a(0, interfaceC1084f, 0, 1);
            interfaceC1084f.L(1705494839);
            boolean zK = interfaceC1084f.K(scrollStateA);
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new SurveyComponentKt$SurveyContent$1$1$1(scrollStateA, null);
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            E.d((p) objF, interfaceC1084f, "");
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            float f10 = 16;
            androidx.compose.ui.h hVarB = ScrollKt.b(PaddingKt.h(W.f10226c, f10, 0.0f, 2), scrollStateA, true, 12);
            SurveyState.Content content = this.$state;
            l<SurveyState.Content.SecondaryCta, r> lVar = this.$onSecondaryCtaClicked;
            l<String, r> lVar2 = this.$onAnswerUpdated;
            l<A, r> lVar3 = this.$onContinue;
            A a10 = this.$coroutineScope;
            C0945e.k kVar = C0945e.f10286c;
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar, aVar2, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar3);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            Lb.a.a(interfaceC1084f, W.e(aVar, f10));
            float f11 = fI - 96;
            for (int i11 = 0; i11 < content.getSecondaryCtaActions().size(); i11++) {
                f11 -= 64;
            }
            androidx.compose.ui.h hVarB2 = W.b(aVar, 0.0f, f11, 1);
            int i12 = 0;
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, aVar2, interfaceC1084f, 0);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarB2);
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
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA2);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z2);
            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                k.b(iF2, interfaceC1084f, iF2, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC2);
            interfaceC1084f.L(412604363);
            List<Block.Builder> stepTitle = content.getStepTitle();
            ArrayList<Block> arrayList = new ArrayList(m.y(stepTitle, 10));
            Iterator<T> it = stepTitle.iterator();
            while (it.hasNext()) {
                arrayList.add(((Block.Builder) it.next()).build());
            }
            for (Block block : arrayList) {
                androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
                kotlin.jvm.internal.i.b(block);
                BlockViewKt.BlockView(hVarD, new BlockRenderData(block, new H(content.getSurveyUiColors().m360getOnBackground0d7_KjU()), null, null, null, 28, null), false, null, false, null, null, null, null, false, null, null, interfaceC1084f, 70, 0, 4092);
                lVar = lVar;
                content = content;
                i12 = 0;
                a10 = a10;
                lVar2 = lVar2;
                lVar3 = lVar3;
                f10 = f10;
                aVar = aVar;
            }
            final A a11 = a10;
            final l<A, r> lVar4 = lVar3;
            l<String, r> lVar5 = lVar2;
            l<SurveyState.Content.SecondaryCta, r> lVar6 = lVar;
            SurveyState.Content content2 = content;
            float f12 = f10;
            int i13 = i12;
            interfaceC1084f.D();
            float f13 = 8;
            androidx.compose.ui.h.a aVar5 = aVar;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            Lb.a.a(interfaceC1084f2, W.e(aVar5, f13));
            interfaceC1084f2.L(412619710);
            for (Object obj : content2.getQuestions()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                QuestionState questionState = (QuestionState) obj;
                final CharSequence charSequence = Phrase.from((Context) interfaceC1084f2.x(AndroidCompositionLocals_androidKt.f14793b), R.string.intercom_surveys_question_question_number_of_question_count).put("questioin_number", i14).put("question_count", content2.getQuestions().size()).format();
                i13 = i14;
                interfaceC1084f2 = interfaceC1084f;
                QuestionComponentKt.m403QuestionComponentlzVJ5Jw(PaddingKt.h(androidx.compose.ui.semantics.p.b(aVar5, true, new l() { // from class: io.intercom.android.sdk.survey.ui.components.g
                    @Override // Ia.l
                    public final Object invoke(Object obj2) {
                        return SurveyComponentKt.AnonymousClass1.invoke$lambda$8$lambda$6$lambda$5$lambda$4(charSequence, (w) obj2);
                    }
                }), 0.0f, f13, 1), null, questionState, null, lVar5, 0L, 0.0f, null, 0L, null, interfaceC1084f2, 512, 1002);
                f13 = f13;
                aVar5 = aVar5;
            }
            androidx.compose.ui.h.a aVar6 = aVar5;
            interfaceC1084f.D();
            interfaceC1084f.J();
            Lb.a.a(interfaceC1084f, W.e(aVar6, f13));
            SurveyState.Content.PrimaryCta primaryCta = content2.getPrimaryCta();
            interfaceC1084f.L(-1140607254);
            if (primaryCta instanceof SurveyState.Content.PrimaryCta.Custom) {
                strP = ((SurveyState.Content.PrimaryCta.Custom) primaryCta).getText();
            } else {
                if (!(primaryCta instanceof SurveyState.Content.PrimaryCta.Fallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                strP = o.p(interfaceC1084f, ((SurveyState.Content.PrimaryCta.Fallback) primaryCta).getFallbackTextRes());
            }
            String str = strP;
            interfaceC1084f.D();
            SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(null, str, content2.getSecondaryCtaActions(), new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.components.h
                @Override // Ia.a
                public final Object invoke() {
                    return SurveyComponentKt.AnonymousClass1.invoke$lambda$8$lambda$7(lVar4, a11);
                }
            }, lVar6, content2.getSurveyUiColors(), interfaceC1084f, 512, 1);
            Lb.a.a(interfaceC1084f, W.e(aVar6, f12));
            interfaceC1084f.J();
        }
    }

    static {
        EmptySet emptySet = EmptySet.f42985b;
        emptyAppConfig = new AppConfig("", 0, 0, 0, false, false, false, 100, 1000L, 1000L, 1000L, 1000L, true, true, "", "", false, true, "", emptySet, emptySet, "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.Companion.getDEFAULT(), true, false, ConversationStateSyncSettings.Companion.getDEFAULT());
    }

    public static final void SimpleSurvey(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(126014647);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurveyUiColors surveyUiColorsG = C4.a.g(null, null, 3, null);
            Avatar avatarCreate = Avatar.create("", "AD");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(avatarCreate, "Andy", emptyAppConfig, true, surveyUiColorsG, new ProgressBarState(true, 0.5f));
            List listS = kotlin.collections.l.s(new Block.Builder().withText("<b>Step 1</b>").withType(BlockType.HEADING.getSerializedName()), new Block.Builder().withText("Get tailored discounts to your inbox").withType(BlockType.PARAGRAPH.getSerializedName()));
            QuestionState questionState = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Is this a preview?")), true, "Let us know", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, Integer.valueOf(androidx.recyclerview.widget.t.d.DEFAULT_SWIPE_ANIMATION_DURATION), false, null, null, 448, null), surveyUiColorsG);
            QuestionState questionState2 = new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Question Title")), true, kotlin.collections.l.s("Option A", "Option B", "Option C", "Option D"), false), C4.a.g(null, null, 3, null));
            String strC = D.c("toString(...)");
            List listK = M1.k(new Block.Builder().withText("How would your rate your experience?"));
            SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType = SurveyData.Step.Question.QuestionData.QuestionSubType.STARS;
            Na.i iVar = new Na.i(1, 5, 1);
            ArrayList arrayList = new ArrayList(m.y(iVar, 10));
            Na.h hVarV = iVar.iterator();
            while (hVarV.f4692d) {
                arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(hVarV.a()));
            }
            SurveyComponent(new SurveyState.Content(listS, kotlin.collections.l.s(questionState, questionState2, new QuestionState(new SurveyData.Step.Question.NumericRatingQuestionModel(strC, listK, true, arrayList, "Poor", "Excellent", 1, 5, questionSubType), surveyUiColorsG)), EmptyList.f42983b, new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button), surveyUiColorsG, senderTopBarState), new C2399n(5), new C2400o(1), new y(9), null, c1086gP, 3512, 16);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SimpleSurvey$lambda$6(A it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SimpleSurvey$lambda$8(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SimpleSurvey$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SimpleSurvey(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void SurveyComponent(final SurveyState state, final l<? super A, r> onContinue, final Ia.a<r> onClose, l<? super String, r> lVar, l<? super SurveyState.Content.SecondaryCta, r> lVar2, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        l<? super String, r> lVar3;
        int i13;
        l<? super SurveyState.Content.SecondaryCta, r> lVar4;
        int i14;
        final l<? super String, r> c2370b;
        final l<? super SurveyState.Content.SecondaryCta, r> c2397l;
        List listS;
        int i15;
        Ia.a<ComposeUiNode> aVar;
        p<ComposeUiNode, Integer, r> pVar;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(onContinue, "onContinue");
        kotlin.jvm.internal.i.e(onClose, "onClose");
        C1086g c1086gP = interfaceC1084f.p(290100480);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(onContinue) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onClose) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 7168) == 0) {
                lVar3 = lVar;
                i12 |= c1086gP.k(lVar3) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    lVar4 = lVar2;
                    if (c1086gP.k(lVar4)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i12 & 46811) == 9362 || !c1086gP.s()) {
                    if (i16 != 0) {
                        c2370b = new C2370b(1);
                    } else {
                        c2370b = lVar3;
                    }
                    if (i13 != 0) {
                        c2397l = new C2397l(2);
                    } else {
                        c2397l = lVar4;
                    }
                    if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                        listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                    } else {
                        listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                    }
                    Z zA = C.a.a(listS, 0.0f, 0.0f, 14);
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarA = C0932d.a(aVar2, zA);
                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i15 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                        J4.i.d(i15, c1086gP, i15, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    ScaffoldKt.a(ComposedModifierKt.a(aVar2, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(359872873);
                            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                            c0 c0VarC = c0.a.c(interfaceC1084f3);
                            boolean zK = interfaceC1084f3.K(c0VarC);
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new InsetsPaddingModifier(c0VarC.f10256b);
                                interfaceC1084f3.E(objF);
                            }
                            InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                            interfaceC1084f3.D();
                            return insetsPaddingModifier;
                        }
                    }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                            if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                            }
                        }
                    }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(l10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                            kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                            if ((i17 & 14) == 0) {
                                i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                            }
                            if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            SurveyState surveyState = state;
                            boolean z10 = surveyState instanceof SurveyState.Content;
                            androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                            if (z10) {
                                interfaceC1084f2.L(-509523482);
                                SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar3, contentPadding), interfaceC1084f2, 8, 0);
                                interfaceC1084f2.D();
                                return;
                            }
                            if (surveyState instanceof SurveyState.Error) {
                                interfaceC1084f2.L(-509512239);
                                ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar3, contentPadding), interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            } else if (surveyState instanceof SurveyState.Loading) {
                                interfaceC1084f2.L(-509506157);
                                LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar3, contentPadding), interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                                interfaceC1084f2.L(1385361405);
                                interfaceC1084f2.D();
                            } else {
                                interfaceC1084f2.L(-509524940);
                                interfaceC1084f2.D();
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }, c1086gP), c1086gP, 806879280, 444);
                    c1086gP.T(true);
                } else {
                    c1086gP.w();
                    c2370b = lVar3;
                    c2397l = lVar4;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.w(state, onContinue, onClose, c2370b, c2397l, i10, i11, 1);
                }
            }
            i12 |= 24576;
            lVar4 = lVar2;
            if ((i12 & 46811) == 9362) {
                if (i16 != 0) {
                    c2370b = new C2370b(1);
                } else {
                    c2370b = lVar3;
                }
                if (i13 != 0) {
                    c2397l = new C2397l(2);
                } else {
                    c2397l = lVar4;
                }
                if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                } else {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                }
                Z zA2 = C.a.a(listS, 0.0f, 0.0f, 14);
                androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarA2 = C0932d.a(aVar3, zA2);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA2);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                ScaffoldKt.a(ComposedModifierKt.a(aVar3, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(359872873);
                        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                        c0 c0VarC = c0.a.c(interfaceC1084f3);
                        boolean zK = interfaceC1084f3.K(c0VarC);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new InsetsPaddingModifier(c0VarC.f10256b);
                            interfaceC1084f3.E(objF);
                        }
                        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                        interfaceC1084f3.D();
                        return insetsPaddingModifier;
                    }
                }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                        }
                    }
                }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(l10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                        kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                        if ((i17 & 14) == 0) {
                            i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                        }
                        if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        SurveyState surveyState = state;
                        boolean z10 = surveyState instanceof SurveyState.Content;
                        androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (z10) {
                            interfaceC1084f2.L(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar4, contentPadding), interfaceC1084f2, 8, 0);
                            interfaceC1084f2.D();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            interfaceC1084f2.L(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar4, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            interfaceC1084f2.L(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar4, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                            interfaceC1084f2.L(1385361405);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-509524940);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }, c1086gP), c1086gP, 806879280, 444);
                c1086gP.T(true);
            } else {
                if (i16 != 0) {
                    c2370b = new C2370b(1);
                } else {
                    c2370b = lVar3;
                }
                if (i13 != 0) {
                    c2397l = new C2397l(2);
                } else {
                    c2397l = lVar4;
                }
                if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                } else {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                }
                Z zA3 = C.a.a(listS, 0.0f, 0.0f, 14);
                androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarA3 = C0932d.a(aVar4, zA3);
                androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarA3);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                ScaffoldKt.a(ComposedModifierKt.a(aVar4, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(359872873);
                        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                        c0 c0VarC = c0.a.c(interfaceC1084f3);
                        boolean zK = interfaceC1084f3.K(c0VarC);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new InsetsPaddingModifier(c0VarC.f10256b);
                            interfaceC1084f3.E(objF);
                        }
                        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                        interfaceC1084f3.D();
                        return insetsPaddingModifier;
                    }
                }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                        }
                    }
                }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(l10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                        kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                        if ((i17 & 14) == 0) {
                            i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                        }
                        if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        SurveyState surveyState = state;
                        boolean z10 = surveyState instanceof SurveyState.Content;
                        androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                        if (z10) {
                            interfaceC1084f2.L(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar5, contentPadding), interfaceC1084f2, 8, 0);
                            interfaceC1084f2.D();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            interfaceC1084f2.L(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar5, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            interfaceC1084f2.L(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar5, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                            interfaceC1084f2.L(1385361405);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-509524940);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }, c1086gP), c1086gP, 806879280, 444);
                c1086gP.T(true);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.w(state, onContinue, onClose, c2370b, c2397l, i10, i11, 1);
            }
        }
        i12 |= 3072;
        lVar3 = lVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                lVar4 = lVar2;
                if (c1086gP.k(lVar4)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i12 & 46811) == 9362) {
                if (i16 != 0) {
                    c2370b = new C2370b(1);
                } else {
                    c2370b = lVar3;
                }
                if (i13 != 0) {
                    c2397l = new C2397l(2);
                } else {
                    c2397l = lVar4;
                }
                if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                } else {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                }
                Z zA4 = C.a.a(listS, 0.0f, 0.0f, 14);
                androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarA4 = C0932d.a(aVar5, zA4);
                androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA4);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                ScaffoldKt.a(ComposedModifierKt.a(aVar5, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(359872873);
                        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                        c0 c0VarC = c0.a.c(interfaceC1084f3);
                        boolean zK = interfaceC1084f3.K(c0VarC);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new InsetsPaddingModifier(c0VarC.f10256b);
                            interfaceC1084f3.E(objF);
                        }
                        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                        interfaceC1084f3.D();
                        return insetsPaddingModifier;
                    }
                }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                        }
                    }
                }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(l10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                        kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                        if ((i17 & 14) == 0) {
                            i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                        }
                        if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        SurveyState surveyState = state;
                        boolean z10 = surveyState instanceof SurveyState.Content;
                        androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                        if (z10) {
                            interfaceC1084f2.L(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar6, contentPadding), interfaceC1084f2, 8, 0);
                            interfaceC1084f2.D();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            interfaceC1084f2.L(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar6, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            interfaceC1084f2.L(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar6, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                            interfaceC1084f2.L(1385361405);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-509524940);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }, c1086gP), c1086gP, 806879280, 444);
                c1086gP.T(true);
            } else {
                if (i16 != 0) {
                    c2370b = new C2370b(1);
                } else {
                    c2370b = lVar3;
                }
                if (i13 != 0) {
                    c2397l = new C2397l(2);
                } else {
                    c2397l = lVar4;
                }
                if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                } else {
                    listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
                }
                Z zA5 = C.a.a(listS, 0.0f, 0.0f, 14);
                androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarA5 = C0932d.a(aVar6, zA5);
                androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarA5);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                ScaffoldKt.a(ComposedModifierKt.a(aVar6, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(359872873);
                        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                        c0 c0VarC = c0.a.c(interfaceC1084f3);
                        boolean zK = interfaceC1084f3.K(c0VarC);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new InsetsPaddingModifier(c0VarC.f10256b);
                            interfaceC1084f3.E(objF);
                        }
                        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                        interfaceC1084f3.D();
                        return insetsPaddingModifier;
                    }
                }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                        }
                    }
                }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(l10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                        kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                        if ((i17 & 14) == 0) {
                            i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                        }
                        if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        SurveyState surveyState = state;
                        boolean z10 = surveyState instanceof SurveyState.Content;
                        androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                        if (z10) {
                            interfaceC1084f2.L(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar7, contentPadding), interfaceC1084f2, 8, 0);
                            interfaceC1084f2.D();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            interfaceC1084f2.L(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar7, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (surveyState instanceof SurveyState.Loading) {
                            interfaceC1084f2.L(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar7, contentPadding), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                            interfaceC1084f2.L(1385361405);
                            interfaceC1084f2.D();
                        } else {
                            interfaceC1084f2.L(-509524940);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }, c1086gP), c1086gP, 806879280, 444);
                c1086gP.T(true);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.w(state, onContinue, onClose, c2370b, c2397l, i10, i11, 1);
            }
        }
        i12 |= 24576;
        lVar4 = lVar2;
        if ((i12 & 46811) == 9362) {
            if (i16 != 0) {
                c2370b = new C2370b(1);
            } else {
                c2370b = lVar3;
            }
            if (i13 != 0) {
                c2397l = new C2397l(2);
            } else {
                c2397l = lVar4;
            }
            if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
            } else {
                listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
            }
            Z zA6 = C.a.a(listS, 0.0f, 0.0f, 14);
            androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarA6 = C0932d.a(aVar7, zA6);
            androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarA6);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            ScaffoldKt.a(ComposedModifierKt.a(aVar7, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(359872873);
                    WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                    c0 c0VarC = c0.a.c(interfaceC1084f3);
                    boolean zK = interfaceC1084f3.K(c0VarC);
                    Object objF = interfaceC1084f3.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new InsetsPaddingModifier(c0VarC.f10256b);
                        interfaceC1084f3.E(objF);
                    }
                    InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                    interfaceC1084f3.D();
                    return insetsPaddingModifier;
                }
            }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                    if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                    }
                }
            }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(l10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                    kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                    if ((i17 & 14) == 0) {
                        i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                    }
                    if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    SurveyState surveyState = state;
                    boolean z10 = surveyState instanceof SurveyState.Content;
                    androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                    if (z10) {
                        interfaceC1084f2.L(-509523482);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar8, contentPadding), interfaceC1084f2, 8, 0);
                        interfaceC1084f2.D();
                        return;
                    }
                    if (surveyState instanceof SurveyState.Error) {
                        interfaceC1084f2.L(-509512239);
                        ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar8, contentPadding), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (surveyState instanceof SurveyState.Loading) {
                        interfaceC1084f2.L(-509506157);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar8, contentPadding), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                        interfaceC1084f2.L(1385361405);
                        interfaceC1084f2.D();
                    } else {
                        interfaceC1084f2.L(-509524940);
                        interfaceC1084f2.D();
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }, c1086gP), c1086gP, 806879280, 444);
            c1086gP.T(true);
        } else {
            if (i16 != 0) {
                c2370b = new C2370b(1);
            } else {
                c2370b = lVar3;
            }
            if (i13 != 0) {
                c2397l = new C2397l(2);
            } else {
                c2397l = lVar4;
            }
            if (ColorExtensionsKt.m664isDarkColor8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())) {
                listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m657darken8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
            } else {
                listS = kotlin.collections.l.s(new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(state.getSurveyUiColors().m356getBackground0d7_KjU()), new H(ColorExtensionsKt.m667lighten8_81llA(state.getSurveyUiColors().m356getBackground0d7_KjU())));
            }
            Z zA7 = C.a.a(listS, 0.0f, 0.0f, 14);
            androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarA7 = C0932d.a(aVar8, zA7);
            androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarA7);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            ScaffoldKt.a(ComposedModifierKt.a(aVar8, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(359872873);
                    WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                    c0 c0VarC = c0.a.c(interfaceC1084f3);
                    boolean zK = interfaceC1084f3.K(c0VarC);
                    Object objF = interfaceC1084f3.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new InsetsPaddingModifier(c0VarC.f10256b);
                        interfaceC1084f3.E(objF);
                    }
                    InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                    interfaceC1084f3.D();
                    return insetsPaddingModifier;
                }
            }), androidx.compose.runtime.internal.a.b(-365860662, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                    if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        SurveyTopBarComponentKt.SurveyTopBar(state.getTopBarState(), onClose, O.h.m(androidx.compose.ui.h.a.f13984b), interfaceC1084f2, 0, 0);
                    }
                }
            }, c1086gP), null, null, null, 0, H.f13503k, 0L, null, androidx.compose.runtime.internal.a.b(-1342576427, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(l10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i17) {
                    kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                    if ((i17 & 14) == 0) {
                        i17 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                    }
                    if ((i17 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    SurveyState surveyState = state;
                    boolean z10 = surveyState instanceof SurveyState.Content;
                    androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                    if (z10) {
                        interfaceC1084f2.L(-509523482);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) state, onContinue, c2370b, c2397l, PaddingKt.e(aVar9, contentPadding), interfaceC1084f2, 8, 0);
                        interfaceC1084f2.D();
                        return;
                    }
                    if (surveyState instanceof SurveyState.Error) {
                        interfaceC1084f2.L(-509512239);
                        ErrorComponentKt.SurveyError((SurveyState.Error) state, PaddingKt.e(aVar9, contentPadding), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (surveyState instanceof SurveyState.Loading) {
                        interfaceC1084f2.L(-509506157);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) state, PaddingKt.e(aVar9, contentPadding), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (kotlin.jvm.internal.i.a(surveyState, SurveyState.Initial.INSTANCE)) {
                        interfaceC1084f2.L(1385361405);
                        interfaceC1084f2.D();
                    } else {
                        interfaceC1084f2.L(-509524940);
                        interfaceC1084f2.D();
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }, c1086gP), c1086gP, 806879280, 444);
            c1086gP.T(true);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.w(state, onContinue, onClose, c2370b, c2397l, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyComponent$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyComponent$lambda$3(SurveyState state, l onContinue, Ia.a onClose, l lVar, l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onContinue, "$onContinue");
        kotlin.jvm.internal.i.e(onClose, "$onClose");
        SurveyComponent(state, onContinue, onClose, lVar, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void SurveyContent(final SurveyState.Content state, final l<? super A, r> onContinue, final l<? super String, r> onAnswerUpdated, final l<? super SurveyState.Content.SecondaryCta, r> onSecondaryCtaClicked, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(onContinue, "onContinue");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "onAnswerUpdated");
        kotlin.jvm.internal.i.e(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        C1086g c1086gP = interfaceC1084f.p(433920899);
        androidx.compose.ui.h hVar2 = (i11 & 16) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF);
        }
        final androidx.compose.ui.h hVar3 = hVar2;
        BoxWithConstraintsKt.a(hVar2.i(W.f10226c), null, false, androidx.compose.runtime.internal.a.b(-1844267539, new AnonymousClass1(state, onSecondaryCtaClicked, onAnswerUpdated, onContinue, (A) objF), c1086gP), c1086gP, 3072, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i12 = i10;
                    int i13 = i11;
                    return SurveyComponentKt.SurveyContent$lambda$4(state, onContinue, onAnswerUpdated, onSecondaryCtaClicked, hVar4, i12, i13, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyContent$lambda$4(SurveyState.Content state, l onContinue, l onAnswerUpdated, l onSecondaryCtaClicked, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onContinue, "$onContinue");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        kotlin.jvm.internal.i.e(onSecondaryCtaClicked, "$onSecondaryCtaClicked");
        SurveyContent(state, onContinue, onAnswerUpdated, onSecondaryCtaClicked, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void SurveyErrorState(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1165269984);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Avatar avatarCreate = Avatar.create("", "AD");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            String str = "Andy";
            int i11 = 0;
            SurveyComponent(new SurveyState.Error.WithCTA(i11, C4.a.g(null, null, 3, null), new TopBarState.SenderTopBarState(avatarCreate, str, emptyAppConfig, true, C4.a.g(null, null, 3, null), null, 32, null), new C2402q(2), 1, null), new C2373e(1), new io.intercom.android.sdk.m5.conversation.ui.r(2), new androidx.navigation.compose.D(5), null, c1086gP, 3504, 16);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyErrorState$lambda$11(A it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyErrorState$lambda$13(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyErrorState$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SurveyErrorState(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final AppConfig getEmptyAppConfig() {
        return emptyAppConfig;
    }
}
