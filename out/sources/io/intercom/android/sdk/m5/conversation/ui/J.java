package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.survey.QuestionState;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38461c;

    public /* synthetic */ J(int i10, Object obj) {
        this.f38460b = i10;
        this.f38461c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38460b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$43((ConversationViewModel) this.f38461c);
            case 1:
                return QuestionState.answer_delegate$lambda$0((QuestionState) this.f38461c);
            default:
                p141l2.w wVar = (p141l2.w) this.f38461c;
                wVar.getClass();
                p141l2.Q navigatorProvider = wVar.f44310b.f44802s;
                Context context = wVar.f44309a;
                kotlin.jvm.internal.i.e(context, "context");
                kotlin.jvm.internal.i.e(navigatorProvider, "navigatorProvider");
                return new p141l2.I();
        }
    }
}
