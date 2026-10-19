package com.braze.ui.inappmessage.listeners;

import android.content.Context;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageThemeable;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.support.ViewUtils;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DefaultInAppMessageManagerListener.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageManagerListener implements IInAppMessageManagerListener {
    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
        Context applicationContext;
        i.e(inAppMessage, "inAppMessage");
        if ((inAppMessage instanceof IInAppMessageThemeable) && (applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext()) != null && ViewUtils.isDeviceInNightMode(applicationContext)) {
            ((IInAppMessageThemeable) inAppMessage).enableDarkTheme();
        }
        return InAppMessageOperation.DISPLAY_NOW;
    }
}
