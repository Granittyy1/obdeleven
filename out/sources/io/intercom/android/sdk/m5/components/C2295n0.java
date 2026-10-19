package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.home.ui.HomeErrorContentKt;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2295n0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38398c;

    public /* synthetic */ C2295n0(int i10, int i11) {
        this.f38397b = i11;
        this.f38398c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38397b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HomeItemKt.HomeSendMessagePreview$lambda$11(this.f38398c, interfaceC1084f, iIntValue);
            case 1:
                return TextWithSeparatorKt.TextWithSeparatorSecondEmptyPreview$lambda$4(this.f38398c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationBottomBarKt.MessageComposerPreview$lambda$3(this.f38398c, interfaceC1084f, iIntValue);
            case 3:
                return HelpCenterErrorScreenKt.HelpCenterErrorScreenWithoutCTAPreview$lambda$2(this.f38398c, interfaceC1084f, iIntValue);
            case 4:
                return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponentPreview$lambda$7(this.f38398c, interfaceC1084f, iIntValue);
            case 5:
                return HomeErrorContentKt.HomeErrorContentWithoutCTAPreview$lambda$2(this.f38398c, interfaceC1084f, iIntValue);
            case 6:
                return CircularAvatarComponentKt.PreviewDefaultAvatar$lambda$7(this.f38398c, interfaceC1084f, iIntValue);
            case 7:
                return NumericRatingCellKt.DarkFilledCell$lambda$4(this.f38398c, interfaceC1084f, iIntValue);
            default:
                return ShortTextQuestionKt.ShortTextPreview$lambda$9(this.f38398c, interfaceC1084f, iIntValue);
        }
    }
}
