package io.intercom.android.sdk.survey.model;

import I7.b;
import io.intercom.android.sdk.NotificationStatuses;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SubmitSurveyResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyResponse {
    public static final int $stable = 8;

    @b(NotificationStatuses.COMPLETE_STATUS)
    private final boolean complete;

    @b("next_step")
    private final SurveyData.Step nextStep;

    @b("survey_id")
    private final String surveyId;

    public SubmitSurveyResponse(boolean z10, SurveyData.Step nextStep, String surveyId) {
        i.e(nextStep, "nextStep");
        i.e(surveyId, "surveyId");
        this.complete = z10;
        this.nextStep = nextStep;
        this.surveyId = surveyId;
    }

    public static /* synthetic */ SubmitSurveyResponse copy$default(SubmitSurveyResponse submitSurveyResponse, boolean z10, SurveyData.Step step, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = submitSurveyResponse.complete;
        }
        if ((i10 & 2) != 0) {
            step = submitSurveyResponse.nextStep;
        }
        if ((i10 & 4) != 0) {
            str = submitSurveyResponse.surveyId;
        }
        return submitSurveyResponse.copy(z10, step, str);
    }

    public final boolean component1() {
        return this.complete;
    }

    public final SurveyData.Step component2() {
        return this.nextStep;
    }

    public final String component3() {
        return this.surveyId;
    }

    public final SubmitSurveyResponse copy(boolean z10, SurveyData.Step nextStep, String surveyId) {
        i.e(nextStep, "nextStep");
        i.e(surveyId, "surveyId");
        return new SubmitSurveyResponse(z10, nextStep, surveyId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyResponse)) {
            return false;
        }
        SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) obj;
        return this.complete == submitSurveyResponse.complete && i.a(this.nextStep, submitSurveyResponse.nextStep) && i.a(this.surveyId, submitSurveyResponse.surveyId);
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        return this.surveyId.hashCode() + ((this.nextStep.hashCode() + (Boolean.hashCode(this.complete) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitSurveyResponse(complete=");
        sb2.append(this.complete);
        sb2.append(", nextStep=");
        sb2.append(this.nextStep);
        sb2.append(", surveyId=");
        return B7.b.g(sb2, this.surveyId, ')');
    }
}
