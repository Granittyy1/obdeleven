package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.models.inappmessage.IInAppMessage;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IHtmlInAppMessageActionListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
    }

    default boolean onCustomEventFired(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        return false;
    }

    default boolean onNewsfeedClicked(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        return false;
    }

    default boolean onOtherUrlAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        i.e(inAppMessage, "inAppMessage");
        i.e(url, "url");
        i.e(queryBundle, "queryBundle");
        return false;
    }
}
