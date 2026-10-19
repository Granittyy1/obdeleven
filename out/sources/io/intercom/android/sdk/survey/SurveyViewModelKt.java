package io.intercom.android.sdk.survey;

import Q3.d;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyViewModelKt {
    public static final SurveyUiColors toSurveyUiColors(SurveyCustomization surveyCustomization) {
        i.e(surveyCustomization, "<this>");
        long jD = d.d(ColorUtils.parseColor(surveyCustomization.getBackgroundColor()));
        long jD2 = d.d(ColorUtils.parseColor(surveyCustomization.getButtonColor()));
        return new SurveyUiColors(jD, ColorExtensionsKt.m658generateTextColor8_81llA(jD), jD2, ColorExtensionsKt.m658generateTextColor8_81llA(jD2), null, 16, null);
    }
}
