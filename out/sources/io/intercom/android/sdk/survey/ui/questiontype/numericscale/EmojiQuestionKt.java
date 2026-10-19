package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.Iterator;
import java.util.List;
import p293xa.r;

/* JADX INFO: compiled from: EmojiQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmojiQuestionKt {
    public static final void EmojiQuestion(final List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption> options, final Answer answer, final l<? super Answer, r> onAnswer, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(options, "options");
        kotlin.jvm.internal.i.e(answer, "answer");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        C1086g c1086gP = interfaceC1084f.p(1738433356);
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
        T tA = S.a(C0945e.a.a(12), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i11 = c1086gP.f12996P;
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
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1487440982);
        Iterator<T> it = options.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) it.next();
            boolean z11 = (answer instanceof Answer.SingleAnswer) && kotlin.jvm.internal.i.a(((Answer.SingleAnswer) answer).getAnswer(), String.valueOf(emojiRatingOption.getValue()));
            String emojiUrl = emojiRatingOption.getEmojiUrl();
            String unicode = emojiRatingOption.getUnicode();
            boolean z12 = (answer instanceof Answer.NoAnswer) || z11;
            androidx.compose.ui.h hVarM = W.m(aVar, z11 ? 34 : 32);
            c1086gP.L(1945180755);
            if ((((i10 & 896) ^ 384) <= 256 || !c1086gP.K(onAnswer)) && (i10 & 384) != 256) {
                z10 = false;
            }
            boolean zK = z10 | c1086gP.K(emojiRatingOption);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new a(onAnswer, emojiRatingOption, 0);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            EmojiRatingKt.EmojiRating(emojiUrl, unicode, z12, ClickableKt.c(hVarM, false, null, (Ia.a) objF, 7), c1086gP, 0, 0);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmojiQuestionKt.EmojiQuestion$lambda$4(options, answer, onAnswer, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(l onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption option) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmojiQuestion$lambda$4(List options, Answer answer, l onAnswer, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(options, "$options");
        kotlin.jvm.internal.i.e(answer, "$answer");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        EmojiQuestion(options, answer, onAnswer, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
