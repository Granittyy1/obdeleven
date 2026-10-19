package com.parse;

import android.util.Base64;
import com.braze.models.IBrazeLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseDecoder {
    private static final ParseDecoder INSTANCE = new ParseDecoder();

    public static ParseDecoder get() {
        return INSTANCE;
    }

    public List<Object> convertJSONArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(decode(jSONArray.opt(i10)));
        }
        return arrayList;
    }

    public Map<String, Object> convertJSONObjectToMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, decode(jSONObject.opt(next)));
        }
        return map;
    }

    public Object decode(Object obj) {
        if (obj instanceof JSONArray) {
            return convertJSONArrayToList((JSONArray) obj);
        }
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optString("__op", null) != null) {
            try {
                return ParseFieldOperations.decode(jSONObject, this);
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
        String strOptString = jSONObject.optString("__type", null);
        if (strOptString == null) {
            return convertJSONObjectToMap(jSONObject);
        }
        if (strOptString.equals("Date")) {
            return ParseDateFormat.getInstance().parse(jSONObject.optString("iso"));
        }
        if (strOptString.equals("Bytes")) {
            return Base64.decode(jSONObject.optString("base64"), 2);
        }
        if (strOptString.equals("Pointer")) {
            return decodePointer(jSONObject.optString("className"), jSONObject.optString("objectId"));
        }
        if (strOptString.equals("File")) {
            return new ParseFile(jSONObject, this);
        }
        if (strOptString.equals("GeoPoint")) {
            try {
                return new ParseGeoPoint(jSONObject.getDouble(IBrazeLocation.LATITUDE), jSONObject.getDouble(IBrazeLocation.LONGITUDE));
            } catch (JSONException e11) {
                throw new RuntimeException(e11);
            }
        }
        if (!strOptString.equals("Polygon")) {
            if (strOptString.equals("Object")) {
                return ParseObject.fromJSON(jSONObject, null, this);
            }
            if (strOptString.equals("Relation")) {
                return new ParseRelation(jSONObject, this);
            }
            if (strOptString.equals("OfflineObject")) {
                throw new RuntimeException("An unexpected offline pointer was encountered.");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("coordinates");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                arrayList.add(new ParseGeoPoint(jSONArray2.getDouble(0), jSONArray2.getDouble(1)));
            }
            return new ParsePolygon(arrayList);
        } catch (JSONException e12) {
            throw new RuntimeException(e12);
        }
    }

    public ParseObject decodePointer(String str, String str2) {
        return ParseObject.createWithoutData(str, str2);
    }
}
