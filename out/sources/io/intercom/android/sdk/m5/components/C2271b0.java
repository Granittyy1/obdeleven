package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadProgressComponentKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsErrorScreenKt;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2271b0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38333c;

    public /* synthetic */ C2271b0(int i10, int i11) {
        this.f38332b = i11;
        this.f38333c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38332b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return FooterNoticeKt.FooterNoticePillPreview$lambda$13(this.f38333c, interfaceC1084f, iIntValue);
            case 1:
                return SearchBrowseCardKt.PreviewSearchBrowse$lambda$1(this.f38333c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationScreenKt.NewConversationScreenContentPreview$lambda$82(this.f38333c, interfaceC1084f, iIntValue);
            case 3:
                return MessageMetadataKt.MessageMetadataPreview$lambda$6(this.f38333c, interfaceC1084f, iIntValue);
            case 4:
                return ArticleCountComponentKt.ArticleCountComponentPreview$lambda$1(this.f38333c, interfaceC1084f, iIntValue);
            case 5:
                return NewConversationCardKt.NewConversationCardTeammatePreview$lambda$3(this.f38333c, interfaceC1084f, iIntValue);
            case 6:
                return ChatFullNotificationKt.ChatFullNotificationBotPreview$lambda$8(this.f38333c, interfaceC1084f, iIntValue);
            case 7:
                return TextBlockKt.UnorderedListTextBlockPreview$lambda$31(this.f38333c, interfaceC1084f, iIntValue);
            case 8:
                return FileUploadProgressComponentKt.UploadingActionSheetContentPreview$lambda$2(this.f38333c, interfaceC1084f, iIntValue);
            case 9:
                return TicketsErrorScreenKt.TicketsErrorScreenWithoutCTAPreview$lambda$2(this.f38333c, interfaceC1084f, iIntValue);
            case 10:
                return IntercomTopBarKt.IntercomTopBarPreviewWithoutNavIcon$lambda$9(this.f38333c, interfaceC1084f, iIntValue);
            default:
                return BooleanAttributeCollectorKt.SubmittedBooleanAttributePreview$lambda$11(this.f38333c, interfaceC1084f, iIntValue);
        }
    }
}
