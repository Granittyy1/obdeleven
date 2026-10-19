package com.braze;

import android.app.Activity;
import android.content.Intent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONObject;
import p293xa.d;

/* JADX INFO: loaded from: classes.dex */
public interface IBraze {
    static /* synthetic */ void logPurchase$default(IBraze iBraze, String str, String str2, BigDecimal bigDecimal, int i10, BrazeProperties brazeProperties, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logPurchase");
        }
        if ((i11 & 8) != 0) {
            i10 = 1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            brazeProperties = null;
        }
        iBraze.logPurchase(str, str2, bigDecimal, i12, brazeProperties);
    }

    <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void changeUser(String str);

    void changeUser(String str, String str2);

    void closeSession(Activity activity);

    Card deserializeContentCard(String str);

    Card deserializeContentCard(JSONObject jSONObject);

    IInAppMessage deserializeInAppMessageString(String str);

    List<FeatureFlag> getAllFeatureFlags();

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    BrazeUser getCurrentUser();

    void getCurrentUser(IValueCallback<BrazeUser> iValueCallback);

    String getDeviceId();

    void getDeviceIdAsync(IValueCallback<String> iValueCallback);

    FeatureFlag getFeatureFlag(String str);

    IBrazeImageLoader getImageLoader();

    @d
    default String getInstallTrackingId() {
        return getDeviceId();
    }

    String getRegisteredPushToken();

    void logCustomEvent(String str);

    void logCustomEvent(String str, BrazeProperties brazeProperties);

    void logFeatureFlagImpression(String str);

    @d
    void logFeedCardClick(String str);

    @d
    void logFeedCardImpression(String str);

    void logFeedDisplayed();

    void logPurchase(String str, String str2, BigDecimal bigDecimal);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i10);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i10, BrazeProperties brazeProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties);

    void logPushNotificationActionClicked(String str, String str2, String str3);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String str);

    void logPushStoryPageClicked(String str, String str2);

    void openSession(Activity activity);

    void refreshFeatureFlags();

    <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void requestContentCardsRefresh();

    @d
    void requestContentCardsRefresh(boolean z10);

    void requestContentCardsRefreshFromCache();

    void requestFeedRefresh();

    void requestFeedRefreshFromCache();

    void requestGeofences(double d10, double d11);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    void setGoogleAdvertisingId(String str, boolean z10);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setRegisteredPushToken(String str);

    void setSdkAuthenticationSignature(String str);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber);

    void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber);

    void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber);

    void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> iEventSubscriber);

    void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> iEventSubscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber);
}
