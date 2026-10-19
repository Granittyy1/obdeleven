package com.braze.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;

/* JADX INFO: compiled from: IInAppMessageViewWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageViewWrapper {
    void close();

    IInAppMessage getInAppMessage();

    View getInAppMessageView();

    boolean isAnimatingClose();

    void open(Activity activity);
}
