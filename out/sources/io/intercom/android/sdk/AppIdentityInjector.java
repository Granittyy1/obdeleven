package io.intercom.android.sdk;

import Ia.p;
import android.app.Application;
import androidx.navigation.compose.K;
import com.google.android.gms.internal.measurement.M1;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.NexusClientUtilsKt;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import okhttp3.t;
import p037cb.C1518c0;
import p037cb.C1532j0;
import p293xa.r;
import retrofit2.w;

/* JADX INFO: compiled from: AppIdentityInjector.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppIdentityInjector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;
    private final p293xa.g api$delegate;
    private final p293xa.g appIdentity$delegate;
    private final A appIdentityScope;
    private final p293xa.g configurableHttpClient$delegate;
    private final p293xa.g externalUploadApi$delegate;
    private final p293xa.g gsonWithAdapters$delegate;
    private final p293xa.g helpCenterApi$delegate;
    private final p293xa.g hostname$delegate;
    private final p293xa.g httpClientWithoutHeaders$delegate;
    private final p293xa.g kotlinXRetrofit$delegate;
    private final p293xa.g legacyRetrofit$delegate;
    private final p293xa.g messengerApi$delegate;
    private final p293xa.g nexusClient$delegate;
    private final long nexusDebouncePeriod;
    private final p293xa.g retrofitWithoutHeaders$delegate;
    private final p293xa.g surveyApi$delegate;
    private final p293xa.g ticketApi$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: AppIdentityInjector.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppIdentityInjector.kt */
    @Aa.c(c = "io.intercom.android.sdk.AppIdentityInjector$initializeEvents$1", f = "AppIdentityInjector.kt", l = {me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_alertDialogStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return AppIdentityInjector.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                IntercomDataLayer dataLayer = AppIdentityInjector.this.getInjector().getDataLayer();
                kotlin.jvm.internal.i.d(dataLayer, "getDataLayer(...)");
                NexusClient nexusClient = AppIdentityInjector.this.getNexusClient();
                kotlin.jvm.internal.i.c(nexusClient, "null cannot be cast to non-null type io.intercom.android.sdk.NexusWrapper");
                this.label = 1;
                if (NexusClientUtilsKt.handleNexusClientLifecycle(dataLayer, (NexusWrapper) nexusClient, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public AppIdentityInjector(final Application application, final String apiKey, final String appId, final String str) {
        kotlin.jvm.internal.i.e(application, "application");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(appId, "appId");
        this.appIdentityScope = B.a(M1.a());
        this.appIdentity$delegate = kotlin.a.a(new Ia.a() { // from class: io.intercom.android.sdk.a
            @Override // Ia.a
            public final Object invoke() {
                return AppIdentityInjector.appIdentity_delegate$lambda$0(apiKey, appId, application);
            }
        });
        this.configurableHttpClient$delegate = kotlin.a.a(new g(application, 0, this));
        this.httpClientWithoutHeaders$delegate = kotlin.a.a(new Q9.a(3, application));
        this.hostname$delegate = kotlin.a.a(new Ia.a() { // from class: io.intercom.android.sdk.h
            @Override // Ia.a
            public final Object invoke() {
                return AppIdentityInjector.hostname_delegate$lambda$3(str, this, application);
            }
        });
        this.gsonWithAdapters$delegate = kotlin.a.a(new i());
        this.kotlinXRetrofit$delegate = kotlin.a.a(new b(0, this));
        this.legacyRetrofit$delegate = kotlin.a.a(new C1518c0(2, this));
        this.retrofitWithoutHeaders$delegate = kotlin.a.a(new Ya.d(1, this));
        this.api$delegate = kotlin.a.a(new c(application, 0, this));
        this.helpCenterApi$delegate = kotlin.a.a(new d(0, this));
        this.surveyApi$delegate = kotlin.a.a(new coil.decode.l(1, this));
        int i10 = 0;
        this.ticketApi$delegate = kotlin.a.a(new e(i10, this));
        this.externalUploadApi$delegate = kotlin.a.a(new f(i10, this));
        int i11 = 1;
        this.messengerApi$delegate = kotlin.a.a(new K(i11, this));
        this.nexusClient$delegate = kotlin.a.a(new C1532j0(i11, this));
        this.nexusDebouncePeriod = TimeUnit.SECONDS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Api api_delegate$lambda$8(Application application, AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(application, "$application");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        kotlin.jvm.internal.i.d(userIdentity, "getUserIdentity(...)");
        Provider<AppConfig> appConfigProvider = this$0.getInjector().getAppConfigProvider();
        kotlin.jvm.internal.i.d(appConfigProvider, "getAppConfigProvider(...)");
        OpsMetricTracker opsMetricTracker = this$0.getInjector().getOpsMetricTracker();
        kotlin.jvm.internal.i.d(opsMetricTracker, "getOpsMetricTracker(...)");
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        kotlin.jvm.internal.i.d(dataLayer, "getDataLayer(...)");
        UnreadConversationsTracker unreadConversationsTracker = this$0.getInjector().getUnreadConversationsTracker();
        kotlin.jvm.internal.i.d(unreadConversationsTracker, "getUnreadConversationsTracker(...)");
        Api apiCreateApi = apiFactory.createApi(application, appIdentity, userIdentity, appConfigProvider, opsMetricTracker, dataLayer, unreadConversationsTracker, this$0.getConfigurableHttpClient(), this$0.getMessengerApi());
        apiCreateApi.updateMaxRequests();
        return apiCreateApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppIdentity appIdentity_delegate$lambda$0(String apiKey, String appId, Application application) {
        kotlin.jvm.internal.i.e(apiKey, "$apiKey");
        kotlin.jvm.internal.i.e(appId, "$appId");
        kotlin.jvm.internal.i.e(application, "$application");
        AppIdentity appIdentityCreate = AppIdentity.create(apiKey, appId);
        appIdentityCreate.persist(application);
        return appIdentityCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t configurableHttpClient_delegate$lambda$1(Application application, AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(application, "$application");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        kotlin.jvm.internal.i.d(userIdentity, "getUserIdentity(...)");
        return apiFactory.createConfigurableHttpClient(application, appIdentity, userIdentity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalUploadApi externalUploadApi_delegate$lambda$12(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.getUploadApi(this$0.getRetrofitWithoutHeaders());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        Injector injector = Injector.get();
        kotlin.jvm.internal.i.d(injector, "get(...)");
        return injector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gsonWithAdapters_delegate$lambda$4() {
        return ApiFactory.INSTANCE.createGsonWithAdapters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HelpCenterApi helpCenterApi_delegate$lambda$9(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createHelpCenterApi(this$0.getKotlinXRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hostname_delegate$lambda$3(String str, AppIdentityInjector this$0, Application application) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(application, "$application");
        return str == null ? ApiFactory.INSTANCE.getServerUrl(this$0.getAppIdentity(), application) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t httpClientWithoutHeaders_delegate$lambda$2(Application application) {
        kotlin.jvm.internal.i.e(application, "$application");
        return ApiFactory.INSTANCE.createHttpClientWithoutHeaders(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w kotlinXRetrofit_delegate$lambda$5(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createKotlinXRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w legacyRetrofit_delegate$lambda$6(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createLegacyRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient(), this$0.getGsonWithAdapters());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessengerApi messengerApi_delegate$lambda$13(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createMessengerApi(this$0.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusWrapper nexusClient_delegate$lambda$14(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        t.a aVarDefaultOkHttpClientBuilder = NexusClient.defaultOkHttpClientBuilder();
        aVarDefaultOkHttpClientBuilder.b(new TaggingSocketFactory(SocketFactory.getDefault(), NEXUS_TRAFFIC_TAG));
        t tVar = new t(aVarDefaultOkHttpClientBuilder);
        Twig nexusTwig = LumberMill.getNexusTwig();
        kotlin.jvm.internal.i.d(nexusTwig, "getNexusTwig(...)");
        Api api = this$0.getApi();
        long j = this$0.nexusDebouncePeriod;
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        kotlin.jvm.internal.i.d(dataLayer, "getDataLayer(...)");
        return new NexusWrapper(nexusTwig, tVar, api, j, dataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w retrofitWithoutHeaders_delegate$lambda$7(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        String hostname = this$0.getHostname();
        t httpClientWithoutHeaders = this$0.getHttpClientWithoutHeaders();
        Gson gson = this$0.getInjector().getGson();
        kotlin.jvm.internal.i.d(gson, "getGson(...)");
        return apiFactory.createLegacyRetrofit(hostname, httpClientWithoutHeaders, gson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyApi surveyApi_delegate$lambda$10(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createSurveyApi(this$0.getLegacyRetrofit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TicketApi ticketApi_delegate$lambda$11(AppIdentityInjector this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        return ApiFactory.INSTANCE.createTicketApi(this$0.getLegacyRetrofit());
    }

    public final void destroy() {
        B.c(this.appIdentityScope, null);
    }

    public final Api getApi() {
        return (Api) this.api$delegate.getValue();
    }

    public final AppIdentity getAppIdentity() {
        Object value = this.appIdentity$delegate.getValue();
        kotlin.jvm.internal.i.d(value, "getValue(...)");
        return (AppIdentity) value;
    }

    public final t getConfigurableHttpClient() {
        return (t) this.configurableHttpClient$delegate.getValue();
    }

    public final ExternalUploadApi getExternalUploadApi() {
        return (ExternalUploadApi) this.externalUploadApi$delegate.getValue();
    }

    public final Gson getGsonWithAdapters() {
        return (Gson) this.gsonWithAdapters$delegate.getValue();
    }

    public final HelpCenterApi getHelpCenterApi() {
        return (HelpCenterApi) this.helpCenterApi$delegate.getValue();
    }

    public final String getHostname() {
        return (String) this.hostname$delegate.getValue();
    }

    public final t getHttpClientWithoutHeaders() {
        return (t) this.httpClientWithoutHeaders$delegate.getValue();
    }

    public final w getKotlinXRetrofit() {
        return (w) this.kotlinXRetrofit$delegate.getValue();
    }

    public final w getLegacyRetrofit() {
        return (w) this.legacyRetrofit$delegate.getValue();
    }

    public final MessengerApi getMessengerApi() {
        return (MessengerApi) this.messengerApi$delegate.getValue();
    }

    public final NexusClient getNexusClient() {
        return (NexusClient) this.nexusClient$delegate.getValue();
    }

    public final w getRetrofitWithoutHeaders() {
        return (w) this.retrofitWithoutHeaders$delegate.getValue();
    }

    public final SurveyApi getSurveyApi() {
        return (SurveyApi) this.surveyApi$delegate.getValue();
    }

    public final TicketApi getTicketApi() {
        return (TicketApi) this.ticketApi$delegate.getValue();
    }

    public final void initializeEvents() {
        C2680e.c(this.appIdentityScope, null, null, new AnonymousClass1(null), 3);
    }

    public /* synthetic */ AppIdentityInjector(Application application, String str, String str2, String str3, int i10, kotlin.jvm.internal.e eVar) {
        this(application, str, str2, (i10 & 8) != 0 ? null : str3);
    }
}
