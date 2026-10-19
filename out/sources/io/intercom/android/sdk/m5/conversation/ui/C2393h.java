package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2393h implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.X f39035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39036d;

    public /* synthetic */ C2393h(Object obj, androidx.compose.runtime.X x10, int i10) {
        this.f39034b = i10;
        this.f39036d = obj;
        this.f39035c = x10;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39034b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$78((kotlinx.coroutines.A) this.f39036d, this.f39035c);
            default:
                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3((Ia.l) this.f39036d, this.f39035c);
        }
    }
}
