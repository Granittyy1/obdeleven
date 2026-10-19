package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.N0;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38086c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f38085b = i10;
        this.f38086c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38085b) {
            case 0:
                return IntercomArticleActivity.viewModel_delegate$lambda$2((IntercomArticleActivity) this.f38086c);
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$30((ConversationViewModel) this.f38086c);
            default:
                return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3((N0) this.f38086c));
        }
    }
}
