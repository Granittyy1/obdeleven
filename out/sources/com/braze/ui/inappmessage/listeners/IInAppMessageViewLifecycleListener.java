package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageCloser;

/* JADX INFO: compiled from: IInAppMessageViewLifecycleListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(IInAppMessage iInAppMessage);

    void afterOpened(View view, IInAppMessage iInAppMessage);

    void beforeClosed(View view, IInAppMessage iInAppMessage);

    void beforeOpened(View view, IInAppMessage iInAppMessage);

    void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive);

    void onClicked(InAppMessageCloser inAppMessageCloser, View view, IInAppMessage iInAppMessage);

    void onDismissed(View view, IInAppMessage iInAppMessage);
}
