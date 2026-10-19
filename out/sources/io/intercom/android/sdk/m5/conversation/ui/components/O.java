package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38555c;

    public /* synthetic */ O(int i10, int i11) {
        this.f38554b = i11;
        this.f38555c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38554b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return MessageListKt.MessageListPreview$lambda$41(this.f38555c, interfaceC1084f, iIntValue);
            case 1:
                return HomeHeaderBackdropKt.ConsistentFadeBehaviorPreview$lambda$10(this.f38555c, interfaceC1084f, iIntValue);
            case 2:
                return TextBlockKt.InlineSourcesTextBlockPreview$lambda$32(this.f38555c, interfaceC1084f, iIntValue);
            case 3:
                return QuestionHeaderComponentKt.HeaderWithError$lambda$7(this.f38555c, interfaceC1084f, iIntValue);
            case 4:
                return StarRatingKt.UnSelectedStar$lambda$5(this.f38555c, interfaceC1084f, iIntValue);
            case 5:
                return TicketTimelineCardKt.InProgressTicketTimelineWithLabelPreview$lambda$6(this.f38555c, interfaceC1084f, iIntValue);
            case 6:
                return CreateTicketContentScreenKt.CreateTicketErrorPreview$lambda$7(this.f38555c, interfaceC1084f, iIntValue);
            default:
                return IntercomButtonKt.OutlinedButtonPreview$lambda$3(this.f38555c, interfaceC1084f, iIntValue);
        }
    }
}
