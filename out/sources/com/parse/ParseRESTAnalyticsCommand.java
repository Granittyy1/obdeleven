package com.parse;

import android.net.Uri;
import com.parse.http.ParseHttpRequest;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTAnalyticsCommand extends ParseRESTCommand {
    public ParseRESTAnalyticsCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    public static ParseRESTAnalyticsCommand trackAppOpenedCommand(String str, String str2) {
        return trackEventCommand("AppOpened", str, null, str2);
    }

    public static ParseRESTAnalyticsCommand trackEventCommand(String str, String str2, Map<String, String> map, String str3) {
        String strC = B7.b.c("events/", Uri.encode(str));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("at", NoObjectsEncoder.get().encode(new Date()));
            if (str2 != null) {
                jSONObject.put("push_hash", str2);
            }
            if (map != null) {
                jSONObject.put("dimensions", NoObjectsEncoder.get().encode(map));
            }
            return new ParseRESTAnalyticsCommand(strC, ParseHttpRequest.Method.POST, jSONObject, str3);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
