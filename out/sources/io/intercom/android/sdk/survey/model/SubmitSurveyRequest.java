package io.intercom.android.sdk.survey.model;

import B1.a;
import I7.b;
import Q8.d;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SubmitSurveyRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyRequest {
    public static final int $stable = 8;

    @b("current_step_id")
    private final String currentStepId;

    @b("responses")
    private final List<SubmitSurveyRequestItem> responses;

    @b("survey_progress_id")
    private final String surveyProgressId;

    public SubmitSurveyRequest(String surveyProgressId, String currentStepId, List<SubmitSurveyRequestItem> responses) {
        i.e(surveyProgressId, "surveyProgressId");
        i.e(currentStepId, "currentStepId");
        i.e(responses, "responses");
        this.surveyProgressId = surveyProgressId;
        this.currentStepId = currentStepId;
        this.responses = responses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequest copy$default(SubmitSurveyRequest submitSurveyRequest, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitSurveyRequest.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = submitSurveyRequest.currentStepId;
        }
        if ((i10 & 4) != 0) {
            list = submitSurveyRequest.responses;
        }
        return submitSurveyRequest.copy(str, str2, list);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> component3() {
        return this.responses;
    }

    public final SubmitSurveyRequest copy(String surveyProgressId, String currentStepId, List<SubmitSurveyRequestItem> responses) {
        i.e(surveyProgressId, "surveyProgressId");
        i.e(currentStepId, "currentStepId");
        i.e(responses, "responses");
        return new SubmitSurveyRequest(surveyProgressId, currentStepId, responses);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequest)) {
            return false;
        }
        SubmitSurveyRequest submitSurveyRequest = (SubmitSurveyRequest) obj;
        return i.a(this.surveyProgressId, submitSurveyRequest.surveyProgressId) && i.a(this.currentStepId, submitSurveyRequest.currentStepId) && i.a(this.responses, submitSurveyRequest.responses);
    }

    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> getResponses() {
        return this.responses;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return this.responses.hashCode() + a.b(this.currentStepId, this.surveyProgressId.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitSurveyRequest(surveyProgressId=");
        sb2.append(this.surveyProgressId);
        sb2.append(", currentStepId=");
        sb2.append(this.currentStepId);
        sb2.append(", responses=");
        return d.b(sb2, this.responses, ')');
    }
}
