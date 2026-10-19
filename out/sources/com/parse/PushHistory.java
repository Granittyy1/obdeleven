package com.parse;

import io.intercom.android.sdk.annotations.SeenState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class PushHistory {
    private final PriorityQueue<Entry> entries;
    private String lastTime = null;
    private final int maxHistoryLength;
    private final HashSet<String> pushIds;

    public static class Entry implements Comparable<Entry> {
        public String pushId;
        public String timestamp;

        public Entry(String str, String str2) {
            this.pushId = str;
            this.timestamp = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            return this.timestamp.compareTo(entry.timestamp);
        }
    }

    public PushHistory(int i10, JSONObject jSONObject) {
        this.maxHistoryLength = i10;
        int i11 = i10 + 1;
        this.entries = new PriorityQueue<>(i11);
        this.pushIds = new HashSet<>(i11);
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SeenState.SEEN);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObjectOptJSONObject.optString(next, null);
                    if (next != null && strOptString != null) {
                        tryInsertPush(next, strOptString);
                    }
                }
            }
            setLastReceivedTimestamp(jSONObject.optString("lastTime", null));
        }
    }

    public String getLastReceivedTimestamp() {
        return this.lastTime;
    }

    public void setLastReceivedTimestamp(String str) {
        this.lastTime = str;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.entries.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            for (Entry entry : this.entries) {
                jSONObject2.put(entry.pushId, entry.timestamp);
            }
            jSONObject.put(SeenState.SEEN, jSONObject2);
        }
        jSONObject.putOpt("lastTime", this.lastTime);
        return jSONObject;
    }

    public boolean tryInsertPush(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Can't insert null pushId or timestamp into history");
        }
        String str3 = this.lastTime;
        if (str3 == null || str2.compareTo(str3) > 0) {
            this.lastTime = str2;
        }
        if (this.pushIds.contains(str)) {
            PLog.e("com.parse.PushHistory", "Ignored duplicate push " + str);
            return false;
        }
        this.entries.add(new Entry(str, str2));
        this.pushIds.add(str);
        while (this.entries.size() > this.maxHistoryLength) {
            this.pushIds.remove(this.entries.remove().pushId);
        }
        return true;
    }
}
