package io.intercom.android.sdk.push;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: IntercomPushClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushClient {
    public static final int $stable = 8;
    private final IntercomPushClientHandler pushHandler;
    private final Twig twig;

    public IntercomPushClient(Twig twig, IntercomPushClientHandler pushHandler) {
        i.e(twig, "twig");
        i.e(pushHandler, "pushHandler");
        this.twig = twig;
        this.pushHandler = pushHandler;
    }

    private final Bundle convertMessageMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public final void handlePush(Application application, Bundle message) {
        i.e(application, "application");
        i.e(message, "message");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        i.b(contextCreateLocalisedContext);
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        i.d(userIdentity, "getUserIdentity(...)");
        IntercomPushClientHandler.handlePush$default(intercomPushClientHandler, message, contextCreateLocalisedContext, userIdentity, null, 8, null);
    }

    public final void handlePushWithCustomStack(Application application, Bundle message, TaskStackBuilder customStack) {
        i.e(application, "application");
        i.e(message, "message");
        i.e(customStack, "customStack");
        if (!isIntercomPush(message)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        i.b(contextCreateLocalisedContext);
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        i.d(userIdentity, "getUserIdentity(...)");
        intercomPushClientHandler.handlePush(message, contextCreateLocalisedContext, userIdentity, customStack);
    }

    public final boolean isIntercomPush(Bundle message) {
        i.e(message, "message");
        return this.pushHandler.isIntercomPush(message);
    }

    public final void sendTokenToIntercom(Application application, String token) {
        i.e(application, "application");
        i.e(token, "token");
        if (n.S(token)) {
            this.twig.e("sendTokenToIntercom() was called with a null or empty token. This user will not receive push notifications until a valid device token is sent.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Token not sent because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        if (this.pushHandler.shouldSendDeviceToken(application, token)) {
            IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
            Api api = injector.getApi();
            i.d(api, "getApi(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            i.d(userIdentity, "getUserIdentity(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            i.d(appConfigProvider, "getAppConfigProvider(...)");
            intercomPushClientHandler.sendTokenToIntercom(application, token, api, userIdentity, appConfigProvider);
        }
    }

    public final boolean isIntercomPush(Map<String, String> message) {
        i.e(message, "message");
        return isIntercomPush(convertMessageMapToBundle(message));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntercomPushClient() {
        Twig logger = LumberMill.getLogger();
        i.d(logger, "getLogger(...)");
        this(logger, new IntercomPushClientHandler());
    }

    public final void handlePush(Application application, Map<String, String> message) {
        i.e(application, "application");
        i.e(message, "message");
        handlePush(application, convertMessageMapToBundle(message));
    }

    public final void handlePushWithCustomStack(Application application, Map<String, String> message, TaskStackBuilder customStack) {
        i.e(application, "application");
        i.e(message, "message");
        i.e(customStack, "customStack");
        handlePushWithCustomStack(application, convertMessageMapToBundle(message), customStack);
    }
}
