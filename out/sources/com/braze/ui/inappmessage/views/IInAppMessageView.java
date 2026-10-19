package com.braze.ui.inappmessage.views;

import android.view.View;
import androidx.core.view.n0;

/* JADX INFO: compiled from: IInAppMessageView.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageView {
    void applyWindowInsets(n0 n0Var);

    boolean getHasAppliedWindowInsets();

    View getMessageClickableView();

    void setHasAppliedWindowInsets(boolean z10);
}
