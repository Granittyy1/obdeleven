package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: DropDownQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$DropDownQuestionKt$lambda2$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$0(Answer it) {
        i.e(it, "it");
        return r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            DropDownQuestionKt.DropDownQuestion(null, DropDownQuestionKt.dropDownQuestionModel, null, new a(), C4.a.g(null, null, 3, null), null, interfaceC1084f, 3136, 37);
        }
    }
}
