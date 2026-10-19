package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class NetworkSessionController implements ParseSessionController {
    private final ParseHttpClient client;
    private final ParseObjectCoder coder = ParseObjectCoder.get();

    public NetworkSessionController(ParseHttpClient parseHttpClient) {
        this.client = parseHttpClient;
    }

    @Override // com.parse.ParseSessionController
    public Task<ParseObject.State> getSessionAsync(String str) {
        return ParseRESTSessionCommand.getCurrentSessionCommand(str).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseObject.State>() { // from class: com.parse.NetworkSessionController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject.State then(Task<JSONObject> task) {
                return ((ParseObject.State.Builder) NetworkSessionController.this.coder.decode(new ParseObject.State.Builder("_Session"), task.getResult(), ParseDecoder.get())).isComplete(true).build();
            }
        });
    }

    @Override // com.parse.ParseSessionController
    public Task<Void> revokeAsync(String str) {
        return ParseRESTSessionCommand.revoke(str).executeAsync(this.client).makeVoid();
    }
}
