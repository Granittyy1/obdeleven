package com.parse;

import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
class TaskStackBuilderHelper {
    public static void startActivities(Context context, Class<? extends Activity> cls, Intent intent) {
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addParentStack(cls);
        taskStackBuilderCreate.addNextIntent(intent);
        taskStackBuilderCreate.startActivities();
    }
}
