package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.user.DeviceData;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: IntercomPushClientHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushClientHandler {
    private final Twig twig = LumberMill.getLogger();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: IntercomPushClientHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void clear(Context context) {
            i.e(context, "context");
            IntercomNotificationHandler.INSTANCE.clear(context);
        }

        public final void setUpNotificationChannels(Context context) {
            i.e(context, "context");
            IntercomNotificationHandler.INSTANCE.setUpNotificationChannels$intercom_sdk_base_release(context);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void handlePush$default(IntercomPushClientHandler intercomPushClientHandler, Bundle bundle, Context context, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            taskStackBuilder = null;
        }
        intercomPushClientHandler.handlePush(bundle, context, userIdentity, taskStackBuilder);
    }

    private final boolean hasUserHashIfNeeded(UserIdentity userIdentity, AppConfig appConfig) {
        if (appConfig.isReceivedFromServer()) {
            if (appConfig.isIdentityVerificationEnabled()) {
                if (appConfig.isIdentityVerificationEnabled()) {
                    String hmac = userIdentity.getHmac();
                    i.d(hmac, "getHmac(...)");
                    if (!n.S(hmac)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void handlePush(Bundle message, Context localisedContext, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder) {
        i.e(message, "message");
        i.e(localisedContext, "localisedContext");
        i.e(userIdentity, "userIdentity");
        IntercomPushData intercomPushDataCreateFrom = IntercomPushData.Companion.createFrom(localisedContext, message);
        if (intercomPushDataCreateFrom == null) {
            this.twig.i("This is not an Intercom push message", new Object[0]);
        } else if (userIdentity.identityExists()) {
            IntercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, localisedContext, intercomPushDataCreateFrom, taskStackBuilder, null, 8, null);
        } else {
            this.twig.i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
            IntercomNotificationHandler.INSTANCE.clear(localisedContext);
        }
    }

    public final boolean isIntercomPush(Bundle message) {
        i.e(message, "message");
        return IntercomPushData.Companion.isIntercomPush(message);
    }

    public final void sendTokenToIntercom(Context context, String token, Api api, UserIdentity userIdentity, Provider<AppConfig> appConfigProvider) {
        i.e(context, "context");
        i.e(token, "token");
        i.e(api, "api");
        i.e(userIdentity, "userIdentity");
        i.e(appConfigProvider, "appConfigProvider");
        if (userIdentity.identityExists()) {
            AppConfig appConfig = appConfigProvider.get();
            i.d(appConfig, "get(...)");
            if (hasUserHashIfNeeded(userIdentity, appConfig)) {
                api.setDeviceToken(token);
            }
        }
        DeviceData.cacheDeviceToken(context, token);
    }

    public final boolean shouldSendDeviceToken(Context context, String token) {
        i.e(context, "context");
        i.e(token, "token");
        return !DeviceData.hasCachedDeviceToken(context, token);
    }
}
