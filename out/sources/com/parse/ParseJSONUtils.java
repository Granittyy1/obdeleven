package com.parse;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseJSONUtils {
    public static JSONObject create(JSONObject jSONObject, Collection<String> collection) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!collection.contains(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return jSONObject2;
    }

    public static int getInt(JSONObject jSONObject, List<String> list) throws JSONException {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                return jSONObject.getInt(it.next());
            } catch (JSONException unused) {
            }
        }
        throw new JSONException("No value for " + list);
    }

    public static Iterable<String> keys(final JSONObject jSONObject) {
        return new Iterable<String>() { // from class: com.parse.ParseJSONUtils.1
            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return jSONObject.keys();
            }
        };
    }
}
