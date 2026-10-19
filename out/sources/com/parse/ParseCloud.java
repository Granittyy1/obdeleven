package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ParseCloud {
    public static <T> T callFunction(String str, Map<String, ?> map) throws ParseException {
        return (T) ParseTaskUtils.wait(callFunctionInBackground(str, map));
    }

    public static <T> Task<T> callFunctionInBackground(final String str, final Map<String, ?> map) {
        return (Task<T>) ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<T>>() { // from class: com.parse.ParseCloud.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<String> task) {
                return ParseCloud.getCloudCodeController().callFunctionInBackground(str, map, task.getResult());
            }
        });
    }

    public static ParseCloudCodeController getCloudCodeController() {
        return ParseCorePlugins.getInstance().getCloudCodeController();
    }
}
