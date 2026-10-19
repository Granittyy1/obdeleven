package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.text.InterfaceC1000i;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38478b;

    public /* synthetic */ T(int i10) {
        this.f38478b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38478b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$65((String) obj);
            case 1:
                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
            case 2:
                return ShortTextQuestionKt.ShortTextQuestion$lambda$0((InterfaceC1000i) obj);
            default:
                return TicketsScreenKt.TicketsScreen$lambda$0((String) obj);
        }
    }
}
