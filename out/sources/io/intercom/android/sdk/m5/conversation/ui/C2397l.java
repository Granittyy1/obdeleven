package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2397l implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39085b;

    public /* synthetic */ C2397l(int i10) {
        this.f39085b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39085b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$51((ComposerInputType) obj);
            case 1:
                return Integer.valueOf(BigTicketCardKt.BigTicketCard$lambda$1(((Integer) obj).intValue()));
            default:
                return SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
        }
    }
}
