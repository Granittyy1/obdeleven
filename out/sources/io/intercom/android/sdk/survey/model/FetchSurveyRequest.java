package io.intercom.android.sdk.survey.model;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FetchSurveyRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FetchSurveyRequest {
    public static final int $stable = 8;

    @b("survey")
    private final SurveyData survey;

    public FetchSurveyRequest(SurveyData survey) {
        i.e(survey, "survey");
        this.survey = survey;
    }

    public static /* synthetic */ FetchSurveyRequest copy$default(FetchSurveyRequest fetchSurveyRequest, SurveyData surveyData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyData = fetchSurveyRequest.survey;
        }
        return fetchSurveyRequest.copy(surveyData);
    }

    public final SurveyData component1() {
        return this.survey;
    }

    public final FetchSurveyRequest copy(SurveyData survey) {
        i.e(survey, "survey");
        return new FetchSurveyRequest(survey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchSurveyRequest) && i.a(this.survey, ((FetchSurveyRequest) obj).survey);
    }

    public final SurveyData getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return this.survey.hashCode();
    }

    public String toString() {
        return "FetchSurveyRequest(survey=" + this.survey + ')';
    }
}
