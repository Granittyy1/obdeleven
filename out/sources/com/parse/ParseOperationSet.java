package com.parse;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseOperationSet extends HashMap<String, ParseFieldOperation> {
    private static final long serialVersionUID = 1;
    private boolean isSaveEventually;
    private final String uuid;

    public ParseOperationSet() {
        this(UUID.randomUUID().toString());
    }

    public static ParseOperationSet fromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        ParseOperationSet parseOperationSet = new ParseOperationSet(parcel.readString());
        parseOperationSet.setIsSaveEventually(parcel.readByte() == 1);
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            parseOperationSet.put(parcel.readString(), (ParseFieldOperation) parseParcelDecoder.decode(parcel));
        }
        return parseOperationSet;
    }

    public static ParseOperationSet fromRest(JSONObject jSONObject, ParseDecoder parseDecoder) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        String[] strArr = new String[jSONObject.length()];
        int i10 = 0;
        while (itKeys.hasNext()) {
            strArr[i10] = itKeys.next();
            i10++;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject, strArr);
        String str = (String) jSONObject2.remove("__uuid");
        ParseOperationSet parseOperationSet = str == null ? new ParseOperationSet() : new ParseOperationSet(str);
        boolean zOptBoolean = jSONObject2.optBoolean("__isSaveEventually");
        jSONObject2.remove("__isSaveEventually");
        parseOperationSet.setIsSaveEventually(zOptBoolean);
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next = itKeys2.next();
            Object objDecode = parseDecoder.decode(jSONObject2.get(next));
            if (next.equals("ACL")) {
                objDecode = ParseACL.createACLFromJSONObject(jSONObject2.getJSONObject(next), parseDecoder);
            }
            parseOperationSet.put(next, objDecode instanceof ParseFieldOperation ? (ParseFieldOperation) objDecode : new ParseSetOperation(objDecode));
        }
        return parseOperationSet;
    }

    public String getUUID() {
        return this.uuid;
    }

    public boolean isSaveEventually() {
        return this.isSaveEventually;
    }

    public void mergeFrom(ParseOperationSet parseOperationSet) {
        for (String str : parseOperationSet.keySet()) {
            ParseFieldOperation parseFieldOperationMergeWithPrevious = parseOperationSet.get(str);
            ParseFieldOperation parseFieldOperation = get(str);
            if (parseFieldOperation != null) {
                parseFieldOperationMergeWithPrevious = parseFieldOperation.mergeWithPrevious(parseFieldOperationMergeWithPrevious);
            }
            put(str, parseFieldOperationMergeWithPrevious);
        }
    }

    public void setIsSaveEventually(boolean z10) {
        this.isSaveEventually = z10;
    }

    public void toParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString(this.uuid);
        parcel.writeByte(this.isSaveEventually ? (byte) 1 : (byte) 0);
        parcel.writeInt(size());
        for (String str : keySet()) {
            parcel.writeString(str);
            parseParcelEncoder.encode(get(str), parcel);
        }
    }

    public JSONObject toRest(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet()) {
            jSONObject.put(str, ((ParseFieldOperation) get(str)).encode(parseEncoder));
        }
        jSONObject.put("__uuid", this.uuid);
        if (this.isSaveEventually) {
            jSONObject.put("__isSaveEventually", true);
        }
        return jSONObject;
    }

    public ParseOperationSet(ParseOperationSet parseOperationSet) {
        super(parseOperationSet);
        this.isSaveEventually = false;
        this.uuid = parseOperationSet.getUUID();
        this.isSaveEventually = parseOperationSet.isSaveEventually;
    }

    private ParseOperationSet(String str) {
        this.isSaveEventually = false;
        this.uuid = str;
    }
}
