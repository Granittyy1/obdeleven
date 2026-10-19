package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.jvm.internal.i;
import p293xa.d;

/* JADX INFO: compiled from: IInAppMessageManagerListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
    }

    default void afterInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
    }

    default InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        return InAppMessageOperation.DISPLAY_NOW;
    }

    default void beforeInAppMessageViewClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
    }

    default void beforeInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage inAppMessage, MessageButton button) {
        i.e(inAppMessage, "inAppMessage");
        i.e(button, "button");
        return false;
    }

    default boolean onInAppMessageClicked(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        return false;
    }

    default void onInAppMessageDismissed(IInAppMessage inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
    }

    @d
    default boolean onInAppMessageButtonClicked(IInAppMessage inAppMessage, MessageButton button, InAppMessageCloser inAppMessageCloser) throws BrazeFunctionNotImplemented {
        i.e(inAppMessage, "inAppMessage");
        i.e(button, "button");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }

    @d
    default boolean onInAppMessageClicked(IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) throws BrazeFunctionNotImplemented {
        i.e(inAppMessage, "inAppMessage");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }
}
