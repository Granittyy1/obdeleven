package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38099c;

    public /* synthetic */ u(int i10, int i11) {
        this.f38098b = i11;
        this.f38099c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38098b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ReactionsComponentKt.ReactionComponentSadTappedPreview$lambda$16(this.f38099c, interfaceC1084f, iIntValue);
            case 1:
                return ConversationItemKt.ReadConversationWithSimpleTicketHeaderPreview$lambda$7(this.f38099c, interfaceC1084f, iIntValue);
            case 2:
                return TopActionBarKt.TopActionBarTeamReplyTimePreview$lambda$13(this.f38099c, interfaceC1084f, iIntValue);
            case 3:
                return AskedAboutRowKt.AskedAboutRowPreview$lambda$4(this.f38099c, interfaceC1084f, iIntValue);
            case 4:
                return ExternalLinkCardKt.ExternalLinkCardPreview$lambda$1(this.f38099c, interfaceC1084f, iIntValue);
            case 5:
                return QuestionHeaderComponentKt.HeaderWithoutError$lambda$9(this.f38099c, interfaceC1084f, iIntValue);
            default:
                return CreateTicketContentScreenKt.CreateTicketContentScreenPreview$lambda$5(this.f38099c, interfaceC1084f, iIntValue);
        }
    }
}
