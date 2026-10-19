package com.parse;

import B6.c;
import android.net.Uri;
import com.parse.http.ParseHttpRequest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTObjectCommand extends ParseRESTCommand {
    public ParseRESTObjectCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    private static ParseRESTObjectCommand createObjectCommand(String str, JSONObject jSONObject, String str2) {
        return new ParseRESTObjectCommand(B7.b.c("classes/", Uri.encode(str)), ParseHttpRequest.Method.POST, jSONObject, str2);
    }

    public static ParseRESTObjectCommand deleteObjectCommand(ParseObject.State state, String str) {
        String strC = B7.b.c("classes/", Uri.encode(state.className()));
        String strObjectId = state.objectId();
        if (strObjectId != null) {
            strC = strC.concat("/" + Uri.encode(strObjectId));
        }
        return new ParseRESTObjectCommand(strC, ParseHttpRequest.Method.DELETE, null, str);
    }

    public static ParseRESTObjectCommand getObjectCommand(String str, String str2, String str3) {
        return new ParseRESTObjectCommand(c.d("classes/", Uri.encode(str2), "/", Uri.encode(str)), ParseHttpRequest.Method.GET, null, str3);
    }

    public static ParseRESTObjectCommand saveObjectCommand(ParseObject.State state, JSONObject jSONObject, String str) {
        return state.objectId() == null ? createObjectCommand(state.className(), jSONObject, str) : updateObjectCommand(state.objectId(), state.className(), jSONObject, str);
    }

    private static ParseRESTObjectCommand updateObjectCommand(String str, String str2, JSONObject jSONObject, String str3) {
        return new ParseRESTObjectCommand(c.d("classes/", Uri.encode(str2), "/", Uri.encode(str)), ParseHttpRequest.Method.PUT, jSONObject, str3);
    }
}
