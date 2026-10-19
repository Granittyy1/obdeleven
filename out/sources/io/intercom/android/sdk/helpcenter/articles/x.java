package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38111c;

    public /* synthetic */ x(int i10, int i11) {
        this.f38110b = i11;
        this.f38111c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38110b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ReactionsComponentKt.ReactionComponentNeutralTappedPreview$lambda$17(this.f38111c, interfaceC1084f, iIntValue);
            case 1:
                return AvatarIconKt.AvatarIconCutPreview$lambda$25(this.f38111c, interfaceC1084f, iIntValue);
            case 2:
                return BigTicketCardKt.BigTicketCardWaitingPreview$lambda$4(this.f38111c, interfaceC1084f, iIntValue);
            case 3:
                return NewConversationCardKt.NewConversationCardBotPreview$lambda$4(this.f38111c, interfaceC1084f, iIntValue);
            case 4:
                return ChatFullNotificationKt.ChatFullNotificationShortMessagePreview$lambda$7(this.f38111c, interfaceC1084f, iIntValue);
            case 5:
                return TextBlockKt.HeadingTextBlockPreview$lambda$27(this.f38111c, interfaceC1084f, iIntValue);
            default:
                return FileUploadErrorComponentKt.UploadFailedErrorActionSheetPreview$lambda$7(this.f38111c, interfaceC1084f, iIntValue);
        }
    }
}
