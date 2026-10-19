package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38449c;

    public /* synthetic */ A(int i10, Object obj) {
        this.f38448b = i10;
        this.f38449c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38448b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$33((ConversationViewModel) this.f38449c, (Part) obj);
            case 1:
                return ((OverlayPresenter) this.f38449c).lambda$new$3((IntercomEvent) obj);
            default:
                return LoadingComponentKt.SurveyLoading$lambda$2$lambda$1((SurveyState.Loading) this.f38449c, (Context) obj);
        }
    }
}
