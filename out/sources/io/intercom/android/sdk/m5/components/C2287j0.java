package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2287j0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38380c;

    public /* synthetic */ C2287j0(int i10, int i11) {
        this.f38379b = i11;
        this.f38380c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38379b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return FooterNoticeKt.ExpandedFooterNoticePreview$lambda$10(this.f38380c, interfaceC1084f, iIntValue);
            case 1:
                return TeamPresenceRowKt.TeamPresenceRowPreview$lambda$2(this.f38380c, interfaceC1084f, iIntValue);
            case 2:
                return ArticleRowComponentKt.ArticleRowComponentLongTextPreview$lambda$6(this.f38380c, interfaceC1084f, iIntValue);
            case 3:
                return SurveyCtaButtonComponentKt.LightButtonPreview$lambda$8(this.f38380c, interfaceC1084f, iIntValue);
            case 4:
                return ChoicePillKt.SelectedPill$lambda$6(this.f38380c, interfaceC1084f, iIntValue);
            default:
                return TicketDetailErrorScreenKt.TicketDetailErrorScreenWithCTAPreview$lambda$1(this.f38380c, interfaceC1084f, iIntValue);
        }
    }
}
