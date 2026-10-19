package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38262c;

    public /* synthetic */ Y(int i10, int i11) {
        this.f38261b = i11;
        this.f38262c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38261b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return EmptyStateKt.EmptyStateWithOutlinedButtonPreview$lambda$6(this.f38262c, interfaceC1084f, iIntValue);
            case 1:
                return PoweredByBadgeKt.TransparentPoweredByBadgePreview$lambda$3(this.f38262c, interfaceC1084f, iIntValue);
            case 2:
                return AvatarIconKt.AvatarIconSquirclePreview$lambda$24(this.f38262c, interfaceC1084f, iIntValue);
            case 3:
                return FinStreamingRowKt.FinStreamingRowPreview$lambda$10(this.f38262c, interfaceC1084f, iIntValue);
            case 4:
                return HomeHeaderKt.HomeErrorHeaderPreview$lambda$20(this.f38262c, interfaceC1084f, iIntValue);
            case 5:
                return ChatFullNotificationKt.ChatFullNotificationTicketPreview$lambda$9(this.f38262c, interfaceC1084f, iIntValue);
            case 6:
                return DropDownQuestionKt.DropDownQuestionPreview$lambda$12(this.f38262c, interfaceC1084f, iIntValue);
            default:
                return RecentTicketsCardKt.RecentTicketsCardPreview$lambda$2(this.f38262c, interfaceC1084f, iIntValue);
        }
    }
}
