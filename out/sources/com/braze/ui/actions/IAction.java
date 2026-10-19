package com.braze.ui.actions;

import android.content.Context;
import com.braze.enums.Channel;

/* JADX INFO: compiled from: IAction.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IAction {
    void execute(Context context);

    Channel getChannel();
}
