package com.parse;

import android.content.Intent;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseAnalytics {
    private static final Map<String, Boolean> lruSeenPushes = new LinkedHashMap<String, Boolean>() { // from class: com.parse.ParseAnalytics.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            return size() > 10;
        }
    };

    public static ParseAnalyticsController getAnalyticsController() {
        return ParseCorePlugins.getInstance().getAnalyticsController();
    }

    public static String getPushHashFromIntent(Intent intent) {
        String string = (intent == null || intent.getExtras() == null) ? null : intent.getExtras().getString("com.parse.Data");
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string).optString("push_hash");
        } catch (JSONException e10) {
            PLog.e("com.parse.ParseAnalytics", "Failed to parse push data: " + e10.getMessage());
            return null;
        }
    }

    public static Task<Void> trackAppOpenedInBackground(Intent intent) {
        String pushHashFromIntent = getPushHashFromIntent(intent);
        final Capture capture = new Capture();
        if (pushHashFromIntent != null && pushHashFromIntent.length() > 0) {
            Map<String, Boolean> map = lruSeenPushes;
            synchronized (map) {
                try {
                    if (map.containsKey(pushHashFromIntent)) {
                        return Task.forResult(null);
                    }
                    map.put(pushHashFromIntent, Boolean.TRUE);
                    capture.set(pushHashFromIntent);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.ParseAnalytics.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                return ParseAnalytics.getAnalyticsController().trackAppOpenedInBackground((String) capture.get(), task.getResult());
            }
        });
    }
}
