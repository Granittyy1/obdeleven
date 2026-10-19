package io.intercom.android.sdk.api;

import gc.o;
import gc.s;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import okhttp3.y;
import p293xa.r;

/* JADX INFO: compiled from: SurveyApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SurveyApi {
    @o("surveys/{surveyId}/dismiss")
    Object dismissSurvey(@s("surveyId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<r>> cVar);

    @o("surveys/{surveyId}/fetch")
    Object fetchSurvey(@s("surveyId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<FetchSurveyRequest>> cVar);

    @o("surveys/{survey_id}/failure")
    Object reportFailure(@s("survey_id") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<r>> cVar);

    @o("surveys/{surveyId}/action_button_clicked")
    Object submitCtaStat(@s("surveyId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<r>> cVar);

    @o("surveys/{surveyId}/submit")
    Object submitSurveyStep(@s("surveyId") String str, @gc.a y yVar, kotlin.coroutines.c<? super NetworkResponse<SubmitSurveyResponse>> cVar);
}
