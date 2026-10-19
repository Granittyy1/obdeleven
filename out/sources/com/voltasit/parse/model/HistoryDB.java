package com.voltasit.parse.model;

import android.text.TextUtils;
import com.parse.ControlUnitDB;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.voltasit.parse.Parse;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.E;
import p255u9.y;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("History")
public final class HistoryDB extends ParseObject {

    public enum HistoryTypeValue {
        /* JADX INFO: Fake field, exist only in values array */
        GATEWAY_CODING("GATEWAY_CODING"),
        CODING("CODING"),
        SUB_CODING("SUB_CODING"),
        LONG_CODING("LONG_CODING"),
        SUB_LONG_CODING("SUB_LONG_CODING"),
        LONG_CODING_UDS("LONG_CODING-UDS"),
        /* JADX INFO: Fake field, exist only in values array */
        ADAPTATION("ADAPTATION"),
        ADAPTATION_UDS("ADAPTATION-UDS"),
        /* JADX INFO: Fake field, exist only in values array */
        BASIC_SETTINGS("BASIC_SETTINGS"),
        /* JADX INFO: Fake field, exist only in values array */
        BASIC_SETTINGS_UDS("BASIC_SETTINGS-UDS"),
        /* JADX INFO: Fake field, exist only in values array */
        CODING_II("CODING_II"),
        /* JADX INFO: Fake field, exist only in values array */
        DIAGNOSTIC_SESSION("DIAGNOSTIC_SESSION"),
        /* JADX INFO: Fake field, exist only in values array */
        APP("APP"),
        BACKUP("BACKUP"),
        BACKUP_ALL("BACKUP_ALL"),
        FAULT("FAULT"),
        SCAN("SCAN"),
        CLEAR("CLEAR"),
        CU_CHANGED("CU_CHANGED"),
        UNKNOWN("UNKNOWN");

        private final String databaseName;

        HistoryTypeValue(String str) {
            this.databaseName = str;
        }

        public final String a() {
            return this.databaseName;
        }
    }

    public static class a implements Comparator<HistoryDB> {
        @Override // java.util.Comparator
        public final int compare(HistoryDB historyDB, HistoryDB historyDB2) {
            return historyDB.c().getControlUnitBase().a().compareTo(historyDB2.c().getControlUnitBase().a());
        }
    }

    public final void a() {
        put("os", "Android ".concat(Parse.f34395b.h()));
        Parse.f34395b.getClass();
        put("appVersion", "0.107.1(10800)");
    }

    public final ArrayList b() {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = d().optJSONObject("advanced_info");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("values")) == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject2 != null) {
                arrayList.add(new y(jSONObjectOptJSONObject2));
            }
        }
        return arrayList;
    }

    public final ControlUnitDB c() {
        return (ControlUnitDB) getParseObject("controlUnit");
    }

    public final JSONObject d() {
        JSONObject jSONObject = getJSONObject("data");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final JSONArray e() {
        JSONObject jSONObjectD = d();
        return jSONObjectD.has("faults") ? jSONObjectD.optJSONArray("faults") : new JSONArray();
    }

    public final ArrayList f() {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = d().optJSONObject("liveData");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("values")) == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject2 != null) {
                arrayList.add(new y(jSONObjectOptJSONObject2));
            }
        }
        return arrayList;
    }

    public final E getVehicle() {
        return (E) getParseObject("vehicle");
    }

    public final String h() {
        JSONObject jSONObjectOptJSONObject = d().optJSONObject("liveData");
        return jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("protocol");
    }

    public final void i(ControlUnitDB controlUnitDB) {
        put("controlUnit", controlUnitDB);
    }

    public final void j(JSONObject jSONObject) {
        JSONObject jSONObjectD = d();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectD.put(next, jSONObject.opt(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        put("data", jSONObjectD);
    }

    public final void k(String str) {
        try {
            j(d().put("diagnostic_session_textid", str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void l(JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("odxName", str);
            }
            jSONObject.put("faults", jSONArray);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        put("data", jSONObject);
    }

    public final void m(int i10) {
        put("mileage", Integer.valueOf(i10));
    }

    public final void n(String str) {
        put("type", str);
    }

    public final void o(z zVar) {
        put(Participant.USER_TYPE, zVar);
    }

    public final void setVehicle(E e10) {
        put("vehicle", e10);
    }
}
