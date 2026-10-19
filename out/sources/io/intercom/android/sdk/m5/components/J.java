package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.survey.ui.components.ErrorComponentKt;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38182c;

    public /* synthetic */ J(int i10, int i11) {
        this.f38181b = i11;
        this.f38182c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38181b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationEndedCardKt.ConversationEndedCardWithButtonBotPreview$lambda$3(this.f38182c, interfaceC1084f, iIntValue);
            case 1:
                return HomeItemKt.HomeTicketsPreview$lambda$13(this.f38182c, interfaceC1084f, iIntValue);
            case 2:
                return HelpCenterErrorScreenKt.HelpCenterErrorScreenWithCTAPreview$lambda$1(this.f38182c, interfaceC1084f, iIntValue);
            case 3:
                return ErrorComponentKt.ErrorStateWithoutCTA$lambda$4(this.f38182c, interfaceC1084f, iIntValue);
            case 4:
                return SurveyTopBarComponentKt.NoTopBar$lambda$12(this.f38182c, interfaceC1084f, iIntValue);
            default:
                return TextInputPillKt.TextInputPillError$lambda$7(this.f38182c, interfaceC1084f, iIntValue);
        }
    }
}
