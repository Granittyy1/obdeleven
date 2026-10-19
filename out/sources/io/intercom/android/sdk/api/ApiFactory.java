package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.Excluder;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import java.io.EOFException;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import okhttp3.C2752c;
import okhttp3.t;
import retrofit2.h;
import retrofit2.w;

/* JADX INFO: compiled from: ApiFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiFactory {
    public static final int $stable = 0;
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;
    private static final String ENDPOINT = "/messenger/mobile/";
    public static final ApiFactory INSTANCE = new ApiFactory();
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";
    private static final String PROTOCOL = "https://";

    private ApiFactory() {
    }

    private final String getCorrectServerHostname(int i10, Context context) {
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (i10 == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) || i10 == 0) {
            LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return PARTIAL_HOSTNAME_US;
        }
        LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return "";
    }

    private final RuntimeTypeAdapterFactory<HomeCards> getHomeCardsAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(HomeCards.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "SPACES".toLowerCase(locale);
        i.d(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(HomeCards.HomeSpacesData.class, lowerCase);
        String lowerCase2 = "NEW_CONVERSATION".toLowerCase(locale);
        i.d(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(HomeCards.HomeNewConversationData.class, lowerCase2);
        String lowerCase3 = "RECENT_CONVERSATION".toLowerCase(locale);
        i.d(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(HomeCards.HomeRecentConversationData.class, lowerCase3);
        String lowerCase4 = "HELP_CENTER".toLowerCase(locale);
        i.d(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(HomeCards.HomeHelpCenterData.class, lowerCase4);
        String lowerCase5 = "EXTERNAL_LINKS".toLowerCase(locale);
        i.d(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(HomeCards.HomeExternalLinkData.class, lowerCase5);
        String lowerCase6 = "MESSENGER_APP".toLowerCase(locale);
        i.d(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(HomeCards.HomeMessengerAppData.class, lowerCase6);
        String lowerCase7 = "RECENT_TICKETS".toLowerCase(locale);
        i.d(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype7 = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(HomeCards.HomeRecentTicketsData.class, lowerCase7);
        String lowerCase8 = "TICKET_LINKS".toLowerCase(locale);
        i.d(lowerCase8, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<HomeCards> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype7.registerSubtype(HomeCards.HomeTicketLinksData.class, lowerCase8).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported");
        i.d(runtimeTypeAdapterFactoryRegisterIgnoredSubtype, "registerIgnoredSubtype(...)");
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    private final RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryOf = RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type");
        Locale locale = Locale.ROOT;
        String lowerCase = "STRING".toLowerCase(locale);
        i.d(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = runtimeTypeAdapterFactoryOf.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase);
        String lowerCase2 = "INTEGER".toLowerCase(locale);
        i.d(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = runtimeTypeAdapterFactoryRegisterSubtype.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase2);
        String lowerCase3 = "FLOAT".toLowerCase(locale);
        i.d(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype3 = runtimeTypeAdapterFactoryRegisterSubtype2.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase3);
        String lowerCase4 = "BOOLEAN".toLowerCase(locale);
        i.d(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype4 = runtimeTypeAdapterFactoryRegisterSubtype3.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase4);
        String lowerCase5 = "LIST".toLowerCase(locale);
        i.d(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype5 = runtimeTypeAdapterFactoryRegisterSubtype4.registerSubtype(Ticket.TicketAttribute.ListAttribute.class, lowerCase5);
        String lowerCase6 = "DATETIME".toLowerCase(locale);
        i.d(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype6 = runtimeTypeAdapterFactoryRegisterSubtype5.registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, lowerCase6);
        String lowerCase7 = "FILES".toLowerCase(locale);
        i.d(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<Ticket.TicketAttribute> runtimeTypeAdapterFactoryRegisterIgnoredSubtype = runtimeTypeAdapterFactoryRegisterSubtype6.registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, lowerCase7).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
        i.d(runtimeTypeAdapterFactoryRegisterIgnoredSubtype, "registerIgnoredSubtype(...)");
        return runtimeTypeAdapterFactoryRegisterIgnoredSubtype;
    }

    public final String convertHostnameToUrl(String hostname) {
        i.e(hostname, "hostname");
        return PROTOCOL + hostname + ENDPOINT;
    }

    public final Api createApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, Provider<AppConfig> appConfigProvider, OpsMetricTracker opsMetricTracker, IntercomDataLayer dataLayer, UnreadConversationsTracker unreadConversationsTracker, t httpClient, MessengerApi messengerApi) {
        i.e(context, "context");
        i.e(appIdentity, "appIdentity");
        i.e(userIdentity, "userIdentity");
        i.e(appConfigProvider, "appConfigProvider");
        i.e(opsMetricTracker, "opsMetricTracker");
        i.e(dataLayer, "dataLayer");
        i.e(unreadConversationsTracker, "unreadConversationsTracker");
        i.e(httpClient, "httpClient");
        i.e(messengerApi, "messengerApi");
        return new Api(context, appIdentity, userIdentity, httpClient, messengerApi, new CallbackHolder(dataLayer, userIdentity, unreadConversationsTracker), new RateLimiter(appConfigProvider.get()), appConfigProvider, opsMetricTracker, dataLayer);
    }

    public final t createConfigurableHttpClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity) {
        i.e(context, "context");
        i.e(appIdentity, "appIdentity");
        i.e(userIdentity, "userIdentity");
        t.a aVar = new t.a();
        TimeUnit unit = TimeUnit.MINUTES;
        i.e(unit, "unit");
        aVar.f45658x = p172nb.b.b(2L, unit);
        aVar.f45657w = p172nb.b.b(2L, unit);
        aVar.f45659y = p172nb.b.b(2L, unit);
        aVar.b(new TaggingSocketFactory(SocketFactory.getDefault(), INTERCOM_TRAFFIC_TAG));
        aVar.a(new UserIdentityInterceptor(userIdentity));
        aVar.a(new RetryInterceptor(new RetryInterceptor.Sleeper()));
        aVar.a(new ShutdownInterceptor(new ShutdownState(context, appIdentity, TimeProvider.SYSTEM)));
        HeaderInterceptor headerInterceptorCreate = HeaderInterceptor.create(context, appIdentity);
        i.d(headerInterceptorCreate, "create(...)");
        aVar.f45639d.add(headerInterceptorCreate);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            aVar.f45645k = new C2752c(new File(cacheDir.getAbsolutePath(), CACHE_NAME));
        }
        return new t(aVar);
    }

    public final Gson createGsonWithAdapters() {
        Excluder excluder = Excluder.f28827d;
        FieldNamingPolicy fieldNamingPolicy = FieldNamingPolicy.f28788b;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.google.gson.c cVar = Gson.f28790l;
        ToNumberPolicy toNumberPolicy = Gson.f28792n;
        ToNumberPolicy toNumberPolicy2 = Gson.f28793o;
        ArrayDeque arrayDeque = new ArrayDeque();
        RuntimeTypeAdapterFactory<HomeCards> homeCardsAdapterFactory = getHomeCardsAdapterFactory();
        Objects.requireNonNull(homeCardsAdapterFactory);
        arrayList.add(homeCardsAdapterFactory);
        RuntimeTypeAdapterFactory<Ticket.TicketAttribute> ticketTypeAdapterFactory = getTicketTypeAdapterFactory();
        Objects.requireNonNull(ticketTypeAdapterFactory);
        arrayList.add(ticketTypeAdapterFactory);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z10 = com.google.gson.internal.sql.a.f28982a;
        return new Gson(excluder, fieldNamingPolicy, new HashMap(map), cVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, toNumberPolicy, toNumberPolicy2, new ArrayList(arrayDeque));
    }

    public final HelpCenterApi createHelpCenterApi(w retrofit) {
        i.e(retrofit, "retrofit");
        Object objB = retrofit.b(HelpCenterApi.class);
        i.d(objB, "create(...)");
        return (HelpCenterApi) objB;
    }

    public final t createHttpClientWithoutHeaders(Context context) {
        i.e(context, "context");
        return new t(new t.a());
    }

    public final w createKotlinXRetrofit(String hostname, t httpClient) throws EOFException {
        i.e(hostname, "hostname");
        i.e(httpClient, "httpClient");
        w.b bVar = new w.b();
        bVar.a(hostname);
        bVar.f46836d.add(new NetworkResponseAdapterFactory());
        h.a convertorFactory = KotlinXConvertorFactory.INSTANCE.getConvertorFactory();
        ArrayList arrayList = bVar.f46835c;
        Objects.requireNonNull(convertorFactory, "factory == null");
        arrayList.add(convertorFactory);
        bVar.f46833a = httpClient;
        return bVar.b();
    }

    public final w createLegacyRetrofit(String hostname, t httpClient, Gson gson) throws EOFException {
        i.e(hostname, "hostname");
        i.e(httpClient, "httpClient");
        i.e(gson, "gson");
        w.b bVar = new w.b();
        bVar.a(hostname);
        bVar.f46836d.add(new NetworkResponseAdapterFactory());
        bVar.f46835c.add(new fc.a(gson));
        bVar.f46833a = httpClient;
        return bVar.b();
    }

    public final MessengerApi createMessengerApi(w retrofit) {
        i.e(retrofit, "retrofit");
        Object objB = retrofit.b(MessengerApi.class);
        i.d(objB, "create(...)");
        return (MessengerApi) objB;
    }

    public final SurveyApi createSurveyApi(w retrofit) {
        i.e(retrofit, "retrofit");
        Object objB = retrofit.b(SurveyApi.class);
        i.d(objB, "create(...)");
        return (SurveyApi) objB;
    }

    public final TicketApi createTicketApi(w retrofit) {
        i.e(retrofit, "retrofit");
        Object objB = retrofit.b(TicketApi.class);
        i.d(objB, "create(...)");
        return (TicketApi) objB;
    }

    public final String createUniqueIdentifier(String appId) {
        i.e(appId, "appId");
        String str = removeInvalidCharacters(appId) + "-android";
        if (str.length() <= 63) {
            return str;
        }
        String strSubstring = str.substring(0, str.charAt(62) == '-' ? 62 : 63);
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String getFullHostname(String appId, Context context) {
        i.e(appId, "appId");
        i.e(context, "context");
        return createUniqueIdentifier(appId) + getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context);
    }

    public final String getServerUrl(AppIdentity appIdentity, Context context) {
        String string;
        i.e(appIdentity, "appIdentity");
        i.e(context, "context");
        String hostFromManifest = UtilsKt.readHostFromManifest(context);
        if (TextUtils.isEmpty(hostFromManifest)) {
            String strAppId = appIdentity.appId();
            i.d(strAppId, "appId(...)");
            string = getFullHostname(strAppId, context);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String strAppId2 = appIdentity.appId();
            i.d(strAppId2, "appId(...)");
            sb2.append(createUniqueIdentifier(strAppId2));
            sb2.append(hostFromManifest);
            string = sb2.toString();
        }
        return convertHostnameToUrl(string);
    }

    public final ExternalUploadApi getUploadApi(w retrofit) {
        i.e(retrofit, "retrofit");
        Object objB = retrofit.b(ExternalUploadApi.class);
        i.d(objB, "create(...)");
        return (ExternalUploadApi) objB;
    }

    public final String removeInvalidCharacters(String appId) {
        i.e(appId, "appId");
        return new Regex("[^A-Za-z0-9\\-$]").f("", appId);
    }
}
