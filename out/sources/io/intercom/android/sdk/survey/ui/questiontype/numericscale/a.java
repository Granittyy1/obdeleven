package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.l;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f39785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39786d;

    public /* synthetic */ a(p293xa.e eVar, Object obj, int i10) {
        this.f39784b = i10;
        this.f39785c = eVar;
        this.f39786d = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f39784b) {
            case 0:
                return EmojiQuestionKt.EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0((l) this.f39785c, (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) this.f39786d);
            default:
                return MediaPickerButtonKt.MediaPickerButton$lambda$5((Ia.a) this.f39785c, (androidx.activity.compose.e) this.f39786d);
        }
    }
}
