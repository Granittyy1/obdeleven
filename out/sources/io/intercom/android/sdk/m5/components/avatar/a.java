package io.intercom.android.sdk.m5.components.avatar;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38279c;

    public /* synthetic */ a(int i10, int i11) {
        this.f38278b = i11;
        this.f38279c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38278b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarIconKt.AvatarIconPreview$lambda$22(this.f38279c, interfaceC1084f, iIntValue);
            case 1:
                return AnswerInfoDialogKt.AnswerInfoDialogPreview$lambda$2(this.f38279c, interfaceC1084f, iIntValue);
            case 2:
                return MessageComposerKt.TextComposerPreview$lambda$31(this.f38279c, interfaceC1084f, iIntValue);
            case 3:
                return TypingIndicatorKt.TeammateTypingIndicator$lambda$10(this.f38279c, interfaceC1084f, iIntValue);
            case 4:
                return NewConversationCardKt.NewConversationCardFinWithoutHumanAccessPreview$lambda$6(this.f38279c, interfaceC1084f, iIntValue);
            case 5:
                return FileUploadErrorComponentKt.ErrorActionSheetContentPreview$lambda$6(this.f38279c, interfaceC1084f, iIntValue);
            case 6:
                return TicketRowKt.TicketRowPreview$lambda$3(this.f38279c, interfaceC1084f, iIntValue);
            default:
                return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$6(this.f38279c, interfaceC1084f, iIntValue);
        }
    }
}
