package com.parse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PushRouter {
    private static PushRouter instance;
    private final File diskState;
    private final PushHistory history;

    private PushRouter(File file, PushHistory pushHistory) {
        this.diskState = file;
        this.history = pushHistory;
    }

    public static synchronized PushRouter getInstance() {
        try {
            if (instance == null) {
                instance = pushRouterFromState(new File(ParsePlugins.get().getFilesDir(), MetricTracker.Place.PUSH), new File(ParsePlugins.get().getParseDir(), "pushState"), 10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public static PushRouter pushRouterFromState(File file, File file2, int i10) {
        boolean z10;
        JSONObject jSONFileQuietly;
        JSONObject jSONFileQuietly2 = readJSONFileQuietly(file);
        PushHistory pushHistory = new PushHistory(i10, jSONFileQuietly2 != null ? jSONFileQuietly2.optJSONObject("history") : null);
        if (pushHistory.getLastReceivedTimestamp() != null || (jSONFileQuietly = readJSONFileQuietly(file2)) == null) {
            z10 = false;
        } else {
            String strOptString = jSONFileQuietly.optString("lastTime", null);
            if (strOptString != null) {
                pushHistory.setLastReceivedTimestamp(strOptString);
            }
            z10 = true;
        }
        PushRouter pushRouter = new PushRouter(file, pushHistory);
        if (z10) {
            pushRouter.saveStateToDisk();
            ParseFileUtils.deleteQuietly(file2);
        }
        return pushRouter;
    }

    private static JSONObject readJSONFileQuietly(File file) {
        if (file != null) {
            try {
                return ParseFileUtils.readFileToJSONObject(file);
            } catch (IOException | JSONException unused) {
            }
        }
        return null;
    }

    private synchronized void saveStateToDisk() {
        try {
            ParseFileUtils.writeJSONObjectToFile(this.diskState, toJSON());
        } catch (IOException | JSONException e10) {
            PLog.e("com.parse.ParsePushRouter", "Unexpected error when serializing push state to " + this.diskState, e10);
        }
    }

    public synchronized boolean handlePush(String str, String str2, String str3, JSONObject jSONObject) {
        try {
            if (!ParseTextUtils.isEmpty(str) && !ParseTextUtils.isEmpty(str2)) {
                if (!this.history.tryInsertPush(str, str2)) {
                    return false;
                }
                saveStateToDisk();
                Bundle bundle = new Bundle();
                bundle.putString("com.parse.Channel", str3);
                if (jSONObject == null) {
                    bundle.putString("com.parse.Data", "{}");
                } else {
                    bundle.putString("com.parse.Data", jSONObject.toString());
                }
                Intent intent = new Intent("com.parse.push.intent.RECEIVE");
                intent.putExtras(bundle);
                Context applicationContext = Parse.getApplicationContext();
                intent.setPackage(applicationContext.getPackageName());
                applicationContext.sendBroadcast(intent);
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized JSONObject toJSON() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("history", this.history.toJSON());
        return jSONObject;
    }
}
