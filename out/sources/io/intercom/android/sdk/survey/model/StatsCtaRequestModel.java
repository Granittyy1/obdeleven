package io.intercom.android.sdk.survey.model;

import I7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: StatsCtaRequestModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StatsCtaRequestModel {
    public static final int $stable = 0;

    @b("step_id")
    private final String stepId;

    @b("survey_progress_id")
    private final String surveyProgressId;

    public StatsCtaRequestModel(String surveyProgressId, String stepId) {
        i.e(surveyProgressId, "surveyProgressId");
        i.e(stepId, "stepId");
        this.surveyProgressId = surveyProgressId;
        this.stepId = stepId;
    }

    public static /* synthetic */ StatsCtaRequestModel copy$default(StatsCtaRequestModel statsCtaRequestModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsCtaRequestModel.surveyProgressId;
        }
        if ((i10 & 2) != 0) {
            str2 = statsCtaRequestModel.stepId;
        }
        return statsCtaRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.stepId;
    }

    public final StatsCtaRequestModel copy(String surveyProgressId, String stepId) {
        i.e(surveyProgressId, "surveyProgressId");
        i.e(stepId, "stepId");
        return new StatsCtaRequestModel(surveyProgressId, stepId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCtaRequestModel)) {
            return false;
        }
        StatsCtaRequestModel statsCtaRequestModel = (StatsCtaRequestModel) obj;
        return i.a(this.surveyProgressId, statsCtaRequestModel.surveyProgressId) && i.a(this.stepId, statsCtaRequestModel.stepId);
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.surveyProgressId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsCtaRequestModel(surveyProgressId=");
        sb2.append(this.surveyProgressId);
        sb2.append(", stepId=");
        return B7.b.g(sb2, this.stepId, ')');
    }
}
