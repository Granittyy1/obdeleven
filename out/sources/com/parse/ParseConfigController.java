package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseConfigController {
    private ParseCurrentConfigController currentConfigController;
    private final ParseHttpClient restClient;

    public ParseConfigController(ParseHttpClient parseHttpClient, ParseCurrentConfigController parseCurrentConfigController) {
        this.restClient = parseHttpClient;
        this.currentConfigController = parseCurrentConfigController;
    }

    public Task<ParseConfig> getAsync(String str) {
        return ParseRESTConfigCommand.fetchConfigCommand(str).executeAsync(this.restClient).onSuccessTask(new Continuation<JSONObject, Task<ParseConfig>>() { // from class: com.parse.ParseConfigController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<ParseConfig> then(Task<JSONObject> task) {
                final ParseConfig parseConfigDecode = ParseConfig.decode(task.getResult(), ParseDecoder.get());
                return ParseConfigController.this.currentConfigController.setCurrentConfigAsync(parseConfigDecode).continueWith(new Continuation<Void, ParseConfig>() { // from class: com.parse.ParseConfigController.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public ParseConfig then(Task<Void> task2) {
                        return parseConfigDecode;
                    }
                });
            }
        });
    }

    public ParseCurrentConfigController getCurrentConfigController() {
        return this.currentConfigController;
    }
}
