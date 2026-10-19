package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38563d;

    public /* synthetic */ Q(Object obj, int i10, Object obj2) {
        this.f38561b = i10;
        this.f38562c = obj;
        this.f38563d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38561b) {
            case 0:
                return MessageListKt.MessageList$lambda$39((kotlinx.coroutines.A) this.f38562c, (ScrollState) this.f38563d);
            case 1:
                return DatePickerQuestionKt.DatePicker$lambda$6((androidx.compose.ui.focus.n) this.f38562c, (androidx.compose.runtime.X) this.f38563d);
            default:
                return FIleAttachmentListKt.FileAttachmentList$lambda$2$lambda$1$lambda$0((Ticket.TicketAttribute.FilesAttribute.File) this.f38562c, (Context) this.f38563d);
        }
    }
}
