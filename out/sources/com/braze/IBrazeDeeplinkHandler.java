package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.enums.Channel;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;

/* JADX INFO: compiled from: IBrazeDeeplinkHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IBrazeDeeplinkHandler {

    /* JADX INFO: compiled from: IBrazeDeeplinkHandler.kt */
    public enum IntentFlagPurpose {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT
    }

    UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z10, Channel channel);

    UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z10, Channel channel);

    int getIntentFlags(IntentFlagPurpose intentFlagPurpose);

    void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction);

    void gotoUri(Context context, UriAction uriAction);
}
