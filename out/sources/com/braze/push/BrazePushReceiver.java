package com.braze.push;

import Ia.a;
import Na.l;
import Q8.d;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.random.Random;
import kotlinx.coroutines.C2680e;
import p005a4.q;

/* JADX INFO: compiled from: BrazePushReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazePushReceiver extends BroadcastReceiver {
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";
    public static final Companion Companion = new Companion(null);
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";
    private static final String MESSAGE_TYPE_KEY = "message_type";
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    /* JADX INFO: compiled from: BrazePushReceiver.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) {
            Context applicationContext = context.getApplicationContext();
            final String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Caught exception while performing the push notification handling work. Action: " + action + " Intent: " + intent;
                    }
                });
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            if (r9.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r9.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r9.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        
            if (r9.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
        
            r8.handlePushNotificationPayload(r10, r11);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void handlePush$performWork(java.lang.String r9, android.content.Context r10, final android.content.Intent r11, android.content.Context r12) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            companion.handleReceivedIntent(context, intent, z10);
        }

        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            i.e(context, "context");
            i.e(appConfigurationProvider, "appConfigurationProvider");
            i.e(notificationExtras, "notificationExtras");
            i.e(brazeExtras, "brazeExtras");
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, final Intent intent) {
            i.e(appConfigurationProvider, "appConfigurationProvider");
            i.e(context, "context");
            i.e(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Received ADM registration. Message: " + intent;
                }
            }, 2, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
                    }
                }, 2, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$2
                @Override // Ia.a
                public final String invoke() {
                    return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
                }
            }, 3, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            final String stringExtra = intent.getStringExtra(BrazePushReceiver.ADM_ERROR_KEY);
            final String stringExtra2 = intent.getStringExtra(BrazePushReceiver.ADM_ERROR_DESCRIPTION_KEY);
            final String stringExtra3 = intent.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            final String stringExtra4 = intent.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Error during ADM registration: " + stringExtra + " description: " + stringExtra2;
                    }
                }, 2, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Registering for ADM messages with registrationId: " + stringExtra3;
                    }
                }, 2, (Object) null);
                Braze.Companion.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "The device was un-registered from ADM: " + stringExtra4;
                    }
                }, 2, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$4
                @Override // Ia.a
                public final String invoke() {
                    return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
                }
            }, 2, (Object) null);
            return false;
        }

        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Not handling non-Braze push message.";
                    }
                }, 3, (Object) null);
                return false;
            }
            if (BrazePushReceiver.DELETED_MESSAGES_KEY.equals(intent.getStringExtra(BrazePushReceiver.MESSAGE_TYPE_KEY))) {
                final int intExtra = intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return q.c(new StringBuilder("Firebase messaging 'total_deleted' reports "), intExtra, " messages.");
                    }
                }, 2, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Push message payload received: " + extras;
                }
            }, 2, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.Companion.getAttachedBrazeExtras(extras);
            extras.putBundle(Constants.BRAZE_PUSH_EXTRAS_KEY, attachedBrazeExtras);
            if (!extras.containsKey(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
                extras.putLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS, System.currentTimeMillis());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            final BrazeNotificationPayload brazeNotificationPayloadCreatePayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (brazeNotificationPayloadCreatePayload.isUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$4
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
                    }
                }, 2, (Object) null);
                return false;
            }
            final String pushUniqueId = brazeNotificationPayloadCreatePayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, BrazePushReceiver.Companion, priority, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return d.a(new StringBuilder("Push with identifier '"), pushUniqueId, "' has already been seen. Not displaying or forwarding push.");
                    }
                }, 2, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayloadCreatePayload);
            if (brazeNotificationPayloadCreatePayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.Companion.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$6
                    @Override // Ia.a
                    public final String invoke() {
                        return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
                    }
                }, 3, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$14
                    @Override // Ia.a
                    public final String invoke() {
                        return "Received silent push notification";
                    }
                }, 3, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
                BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate(brazeNotificationPayloadCreatePayload);
                BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(brazeNotificationPayloadCreatePayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$7
                @Override // Ia.a
                public final String invoke() {
                    return "Received visible push notification";
                }
            }, 3, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(brazeNotificationPayloadCreatePayload);
            extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
            if (brazeNotificationPayloadCreatePayload.isPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$8
                        @Override // Ia.a
                        public final String invoke() {
                            return "Push stories not supported on Amazon devices.";
                        }
                    }, 3, (Object) null);
                    return false;
                }
                if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$9
                        @Override // Ia.a
                        public final String invoke() {
                            return "Received the initial Push Story notification.";
                        }
                    }, 3, (Object) null);
                    extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$10
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Creating notification with payload:\n" + brazeNotificationPayloadCreatePayload;
                }
            }, 2, (Object) null);
            Notification notificationCreateNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(brazeNotificationPayloadCreatePayload);
            if (notificationCreateNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$11
                    @Override // Ia.a
                    public final String invoke() {
                        return "Notification created by notification factory was null. Not displaying notification.";
                    }
                }, 3, (Object) null);
                return false;
            }
            final NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            i.d(notificationManagerCompatFrom, "from(context)");
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$12
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompatFrom.areNotificationsEnabled();
                }
            }, 3, (Object) null);
            notificationManagerCompatFrom.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, notificationCreateNotification);
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = brazeNotificationPayloadCreatePayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            logNotificationMetadata$android_sdk_ui_release(context, brazeNotificationPayloadCreatePayload);
            return true;
        }

        public final void handleReceivedIntent(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            handleReceivedIntent$default(this, context, intent, false, 4, null);
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload payload) {
            String campaignId;
            i.e(context, "context");
            i.e(payload, "payload");
            if (payload.isPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long jY = l.y(payload.getFlushMinMinutes(), 0L);
                long jY2 = l.y(payload.getFlushMaxMinutes(), jY);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(jY);
                if (jY2 > jY) {
                    Random.Default r10 = Random.f43064b;
                    long millis2 = timeUnit.toMillis(jY2);
                    r10.getClass();
                    millis = Random.f43065c.g(millis, millis2);
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }

        public final void handleReceivedIntent(Context context, Intent intent, boolean z10) {
            i.e(context, "context");
            i.e(intent, "intent");
            if (z10) {
                C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3);
            } else {
                handlePush(context, intent);
            }
        }
    }

    public static final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        return Companion.createPayload(context, brazeConfigurationProvider, bundle, bundle2);
    }

    public static final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        return Companion.handleAdmRegistrationEventIfEnabled(brazeConfigurationProvider, context, intent);
    }

    public static final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
        return Companion.handleAdmRegistrationIntent(context, intent);
    }

    public static final boolean handlePushNotificationPayload(Context context, Intent intent) {
        return Companion.handlePushNotificationPayload(context, intent);
    }

    public static final void handleReceivedIntent(Context context, Intent intent) {
        Companion.handleReceivedIntent(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        Companion.handleReceivedIntent$default(Companion, context, intent, false, 4, null);
    }

    public static final void handleReceivedIntent(Context context, Intent intent, boolean z10) {
        Companion.handleReceivedIntent(context, intent, z10);
    }
}
