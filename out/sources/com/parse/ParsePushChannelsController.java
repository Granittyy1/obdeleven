package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ParsePushChannelsController {
    private static ParseCurrentInstallationController getCurrentInstallationController() {
        return ParseCorePlugins.getInstance().getCurrentInstallationController();
    }

    public Task<Void> subscribeInBackground(final String str) {
        if (str != null) {
            return getCurrentInstallationController().getAsync().onSuccessTask(new Continuation<ParseInstallation, Task<Void>>() { // from class: com.parse.ParsePushChannelsController.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<ParseInstallation> task) {
                    ParseInstallation result = task.getResult();
                    List list = result.getList("channels");
                    if (list != null && !result.isDirty("channels") && list.contains(str)) {
                        return Task.forResult(null);
                    }
                    result.addUnique("channels", str);
                    return result.saveInBackground();
                }
            });
        }
        throw new IllegalArgumentException("Can't subscribe to null channel.");
    }
}
