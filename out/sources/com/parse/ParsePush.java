package com.parse;

import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
public class ParsePush {
    public static ParsePushChannelsController getPushChannelsController() {
        return ParseCorePlugins.getInstance().getPushChannelsController();
    }

    public static Task<Void> subscribeInBackground(String str) {
        return getPushChannelsController().subscribeInBackground(str);
    }
}
