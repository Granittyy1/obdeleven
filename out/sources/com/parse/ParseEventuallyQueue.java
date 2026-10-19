package com.parse;

import com.parse.boltsinternal.Task;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class ParseEventuallyQueue {
    private boolean isConnected;

    public ParseRESTCommand commandFromJSON(JSONObject jSONObject) throws JSONException {
        if (ParseRESTCommand.isValidCommandJSONObject(jSONObject)) {
            return ParseRESTCommand.fromJSONObject(jSONObject);
        }
        if (ParseRESTCommand.isValidOldFormatCommandJSONObject(jSONObject)) {
            return null;
        }
        throw new JSONException("Failed to load command from JSON.");
    }

    public abstract Task<JSONObject> enqueueEventuallyAsync(ParseRESTCommand parseRESTCommand, ParseObject parseObject);

    public boolean isConnected() {
        return this.isConnected;
    }

    public void notifyTestHelper(int i10, Throwable th) {
    }

    public void setConnected(boolean z10) {
        this.isConnected = z10;
    }

    public Task<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet parseOperationSet, EventuallyPin eventuallyPin) {
        return Task.forResult(null);
    }

    public void notifyTestHelper(int i10) {
        notifyTestHelper(i10, null);
    }

    public void fakeObjectUpdate() {
    }
}
