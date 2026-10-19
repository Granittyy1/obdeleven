package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import io.intercom.android.sdk.models.Participant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("_Session")
public class ParseSession extends ParseObject {
    private static final List<String> READ_ONLY_KEYS = Collections.unmodifiableList(Arrays.asList("sessionToken", "createdWith", "restricted", Participant.USER_TYPE, "expiresAt", "installationId"));

    public static Task<ParseSession> getCurrentSessionInBackground() {
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<ParseSession>>() { // from class: com.parse.ParseSession.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<ParseSession> then(Task<String> task) {
                String result = task.getResult();
                return result == null ? Task.forResult(null) : ParseSession.getSessionController().getSessionAsync(result).onSuccess(new Continuation<ParseObject.State, ParseSession>() { // from class: com.parse.ParseSession.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public ParseSession then(Task<ParseObject.State> task2) {
                        return (ParseSession) ParseObject.from(task2.getResult());
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ParseSessionController getSessionController() {
        return ParseCorePlugins.getInstance().getSessionController();
    }

    public static boolean isRevocableSessionToken(String str) {
        return str.contains("r:");
    }

    public static Task<Void> revokeAsync(String str) {
        return (str == null || !isRevocableSessionToken(str)) ? Task.forResult(null) : getSessionController().revokeAsync(str);
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_KEYS.contains(str);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }
}
