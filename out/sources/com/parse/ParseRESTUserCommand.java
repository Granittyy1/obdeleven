package com.parse;

import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTUserCommand extends ParseRESTCommand {
    private boolean isRevocableSessionEnabled;
    private int statusCode;

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        this(str, method, map, str2, false);
    }

    public static ParseRESTUserCommand getCurrentUserCommand(String str) {
        return new ParseRESTUserCommand("users/me", ParseHttpRequest.Method.GET, null, str);
    }

    public static ParseRESTUserCommand logInUserCommand(String str, String str2, boolean z10) {
        HashMap map = new HashMap();
        map.put("username", str);
        map.put("password", str2);
        return new ParseRESTUserCommand("login", ParseHttpRequest.Method.GET, map, (String) null, z10);
    }

    public static ParseRESTUserCommand resetPasswordResetCommand(String str) {
        HashMap map = new HashMap();
        map.put("email", str);
        return new ParseRESTUserCommand("requestPasswordReset", ParseHttpRequest.Method.POST, map, null);
    }

    public static ParseRESTUserCommand serviceLogInUserCommand(JSONObject jSONObject, String str, boolean z10) {
        return new ParseRESTUserCommand("users", ParseHttpRequest.Method.POST, jSONObject, str, z10);
    }

    public static ParseRESTUserCommand signUpUserCommand(JSONObject jSONObject, String str, boolean z10) {
        return new ParseRESTUserCommand("users", ParseHttpRequest.Method.POST, jSONObject, str, z10);
    }

    @Override // com.parse.ParseRESTCommand
    public void addAdditionalHeaders(ParseHttpRequest.Builder builder) {
        super.addAdditionalHeaders(builder);
        if (this.isRevocableSessionEnabled) {
            builder.addHeader("X-Parse-Revocable-Session", "1");
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // com.parse.ParseRESTCommand, com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) {
        this.statusCode = parseHttpResponse.getStatusCode();
        return super.onResponseAsync(parseHttpResponse, progressCallback);
    }

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2, boolean z10) {
        super(str, method, map, str2);
        this.isRevocableSessionEnabled = z10;
    }

    private ParseRESTUserCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2, boolean z10) {
        super(str, method, jSONObject, str2);
        this.isRevocableSessionEnabled = z10;
    }
}
