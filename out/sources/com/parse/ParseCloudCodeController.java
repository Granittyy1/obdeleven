package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseCloudCodeController {
    final ParseHttpClient restClient;

    public ParseCloudCodeController(ParseHttpClient parseHttpClient) {
        this.restClient = parseHttpClient;
    }

    public <T> Task<T> callFunctionInBackground(String str, Map<String, ?> map, String str2) {
        return (Task<T>) ParseRESTCloudCommand.callFunctionCommand(str, map, str2).executeAsync(this.restClient).onSuccess(new Continuation<JSONObject, T>() { // from class: com.parse.ParseCloudCodeController.1
            @Override // com.parse.boltsinternal.Continuation
            public T then(Task<JSONObject> task) {
                return (T) ParseCloudCodeController.this.convertCloudResponse(task.getResult());
            }
        });
    }

    public Object convertCloudResponse(Object obj) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.isNull("result")) {
                return null;
            }
            obj = jSONObject.opt("result");
        }
        Object objDecode = ParseDecoder.get().decode(obj);
        return objDecode != null ? objDecode : obj;
    }
}
