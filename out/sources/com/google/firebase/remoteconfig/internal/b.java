package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConfigContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f28584h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f28585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f28586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f28587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f28588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f28589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f28591g;

    /* JADX INFO: compiled from: ConfigContainer.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f28592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f28593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONArray f28594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f28595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f28596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONArray f28597f;

        public final b a() throws JSONException {
            return new b(this.f28592a, this.f28593b, this.f28594c, this.f28595d, this.f28596e, this.f28597f);
        }
    }

    public b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f28586b = jSONObject;
        this.f28587c = date;
        this.f28588d = jSONArray;
        this.f28589e = jSONObject2;
        this.f28590f = j;
        this.f28591g = jSONArray2;
        this.f28585a = jSONObject3;
    }

    public static b a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static a c() {
        a aVar = new a();
        aVar.f28592a = new JSONObject();
        aVar.f28593b = f28584h;
        aVar.f28594c = new JSONArray();
        aVar.f28595d = new JSONObject();
        aVar.f28596e = 0L;
        aVar.f28597f = new JSONArray();
        return aVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f28591g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f28585a.toString().equals(((b) obj).f28585a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f28585a.hashCode();
    }

    public final String toString() {
        return this.f28585a.toString();
    }
}
