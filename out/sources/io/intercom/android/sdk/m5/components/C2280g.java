package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2280g implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38361c;

    public /* synthetic */ C2280g(int i10, int i11) {
        this.f38360b = i11;
        this.f38361c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38360b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarTriangleGroupKt.SingleAvatarPreview$lambda$6(this.f38361c, interfaceC1084f, iIntValue);
            case 1:
                return IntercomErrorScreenKt.ErrorScreenWithoutCTAPreview$lambda$2(this.f38361c, interfaceC1084f, iIntValue);
            case 2:
                return TopActionBarKt.TopActionBarTitlePreview$lambda$16(this.f38361c, interfaceC1084f, iIntValue);
            case 3:
                return SpecialNoticeKt.SpecialNoticePreview$lambda$2(this.f38361c, interfaceC1084f, iIntValue);
            case 4:
                return HomeHeaderBackdropKt.GradientHeaderBackdropWithFadePreview$lambda$7(this.f38361c, interfaceC1084f, iIntValue);
            case 5:
                return FileActionSheetKt.FileActionSheetUploadingPreview$lambda$7(this.f38361c, interfaceC1084f, iIntValue);
            case 6:
                return TicketProgressIndicatorKt.TicketProgressIndicatorPreview$lambda$9(this.f38361c, interfaceC1084f, iIntValue);
            case 7:
                return CreateTicketCardKt.DisabledCreateTicketCardPreview$lambda$2(this.f38361c, interfaceC1084f, iIntValue);
            case 8:
                return AttributeCollectorCardKt.BooleanAttributeCard$lambda$2(this.f38361c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.DisabledTextAttributePreview$lambda$15(this.f38361c, interfaceC1084f, iIntValue);
        }
    }
}
