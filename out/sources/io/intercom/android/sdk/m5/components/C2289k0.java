package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.survey.block.CodeBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2289k0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38389c;

    public /* synthetic */ C2289k0(int i10, int i11) {
        this.f38388b = i11;
        this.f38389c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38388b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HomeCardScaffoldKt.HomeCardScaffoldPreview$lambda$1(this.f38389c, interfaceC1084f, iIntValue);
            case 1:
                return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsASItemPreview$lambda$8(this.f38389c, interfaceC1084f, iIntValue);
            case 2:
                return InboxEmptyScreenKt.EmptyScreenMessagePreview$lambda$1(this.f38389c, interfaceC1084f, iIntValue);
            case 3:
                return CodeBlockKt.CodeBlockPreview$lambda$2(this.f38389c, interfaceC1084f, iIntValue);
            case 4:
                return EmojiRatingKt.SelectedEmoji$lambda$3(this.f38389c, interfaceC1084f, iIntValue);
            default:
                return MediaPickerButtonKt.MediaPickerButtonPreview$lambda$8(this.f38389c, interfaceC1084f, iIntValue);
        }
    }
}
