package com.braze.ui.inappmessage.factories;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DefaultInAppMessageViewWrapperFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageViewWrapperFactory implements IInAppMessageViewWrapperFactory {
    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        i.e(configurationProvider, "configurationProvider");
        return new DefaultInAppMessageViewWrapper(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, null, null, 384, null);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list, View view2) {
        i.e(inAppMessageView, "inAppMessageView");
        i.e(inAppMessage, "inAppMessage");
        i.e(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        i.e(configurationProvider, "configurationProvider");
        return new DefaultInAppMessageViewWrapper(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, list, view2);
    }
}
