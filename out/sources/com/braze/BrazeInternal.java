package com.braze;

import android.content.Context;
import android.content.Intent;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.InAppMessageEvent;
import com.braze.models.IBrazeLocation;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    public static final void addSerializedContentCardToStorage(Context context, String serializedCardJson, String str) {
        i.e(context, "context");
        i.e(serializedCardJson, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(serializedCardJson, str);
    }

    public static final void applyPendingRuntimeConfiguration(Context context) {
        i.e(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    private final Braze getInstance(Context context) {
        return Braze.Companion.getInstance(context);
    }

    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    public static final void logLocationRecordedEvent(Context context, IBrazeLocation location) {
        i.e(context, "context");
        i.e(location, "location");
        INSTANCE.getInstance(context).logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(location);
    }

    public static final void recordGeofenceTransition(Context context, String geofenceId, GeofenceTransitionType transitionType) {
        i.e(context, "context");
        i.e(geofenceId, "geofenceId");
        i.e(transitionType, "transitionType");
        INSTANCE.getInstance(context).recordGeofenceTransition$android_sdk_base_release(geofenceId, transitionType);
    }

    public static final void refreshFeatureFlags(Context context) {
        i.e(context, "context");
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    public static final void requestGeofenceRefresh(Context context, boolean z10) {
        i.e(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(z10);
    }

    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        i.e(context, "context");
        i.e(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final BrazeConfigurationProvider getConfigurationProvider(Context context) {
        i.e(context, "context");
        return getInstance(context).getConfigurationProviderSafe$android_sdk_base_release(context);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String campaignId) {
        i.e(context, "context");
        i.e(campaignId, "campaignId");
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(campaignId);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String campaignId, long j) {
        i.e(context, "context");
        i.e(campaignId, "campaignId");
        getInstance(context).logPushDelivery$android_sdk_base_release(campaignId, j);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        i.e(context, "context");
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        i.e(context, "context");
        i.e(pushActionType, "pushActionType");
        i.e(payload, "payload");
        getInstance(context).publishBrazePushAction$android_sdk_base_release(pushActionType, payload);
    }

    public final void reenqueueInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        i.e(context, "context");
        i.e(inAppMessageEvent, "inAppMessageEvent");
        getInstance(context).reenqueueInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final /* synthetic */ boolean validateAndStorePushId(Context context, String pushId) {
        i.e(context, "context");
        i.e(pushId, "pushId");
        return getInstance(context).validateAndStorePushId$android_sdk_base_release(pushId);
    }

    public static final void requestGeofenceRefresh(Context context, IBrazeLocation location) {
        i.e(context, "context");
        i.e(location, "location");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(location);
    }
}
