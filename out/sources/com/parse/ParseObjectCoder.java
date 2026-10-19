package com.parse;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseObjectCoder {
    private static final ParseObjectCoder INSTANCE = new ParseObjectCoder();

    public static ParseObjectCoder get() {
        return INSTANCE;
    }

    public <T extends ParseObject.State.Init<?>> T decode(T t8, JSONObject jSONObject, ParseDecoder parseDecoder) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("__type") && !next.equals("className")) {
                    if (next.equals("objectId")) {
                        t8.objectId(jSONObject.getString(next));
                    } else if (next.equals("createdAt")) {
                        t8.createdAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("updatedAt")) {
                        t8.updatedAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("ACL")) {
                        t8.put("ACL", ParseACL.createACLFromJSONObject(jSONObject.getJSONObject(next), parseDecoder));
                    } else {
                        t8.put(next, parseDecoder.decode(jSONObject.get(next)));
                    }
                }
            }
            return t8;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public <T extends ParseObject.State> JSONObject encode(T t8, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : parseOperationSet.keySet()) {
                jSONObject.put(str, parseEncoder.encode((ParseFieldOperation) parseOperationSet.get(str)));
            }
            if (t8.objectId() != null) {
                jSONObject.put("objectId", t8.objectId());
            }
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }
}
