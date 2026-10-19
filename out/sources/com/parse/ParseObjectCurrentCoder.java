package com.parse;

import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseObjectCurrentCoder extends ParseObjectCoder {
    private static final ParseObjectCurrentCoder INSTANCE = new ParseObjectCurrentCoder();

    public static ParseObjectCurrentCoder get() {
        return INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    @Override // com.parse.ParseObjectCoder
    public <T extends ParseObject.State.Init<?>> T decode(T t8, JSONObject jSONObject, ParseDecoder parseDecoder) {
        byte b10;
        String string;
        String string2;
        try {
            if (jSONObject.has("id")) {
                t8.objectId(jSONObject.getString("id"));
            }
            if (jSONObject.has("created_at") && (string2 = jSONObject.getString("created_at")) != null) {
                t8.createdAt(ParseImpreciseDateFormat.getInstance().parse(string2));
            }
            if (jSONObject.has("updated_at") && (string = jSONObject.getString("updated_at")) != null) {
                t8.updatedAt(ParseImpreciseDateFormat.getInstance().parse(string));
            }
            if (jSONObject.has("pointers")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pointers");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next);
                    t8.put(next, ParseObject.createWithoutData(jSONArray.optString(0), jSONArray.optString(1)));
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    switch (next2) {
                        case "updatedAt":
                            b10 = 2;
                            break;
                        case "ACL":
                            b10 = 3;
                            break;
                        case "objectId":
                            b10 = 0;
                            break;
                        case "createdAt":
                            b10 = 1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        t8.objectId(jSONObjectOptJSONObject.getString(next2));
                    } else if (b10 == 1) {
                        t8.createdAt(ParseDateFormat.getInstance().parse(jSONObjectOptJSONObject.getString(next2)));
                    } else if (b10 == 2) {
                        t8.updatedAt(ParseDateFormat.getInstance().parse(jSONObjectOptJSONObject.getString(next2)));
                    } else if (b10 != 3) {
                        t8.put(next2, parseDecoder.decode(jSONObjectOptJSONObject.get(next2)));
                    } else {
                        t8.put("ACL", ParseACL.createACLFromJSONObject(jSONObjectOptJSONObject.getJSONObject(next2), parseDecoder));
                    }
                }
            }
            return t8;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.parse.ParseObjectCoder
    public <T extends ParseObject.State> JSONObject encode(T t8, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) {
        if (parseOperationSet != null) {
            throw new IllegalArgumentException("Parameter ParseOperationSet is not null");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : t8.keySet()) {
                jSONObject2.put(str, parseEncoder.encode(t8.get(str)));
            }
            if (t8.createdAt() > 0) {
                jSONObject2.put("createdAt", ParseDateFormat.getInstance().format(new Date(t8.createdAt())));
            }
            if (t8.updatedAt() > 0) {
                jSONObject2.put("updatedAt", ParseDateFormat.getInstance().format(new Date(t8.updatedAt())));
            }
            if (t8.objectId() != null) {
                jSONObject2.put("objectId", t8.objectId());
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put("classname", t8.className());
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }
}
