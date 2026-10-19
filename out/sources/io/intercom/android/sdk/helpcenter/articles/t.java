package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38097c;

    public /* synthetic */ t(int i10, int i11) {
        this.f38096b = i11;
        this.f38097c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38096b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ReactionsComponentKt.ReactionsComponentPreview$lambda$15(this.f38097c, interfaceC1084f, iIntValue);
            case 1:
                return BotAndHumansFacePileKt.BotsWithOneTeammatePreview$lambda$13(this.f38097c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationItemKt.UnreadConversationCardPreview$lambda$9(this.f38097c, interfaceC1084f, iIntValue);
            case 3:
                return TicketStatusRowKt.SimplePreview$lambda$4(this.f38097c, interfaceC1084f, iIntValue);
            case 4:
                return FileAttachmentListKt.FileAttachmentListErrorPreview$lambda$6(this.f38097c, interfaceC1084f, iIntValue);
            case 5:
                return CreateTicketContentScreenKt.CreateTicketLoadingPreview$lambda$6(this.f38097c, interfaceC1084f, iIntValue);
            default:
                return IntercomButtonKt.PrimaryButtonPreview$lambda$1(this.f38097c, interfaceC1084f, iIntValue);
        }
    }
}
