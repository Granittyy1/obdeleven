package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.models.inappmessage.IInAppMessage;

/* JADX INFO: compiled from: IInAppMessageWebViewClientListener.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageWebViewClientListener {
    void onCloseAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onCustomEventAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onNewsfeedAction(IInAppMessage iInAppMessage, String str, Bundle bundle);

    void onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle);
}
