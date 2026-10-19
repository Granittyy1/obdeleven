package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxLoadingScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38203c;

    public /* synthetic */ L(int i10, int i11) {
        this.f38202b = i11;
        this.f38203c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38202b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationEndedCardKt.ConversationEndedCardWithButtonPreview$lambda$2(this.f38203c, interfaceC1084f, iIntValue);
            case 1:
                return TopActionBarKt.TopActionBarEndContentPreview$lambda$17(this.f38203c, interfaceC1084f, iIntValue);
            case 2:
                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemPreview$lambda$8(this.f38203c, interfaceC1084f, iIntValue);
            case 3:
                return BottomBarButtonComponentKt.BottomBarButtonComponentPreview$lambda$7(this.f38203c, interfaceC1084f, iIntValue);
            case 4:
                return GifGridKt.PreviewGifGrid$lambda$16(this.f38203c, interfaceC1084f, iIntValue);
            case 5:
                return EventRowKt.ParticipantAddedRowPreview$lambda$2(this.f38203c, interfaceC1084f, iIntValue);
            case 6:
                return HelpCenterLoadingScreenKt.HomeLoadingContentPreview$lambda$4(this.f38203c, interfaceC1084f, iIntValue);
            case 7:
                return InboxLoadingScreenKt.InboxLoadingScreen$lambda$0(this.f38203c, interfaceC1084f, iIntValue);
            default:
                return NumericRatingQuestionKt.StarQuestionPreview$lambda$15(this.f38203c, interfaceC1084f, iIntValue);
        }
    }
}
