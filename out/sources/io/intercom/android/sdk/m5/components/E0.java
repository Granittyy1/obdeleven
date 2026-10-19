package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.survey.block.AttachmentBlockKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsErrorScreenKt;
import io.intercom.android.sdk.ui.component.JumpToBottomKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38165c;

    public /* synthetic */ E0(int i10, int i11) {
        this.f38164b = i11;
        this.f38165c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38164b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestions$lambda$2(this.f38165c, interfaceC1084f, iIntValue);
            case 1:
                return MergedConversationRowKt.MergedConversationRowPreview$lambda$5(this.f38165c, interfaceC1084f, iIntValue);
            case 2:
                return AttachmentBlockKt.AttachmentBlockPreview$lambda$7(this.f38165c, interfaceC1084f, iIntValue);
            case 3:
                return TextBlockKt.TextBlockWithSuffixPreview$lambda$29(this.f38165c, interfaceC1084f, iIntValue);
            case 4:
                return ChoicePillKt.EmptyPill$lambda$5(this.f38165c, interfaceC1084f, iIntValue);
            case 5:
                return TicketsErrorScreenKt.TicketsErrorScreenWithCTAPreview$lambda$1(this.f38165c, interfaceC1084f, iIntValue);
            case 6:
                return JumpToBottomKt.JumpToBottomPreview$lambda$1(this.f38165c, interfaceC1084f, iIntValue);
            default:
                return BooleanAttributeCollectorKt.DisabledBooleanAttributePreview$lambda$12(this.f38165c, interfaceC1084f, iIntValue);
        }
    }
}
