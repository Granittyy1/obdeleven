package io.intercom.android.sdk;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.UnreadCountTracker;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.y;

/* JADX INFO: compiled from: Intercom.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Intercom {
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static Intercom instance;
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Application context;
    private final IntercomDataLayer dataLayer;
    private final MetricTracker metricTracker;
    private final Provider<NexusClient> nexusClientProvider;
    private final OverlayPresenter overlayPresenter;
    private final ResetManager resetManager;
    private final DeDuper superDeDuper;
    private final Twig twig;
    private final UnreadCountTracker unreadCountTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserUpdater> userUpdater;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Visibility VISIBLE = Visibility.VISIBLE;
    public static final Visibility GONE = Visibility.GONE;
    private static final Twig TWIG = LumberMill.getLogger();

    /* JADX INFO: compiled from: Intercom.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private final Intercom create(Application application, String str, String str2) {
            Injector.initWithAppCredentials(application, str, str2);
            Injector injector = Injector.get();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            ThemeManager.INSTANCE.initialize();
            DeDuper deDuper = injector.getDeDuper();
            kotlin.jvm.internal.i.d(deDuper, "getDeDuper(...)");
            Provider<Api> apiProvider = injector.getApiProvider();
            kotlin.jvm.internal.i.d(apiProvider, "getApiProvider(...)");
            Provider<NexusClient> nexusClientProvider = injector.getNexusClientProvider();
            kotlin.jvm.internal.i.d(nexusClientProvider, "getNexusClientProvider(...)");
            kotlin.jvm.internal.i.b(dataLayer);
            UnreadCountTracker unreadCountTracker = new UnreadCountTracker(dataLayer);
            MetricTracker metricTracker = injector.getMetricTracker();
            kotlin.jvm.internal.i.d(metricTracker, "getMetricTracker(...)");
            ErrorReporter errorReporter = injector.getErrorReporter();
            kotlin.jvm.internal.i.d(errorReporter, "getErrorReporter(...)");
            OverlayPresenter overlayPresenter = injector.getOverlayPresenter();
            kotlin.jvm.internal.i.d(overlayPresenter, "getOverlayPresenter(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            kotlin.jvm.internal.i.d(appConfigProvider, "getAppConfigProvider(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            kotlin.jvm.internal.i.d(userIdentity, "getUserIdentity(...)");
            Provider<UserUpdater> userUpdaterProvider = injector.getUserUpdaterProvider();
            kotlin.jvm.internal.i.d(userUpdaterProvider, "getUserUpdaterProvider(...)");
            ResetManager resetManager = injector.getResetManager();
            kotlin.jvm.internal.i.d(resetManager, "getResetManager(...)");
            Twig logger = LumberMill.getLogger();
            kotlin.jvm.internal.i.d(logger, "getLogger(...)");
            ActivityFinisher activityFinisher = injector.getActivityFinisher();
            kotlin.jvm.internal.i.d(activityFinisher, "getActivityFinisher(...)");
            return new Intercom(deDuper, apiProvider, nexusClientProvider, unreadCountTracker, metricTracker, errorReporter, application, overlayPresenter, appConfigProvider, userIdentity, userUpdaterProvider, resetManager, logger, activityFinisher, dataLayer);
        }

        public final synchronized Intercom client() {
            Intercom intercom;
            intercom = Intercom.instance;
            if (intercom == null) {
                throw new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key");
            }
            return intercom;
        }

        public final synchronized void initialize(Application application, String str, String str2) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
                return;
            }
            if (application == null || str == null || str2 == null || !ValidatorUtil.isValidConstructorParams(application, str, str2)) {
                Intercom.TWIG.e("Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
            } else {
                Intercom.instance = create(application, str, str2);
                LateInitializationPreparer.getInstance().handlePastLifecycleEvents(application, Injector.get());
                Injector.get().getMetricTracker().initialiseAPICall();
                Injector.get().initializeIntercomEventsListeners();
            }
        }

        @p293xa.d
        public final synchronized void registerForLaterInitialisation(Application application) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
            } else {
                if (application == null) {
                    throw new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                }
                LateInitializationPreparer.getInstance().register(application);
            }
        }

        public final void setLogLevel(@LogLevel int i10) {
            Injector.get().getMetricTracker().setLogLevelAPICall();
            LumberMill.setLogLevel(i10);
        }

        @p293xa.d
        public final void unregisterForLateInitialisation(Application application) {
            Injector.get().getMetricTracker().unRegisterForLateInitialisationAPICall();
            if (application == null) {
                throw new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
            }
            LateInitializationPreparer.getInstance().unregister(application);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final int ASSERT = 7;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        /* JADX INFO: compiled from: Intercom.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public enum Visibility {
        GONE,
        VISIBLE;

        private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

        public static Ba.a<Visibility> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Intercom.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            try {
                iArr[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IntercomSpace.values().length];
            try {
                iArr2[IntercomSpace.HelpCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[IntercomSpace.Home.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IntercomSpace.Messages.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IntercomSpace.Tickets.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Intercom(DeDuper superDeDuper, Provider<Api> apiProvider, Provider<NexusClient> nexusClientProvider, UnreadCountTracker unreadCountTracker, MetricTracker metricTracker, ErrorReporter errorReporter, Application context, OverlayPresenter overlayPresenter, Provider<AppConfig> appConfigProvider, UserIdentity userIdentity, Provider<UserUpdater> userUpdater, ResetManager resetManager, Twig twig, ActivityFinisher activityFinisher, IntercomDataLayer dataLayer) {
        kotlin.jvm.internal.i.e(superDeDuper, "superDeDuper");
        kotlin.jvm.internal.i.e(apiProvider, "apiProvider");
        kotlin.jvm.internal.i.e(nexusClientProvider, "nexusClientProvider");
        kotlin.jvm.internal.i.e(unreadCountTracker, "unreadCountTracker");
        kotlin.jvm.internal.i.e(metricTracker, "metricTracker");
        kotlin.jvm.internal.i.e(errorReporter, "errorReporter");
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(overlayPresenter, "overlayPresenter");
        kotlin.jvm.internal.i.e(appConfigProvider, "appConfigProvider");
        kotlin.jvm.internal.i.e(userIdentity, "userIdentity");
        kotlin.jvm.internal.i.e(userUpdater, "userUpdater");
        kotlin.jvm.internal.i.e(resetManager, "resetManager");
        kotlin.jvm.internal.i.e(twig, "twig");
        kotlin.jvm.internal.i.e(activityFinisher, "activityFinisher");
        kotlin.jvm.internal.i.e(dataLayer, "dataLayer");
        this.superDeDuper = superDeDuper;
        this.apiProvider = apiProvider;
        this.nexusClientProvider = nexusClientProvider;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = context;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = appConfigProvider;
        this.userIdentity = userIdentity;
        this.userUpdater = userUpdater;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        this.dataLayer = dataLayer;
        IntercomPushManager.IntercomPushIntegrationType installedModuleType = IntercomPushManager.getInstalledModuleType();
        if ((installedModuleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[installedModuleType.ordinal()]) == 1) {
            twig.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomPushClientHandler.Companion.setUpNotificationChannels(context);
            IntercomPushManager.initializeFcmService(context);
        } else {
            twig.internal("No FCM integration detected");
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    public static final synchronized Intercom client() {
        return Companion.client();
    }

    public static final synchronized void initialize(Application application, String str, String str2) {
        Companion.initialize(application, str, str2);
    }

    private final void logErrorAndOpenInbox(String str) {
        this.twig.e(str, new Object[0]);
        present(IntercomSpace.Messages);
    }

    private final void logEventWithValidation(String str, Map<String, ?> map) {
        if (str == null || str.length() == 0) {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        } else {
            this.apiProvider.get().logEvent(str, map);
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    private final boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private final void openIntercomChatPush(String str, TaskStackBuilder taskStackBuilder) {
        if (kotlin.jvm.internal.i.a(str, IntercomPushManager.MULTIPLE_NOTIFICATIONS)) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(this.context, str);
            if (taskStackBuilder != null) {
                taskStackBuilder.addNextIntent(conversationIntent);
                this.context.startActivities(taskStackBuilder.getIntents());
            } else {
                this.context.startActivity(conversationIntent);
            }
        }
        this.metricTracker.viewedPushNotification(str);
        IntercomPushClientHandler.Companion.clear(this.context);
    }

    private final void performUpdate(Map<String, ? extends Object> map, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(map);
        }
        if (!this.superDeDuper.shouldUpdateUser(map)) {
            intercomStatusCallback.onSuccess();
            this.twig.internal("dupe", "dropped dupe");
        } else {
            this.superDeDuper.update(map);
            this.userUpdater.get().updateUser(UserUpdateRequest.create(false, this.dataLayer.getHostAppState().getValue().isBackgrounded(), map, false), intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
        }
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    @p293xa.d
    public static final synchronized void registerForLaterInitialisation(Application application) {
        Companion.registerForLaterInitialisation(application);
    }

    private final void registerNewIdentifiedUser(Registration registration, IntercomStatusCallback intercomStatusCallback) {
        UserUpdateRequest userUpdateRequestCreate;
        this.resetManager.hardReset();
        this.userIdentity.registerIdentifiedUser(registration);
        this.nexusClientProvider.get().disconnect();
        boolean z10 = !this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded();
        boolean zIsBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (registration.getAttributes() != null) {
            UserAttributes attributes = registration.getAttributes();
            kotlin.jvm.internal.i.b(attributes);
            userUpdateRequestCreate = UserUpdateRequest.create(z10, zIsBackgrounded, attributes.toMap(), true);
            kotlin.jvm.internal.i.b(userUpdateRequestCreate);
        } else {
            userUpdateRequestCreate = UserUpdateRequest.create(z10, zIsBackgrounded, true);
            kotlin.jvm.internal.i.b(userUpdateRequestCreate);
        }
        this.userUpdater.get().updateUser(userUpdateRequestCreate, intercomStatusCallback);
    }

    public static /* synthetic */ void setAuthTokens$default(Intercom intercom, List list, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.setAuthTokens(list, intercomStatusCallback);
    }

    public static final void setLogLevel(@LogLevel int i10) {
        Companion.setLogLevel(i10);
    }

    private final boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_ERROR_REPORTING);
    }

    private final void softRegister() {
        this.nexusClientProvider.get().connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        R0.j jVar = new R0.j(3, this);
        if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            jVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void softRegister$lambda$2(Intercom this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this$0.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    @p293xa.d
    public static final void unregisterForLateInitialisation(Application application) {
        Companion.unregisterForLateInitialisation(application);
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    public final void addUnreadConversationCountListener(UnreadConversationCountListener listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.metricTracker.addUnreadConversationCountListenerAPICall();
        UnreadCountTracker.addListener$default(this.unreadCountTracker, listener, null, 2, null);
    }

    public final void changeWorkspace(String str, String str2) {
        this.metricTracker.changeWorkspaceAPICall();
        if (str == null || str2 == null || !ValidatorUtil.isValidAppIdParams(str, str2)) {
            TWIG.e("Workspace has not been changed. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
        } else {
            logout();
            Injector.get().changeWorkspace(str, str2);
        }
    }

    @p293xa.d
    public final void displayArticle(String articleId) {
        kotlin.jvm.internal.i.e(articleId, "articleId");
        this.metricTracker.displayArticleAPICall();
        this.context.startActivity(IntercomArticleActivity.Companion.buildIntent(this.context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.API, false, false, 12, null)));
    }

    @p293xa.d
    public final void displayCarousel(String str) {
        this.metricTracker.displayCarouselAPICall();
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent(application, str));
    }

    @p293xa.d
    public final void displayConversationsList() {
        this.metricTracker.displayConversationsListAPICall();
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
    }

    @p293xa.d
    public final void displayHelpCenter() {
        this.metricTracker.displayHelpCenterAPICall();
        displayHelpCenterCollections(EmptyList.f42983b);
    }

    @p293xa.d
    public final void displayHelpCenterCollections(List<String> list) {
        this.metricTracker.displayHelpCenterCollectionsAPICall();
        Application application = this.context;
        List listM = list != null ? q.M(list) : null;
        if (listM == null) {
            listM = EmptyList.f42983b;
        }
        HelpCenterUrlUtilsKt.openCollections(application, listM, MetricTracker.Place.API);
    }

    public final void displayMessageComposer() {
        this.metricTracker.displayMessageComposerAPICall();
        displayMessageComposer("");
    }

    @p293xa.d
    public final void displayMessenger() {
        this.metricTracker.displayMessengerAPICall();
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger(this.context);
        }
    }

    @p293xa.d
    public final void displaySurvey(String surveyId) {
        kotlin.jvm.internal.i.e(surveyId, "surveyId");
        this.metricTracker.displaySurveyAPICall();
        Application application = this.context;
        application.startActivity(IntercomSurveyActivity.Companion.buildIntent(application, surveyId));
    }

    public final void fetchHelpCenterCollection(String str, CollectionContentRequestCallback collectionContentRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        kotlin.jvm.internal.i.b(str);
        kotlin.jvm.internal.i.b(collectionContentRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker, str, collectionContentRequestCallback);
    }

    public final void fetchHelpCenterCollections(CollectionRequestCallback collectionRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionsAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        kotlin.jvm.internal.i.b(collectionRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker, collectionRequestCallback);
    }

    public final Registration fetchLoggedInUserAttributes() {
        UserIdentity userIdentity = this.userIdentity;
        if (!userIdentity.identityExists()) {
            userIdentity = null;
        }
        if (userIdentity == null) {
            return null;
        }
        Registration registration = new Registration();
        String userId = userIdentity.getUserId();
        if (userId != null && userId.length() != 0) {
            registration.withUserId(userIdentity.getUserId());
        }
        String email = userIdentity.getEmail();
        if (email != null && email.length() != 0) {
            registration.withEmail(userIdentity.getEmail());
        }
        String anonymousId = userIdentity.getAnonymousId();
        if (anonymousId != null && anonymousId.length() != 0) {
            registration.withUserId(userIdentity.getAnonymousId());
        }
        return registration;
    }

    public final int getUnreadConversationCount() {
        this.metricTracker.unreadConversationCountAPICall();
        return this.dataLayer.getUnreadConversationIds().getValue().size();
    }

    @p293xa.d
    public final void handlePushMessage() {
        this.metricTracker.handlePushMessageAPICall();
        handlePushMessage(null);
    }

    public final void hideIntercom() {
        this.metricTracker.hideIntercomAPICall();
        this.activityFinisher.finishActivities();
    }

    public final boolean isUserLoggedIn() {
        return this.userIdentity.identityExists();
    }

    public final void logEvent(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        this.metricTracker.logEventAPICall();
        logEventWithValidation(name, y.p());
    }

    public final void loginIdentifiedUser(Registration userRegistration, IntercomStatusCallback intercomStatusCallback) {
        Map<String, Object> mapP;
        kotlin.jvm.internal.i.e(userRegistration, "userRegistration");
        kotlin.jvm.internal.i.e(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginIdentifiedUserAPICall();
        String userId = userRegistration.getUserId();
        kotlin.jvm.internal.i.d(userId, "getUserId(...)");
        if (userId.length() == 0) {
            String email = userRegistration.getEmail();
            kotlin.jvm.internal.i.d(email, "getEmail(...)");
            if (email.length() == 0) {
                this.twig.e("Failed to register user. You need to provide a user identifier, an email address, or both. ", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(1007, "Failed to register user. You need to provide unique user identifier, an email address, or both."));
                return;
            }
        }
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !this.userIdentity.softIdentityIsSameUser(userRegistration)) {
                registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
                return;
            } else {
                softRegister();
                intercomStatusCallback.onSuccess();
                return;
            }
        }
        if (!kotlin.jvm.internal.i.a(userRegistration.getEmail(), this.userIdentity.getEmail()) || !kotlin.jvm.internal.i.a(userRegistration.getUserId(), this.userIdentity.getUserId())) {
            this.twig.i("The user is already registered with a different email or user id", new Object[0]);
            registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
        } else {
            if (!this.userIdentity.registrationHasAttributes(userRegistration)) {
                this.twig.i("The user is already registered with the same email and user id, skipping API call", new Object[0]);
                intercomStatusCallback.onSuccess();
                return;
            }
            this.twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
            UserAttributes attributes = userRegistration.getAttributes();
            if (attributes == null || (mapP = attributes.toMap()) == null) {
                mapP = y.p();
            }
            performUpdate(mapP, intercomStatusCallback);
        }
    }

    public final void loginUnidentifiedUser(IntercomStatusCallback intercomStatusCallback) {
        kotlin.jvm.internal.i.e(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginUnidentifiedUserAPICall();
        if (this.userIdentity.isUnidentified()) {
            this.twig.i("The unidentified user is already registered", new Object[0]);
            intercomStatusCallback.onSuccess();
        } else {
            if (this.userIdentity.isIdentified()) {
                this.twig.e("The identified user is already registered", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
                return;
            }
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClientProvider.get().disconnect();
            this.userUpdater.get().updateUser(UserUpdateRequest.create(!this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded(), this.dataLayer.getHostAppState().getValue().isBackgrounded(), true), intercomStatusCallback);
        }
    }

    public final void logout() {
        this.metricTracker.logoutAPICall();
        if (this.userIdentity.isSoftReset()) {
            return;
        }
        this.resetManager.softReset();
    }

    public final void present() {
        present$default(this, null, 1, null);
    }

    public final void presentContent(IntercomContent content) {
        kotlin.jvm.internal.i.e(content, "content");
        if (!Injector.isNotInitialised() && !noUserRegistered()) {
            Injector.get().getMetricTracker().presentContentAPICall(content);
        }
        if (content instanceof IntercomContent.Article) {
            Application application = this.context;
            application.startActivity(IntercomArticleActivity.Companion.buildIntent(application, new IntercomArticleActivity.ArticleActivityArguments(((IntercomContent.Article) content).getId(), MetricTracker.Place.API, false, false, 12, null)));
            return;
        }
        if (content instanceof IntercomContent.Carousel) {
            Application application2 = this.context;
            application2.startActivity(IntercomCarouselActivity.buildIntent(application2, ((IntercomContent.Carousel) content).getId()));
            return;
        }
        if (content instanceof IntercomContent.Survey) {
            Application application3 = this.context;
            application3.startActivity(IntercomSurveyActivity.Companion.buildIntent(application3, ((IntercomContent.Survey) content).getId()));
        } else if (content instanceof IntercomContent.HelpCenterCollections) {
            HelpCenterUrlUtilsKt.openCollections(this.context, ((IntercomContent.HelpCenterCollections) content).getIds(), MetricTracker.Place.API);
        } else if (content instanceof IntercomContent.Conversation) {
            ConversationScreenOpenerKt.openComposer$default(this.context, "", true, null, ((IntercomContent.Conversation) content).getId(), 8, null);
        } else {
            if (!(content instanceof IntercomContent.Ticket)) {
                throw new NoWhenBranchMatchedException();
            }
            IntercomRootActivityLauncher.INSTANCE.startTicketDetails(this.context, ((IntercomContent.Ticket) content).getId(), MetricTracker.Context.FROM_PROGRAMMATIC);
        }
    }

    @p293xa.d
    public final void registerIdentifiedUser(Registration registration) {
        if (registration != null) {
            loginIdentifiedUser(registration, IntercomStatusCallbackKt.getNoStatusCallback());
        } else {
            this.metricTracker.registerIdentifiedUserAPICall();
            this.twig.e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
        }
    }

    @p293xa.d
    public final void registerUnidentifiedUser() {
        loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public final void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        this.metricTracker.removeUnreadConversationCountListenerAPICall();
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.removeListener(unreadConversationCountListener);
        }
    }

    @p293xa.d
    public final void reset() {
        this.metricTracker.resetAPICall();
        logout();
    }

    public final void searchHelpCenter(String str, SearchRequestCallback searchRequestCallback) {
        this.metricTracker.searchHelpCenterAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        kotlin.jvm.internal.i.b(str);
        kotlin.jvm.internal.i.b(searchRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker, str, searchRequestCallback);
    }

    public final void setAuthTokens(List<AuthToken> authTokens, IntercomStatusCallback intercomStatusCallback) {
        kotlin.jvm.internal.i.e(authTokens, "authTokens");
        kotlin.jvm.internal.i.e(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.authTokensAPICall();
        ArrayList arrayList = new ArrayList();
        for (Object obj : authTokens) {
            AuthToken authToken = (AuthToken) obj;
            if (authToken.getName().length() > 0 && authToken.getToken().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.apiProvider.get().setAuthTokens(arrayList, intercomStatusCallback);
        } else {
            this.twig.e("All auth tokens in the map have empty keys or values.", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3003, "ERROR - Failed to set Auth Tokens. All keys or values passed were empty."));
        }
    }

    public final void setBottomPadding(int i10) {
        this.metricTracker.setBottomPaddingAPICall();
        this.dataLayer.updateBottomPadding(i10);
    }

    public final void setInAppMessageVisibility(Visibility visibility) {
        this.metricTracker.setInAppMessageVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateInAppNotificationsVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setLauncherVisibility(Visibility visibility) {
        this.metricTracker.setLauncherVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateLauncherVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setThemeMode(ThemeMode themeMode) {
        this.metricTracker.setThemeModeAPICall();
        if (themeMode == null) {
            ThemeManager.INSTANCE.clearSessionOverride();
            this.twig.i("Theme mode cleared, using server-provided theme", new Object[0]);
            return;
        }
        ThemeManager.INSTANCE.setSessionOverride(themeMode);
        this.twig.i("Theme mode set to: " + themeMode + " (session only)", new Object[0]);
    }

    public final void setUserHash(String userHash) {
        kotlin.jvm.internal.i.e(userHash, "userHash");
        this.metricTracker.setUserHashAPICall();
        if (userHash.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else {
            if (kotlin.jvm.internal.i.a(this.userIdentity.getHmac(), userHash)) {
                this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityHmacDiffers(userHash)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(userHash);
        }
    }

    public final void setUserJwt(String jwt) {
        kotlin.jvm.internal.i.e(jwt, "jwt");
        this.metricTracker.setUserJwtAPICall();
        if (jwt.length() == 0) {
            this.twig.w("The JWT you sent us to verify was empty, we will not be able to authenticate your requests without a valid JWT.", new Object[0]);
        } else {
            if (kotlin.jvm.internal.i.a(this.userIdentity.getJwt(), jwt)) {
                this.twig.i("The JWT set matches the existing user identity JWT value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityJwtDiffers(jwt)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setJwt(jwt);
        }
    }

    @p293xa.d
    public final void updateUser(UserAttributes userAttributes) {
        this.metricTracker.updateUserAPICall();
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    public final void present(IntercomSpace space) {
        kotlin.jvm.internal.i.e(space, "space");
        if (noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
            return;
        }
        Injector.get().getMetricTracker().presentAPICall(space);
        int i10 = WhenMappings.$EnumSwitchMapping$1[space.ordinal()];
        if (i10 == 1) {
            HelpCenterUrlUtilsKt.openCollections(this.context, EmptyList.f42983b, MetricTracker.Place.API);
            return;
        }
        if (i10 == 2) {
            IntercomRootActivityLauncher.INSTANCE.startHome(this.context);
        } else if (i10 == 3) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            IntercomRootActivityLauncher.INSTANCE.startTickets(this.context);
        }
    }

    public final void displayMessageComposer(String str) {
        if (str != null && str.length() != 0) {
            this.metricTracker.displayMessageComposerInitialMessageAPICall();
        }
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
            return;
        }
        if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
            return;
        }
        this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
        Application application = this.context;
        if (str == null) {
            str = "";
        }
        ConversationScreenOpenerKt.openComposer$default(application, str, true, null, null, 24, null);
    }

    @p293xa.d
    public final void handlePushMessage(TaskStackBuilder taskStackBuilder) {
        if (taskStackBuilder != null) {
            this.metricTracker.handlePushMessageCustomStackAPICall();
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String string = sharedPreferences.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        if (string != null && !kotlin.text.n.S(string)) {
            openIntercomChatPush(string, taskStackBuilder);
            sharedPreferences.edit().clear().apply();
        } else {
            this.twig.internal("No Uri found");
        }
    }

    public final void logEvent(String str, Map<String, ?> map) {
        this.metricTracker.logEventMetadataAPICall();
        if (map == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (map.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        Map<String, ?> mapX = map != null ? y.x(map) : null;
        if (mapX == null) {
            mapX = y.p();
        }
        logEventWithValidation(str, mapX);
    }

    public final void updateUser(UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback) {
        kotlin.jvm.internal.i.e(userAttributes, "userAttributes");
        kotlin.jvm.internal.i.e(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.updateUserCallbackAPICall();
        Map<String, Object> map = userAttributes.toMap();
        kotlin.jvm.internal.i.d(map, "toMap(...)");
        performUpdate(map, intercomStatusCallback);
    }
}
