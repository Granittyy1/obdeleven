package io.intercom.android.sdk.tickets.create.ui;

import android.view.View;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.C1121c;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.components.T;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.ui.I;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CreateTicketContentScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketContentScreenKt {
    private static final List<QuestionState> questions;
    private static final SurveyUiColors surveyUiColors;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = H.f13505m;
        kotlin.jvm.internal.e eVar = null;
        SurveyUiColors surveyUiColors2 = new SurveyUiColors(H.f13495b, H.f13499f, H.j, H.f13502i, null, 16, eVar);
        surveyUiColors = surveyUiColors2;
        List listK = M1.k(new Block.Builder().withText("Email").withType("paragraph"));
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType = SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        questions = kotlin.collections.l.s(new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel("1", listK, false, "abc@example.com", validationType, null, false, null, 0 == true ? 1 : 0, 448, eVar), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.LongTextQuestionModel("2", M1.k(new Block.Builder().withText("Multiline text").withType("paragraph")), true, "Enter text here...", validationType, null, R.styleable.AppCompatTheme_windowFixedHeightMajor, 0, null, 384, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel("3", M1.k(new Block.Builder().withText("List attribute").withType("paragraph")), true, kotlin.collections.l.s("Option A", "Option B", "Option C"), "Please select...", null, 32, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel("4", M1.k(new Block.Builder().withText("Boolean").withType("paragraph")), false, kotlin.collections.l.s("True", "False"), false), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", M1.k(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", M1.k(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2));
    }

    @IntercomPreviews
    private static final void CreateTicketContentErrorScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1908579859);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m488getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketContentErrorScreenPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CreateTicketContentErrorScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void CreateTicketContentScreen(androidx.compose.ui.h hVar, final CreateTicketViewModel.CreateTicketFormUiState.Content state, final Ia.a<p293xa.r> onCreateTicket, final Ia.a<p293xa.r> onCancel, final Ia.l<? super String, p293xa.r> onAnswerUpdated, final Ia.l<? super AnswerClickData, p293xa.r> onAnswerClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        SurveyUiColors surveyUiColors2;
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(onCreateTicket, "onCreateTicket");
        kotlin.jvm.internal.i.e(onCancel, "onCancel");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "onAnswerUpdated");
        kotlin.jvm.internal.i.e(onAnswerClick, "onAnswerClick");
        C1086g c1086gP = interfaceC1084f.p(-296750187);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        int i13 = 0;
        float f10 = 16;
        androidx.compose.ui.h hVarH = PaddingKt.h(C0932d.b(ScrollKt.b(hVar2.i(W.f10226c), ScrollKt.a(0, c1086gP, 0, 1), true, 12), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a), f10, 0.0f, 2);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        Lb.a.a(c1086gP, W.e(aVar, f10));
        c1086gP.L(-210345224);
        for (QuestionState questionState : state.getQuestions()) {
            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                c1086gP.L(-267718574);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                SurveyUiColors surveyUiColors3 = new SurveyUiColors(intercomTheme.getColors(c1086gP, i15).m621getBackground0d7_KjU(), intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), intercomTheme.getColors(c1086gP, i15).m615getAction0d7_KjU(), intercomTheme.getColors(c1086gP, i15).m639getOnAction0d7_KjU(), null, 16, null);
                c1086gP.T(i13);
                surveyUiColors2 = surveyUiColors3;
            } else {
                c1086gP.L(-267313094);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                SurveyUiColors surveyUiColors4 = new SurveyUiColors(intercomTheme2.getColors(c1086gP, i16).m621getBackground0d7_KjU(), intercomTheme2.getColors(c1086gP, i16).m645getPrimaryText0d7_KjU(), intercomTheme2.getColors(c1086gP, i16).m621getBackground0d7_KjU(), intercomTheme2.getColors(c1086gP, i16).m645getPrimaryText0d7_KjU(), new H(intercomTheme2.getColors(c1086gP, i16).m615getAction0d7_KjU()), null);
                i13 = 0;
                c1086gP.T(false);
                surveyUiColors2 = surveyUiColors4;
            }
            QuestionComponentKt.m403QuestionComponentlzVJ5Jw(C1121c.a(aVar, new I(2, questionState)), PaddingKt.j(aVar, 0.0f, 24, 0.0f, 0.0f, 13), questionState, surveyUiColors2, onAnswerUpdated, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), i13, androidx.compose.ui.text.font.l.f15444i, G0.a.g(16), onAnswerClick, c1086gP, (i10 & 57344) | 114819632 | ((i10 << 12) & 1879048192), 0);
            aVar = aVar;
            f10 = f10;
            i13 = 0;
        }
        float f11 = f10;
        boolean z10 = i13 == true ? 1 : 0;
        androidx.compose.ui.h.a aVar3 = aVar;
        c1086gP.T(z10);
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        Lb.a.a(c1086gP, hVar2.i(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE))));
        final androidx.compose.ui.h hVar3 = hVar2;
        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(onCreateTicket, PaddingKt.j(W.d(aVar3, 1.0f), 0.0f, 24, 0.0f, 0.0f, 13), (!state.getEnableCta() || state.getShowCreatingTicketProgress()) ? z10 ? 1 : 0 : true, androidx.compose.runtime.internal.a.b(-964987781, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(u10, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(U LegacyIntercomPrimaryButton, InterfaceC1084f interfaceC1084f2, int i17) {
                kotlin.jvm.internal.i.e(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                if ((i17 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                boolean showCreatingTicketProgress = state.getShowCreatingTicketProgress();
                androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                if (showCreatingTicketProgress) {
                    interfaceC1084f2.L(-265539615);
                    ProgressIndicatorKt.a(W.m(aVar4, 24), 0L, 2, 0L, 0, 390, interfaceC1084f2, 26);
                    interfaceC1084f2.D();
                    return;
                }
                interfaceC1084f2.L(-265348128);
                androidx.compose.foundation.layout.T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, interfaceC1084f2, 48);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar4);
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
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                String strP = S4.o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_tickets_create_ticket);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                TextKt.b(strP, null, intercomTheme3.getColors(interfaceC1084f2, i18).m639getOnAction0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(interfaceC1084f2, i18).getType04(), interfaceC1084f2, 0, 0, 65530);
                Lb.a.a(interfaceC1084f2, W.q(aVar4, 6));
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, interfaceC1084f2, 0), null, W.m(aVar4, 16), intercomTheme3.getColors(interfaceC1084f2, i18).m639getOnAction0d7_KjU(), interfaceC1084f2, 440, 0);
                interfaceC1084f2.J();
                interfaceC1084f2.D();
            }
        }, c1086gP), c1086gP, ((i10 >> 6) & 14) | 3120, 0);
        androidx.compose.ui.h hVarE = W.e(PaddingKt.j(W.d(aVar3, 1.0f), 0.0f, 8, 0.0f, f11, 5), 48);
        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
        int i17 = IntercomTheme.$stable;
        p270w.a aVar4 = intercomTheme3.getShapes(c1086gP, i17).f12430b;
        N n10 = C1051f.f12444a;
        ButtonKt.c(onCancel, hVarE, false, aVar4, C1051f.g(0L, intercomTheme3.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), c1086gP, 13), null, null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m484getLambda1$intercom_sdk_base_release(), c1086gP, ((i10 >> 9) & 14) | 805306416, 484);
        Lb.a.a(c1086gP, W.e(aVar3, f11));
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.create.ui.w
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i18 = i10;
                    int i19 = i11;
                    return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$4(hVar4, state, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, i18, i19, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(QuestionState questionState, y it) {
        kotlin.jvm.internal.i.e(questionState, "$questionState");
        kotlin.jvm.internal.i.e(it, "it");
        if ((questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getAnswer() instanceof Answer.NoAnswer.InitialNoAnswer) && !it.a()) {
            questionState.validate();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketContentScreen$lambda$4(androidx.compose.ui.h hVar, CreateTicketViewModel.CreateTicketFormUiState.Content state, Ia.a onCreateTicket, Ia.a onCancel, Ia.l onAnswerUpdated, Ia.l onAnswerClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onCreateTicket, "$onCreateTicket");
        kotlin.jvm.internal.i.e(onCancel, "$onCancel");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        kotlin.jvm.internal.i.e(onAnswerClick, "$onAnswerClick");
        CreateTicketContentScreen(hVar, state, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void CreateTicketContentScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1070922859);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m485getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.u(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketContentScreenPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CreateTicketContentScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void CreateTicketErrorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-627794766);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m487getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketErrorPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CreateTicketErrorPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void CreateTicketLoadingPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1078617214);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m486getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.t(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketLoadingPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CreateTicketLoadingPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void CreateTicketScreen(final CreateTicketViewModel.CreateTicketFormUiState uiState, final Ia.a<p293xa.r> onBackClick, final Ia.a<p293xa.r> onCreateTicket, final Ia.a<p293xa.r> onCancel, final Ia.l<? super String, p293xa.r> onAnswerUpdated, final Ia.l<? super AnswerClickData, p293xa.r> onAnswerClick, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        kotlin.jvm.internal.i.e(uiState, "uiState");
        kotlin.jvm.internal.i.e(onBackClick, "onBackClick");
        kotlin.jvm.internal.i.e(onCreateTicket, "onCreateTicket");
        kotlin.jvm.internal.i.e(onCancel, "onCancel");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "onAnswerUpdated");
        kotlin.jvm.internal.i.e(onAnswerClick, "onAnswerClick");
        C1086g c1086gP = interfaceC1084f.p(-2129527205);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(uiState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onBackClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onCreateTicket) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(onCancel) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c1086gP.k(onAnswerUpdated) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c1086gP.k(onAnswerClick) ? 131072 : 65536;
        }
        if ((i11 & 374491) == 74898 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            WeakHashMap<View, c0> weakHashMap = c0.f10254v;
            c1086g = c1086gP;
            ScaffoldKt.a(WindowInsetsPaddingKt.c(hVarB, c0.a.c(c1086gP).f10256b), androidx.compose.runtime.internal.a.b(-2106967777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                    if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = uiState;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getTitle() : "", null, null, null, onBackClick, null, false, 0L, 0L, 0L, null, null, interfaceC1084f2, 0, 0, 8157);
                    }
                }
            }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(426563690, new Ia.q<L, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(l10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f2, int i12) {
                    kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
                    if ((i12 & 14) == 0) {
                        i12 |= interfaceC1084f2.K(contentPadding) ? 4 : 2;
                    }
                    if ((i12 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = uiState;
                    if (kotlin.jvm.internal.i.a(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE)) {
                        interfaceC1084f2.L(-1277613046);
                        interfaceC1084f2.D();
                        return;
                    }
                    boolean z10 = createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content;
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    if (z10) {
                        interfaceC1084f2.L(-1277572622);
                        CreateTicketContentScreenKt.CreateTicketContentScreen(PaddingKt.e(aVar, contentPadding), (CreateTicketViewModel.CreateTicketFormUiState.Content) uiState, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, interfaceC1084f2, 64, 0);
                        interfaceC1084f2.D();
                    } else if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Error) {
                        interfaceC1084f2.L(-1277133631);
                        IntercomErrorScreenKt.IntercomErrorScreen(((CreateTicketViewModel.CreateTicketFormUiState.Error) uiState).getErrorState(), PaddingKt.e(aVar, contentPadding), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else {
                        if (!kotlin.jvm.internal.i.a(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE)) {
                            interfaceC1084f2.L(97332199);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC1084f2.L(97356214);
                        LoadingScreenKt.LoadingScreen(PaddingKt.e(aVar, contentPadding), io.intercom.android.sdk.R.drawable.intercom_content_loading, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }
            }, c1086gP), c1086g, 805306416, 508);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.create.ui.v
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketContentScreenKt.CreateTicketScreen$lambda$0(uiState, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState uiState, Ia.a onBackClick, Ia.a onCreateTicket, Ia.a onCancel, Ia.l onAnswerUpdated, Ia.l onAnswerClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(uiState, "$uiState");
        kotlin.jvm.internal.i.e(onBackClick, "$onBackClick");
        kotlin.jvm.internal.i.e(onCreateTicket, "$onCreateTicket");
        kotlin.jvm.internal.i.e(onCancel, "$onCancel");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        kotlin.jvm.internal.i.e(onAnswerClick, "$onAnswerClick");
        CreateTicketScreen(uiState, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
