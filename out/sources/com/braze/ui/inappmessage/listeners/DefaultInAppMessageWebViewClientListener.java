package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: DefaultInAppMessageWebViewClientListener.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    public static final Companion Companion = new Companion(null);
    private static final String HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY = "name";

    /* JADX INFO: compiled from: DefaultInAppMessageWebViewClientListener.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void logHtmlInAppMessageClick(IInAppMessage inAppMessage, Bundle queryBundle) {
            i.e(inAppMessage, "inAppMessage");
            i.e(queryBundle, "queryBundle");
            if (!queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID)) {
                if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    inAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID);
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            }
        }

        public final String parseCustomEventNameFromQueryBundle(Bundle queryBundle) {
            i.e(queryBundle, "queryBundle");
            return queryBundle.getString(DefaultInAppMessageWebViewClientListener.HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY);
        }

        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle queryBundle) {
            String string;
            i.e(queryBundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String key : queryBundle.keySet()) {
                if (!i.a(key, DefaultInAppMessageWebViewClientListener.HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY) && (string = queryBundle.getString(key, null)) != null && !n.S(string)) {
                    i.d(key, "key");
                    brazeProperties.addProperty(key, string);
                }
            }
            return brazeProperties;
        }

        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage inAppMessage, Bundle queryBundle) {
            boolean z10;
            boolean z11;
            boolean z12;
            i.e(inAppMessage, "inAppMessage");
            i.e(queryBundle, "queryBundle");
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK)) {
                z10 = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK));
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z12 = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
                z11 = true;
            } else {
                z12 = false;
            }
            boolean openUriInWebView = inAppMessage.getOpenUriInWebView();
            if (z11) {
                return (z10 || z12) ? false : true;
            }
            return openUriInWebView;
        }

        private Companion() {
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    public static final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
    }

    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return Companion.parseCustomEventNameFromQueryBundle(bundle);
    }

    public static final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        return Companion.parsePropertiesFromQueryBundle(bundle);
    }

    public static final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        return Companion.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCloseAction.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCloseAction called.";
            }
        }, 3, (Object) null);
        Companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCloseAction.2
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCloseAction finished.";
            }
        }, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Companion companion;
        String customEventNameFromQueryBundle;
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCustomEventAction.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCustomEventAction.2
                @Override // Ia.a
                public final String invoke() {
                    return "Can't perform custom event action because the activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle) || (customEventNameFromQueryBundle = (companion = Companion).parseCustomEventNameFromQueryBundle(queryBundle)) == null || n.S(customEventNameFromQueryBundle)) {
            return;
        }
        BrazeProperties propertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.Companion.getInstance(activity).logCustomEvent(customEventNameFromQueryBundle, propertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onNewsfeedAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onNewsfeedAction.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onNewsfeedAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onNewsfeedAction.2
                @Override // Ia.a
                public final String invoke() {
                    return "Can't perform news feed action because the cached activity is null.";
                }
            }, 2, (Object) null);
            return;
        }
        Companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(inAppMessage, url, queryBundle)) {
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        NewsfeedAction newsfeedAction = new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, newsfeedAction);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, final String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.1
            @Override // Ia.a
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
            }
        }, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Can't perform other url action because the cached activity is null. Url: " + url;
                }
            }, 2, (Object) null);
            return;
        }
        Companion companion = Companion;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + url;
                }
            }, 2, (Object) null);
            return;
        }
        boolean useWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.Companion;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(url, bundle, useWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + url;
                }
            }, 2, (Object) null);
            return;
        }
        final Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + url;
                }
            }, 2, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            companion2.getInstance().gotoUri(activity, uriActionCreateUriActionFromUrlString);
        }
    }
}
