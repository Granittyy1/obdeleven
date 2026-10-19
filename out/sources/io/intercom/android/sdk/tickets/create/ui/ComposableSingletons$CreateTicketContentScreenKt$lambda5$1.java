package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: CreateTicketContentScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda5$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$4(AnswerClickData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        List listI0 = kotlin.collections.q.i0(CreateTicketContentScreenKt.questions, 4);
        ((QuestionState) kotlin.collections.q.O(listI0)).setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null));
        p293xa.r rVar = p293xa.r.f47939a;
        CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", listI0, false, false), new p(), new q(), new r(), new s(), interfaceC1084f, 224704, 1);
    }
}
