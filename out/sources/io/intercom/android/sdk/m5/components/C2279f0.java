package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.AddFileButtonKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2279f0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38359c;

    public /* synthetic */ C2279f0(int i10, int i11) {
        this.f38358b = i11;
        this.f38359c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38358b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return FooterNoticeKt.ExpandedTitleOnlyFooterNoticePreview$lambda$12(this.f38359c, interfaceC1084f, iIntValue);
            case 1:
                return SearchBrowseCardKt.PreviewSearchBrowseNoSearchFirst$lambda$3(this.f38359c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationScreenKt.ConversationScreenContentPreview$lambda$81(this.f38359c, interfaceC1084f, iIntValue);
            case 3:
                return MessageMetadataKt.MessageMetadataLongTextPreview$lambda$7(this.f38359c, interfaceC1084f, iIntValue);
            case 4:
                return TicketLinksCardKt.ExternalLinkCardPreview$lambda$1(this.f38359c, interfaceC1084f, iIntValue);
            case 5:
                return AddFileButtonKt.AddFileButtonPreview$lambda$2(this.f38359c, interfaceC1084f, iIntValue);
            case 6:
                return UploadFileQuestionKt.UploadFileQuestionPreview$lambda$2(this.f38359c, interfaceC1084f, iIntValue);
            default:
                return ListAttributeCollectorKt.SubmittedAndDisabledListAttributePreview$lambda$13(this.f38359c, interfaceC1084f, iIntValue);
        }
    }
}
