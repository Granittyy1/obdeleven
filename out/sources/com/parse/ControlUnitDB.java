package com.parse;

import J8.p;
import android.text.TextUtils;
import androidx.compose.ui.text.font.s;
import androidx.media3.exoplayer.I;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.AdaptationType;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p255u9.C2801d;
import p255u9.E;
import p255u9.m;
import p255u9.q;
import p279w9.d;
import p293xa.g;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("ControlUnit")
public class ControlUnitDB extends ParseObject {
    private ParseObject controlUnitRelation;
    private g<p> logger = KoinJavaComponent.b(p.class, null, null);

    private int getChannelPositionInArray(int i10, ArrayList<OfflineData> arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 == arrayList.get(i11).getChannel()) {
                return i11;
            }
        }
        return -1;
    }

    public static String getLatestSoftwareVersion(String str) {
        ParseQuery query = ParseQuery.getQuery(ControlUnitDB.class);
        query.whereEqualTo("swNumber", str);
        query.orderByDescending("swVersion");
        query.setLimit(1);
        return ((ControlUnitDB) d.d(query, null).f47831b.get(0)).getSWVersion();
    }

    private q getSecurityAccessCode(int i10, ParseObject parseObject) {
        try {
            ParseQuery query = ParseQuery.getQuery(q.class);
            query.whereEqualTo("relationId", parseObject);
            query.whereEqualTo("code", Integer.valueOf(i10));
            return (q) query.getFirst();
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ParseQuery<ControlUnitDB> getSubsystemQuery(String str, ControlUnitDB controlUnitDB, E e10) {
        ParseQuery<ControlUnitDB> query = ParseQuery.getQuery(ControlUnitDB.class);
        query.whereEqualTo("systemDescription", str);
        query.whereEqualTo("parent", controlUnitDB);
        query.whereEqualTo("vehicle", e10);
        return query;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List lambda$getConfirmedSecurityAccessCodesAsync$1(List list, Task task) throws Exception {
        List list2 = (List) task.getResult();
        if (list2 == null) {
            return I.b.n(list);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list.add(String.valueOf(((q) it.next()).getInt("code")));
        }
        return I.b.n(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List lambda$getOutputTestCodesAsync$0(List list, Task task) throws Exception {
        Iterator it = ((List) task.getResult()).iterator();
        while (it.hasNext()) {
            list.add(((m) it.next()).getString("code"));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveInBackgroundEventually$2(ParseException parseException) {
        if (parseException != null) {
            saveEventually();
        }
    }

    private void logInvalidDataErrorIfNeeded() {
        if (getVehicle() == null || (getControlUnitBase() == null && getParent() == null)) {
            String strB = getVehicle() == null ? "Incorrect control unit state detected. Vehicle is null. " : "Incorrect control unit state detected. ";
            if (getParent() == null) {
                strB = strB.concat("Parent is null. ");
            }
            if (getControlUnitBase() == null) {
                strB = s.b(strB, "ControlUnitBase is null.");
            }
            this.logger.getValue().d(new Throwable(strB), true);
        }
    }

    private void logStateBeforeSave() {
        if (getVehicle() == null || getControlUnitBase() == null) {
            new Throwable("Incorrect control unit state detected");
        }
    }

    public static void saveSubsystem(ControlUnitDB controlUnitDB) throws ParseException {
        ControlUnitDB controlUnitDB2;
        if (controlUnitDB.getSystemDescription() == null) {
            return;
        }
        d.a aVarD = d.d(getSubsystemQuery(controlUnitDB.getSystemDescription(), controlUnitDB.getParent(), controlUnitDB.getVehicle()), null);
        List<T> list = aVarD.f47831b;
        if (!list.isEmpty() && (controlUnitDB2 = (ControlUnitDB) list.get(0)) != null) {
            controlUnitDB2.setSubsystemId(controlUnitDB.getSubsystemId());
            controlUnitDB2.save();
        }
        if (aVarD.f47830a == null && list.isEmpty() && !controlUnitDB.getSystemDescription().isEmpty()) {
            controlUnitDB.save();
            controlUnitDB.getParent().setHasSubsystems(true);
            controlUnitDB.getParent().save();
        }
    }

    private void setAdaptations(AdaptationType adaptationType, String str, ArrayList<OfflineData> arrayList) {
        try {
            JSONObject jSONObject = getJSONObject("adaptations");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (jSONObject.optString("adaptationType").isEmpty()) {
                jSONObject.put("adaptationType", adaptationType.b());
            }
            if (jSONObject.optString("adaptationProtocol").isEmpty()) {
                jSONObject.put("adaptationProtocol", str);
            }
            if (jSONObject.optJSONArray("values") == null) {
                jSONObject.put("values", new JSONArray());
            }
            jSONObject.remove("values");
            JSONArray jSONArray = new JSONArray();
            Iterator<OfflineData> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getJsonObject());
            }
            jSONObject.put("values", jSONArray);
            put("adaptations", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private void setAdvancedInfo(ArrayList<OfflineData> arrayList) {
        try {
            JSONObject jSONObject = getJSONObject("advancedInfo");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (jSONObject.optJSONArray("values") == null) {
                jSONObject.put("values", new JSONArray());
            }
            jSONObject.remove("values");
            JSONArray jSONArray = new JSONArray();
            Iterator<OfflineData> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getJsonObject());
            }
            jSONObject.put("values", jSONArray);
            put("advancedInfo", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void addOutputTestCodeAndSave(String str) {
        if ("04AB".equals(str)) {
            return;
        }
        try {
            if (getOutputTestCode(str, getLabelRelation()) == null) {
                m mVar = new m();
                mVar.put("code", str);
                mVar.put("relation", getLabelRelation());
                mVar.saveInBackground();
            }
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    public void addSecurityAccessCode(int i10, Integer num) {
        try {
            ParseObject labelRelation = getLabelRelation();
            if (labelRelation == null) {
                return;
            }
            q securityAccessCode = getSecurityAccessCode(i10, labelRelation);
            if (securityAccessCode != null) {
                if (num != null) {
                    securityAccessCode.addUnique("serviceStates", num);
                }
                if (!((ControlUnitDB) securityAccessCode.getParseObject("lastUsedControlUnit")).getObjectId().equals(getObjectId())) {
                    securityAccessCode.put("successfulEntersCount", Integer.valueOf(securityAccessCode.getInt("successfulEntersCount") + 1));
                    securityAccessCode.put("lastUsedControlUnit", this);
                }
                securityAccessCode.saveInBackground();
                return;
            }
            q qVar = new q();
            qVar.put("code", Integer.valueOf(i10));
            qVar.put("relationId", labelRelation);
            qVar.put("lastUsedControlUnit", this);
            qVar.put("successfulEntersCount", 1);
            if (num != null) {
                qVar.addUnique("serviceStates", num);
            }
            qVar.saveInBackground();
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    public ArrayList<OfflineData> getAdaptation() {
        JSONObject jSONObject = getJSONObject("adaptations");
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        ArrayList<OfflineData> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new OfflineData(jSONArrayOptJSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    public AdaptationType getAdaptationType() {
        JSONObject jSONObject = getJSONObject("adaptations");
        return jSONObject == null ? AdaptationType.UNKNOWN : AdaptationType.a(jSONObject.optString("adaptationType"));
    }

    public ArrayList<OfflineData> getAdvancedInfo() {
        JSONObject jSONObject = getJSONObject("advancedInfo");
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        ArrayList<OfflineData> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new OfflineData(jSONArrayOptJSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    @Deprecated
    public JSONObject getCoding() {
        return getJSONObject("coding");
    }

    public CodingType getCodingType() {
        JSONObject jSONObject = getJSONObject("coding");
        return jSONObject == null ? CodingType.f34404d : CodingType.a(jSONObject.optString("type"));
    }

    public String getCodingValue() {
        return getJSONObject("coding").optString("value");
    }

    public Task<List<String>> getConfirmedSecurityAccessCodesAsync() {
        ArrayList arrayList = new ArrayList();
        try {
            ParseObject labelRelation = getLabelRelation();
            ParseQuery query = ParseQuery.getQuery(q.class);
            query.whereEqualTo("relationId", labelRelation);
            query.whereGreaterThanOrEqualTo("successfulEntersCount", 2);
            ParseQuery query2 = ParseQuery.getQuery(q.class);
            query2.whereEqualTo("relationId", labelRelation);
            query2.whereEqualTo("lastUsedControlUnit", this);
            return ParseQuery.or(Arrays.asList(query, query2)).findInBackground().continueWith(new a(0, arrayList));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return Task.forResult(arrayList);
        }
    }

    public List<String> getConfirmedSecurityAccessCodesSync() {
        try {
            Task<List<String>> confirmedSecurityAccessCodesAsync = getConfirmedSecurityAccessCodesAsync();
            confirmedSecurityAccessCodesAsync.waitForCompletion();
            return confirmedSecurityAccessCodesAsync.getResult();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
            return new ArrayList();
        }
    }

    public C2801d getControlUnitBase() {
        return (C2801d) getParseObject("controlUnitBase");
    }

    public String getDataById(int i10) {
        return getUdsData().optString(String.valueOf(i10));
    }

    public JSONArray getFaults() {
        JSONArray jSONArray = getJSONArray("faults");
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public String getHWNumber() {
        return getString("hwNumber");
    }

    public String getHWNumberTrimmed() {
        if (getHWNumber() != null) {
            return getHWNumber().trim();
        }
        return null;
    }

    public String getHWVersion() {
        return getString("hwVersion");
    }

    public String getHWVersionTrimmed() {
        if (getHWVersion() != null) {
            return getHWVersion().trim();
        }
        return null;
    }

    public JSONObject getKWP1281Data() {
        JSONObject jSONObject = getJSONObject("liveData");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public String getKWP1281DataById(int i10) {
        return getKWP1281Data().optString(String.valueOf(i10));
    }

    public JSONObject getKWP2000Data() {
        JSONObject jSONObject = getJSONObject("readDataByLocalIden");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public String getKWP2000DataById(int i10) {
        return getKWP2000Data().optString(String.valueOf(i10));
    }

    public ParseObject getLabelRelation() throws ParseException {
        ParseObject parseObject = this.controlUnitRelation;
        if (parseObject != null) {
            return parseObject;
        }
        String sWNumber = getSWNumber();
        if (!TextUtils.isEmpty(sWNumber)) {
            this.controlUnitRelation = getLabelRelation(sWNumber.trim());
        }
        String hWNumber = getHWNumber();
        if (this.controlUnitRelation == null && !TextUtils.isEmpty(hWNumber)) {
            this.controlUnitRelation = getLabelRelation(hWNumber.trim());
        }
        if (sWNumber == null && hWNumber == null) {
            return this.controlUnitRelation;
        }
        if (this.controlUnitRelation == null) {
            String strTrim = getSWNumber().trim();
            if (strTrim.isEmpty()) {
                strTrim = getHWNumber().trim();
            }
            if (!strTrim.isEmpty()) {
                ParseObject parseObjectCreate = ParseObject.create("ControlUnitRelation");
                this.controlUnitRelation = parseObjectCreate;
                parseObjectCreate.put("cuId", getControlUnitBase().b() + "-" + strTrim.substring(0, 2));
                this.controlUnitRelation.put("relationId", strTrim);
                this.controlUnitRelation.put("relation", Collections.singletonList(strTrim));
                this.controlUnitRelation.save();
            }
        }
        return this.controlUnitRelation;
    }

    public String getName() {
        return getControlUnitBase().getString("name");
    }

    public String getODXName() {
        return getString("odxName");
    }

    public String getODXVersion() {
        return getString("odxVersion");
    }

    public m getOutputTestCode(String str, ParseObject parseObject) {
        try {
            ParseQuery query = ParseQuery.getQuery(m.class);
            query.whereEqualTo("relation", parseObject);
            query.whereEqualTo("code", str);
            return (m) query.getFirst();
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public List<String> getOutputTestCodesAsList() {
        try {
            Task<List<String>> outputTestCodesAsync = getOutputTestCodesAsync();
            outputTestCodesAsync.waitForCompletion();
            return outputTestCodesAsync.getResult();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
            return new ArrayList();
        }
    }

    public Task<List<String>> getOutputTestCodesAsync() {
        ArrayList arrayList = new ArrayList();
        try {
            ParseObject labelRelation = getLabelRelation();
            ParseQuery query = ParseQuery.getQuery(m.class);
            query.whereEqualTo("relation", labelRelation);
            return query.findInBackground().continueWith(new b(0, arrayList));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return Task.forResult(arrayList);
        }
    }

    public ControlUnitDB getParent() {
        return (ControlUnitDB) getParseObject("parent");
    }

    public String getProtocol() {
        return getString("protocol");
    }

    public String getSWNumber() {
        return getString("swNumber");
    }

    public String getSWNumberTrimmed() {
        if (getSWNumber() != null) {
            return getSWNumber().trim();
        }
        return null;
    }

    public String getSWVersion() {
        return getString("swVersion");
    }

    public String getSWVersionTrimmed() {
        if (getSWVersion() != null) {
            return getSWVersion().trim();
        }
        return null;
    }

    public String getSerialNumber() {
        return getString("serialNumber");
    }

    public p255u9.s getSgbd() {
        return (p255u9.s) getParseObject("sgbd");
    }

    public int getSubsystemId() {
        return getInt("subsystemId");
    }

    public ParseQuery<ControlUnitDB> getSubsystemsQuery(ControlUnitDB controlUnitDB, E e10) {
        ParseQuery<ControlUnitDB> query = ParseQuery.getQuery(ControlUnitDB.class);
        query.whereEqualTo("parent", controlUnitDB);
        query.whereEqualTo("vehicle", e10);
        return query;
    }

    public String getSystemDescription() {
        return getString("systemDescription");
    }

    public String getSystemIdentifier() {
        return getString("systemIdentifier");
    }

    public JSONObject getUdsData() {
        JSONObject jSONObject = getJSONObject("dataById");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public E getVehicle() {
        return (E) getParseObject("vehicle");
    }

    public boolean hasSubsystems() {
        return getBoolean("hasSubsystems");
    }

    public boolean isValid() {
        return (getSystemDescription() == null && getSystemIdentifier() == null && getHWNumber() == null && getHWVersion() == null && getSWNumber() == null && getSWVersion() == null && getSerialNumber() == null && getCodingType() == CodingType.f34404d && (getODXName() == null || getODXName().isEmpty()) && (getODXVersion() == null || getODXVersion().isEmpty())) ? false : true;
    }

    public void removeProtocol() {
        remove("protocol");
    }

    public void saveEventuallyWithLogging() {
        logStateBeforeSave();
        saveEventually();
    }

    public void saveInBackgroundEventually() {
        logStateBeforeSave();
        saveInBackground(new I(this));
    }

    public void saveInBackgroundWithLogging() {
        logStateBeforeSave();
        saveInBackground();
    }

    public void saveKWP1281Measurement(int i10, String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObject = getKWP1281Data() == null ? new JSONObject() : getKWP1281Data();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.getString(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        map.put(String.valueOf(i10), str);
        put("liveData", new JSONObject(map));
    }

    public void saveKWP2000Measurement(int i10, String str) {
        JSONObject jSONObject = getKWP2000Data() == null ? new JSONObject() : getKWP2000Data();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.getString(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (str != null) {
            map.put(String.valueOf(i10), str);
        }
        put("readDataByLocalIden", new JSONObject(map));
    }

    public void saveUdsData(int i10, String str) {
        JSONObject jSONObject = getUdsData() == null ? new JSONObject() : getUdsData();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.getString(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        map.put(String.valueOf(i10), str);
        put("dataById", new JSONObject(map));
    }

    public void saveWithLogging() throws ParseException {
        logStateBeforeSave();
        save();
    }

    public boolean setCoding(CodingType codingType, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", codingType.name());
            jSONObject.put("value", str);
            setCoding(jSONObject);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public void setControlUnitBase(C2801d c2801d) {
        put("controlUnitBase", c2801d);
    }

    public void setFaults(JSONArray jSONArray) {
        put("faults", jSONArray);
    }

    public void setHWNumber(String str) {
        put("hwNumber", str.trim());
    }

    public void setHWVersion(String str) {
        put("hwVersion", str.trim());
    }

    public void setHasSubsystems(boolean z10) {
        put("hasSubsystems", Boolean.valueOf(z10));
    }

    public void setODXName(String str) {
        put("odxName", str);
    }

    public void setODXVersion(String str) {
        put("odxVersion", str);
    }

    public void setParent(ControlUnitDB controlUnitDB) {
        put("parent", controlUnitDB);
    }

    public void setProtocol(String str) {
        put("protocol", str);
    }

    public void setSWNumber(String str) {
        put("swNumber", str.trim());
    }

    public void setSWVersion(String str) {
        put("swVersion", str.trim());
    }

    public void setScannedLogins(int i10) {
        put("scannedLogins", Integer.valueOf(i10));
    }

    public void setSerialNumber(String str) {
        put("serialNumber", str.trim());
    }

    public void setSubsystemId(int i10) {
        put("subsystemId", Integer.valueOf(i10));
    }

    public void setSystemDescription(String str) {
        put("systemDescription", str.trim());
    }

    public void setSystemIdentifier(String str) {
        put("systemIdentifier", str.trim());
    }

    public void setVehicle(E e10) {
        put("vehicle", e10);
    }

    public void updateAdaptation(AdaptationType adaptationType, String str, int i10, String str2, String str3) {
        ArrayList<OfflineData> adaptation = getAdaptation();
        if (adaptation.size() != 0 && getChannelPositionInArray(i10, adaptation) >= 0) {
            adaptation.set(getChannelPositionInArray(i10, adaptation), new OfflineData(i10, str2, str3));
        } else {
            adaptation.add(new OfflineData(i10, str2, str3));
        }
        setAdaptations(adaptationType, str, adaptation);
    }

    public void updateAdvancedInfo(int i10, String str, String str2) {
        ArrayList<OfflineData> advancedInfo = getAdvancedInfo();
        if (advancedInfo.size() != 0 && getChannelPositionInArray(i10, advancedInfo) >= 0) {
            advancedInfo.set(getChannelPositionInArray(i10, advancedInfo), new OfflineData(i10, str, str2));
        } else {
            advancedInfo.add(new OfflineData(i10, str, str2));
        }
        setAdvancedInfo(advancedInfo);
    }

    @Override // com.parse.ParseObject
    public void updateBeforeSave() {
        this.logger.getValue().c("ControlUnitDB", "validateSave()");
        logInvalidDataErrorIfNeeded();
    }

    public void setCoding(JSONObject jSONObject) {
        put("coding", jSONObject);
    }

    public static class OfflineData {
        private JSONObject jsonObject;

        public OfflineData(int i10, String str, String str2) {
            try {
                this.jsonObject = new JSONObject().put("channel", i10).put("value", str).put("responseType", str2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        public int getChannel() {
            return this.jsonObject.optInt("channel");
        }

        public JSONObject getJsonObject() {
            return this.jsonObject;
        }

        public String getResponseType() {
            return this.jsonObject.optString("responseType");
        }

        public String getValue() {
            return this.jsonObject.optString("value");
        }

        public OfflineData(JSONObject jSONObject) {
            this.jsonObject = jSONObject;
        }
    }

    private ParseObject getLabelRelation(String str) throws ParseException {
        return ControlUnitParseUtils.getLabelRelation(str, getControlUnitBase().b());
    }
}
