package com.braze.ui.inappmessage.views;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: IInAppMessageImmersiveView.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageImmersiveView extends IInAppMessageView {
    List<View> getMessageButtonViews(int i10);

    View getMessageCloseButtonView();

    void setupDirectionalNavigation(int i10);
}
