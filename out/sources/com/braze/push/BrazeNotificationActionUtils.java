package com.braze.push;

import Ia.a;
import Q8.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.r;
import androidx.core.app.v;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: BrazeNotificationActionUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    public static final void addNotificationActions(v notificationBuilder, BrazeNotificationPayload payload) {
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationActions.1
                @Override // Ia.a
                public final String invoke() {
                    return "Context cannot be null when adding notification buttons.";
                }
            }, 3, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationActions.2
                @Override // Ia.a
                public final String invoke() {
                    return "No action buttons present. Not adding notification actions";
                }
            }, 3, (Object) null);
            return;
        }
        for (final BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationActions.3
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Adding action button: " + actionButton;
                }
            }, 2, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0099 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:30:0x0064, B:33:0x006f, B:35:0x0075, B:37:0x007c, B:39:0x0089, B:41:0x008f, B:43:0x009c, B:45:0x00ab, B:46:0x00af, B:42:0x0099, B:23:0x004f, B:26:0x0058, B:27:0x005d, B:47:0x00bc, B:48:0x00c9), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:30:0x0064, B:33:0x006f, B:35:0x0075, B:37:0x007c, B:39:0x0089, B:41:0x008f, B:43:0x009c, B:45:0x00ab, B:46:0x00af, B:42:0x0099, B:23:0x004f, B:26:0x0058, B:27:0x005d, B:47:0x00bc, B:48:0x00c9), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:30:0x0064, B:33:0x006f, B:35:0x0075, B:37:0x007c, B:39:0x0089, B:41:0x008f, B:43:0x009c, B:45:0x00ab, B:46:0x00af, B:42:0x0099, B:23:0x004f, B:26:0x0058, B:27:0x005d, B:47:0x00bc, B:48:0x00c9), top: B:52:0x000e }] */
    public static final void handleNotificationActionClicked(Context context, Intent intent) {
        Bundle extras;
        i.e(context, "context");
        i.e(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_TYPE_KEY);
            if (stringExtra != null && !n.S(stringExtra)) {
                int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
                brazeNotificationActionUtils.logNotificationActionClicked(context, intent, stringExtra);
                if (stringExtra != null) {
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode == -1424488370) {
                        if (!stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                        }
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                            intent.removeExtra("uri");
                        } else {
                            intent.removeExtra("uri");
                        }
                        BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                        if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                            BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                            return;
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked.2
                                @Override // Ia.a
                                public final String invoke() {
                                    return "Not handling deep links automatically, skipping deep link handling";
                                }
                            }, 2, (Object) null);
                            return;
                        }
                    }
                    if (iHashCode != -1209677674) {
                        if (iHashCode == -1209647192 && stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_OPEN)) {
                            BrazeNotificationUtils.cancelNotification(context, intExtra);
                            if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI) || (extras = intent.getExtras()) == null || !extras.containsKey(Constants.BRAZE_ACTION_URI_KEY)) {
                                intent.removeExtra("uri");
                            } else {
                                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                                Bundle extras2 = intent.getExtras();
                                if (extras2 != null && extras2.containsKey(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY)) {
                                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY));
                                }
                            }
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                                BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                                return;
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked.2
                                    @Override // Ia.a
                                    public final String invoke() {
                                        return "Not handling deep links automatically, skipping deep link handling";
                                    }
                                }, 2, (Object) null);
                                return;
                            }
                        }
                    } else if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_NONE)) {
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        return;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeNotificationActionUtils, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked.3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Unknown notification action button clicked. Doing nothing.";
                    }
                }, 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked.1
                @Override // Ia.a
                public final String invoke() {
                    return "Notification action button type was blank or null. Doing nothing.";
                }
            }, 2, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked.4
                @Override // Ia.a
                public final String invoke() {
                    return "Caught exception while handling notification action button click.";
                }
            });
        }
    }

    public final void addNotificationAction(v notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        i.e(notificationBuilder, "notificationBuilder");
        i.e(payload, "payload");
        i.e(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot add notification action with null context from payload";
                }
            }, 3, (Object) null);
            return;
        }
        final Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        final String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (Constants.BRAZE_PUSH_ACTION_TYPE_NONE.equals(type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Adding notification action with type: " + type + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
                }
            }, 2, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            i.d(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            i.d(activity, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return d.a(new StringBuilder("Adding notification action with type: "), type, " Setting intent class to trampoline activity");
                }
            }, 2, (Object) null);
            Intent intent2 = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            i.d(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            i.d(activity, "getActivity(\n           …IntentFlags\n            )");
        }
        r.a aVar = new r.a(0, activity, actionButton.getText());
        aVar.f16778e.putAll(new Bundle(bundle));
        notificationBuilder.f16797b.add(aVar.a());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Added action with bundle: " + bundle;
            }
        }, 2, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String str) {
        i.e(context, "context");
        i.e(intent, "intent");
        Braze.Companion.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.BRAZE_ACTION_ID_KEY), str);
    }
}
