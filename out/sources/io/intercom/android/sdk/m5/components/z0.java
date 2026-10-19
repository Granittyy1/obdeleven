package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38442c;

    public /* synthetic */ z0(int i10, int i11) {
        this.f38441b = i11;
        this.f38442c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38441b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return IntercomPrimaryButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$4(this.f38442c, interfaceC1084f, iIntValue);
            case 1:
                return AvatarIconKt.BotAvatarPreview$lambda$26(this.f38442c, interfaceC1084f, iIntValue);
            case 2:
                return AnswerInfoDialogKt.AnswerInfoWithoutExternalLinkPreview$lambda$3(this.f38442c, interfaceC1084f, iIntValue);
            case 3:
                return LazyMessageListKt.LazyMessageListPreview$lambda$28(this.f38442c, interfaceC1084f, iIntValue);
            case 4:
                return TypingIndicatorKt.TypingIndicatorWithoutAvatarPreview$lambda$12(this.f38442c, interfaceC1084f, iIntValue);
            case 5:
                return TeamPresenceComponentKt.TeamPresenceWithBubblePreview$lambda$13(this.f38442c, interfaceC1084f, iIntValue);
            case 6:
                return TextBlockKt.SubheadingTextBlockPreview$lambda$28(this.f38442c, interfaceC1084f, iIntValue);
            case 7:
                return FileAttachmentListKt.FileAttachmentListPreview$lambda$5(this.f38442c, interfaceC1084f, iIntValue);
            default:
                return BooleanAttributeCollectorKt.SubmittedAndDisabledBooleanAttributePreview$lambda$13(this.f38442c, interfaceC1084f, iIntValue);
        }
    }
}
