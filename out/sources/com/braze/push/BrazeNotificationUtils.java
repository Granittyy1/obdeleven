package com.braze.push;

import B7.b;
import Ia.a;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.compose.ui.text.font.s;
import androidx.core.app.v;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.events.BrazePushEvent;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONObject;
import p005a4.q;
import p293xa.d;

/* JADX INFO: compiled from: BrazeNotificationUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationUtils {
    private static final String SOURCE_KEY = "source";
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX INFO: compiled from: BrazeNotificationUtils.kt */
    public enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);

        private final BrazePushEventType brazePushEventType;

        BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    /* JADX INFO: compiled from: BrazeNotificationUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BrazeNotificationUtils.kt */
    public static final class C16131 extends Lambda implements a<String> {
        public static final C16131 INSTANCE = new C16131();

        public C16131() {
            super(0);
        }

        @Override // Ia.a
        public final String invoke() {
            return "Notification badge number not supported on this android version. Not setting badge number for notification.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BrazeNotificationUtils.kt */
    public static final class C16161 extends Lambda implements a<String> {
        public static final C16161 INSTANCE = new C16161();

        public C16161() {
            super(0);
        }

        @Override // Ia.a
        public final String invoke() {
            return "Cannot set public version before Lollipop";
        }
    }

    private BrazeNotificationUtils() {
    }

    public static final void cancelNotification(Context context, final int i10) {
        i.e(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.cancelNotification.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Cancelling notification action with id: " + i10;
                }
            }, 3, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION).setClass(context, getNotificationReceiverClass());
            i.d(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, i10);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.cancelNotification.2
                @Override // Ia.a
                public final String invoke() {
                    return "Exception occurred attempting to cancel notification.";
                }
            });
        }
    }

    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.Companion.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.Companion.getInstance() : customBrazeNotificationFactory;
    }

    public static final int getNotificationId(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        final Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getNotificationId.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Using notification id provided in the message's extras bundle: " + customNotificationId;
                }
            }, 3, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        if (titleText == null) {
            titleText = "";
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            titleText = s.b(titleText, contentText);
        }
        final int iHashCode = titleText != null ? titleText.hashCode() : 0;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getNotificationId.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + iHashCode;
            }
        }, 3, (Object) null);
        return iHashCode;
    }

    public static final int getNotificationPriority(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int iIntValue = notificationPriorityInt2.intValue();
        if (-2 <= iIntValue && iIntValue < 3) {
            return iIntValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils$getNotificationPriority$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Received invalid notification priority " + notificationPriorityInt;
            }
        }, 2, (Object) null);
        return 0;
    }

    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        final String notificationChannelId = payload.getNotificationChannelId();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getOrCreateNotificationChannelId.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Found notification channel in extras with id: " + notificationChannelId;
                    }
                }, 3, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getOrCreateNotificationChannelId.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Notification channel from extras is invalid. No channel found with id: " + notificationChannelId;
                }
            }, 3, (Object) null);
        }
        if (notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getOrCreateNotificationChannelId.3
                @Override // Ia.a
                public final String invoke() {
                    return "Braze default notification channel does not exist on device. Creating default channel.";
                }
            }, 3, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        i.d(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        i.d(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle bundle) {
        i.e(notificationManager, "notificationManager");
        if (bundle == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.1
                @Override // Ia.a
                public final String invoke() {
                    return "Notification extras bundle was null. Could not find a valid notification channel";
                }
            }, 3, (Object) null);
            return null;
        }
        final String string = bundle.getString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, null);
        if (string != null && !n.S(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Found notification channel in extras with id: " + string;
                    }
                }, 3, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Notification channel from extras is invalid, no channel found with id: " + string;
                }
            }, 3, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.getValidNotificationChannel.4
            @Override // Ia.a
            public final String invoke() {
                return "Braze default notification channel does not exist on device.";
            }
        }, 3, (Object) null);
        return null;
    }

    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        try {
            if (intent.hasExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID)) {
                final int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleCancelNotificationAction.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Cancelling notification action with id: " + intExtra;
                    }
                }, 3, (Object) null);
                Object systemService = context.getSystemService("notification");
                i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel(Constants.BRAZE_PUSH_NOTIFICATION_TAG, intExtra);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleCancelNotificationAction.2
                @Override // Ia.a
                public final String invoke() {
                    return "Exception occurred handling cancel notification intent.";
                }
            });
        }
    }

    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        final String contentCardSyncData = payload.getContentCardSyncData();
        final String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Push contains associated Content Cards card. User id: " + contentCardSyncUserId + " Card data: " + contentCardSyncData;
            }
        }, 3, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    public static final void handleNotificationDeleted(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleNotificationDeleted.1
                @Override // Ia.a
                public final String invoke() {
                    return "Sending notification deleted broadcast";
                }
            }, 3, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            } else {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleNotificationDeleted.2
                @Override // Ia.a
                public final String invoke() {
                    return "Exception occurred attempting to handle notification delete intent.";
                }
            });
        }
    }

    public static final void handleNotificationOpened(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleNotificationOpened.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Not handling deep links automatically, skipping deep link handling";
                    }
                }, 2, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handleNotificationOpened.2
                @Override // Ia.a
                public final String invoke() {
                    return "Exception occurred attempting to handle notification opened intent.";
                }
            });
        }
    }

    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.BRAZE_CAMPAIGN_ID), intent.getStringExtra(Constants.BRAZE_STORY_PAGE_ID));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            final String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY);
            if (stringExtra == null || n.S(stringExtra)) {
                intent.removeExtra("uri");
            } else {
                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY);
                if (stringExtra2 != null && !n.S(stringExtra2)) {
                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return b.g(new StringBuilder("Not handling deep links automatically, skipping deep link handling for '"), stringExtra, '\'');
                    }
                }, 2, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked.2
                @Override // Ia.a
                public final String invoke() {
                    return "Caught exception while handling story click.";
                }
            });
        }
    }

    public static final boolean isBrazePushMessage(Intent intent) {
        i.e(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return "true".equalsIgnoreCase(extras.getString(Constants.BRAZE_PUSH_BRAZE_KEY));
    }

    public static final boolean isNotificationMessage(Intent intent) {
        i.e(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey(Constants.BRAZE_PUSH_TITLE_KEY) && extras.containsKey(Constants.BRAZE_PUSH_CONTENT_KEY);
    }

    @d
    public static final boolean isUninstallTrackingPush(Bundle notificationExtras) {
        i.e(notificationExtras, "notificationExtras");
        try {
            if (notificationExtras.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle = notificationExtras.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (bundle != null) {
                return bundle.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.isUninstallTrackingPush.1
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to determine if push is uninstall tracking. Returning false.";
                }
            });
            return false;
        }
    }

    public static final boolean isValidNotificationVisibility(int i10) {
        return i10 == -1 || i10 == 0 || i10 == 1;
    }

    public static final void logBaiduNotificationClick(Context context, final String str) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.logBaiduNotificationClick.1
                @Override // Ia.a
                public final String invoke() {
                    return "customContentString was null. Doing nothing.";
                }
            }, 2, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.logBaiduNotificationClick.2
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot log baidu click with null context. Doing nothing.";
                }
            }, 2, (Object) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optionalString = JsonUtils.getOptionalString(jSONObject, SOURCE_KEY);
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (optionalString == null || !optionalString.equals(Constants.BRAZE) || optionalString2 == null) {
                return;
            }
            Braze.Companion.getInstance(context).logPushNotificationOpened(optionalString2);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.logBaiduNotificationClick.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Caught an exception processing customContentString: " + str;
                }
            });
        }
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.isPushStory() && payload.isNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Pre-fetching bitmap at URL: " + str;
                    }
                }, 2, (Object) null);
                Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate.2
                @Override // Ia.a
                public final String invoke() {
                    return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
                }
            }, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate.1
            @Override // Ia.a
            public final String invoke() {
                return "Feature flag refresh key was true. Refreshing feature flags.";
            }
        }, 3, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    public static final boolean requestGeofenceRefreshIfAppropriate(BrazeNotificationPayload payload) {
        i.e(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldSyncGeofences() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate.2
                @Override // Ia.a
                public final String invoke() {
                    return "Geofence sync key not included in push payload or false. Not syncing geofences.";
                }
            }, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate.1
            @Override // Ia.a
            public final String invoke() {
                return "Geofence sync key was true. Syncing geofences.";
            }
        }, 3, (Object) null);
        BrazeInternal.requestGeofenceRefresh(context, true);
        return true;
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.1
            @Override // Ia.a
            public final String invoke() {
                return "routeUserWithNotificationOpenedIntent called with Intent";
            }
        }, 3, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra(Constants.BRAZE_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString(SOURCE_KEY, Constants.BRAZE);
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, bundleExtra, intent.getStringExtra("uri"), "true".equalsIgnoreCase(intent.getStringExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY)));
    }

    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendNotificationOpenedBroadcast.1
            @Override // Ia.a
            public final String invoke() {
                return "Sending notification opened broadcast";
            }
        }, 3, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    private final void sendPushActionIntent(Context context, final BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        Intent intent;
        int i10 = WhenMappings.$EnumSwitchMapping$0[brazeNotificationBroadcastType.ordinal()];
        if (i10 == 1) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            i.d(intent, "{\n                Intent…ackageName)\n            }");
        } else if (i10 == 2) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            i.d(intent, "{\n                Intent…ackageName)\n            }");
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            i.d(intent, "{\n                Intent…ackageName)\n            }");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendPushActionIntent.1
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
            }
        }, 2, (Object) null);
        sendPushActionIntent(context, intent, bundle);
        if (brazeNotificationPayload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, brazeNotificationBroadcastType.getBrazePushEventType(), brazeNotificationPayload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle notificationExtras, BrazeNotificationPayload payload) {
        i.e(context, "context");
        i.e(notificationExtras, "notificationExtras");
        i.e(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendPushMessageReceivedBroadcast.1
            @Override // Ia.a
            public final String invoke() {
                return "Sending push message received broadcast";
            }
        }, 3, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    public static final void setAccentColorIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setAccentColorIfPresentAndSupported.1
                @Override // Ia.a
                public final String invoke() {
                    return "Using accent color for notification from extras bundle";
                }
            }, 3, (Object) null);
            notificationBuilder.f16813s = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils$setAccentColorIfPresentAndSupported$2$1
                @Override // Ia.a
                public final String invoke() {
                    return "Using default accent color for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.f16813s = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    public static final void setCategoryIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setCategoryIfPresentAndSupported.2
                @Override // Ia.a
                public final String invoke() {
                    return "Category not present in notification extras. Not setting category for notification.";
                }
            }, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setCategoryIfPresentAndSupported.1
                @Override // Ia.a
                public final String invoke() {
                    return "Setting category for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.f16811q = notificationCategory;
        }
    }

    public static final void setContentIfPresent(v notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setContentIfPresent.1
            @Override // Ia.a
            public final String invoke() {
                return "Setting content for notification";
            }
        }, 3, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.f16801f = v.b(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    public static final void setContentIntentIfPresent(Context context, v notificationBuilder, Bundle bundle) {
        i.e(context, "context");
        i.e(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.f16802g = INSTANCE.getPushActionPendingIntent(context, Constants.BRAZE_PUSH_CLICKED_ACTION, bundle);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setContentIntentIfPresent.1
                @Override // Ia.a
                public final String invoke() {
                    return "Error setting content intent.";
                }
            });
        }
    }

    public static final void setDeleteIntent(Context context, v notificationBuilder, Bundle bundle) {
        i.e(context, "context");
        i.e(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent(Constants.BRAZE_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            i.d(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            notificationBuilder.f16793C.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setDeleteIntent.1
                @Override // Ia.a
                public final String invoke() {
                    return "Error setting delete intent.";
                }
            });
        }
    }

    public static final boolean setLargeIconIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        if (payload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.1
                @Override // Ia.a
                public final String invoke() {
                    return "Large icon not supported in story push.";
                }
            }, 3, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.2
                @Override // Ia.a
                public final String invoke() {
                    return "Setting large icon for notification";
                }
            }, 3, (Object) null);
            String largeIcon = payload.getLargeIcon();
            if (largeIcon != null) {
                notificationBuilder.e(Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.4
                @Override // Ia.a
                public final String invoke() {
                    return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
                }
            }, 3, (Object) null);
            int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
            if (largeNotificationIconResourceId != 0) {
                notificationBuilder.e(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.5
                @Override // Ia.a
                public final String invoke() {
                    return "Large icon resource id not present for notification";
                }
            }, 3, (Object) null);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.7
                @Override // Ia.a
                public final String invoke() {
                    return "Large icon not set for notification";
                }
            }, 3, (Object) null);
            return false;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setLargeIconIfPresentAndSupported.6
                @Override // Ia.a
                public final String invoke() {
                    return "Error setting large notification icon";
                }
            });
        }
    }

    public static final void setNotificationBadgeNumberIfPresent(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.f16804i = notificationBadgeNumber.intValue();
        }
    }

    public static final void setNotificationDurationAlarm(Context context, Class<?> cls, int i10, final int i11) {
        i.e(context, "context");
        Intent intent = new Intent(context, cls);
        intent.setAction(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, i10);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        i.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (i11 >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setNotificationDurationAlarm.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return q.c(new StringBuilder("Setting Notification duration alarm for "), i11, " ms");
                }
            }, 3, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i11), broadcast);
        }
    }

    public static final void setPriorityIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setPriorityIfPresentAndSupported.1
            @Override // Ia.a
            public final String invoke() {
                return "Setting priority for notification";
            }
        }, 3, (Object) null);
        notificationBuilder.j = getNotificationPriority(payload);
    }

    public static final void setPublicVersionIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle jsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (jsonObjectIntoBundle.isEmpty()) {
            return;
        }
        final BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(jsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        v vVar = new v(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setPublicVersionIfPresentAndSupported.2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Setting public version of notification with payload: " + brazeNotificationPayload;
            }
        }, 3, (Object) null);
        setContentIfPresent(vVar, brazeNotificationPayload);
        setTitleIfPresent(vVar, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(vVar, brazeNotificationPayload);
        setSmallIcon(configurationProvider, vVar);
        setAccentColorIfPresentAndSupported(vVar, brazeNotificationPayload);
        notificationBuilder.f16815u = vVar.a();
    }

    public static final void setSetShowWhen(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        if (payload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSetShowWhen.1
                @Override // Ia.a
                public final String invoke() {
                    return "Set show when not supported in story push.";
                }
            }, 3, (Object) null);
            notificationBuilder.f16805k = false;
        }
    }

    public static final int setSmallIcon(BrazeConfigurationProvider appConfigurationProvider, v notificationBuilder) {
        i.e(appConfigurationProvider, "appConfigurationProvider");
        i.e(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSmallIcon.1
                @Override // Ia.a
                public final String invoke() {
                    return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
                }
            }, 3, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSmallIcon.2
                @Override // Ia.a
                public final String invoke() {
                    return "Setting small icon for notification via resource id";
                }
            }, 3, (Object) null);
        }
        notificationBuilder.f16793C.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    public static final void setSoundIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (notificationSound.equals(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSoundIfPresentAndSupported.1
                @Override // Ia.a
                public final String invoke() {
                    return "Setting default sound for notification.";
                }
            }, 3, (Object) null);
            notificationBuilder.c(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSoundIfPresentAndSupported.2
                @Override // Ia.a
                public final String invoke() {
                    return "Setting sound for notification via uri.";
                }
            }, 3, (Object) null);
            notificationBuilder.f(Uri.parse(notificationSound));
        }
    }

    public static final void setSummaryTextIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSummaryTextIfPresentAndSupported.2
                @Override // Ia.a
                public final String invoke() {
                    return "Summary text not present. Not setting summary text for notification.";
                }
            }, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setSummaryTextIfPresentAndSupported.1
                @Override // Ia.a
                public final String invoke() {
                    return "Setting summary text for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.f16807m = v.b(summaryText);
        }
    }

    public static final void setTickerIfPresent(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setTickerIfPresent.1
            @Override // Ia.a
            public final String invoke() {
                return "Setting ticker for notification";
            }
        }, 3, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.f16793C.tickerText = v.b(titleText);
    }

    public static final void setTitleIfPresent(v notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setTitleIfPresent.1
            @Override // Ia.a
            public final String invoke() {
                return "Setting title for notification";
            }
        }, 3, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.f16800e = v.b(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    public static final void setVisibilityIfPresentAndSupported(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        final Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setVisibilityIfPresentAndSupported.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Received invalid notification visibility " + notificationVisibility;
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.setVisibilityIfPresentAndSupported.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Setting visibility for notification";
                    }
                }, 3, (Object) null);
                notificationBuilder.f16814t = notificationVisibility.intValue();
            }
        }
    }

    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider configurationProvider, Bundle bundle) {
        i.e(context, "context");
        i.e(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(bundle, null, context, configurationProvider, 2, null));
    }

    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        i.e(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            i.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Not waking this TV UI mode device";
                    }
                }, 3, (Object) null);
                return false;
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.2
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to check for TV status during screen wake. Continuing.";
                }
            });
        }
        Object systemService2 = context.getSystemService("notification");
        i.c(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        final NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
        if (validNotificationChannel == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.3
                @Override // Ia.a
                public final String invoke() {
                    return "Not waking screen on Android O+ device, could not find notification channel.";
                }
            }, 3, (Object) null);
            return false;
        }
        if (validNotificationChannel.getImportance() == 1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Not acquiring wake-lock for Android O+ notification with importance: " + validNotificationChannel.getImportance();
                }
            }, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.wakeScreenIfAppropriate.5
            @Override // Ia.a
            public final String invoke() {
                return "Waking screen for notification";
            }
        }, 3, (Object) null);
        Object systemService3 = context.getSystemService("power");
        i.c(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
        return true;
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, BrazePushEvent brazePush) {
        i.e(context, "context");
        i.e(brazePush, "brazePush");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.2
            @Override // Ia.a
            public final String invoke() {
                return "routeUserWithNotificationOpenedIntent called with BrazePushEvent";
            }
        }, 3, (Object) null);
        Bundle brazeExtras = brazePush.getNotificationPayload().getBrazeExtras();
        brazeExtras.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, brazePush.getNotificationPayload().getCampaignId());
        brazeExtras.putString(SOURCE_KEY, Constants.BRAZE);
        String deeplink = brazePush.getNotificationPayload().getDeeplink();
        Boolean useWebView = brazePush.getNotificationPayload().getUseWebView();
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, brazeExtras, deeplink, useWebView != null ? useWebView.booleanValue() : false);
    }

    private final void sendPushActionIntent(Context context, final Intent intent, Bundle bundle) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.sendPushActionIntent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Sending push action intent: " + intent;
            }
        }, 2, (Object) null);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        IntentUtils.addComponentAndSendBroadcast(context, intent);
    }

    private final void routeUserWithNotificationOpenedIntent(Context context, Bundle bundle, final String str, final boolean z10) {
        if (str != null && !n.S(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Found a deep link: " + str + ". Use webview set to: " + z10;
                }
            }, 3, (Object) null);
            bundle.putString("uri", str);
            bundle.putBoolean(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, z10);
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.Companion;
            UriAction uriActionCreateUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(str, bundle, z10, Channel.PUSH);
            if (uriActionCreateUriActionFromUrlString != null) {
                companion.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
                return;
            }
            return;
        }
        final Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationUtils.routeUserWithNotificationOpenedIntent.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Push notification had no deep link. Opening main activity: " + mainActivityIntent;
            }
        }, 3, (Object) null);
        context.startActivity(mainActivityIntent);
    }
}
