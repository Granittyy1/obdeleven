package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxErrorScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.component.PulsatingBoxKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2270b implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38331c;

    public /* synthetic */ C2270b(int i10, int i11) {
        this.f38330b = i11;
        this.f38331c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38330b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarGroupKt.AvatarGroupWithMixedShapesPreview$lambda$4(this.f38331c, interfaceC1084f, iIntValue);
            case 1:
                return ConversationEndedCardKt.ConversationMergedCardPreview$lambda$4(this.f38331c, interfaceC1084f, iIntValue);
            case 2:
                return TicketHeaderKt.TicketHeaderLongTextPreview$lambda$4(this.f38331c, interfaceC1084f, iIntValue);
            case 3:
                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemDotPreview$lambda$9(this.f38331c, interfaceC1084f, iIntValue);
            case 4:
                return BottomBarButtonComponentKt.BottomBarButtonComponentPreviewMediaOnly$lambda$9(this.f38331c, interfaceC1084f, iIntValue);
            case 5:
                return CollectionRowComponentKt.RowWithNoDescriptionPreview$lambda$7(this.f38331c, interfaceC1084f, iIntValue);
            case 6:
                return InboxErrorScreenKt.InboxErrorScreenWithCTAPreview$lambda$1(this.f38331c, interfaceC1084f, iIntValue);
            case 7:
                return NumericRatingCellKt.EmptyCell$lambda$2(this.f38331c, interfaceC1084f, iIntValue);
            case 8:
                return TextInputPillKt.TextInputPillDisabled$lambda$8(this.f38331c, interfaceC1084f, iIntValue);
            case 9:
                return TicketProgressBannerKt.TicketProgressRowLongTextPreview$lambda$2(this.f38331c, interfaceC1084f, iIntValue);
            case 10:
                return PulsatingBoxKt.PulsatingBoxPreview$lambda$2(this.f38331c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.SubmittedTextAttributePreview$lambda$14(this.f38331c, interfaceC1084f, iIntValue);
        }
    }
}
