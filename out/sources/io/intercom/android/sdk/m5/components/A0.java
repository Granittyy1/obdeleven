package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38149c;

    public /* synthetic */ A0(int i10, int i11) {
        this.f38148b = i11;
        this.f38149c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38148b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return LoadingScreenKt.LoadingScreenPreview$lambda$4(this.f38149c, interfaceC1084f, iIntValue);
            case 1:
                return AvatarIconKt.AvatarIconActivePreview$lambda$23(this.f38149c, interfaceC1084f, iIntValue);
            case 2:
                return MessageComposerKt.TextComposerWithInitialTextPreview$lambda$35(this.f38149c, interfaceC1084f, iIntValue);
            case 3:
                return TeamPresenceComponentKt.TeamPresencePreview$lambda$14(this.f38149c, interfaceC1084f, iIntValue);
            case 4:
                return NewConversationCardKt.NewConversationCardFinWithHumanAccessPreview$lambda$5(this.f38149c, interfaceC1084f, iIntValue);
            case 5:
                return ChatFullNotificationKt.ChatFullNotificationPreview$lambda$6(this.f38149c, interfaceC1084f, iIntValue);
            case 6:
                return TextBlockKt.TextBlockPreview$lambda$25(this.f38149c, interfaceC1084f, iIntValue);
            case 7:
                return FIleAttachmentListKt.FileAttachmentListPreview$lambda$6(this.f38149c, interfaceC1084f, iIntValue);
            default:
                return BooleanAttributeCollectorKt.BooleanAttributePreview$lambda$10(this.f38149c, interfaceC1084f, iIntValue);
        }
    }
}
