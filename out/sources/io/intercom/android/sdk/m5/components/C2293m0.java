package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.PrivacyPolicyKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2293m0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38396c;

    public /* synthetic */ C2293m0(int i10, int i11) {
        this.f38395b = i11;
        this.f38396c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38395b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HomeItemKt.HomeMessagesPreview$lambda$12(this.f38396c, interfaceC1084f, iIntValue);
            case 1:
                return TextWithSeparatorKt.TextWithSeparatorPreview$lambda$3(this.f38396c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationBottomBarKt.MessageComposerLongTextPreview$lambda$4(this.f38396c, interfaceC1084f, iIntValue);
            case 3:
                return PrivacyPolicyKt.PrivacyPolicyPreview$lambda$3(this.f38396c, interfaceC1084f, iIntValue);
            case 4:
                return QuickRepliesKt.QuickRepliesPreview$lambda$15(this.f38396c, interfaceC1084f, iIntValue);
            case 5:
                return InboxEmptyScreenKt.EmptyScreenBotPreview$lambda$4(this.f38396c, interfaceC1084f, iIntValue);
            case 6:
                return ShortTextQuestionKt.ShortTextPhoneNumberPreview$lambda$11(this.f38396c, interfaceC1084f, iIntValue);
            default:
                return TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreenPreview$lambda$2(this.f38396c, interfaceC1084f, iIntValue);
        }
    }
}
