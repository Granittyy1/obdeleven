package com.parse;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseUserCurrentCoder extends ParseObjectCurrentCoder {
    private static final ParseUserCurrentCoder INSTANCE = new ParseUserCurrentCoder();

    public static ParseUserCurrentCoder get() {
        return INSTANCE;
    }

    @Override // com.parse.ParseObjectCurrentCoder, com.parse.ParseObjectCoder
    public <T extends ParseObject.State.Init<?>> T decode(T t8, JSONObject jSONObject, ParseDecoder parseDecoder) {
        ParseUser.State.Builder builder = (ParseUser.State.Builder) super.decode(t8, jSONObject, parseDecoder);
        builder.sessionToken(jSONObject.optString("session_token", null));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auth_data");
        if (jSONObjectOptJSONObject == null) {
            builder.authData(null);
        } else {
            try {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObjectOptJSONObject.isNull(next)) {
                        builder.putAuthData(next, (Map) ParseDecoder.get().decode(jSONObjectOptJSONObject.getJSONObject(next)));
                    }
                }
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
        return builder;
    }

    @Override // com.parse.ParseObjectCurrentCoder, com.parse.ParseObjectCoder
    public <T extends ParseObject.State> JSONObject encode(T t8, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) {
        JSONObject jSONObjectEncode = super.encode(t8, parseOperationSet, parseEncoder);
        ParseUser.State state = (ParseUser.State) t8;
        String strSessionToken = state.sessionToken();
        if (strSessionToken != null) {
            try {
                jSONObjectEncode.put("session_token", strSessionToken);
            } catch (JSONException unused) {
                throw new RuntimeException("could not encode value for key: session_token");
            }
        }
        Map<String, Map<String, String>> mapAuthData = state.authData();
        if (mapAuthData.size() > 0) {
            try {
                jSONObjectEncode.put("auth_data", parseEncoder.encode(mapAuthData));
            } catch (JSONException unused2) {
                throw new RuntimeException("could not attach key: auth_data");
            }
        }
        return jSONObjectEncode;
    }
}
