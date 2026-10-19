package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseConfig {
    static final TaskQueue taskQueue = new TaskQueue();
    final Map<String, Object> params;

    public ParseConfig(Map<String, Object> map) {
        this.params = Collections.unmodifiableMap(map);
    }

    public static ParseConfig decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
        Map map = (Map) ((Map) parseDecoder.decode(jSONObject)).get("params");
        if (map != null) {
            return new ParseConfig(map);
        }
        throw new RuntimeException("Object did not contain the 'params' key.");
    }

    public static ParseConfig get() throws ParseException {
        return (ParseConfig) ParseTaskUtils.wait(getInBackground());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task<ParseConfig> getAsync(final Task<Void> task) {
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<ParseConfig>>() { // from class: com.parse.ParseConfig.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<ParseConfig> then(Task<String> task2) {
                final String result = task2.getResult();
                return task.continueWithTask(new Continuation<Void, Task<ParseConfig>>() { // from class: com.parse.ParseConfig.2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<ParseConfig> then(Task<Void> task3) {
                        return ParseConfig.getConfigController().getAsync(result);
                    }
                });
            }
        });
    }

    public static ParseConfigController getConfigController() {
        return ParseCorePlugins.getInstance().getConfigController();
    }

    public static ParseConfig getCurrentConfig() {
        try {
            return (ParseConfig) ParseTaskUtils.wait(getConfigController().getCurrentConfigController().getCurrentConfigAsync());
        } catch (ParseException unused) {
            return new ParseConfig();
        }
    }

    public static Task<ParseConfig> getInBackground() {
        return taskQueue.enqueue(new Continuation<Void, Task<ParseConfig>>() { // from class: com.parse.ParseConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<ParseConfig> then(Task<Void> task) {
                return ParseConfig.getAsync(task);
            }
        });
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public Date getDate(String str) {
        return getDate(str, null);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public JSONArray getJSONArray(String str) {
        return getJSONArray(str, null);
    }

    public JSONObject getJSONObject(String str) {
        return getJSONObject(str, null);
    }

    public <T> List<T> getList(String str) {
        return getList(str, null);
    }

    public <V> Map<String, V> getMap(String str) {
        return getMap(str, null);
    }

    public Number getNumber(String str) {
        return getNumber(str, null);
    }

    public Map<String, Object> getParams() {
        return Collections.unmodifiableMap(new HashMap(this.params));
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public String toString() {
        return "ParseConfig[" + this.params.toString() + "]";
    }

    public boolean getBoolean(String str, boolean z10) {
        if (!this.params.containsKey(str)) {
            return z10;
        }
        Object obj = this.params.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public Date getDate(String str, Date date) {
        if (!this.params.containsKey(str)) {
            return date;
        }
        Object obj = this.params.get(str);
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof Date ? (Date) obj : date;
    }

    public int getInt(String str, int i10) {
        Number number = getNumber(str);
        return number != null ? number.intValue() : i10;
    }

    public JSONArray getJSONArray(String str, JSONArray jSONArray) {
        List list = getList(str);
        Object objEncode = list != null ? PointerEncoder.get().encode(list) : null;
        return (objEncode == null || (objEncode instanceof JSONArray)) ? (JSONArray) objEncode : jSONArray;
    }

    public JSONObject getJSONObject(String str, JSONObject jSONObject) {
        Map map = getMap(str);
        Object objEncode = map != null ? PointerEncoder.get().encode(map) : null;
        return (objEncode == null || (objEncode instanceof JSONObject)) ? (JSONObject) objEncode : jSONObject;
    }

    public <T> List<T> getList(String str, List<T> list) {
        if (!this.params.containsKey(str)) {
            return list;
        }
        Object obj = this.params.get(str);
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof List ? (List) obj : list;
    }

    public <V> Map<String, V> getMap(String str, Map<String, V> map) {
        if (!this.params.containsKey(str)) {
            return map;
        }
        Object obj = this.params.get(str);
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof Map ? (Map) obj : map;
    }

    public Number getNumber(String str, Number number) {
        if (!this.params.containsKey(str)) {
            return number;
        }
        Object obj = this.params.get(str);
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof Number ? (Number) obj : number;
    }

    public String getString(String str, String str2) {
        if (!this.params.containsKey(str)) {
            return str2;
        }
        Object obj = this.params.get(str);
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof String ? (String) obj : str2;
    }

    public ParseConfig() {
        this.params = Collections.unmodifiableMap(new HashMap());
    }
}
