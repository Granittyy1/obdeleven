package io.intercom.android.sdk.survey;

import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SurveyRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyRepository {
    public static final int $stable = 8;
    private final SurveyApi surveyApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object dismissSurvey(String str, String str2, c<? super NetworkResponse<r>> cVar) {
        return this.surveyApi.dismissSurvey(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(x.o(new Pair("survey_progress_id", str2))), cVar);
    }

    public final Object fetchSurvey(String str, c<? super NetworkResponse<FetchSurveyRequest>> cVar) {
        return this.surveyApi.fetchSurvey(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), cVar);
    }

    public final Object reportFailure(String str, String str2, c<? super NetworkResponse<r>> cVar) {
        return this.surveyApi.reportFailure(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(x.o(new Pair("survey_progress_id", str2))), cVar);
    }

    public final Object submitCtaStat(String str, StatsCtaRequestModel statsCtaRequestModel, c<? super r> cVar) {
        Object objD = new Gson().d(Map.class, new Gson().h(statsCtaRequestModel));
        i.c(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Object objSubmitCtaStat = this.surveyApi.submitCtaStat(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objD), cVar);
        return objSubmitCtaStat == CoroutineSingletons.f43038b ? objSubmitCtaStat : r.f47939a;
    }

    public final Object submitSurvey(SubmitSurveyRequest submitSurveyRequest, String str, c<? super NetworkResponse<SubmitSurveyResponse>> cVar) {
        Object objD = new Gson().d(Map.class, new Gson().h(submitSurveyRequest));
        i.c(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return this.surveyApi.submitSurveyStep(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objD), cVar);
    }

    public SurveyRepository(SurveyApi surveyApi) {
        i.e(surveyApi, "surveyApi");
        this.surveyApi = surveyApi;
    }

    public /* synthetic */ SurveyRepository(SurveyApi surveyApi, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getSurveyApi() : surveyApi);
    }
}
