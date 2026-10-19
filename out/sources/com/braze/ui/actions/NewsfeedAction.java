package com.braze.ui.actions;

import Ia.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.BrazeFeedActivity;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NewsfeedAction.kt */
/* JADX INFO: loaded from: classes.dex */
public class NewsfeedAction implements IAction {
    private final Channel channel;
    private final Bundle extras;

    public NewsfeedAction(Bundle bundle, Channel channel) {
        i.e(channel, "channel");
        this.extras = bundle;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        i.e(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) BrazeFeedActivity.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.actions.NewsfeedAction.execute.1
                @Override // Ia.a
                public final String invoke() {
                    return "BrazeFeedActivity was not opened successfully.";
                }
            });
        }
    }

    @Override // com.braze.ui.actions.IAction
    public Channel getChannel() {
        return this.channel;
    }

    public final Bundle getExtras() {
        return this.extras;
    }
}
