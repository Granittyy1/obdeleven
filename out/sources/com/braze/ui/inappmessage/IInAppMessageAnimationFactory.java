package com.braze.ui.inappmessage;

import android.view.animation.Animation;
import com.braze.models.inappmessage.IInAppMessage;

/* JADX INFO: compiled from: IInAppMessageAnimationFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageAnimationFactory {
    Animation getClosingAnimation(IInAppMessage iInAppMessage);

    Animation getOpeningAnimation(IInAppMessage iInAppMessage);
}
