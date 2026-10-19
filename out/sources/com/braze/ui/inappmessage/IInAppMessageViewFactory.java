package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;

/* JADX INFO: compiled from: IInAppMessageViewFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageViewFactory {
    View createInAppMessageView(Activity activity, IInAppMessage iInAppMessage);
}
