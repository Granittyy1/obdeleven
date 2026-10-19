package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38711d;

    public /* synthetic */ f0(Object obj, int i10, Object obj2) {
        this.f38709b = i10;
        this.f38710c = obj;
        this.f38711d = obj2;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f38709b) {
            case 0:
                return VoiceInputLayoutKt.VoiceInputLayout_Denoh9s$lambda$10((Context) this.f38710c, (androidx.compose.runtime.X) this.f38711d);
            default:
                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5((SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) this.f38710c, (Ia.l) this.f38711d);
        }
    }
}
