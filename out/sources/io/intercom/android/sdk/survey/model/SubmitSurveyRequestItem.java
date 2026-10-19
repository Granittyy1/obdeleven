package io.intercom.android.sdk.survey.model;

import I7.b;
import Q8.d;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SubmitSurveyRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyRequestItem {
    public static final int $stable = 8;

    @b("question_id")
    private final String questionId;

    @b("response")
    private final List<String> response;

    public SubmitSurveyRequestItem(String questionId, List<String> response) {
        i.e(questionId, "questionId");
        i.e(response, "response");
        this.questionId = questionId;
        this.response = response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequestItem copy$default(SubmitSurveyRequestItem submitSurveyRequestItem, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitSurveyRequestItem.questionId;
        }
        if ((i10 & 2) != 0) {
            list = submitSurveyRequestItem.response;
        }
        return submitSurveyRequestItem.copy(str, list);
    }

    public final String component1() {
        return this.questionId;
    }

    public final List<String> component2() {
        return this.response;
    }

    public final SubmitSurveyRequestItem copy(String questionId, List<String> response) {
        i.e(questionId, "questionId");
        i.e(response, "response");
        return new SubmitSurveyRequestItem(questionId, response);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequestItem)) {
            return false;
        }
        SubmitSurveyRequestItem submitSurveyRequestItem = (SubmitSurveyRequestItem) obj;
        return i.a(this.questionId, submitSurveyRequestItem.questionId) && i.a(this.response, submitSurveyRequestItem.response);
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final List<String> getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.questionId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitSurveyRequestItem(questionId=");
        sb2.append(this.questionId);
        sb2.append(", response=");
        return d.b(sb2, this.response, ')');
    }
}
