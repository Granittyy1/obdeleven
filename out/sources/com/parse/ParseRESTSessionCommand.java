package com.parse;

import com.parse.http.ParseHttpRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTSessionCommand extends ParseRESTCommand {
    private ParseRESTSessionCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    public static ParseRESTSessionCommand getCurrentSessionCommand(String str) {
        return new ParseRESTSessionCommand("sessions/me", ParseHttpRequest.Method.GET, null, str);
    }

    public static ParseRESTSessionCommand revoke(String str) {
        return new ParseRESTSessionCommand(MetricTracker.Object.LOGOUT, ParseHttpRequest.Method.POST, new JSONObject(), str);
    }
}
