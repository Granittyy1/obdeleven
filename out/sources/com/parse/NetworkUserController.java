package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class NetworkUserController implements ParseUserController {
    private final ParseHttpClient client;
    private final ParseObjectCoder coder;
    private final boolean revocableSession;

    public NetworkUserController(ParseHttpClient parseHttpClient) {
        this(parseHttpClient, false);
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> getUserAsync(String str) {
        return ParseRESTUserCommand.getCurrentUserCommand(str).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseUser.State>() { // from class: com.parse.NetworkUserController.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseUser.State then(Task<JSONObject> task) {
                return ((ParseUser.State.Builder) NetworkUserController.this.coder.decode(new ParseUser.State.Builder(), task.getResult(), ParseDecoder.get())).isComplete(true).build();
            }
        });
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> logInAsync(String str, String str2) {
        return ParseRESTUserCommand.logInUserCommand(str, str2, this.revocableSession).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseUser.State>() { // from class: com.parse.NetworkUserController.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseUser.State then(Task<JSONObject> task) {
                return ((ParseUser.State.Builder) NetworkUserController.this.coder.decode(new ParseUser.State.Builder(), task.getResult(), ParseDecoder.get())).isComplete(true).build();
            }
        });
    }

    @Override // com.parse.ParseUserController
    public Task<Void> requestPasswordResetAsync(String str) {
        return ParseRESTUserCommand.resetPasswordResetCommand(str).executeAsync(this.client).makeVoid();
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> signUpAsync(ParseObject.State state, ParseOperationSet parseOperationSet, String str) {
        return ParseRESTUserCommand.signUpUserCommand(this.coder.encode(state, parseOperationSet, PointerEncoder.get()), str, this.revocableSession).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseUser.State>() { // from class: com.parse.NetworkUserController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseUser.State then(Task<JSONObject> task) {
                return ((ParseUser.State.Builder) NetworkUserController.this.coder.decode(new ParseUser.State.Builder(), task.getResult(), ParseDecoder.get())).isComplete(false).isNew(true).build();
            }
        });
    }

    public NetworkUserController(ParseHttpClient parseHttpClient, boolean z10) {
        this.client = parseHttpClient;
        this.coder = ParseObjectCoder.get();
        this.revocableSession = z10;
    }

    @Override // com.parse.ParseUserController
    public Task<ParseUser.State> logInAsync(ParseUser.State state, ParseOperationSet parseOperationSet) {
        final ParseRESTUserCommand parseRESTUserCommandServiceLogInUserCommand = ParseRESTUserCommand.serviceLogInUserCommand(this.coder.encode(state, parseOperationSet, PointerEncoder.get()), state.sessionToken(), this.revocableSession);
        return parseRESTUserCommandServiceLogInUserCommand.executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseUser.State>() { // from class: com.parse.NetworkUserController.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseUser.State then(Task<JSONObject> task) {
                JSONObject result = task.getResult();
                boolean z10 = parseRESTUserCommandServiceLogInUserCommand.getStatusCode() == 201;
                return ((ParseUser.State.Builder) NetworkUserController.this.coder.decode(new ParseUser.State.Builder(), result, ParseDecoder.get())).isComplete(!z10).isNew(z10).build();
            }
        });
    }
}
