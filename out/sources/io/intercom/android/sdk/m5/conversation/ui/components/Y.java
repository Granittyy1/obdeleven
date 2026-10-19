package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterEmptyScreenKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38601c;

    public /* synthetic */ Y(int i10, int i11) {
        this.f38600b = i11;
        this.f38601c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38600b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return UploadSizeLimitDialogKt.UploadSizeLimitDialogPreview$lambda$4(this.f38601c, interfaceC1084f, iIntValue);
            case 1:
                return HelpCenterEmptyScreenKt.InboxEmptyScreenPreview$lambda$2(this.f38601c, interfaceC1084f, iIntValue);
            case 2:
                return InboxEmptyScreenKt.EmptyScreenWithoutActionPreview$lambda$3(this.f38601c, interfaceC1084f, iIntValue);
            case 3:
                return EmojiRatingKt.UnSelectedEmoji$lambda$4(this.f38601c, interfaceC1084f, iIntValue);
            default:
                return PermissionDeniedDialogKt.PermissionDeniedDialogPreview$lambda$3(this.f38601c, interfaceC1084f, iIntValue);
        }
    }
}
