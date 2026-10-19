package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38459c;

    public /* synthetic */ I(int i10, Object obj) {
        this.f38458b = i10;
        this.f38459c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38458b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$42$lambda$41((Ia.l) this.f38459c, (String) obj);
            case 1:
                return HomeHeaderKt.HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4((androidx.compose.runtime.X) this.f38459c, ((Boolean) obj).booleanValue());
            default:
                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$3$lambda$2$lambda$1((QuestionState) this.f38459c, (androidx.compose.ui.focus.y) obj);
        }
    }
}
