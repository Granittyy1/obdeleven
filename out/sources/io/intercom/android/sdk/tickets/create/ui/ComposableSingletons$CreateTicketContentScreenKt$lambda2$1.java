package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: CreateTicketContentScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$2(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$3(AnswerClickData it) {
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
        } else {
            CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", CreateTicketContentScreenKt.questions, false, true), new a(), new b(), new c(), new d(), interfaceC1084f, 224704, 1);
        }
    }
}
