package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.TeammateSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2281g0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38363c;

    public /* synthetic */ C2281g0(int i10, int i11) {
        this.f38362b = i11;
        this.f38363c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38362b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return FooterNoticeKt.FooterNoticePillMultipleAvatarsPreview$lambda$14(this.f38363c, interfaceC1084f, iIntValue);
            case 1:
                return TeammateSheetContentKt.TeammateSheetContentPreview$lambda$2(this.f38363c, interfaceC1084f, iIntValue);
            case 2:
                return NoteCardRowKt.NoteCardRowPreview$lambda$1(this.f38363c, interfaceC1084f, iIntValue);
            case 3:
                return InboxContentScreenItemsKt.InboxContentScreenPreview$lambda$0(this.f38363c, interfaceC1084f, iIntValue);
            case 4:
                return LongTextQuestionKt.LongTextPreview$lambda$7(this.f38363c, interfaceC1084f, iIntValue);
            case 5:
                return TicketDetailContentKt.TicketPreview$lambda$20(this.f38363c, interfaceC1084f, iIntValue);
            default:
                return ListAttributeCollectorKt.DisabledListAttributePreview$lambda$12(this.f38363c, interfaceC1084f, iIntValue);
        }
    }
}
