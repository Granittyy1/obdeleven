package com.parse;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTCommand extends ParseRequest<JSONObject> {
    static URL server;
    String httpPath;
    private String installationId;
    final JSONObject jsonParameters;
    private String localId;
    public String masterKey;
    private String operationSetUUID;
    private final String sessionToken;

    public static abstract class Init<T extends Init<T>> {
        private String httpPath;
        private String installationId;
        private JSONObject jsonParameters;
        private String localId;
        public String masterKey;
        private ParseHttpRequest.Method method = ParseHttpRequest.Method.GET;
        private String operationSetUUID;
        private String sessionToken;

        public T httpPath(String str) {
            this.httpPath = str;
            return (T) self();
        }

        public T method(ParseHttpRequest.Method method) {
            this.method = method;
            return (T) self();
        }

        public abstract T self();

        public T sessionToken(String str) {
            this.sessionToken = str;
            return (T) self();
        }
    }

    public ParseRESTCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        this(str, method, map != null ? (JSONObject) NoObjectsEncoder.get().encode(map) : null, str2);
    }

    private static void addToStringer(JSONStringer jSONStringer, Object obj) throws JSONException {
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                jSONStringer.value(obj);
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            jSONStringer.array();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                addToStringer(jSONStringer, jSONArray.get(i10));
            }
            jSONStringer.endArray();
            return;
        }
        jSONStringer.object();
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        ArrayList<String> arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList);
        for (String str : arrayList) {
            jSONStringer.key(str);
            addToStringer(jSONStringer, jSONObject.opt(str));
        }
        jSONStringer.endObject();
    }

    private static String createUrl(String str) {
        if (str == null) {
            return server.toString();
        }
        try {
            return new URL(server, str).toString();
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static ParseRESTCommand fromJSONObject(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("httpPath");
        ParseHttpRequest.Method methodFromString = ParseHttpRequest.Method.fromString(jSONObject.optString("httpMethod"));
        String strOptString2 = jSONObject.optString("sessionToken", null);
        return new ParseRESTCommand(strOptString, methodFromString, jSONObject.optJSONObject("parameters"), jSONObject.optString("localId", null), strOptString2);
    }

    private static LocalIdManager getLocalIdManager() {
        return ParseCorePlugins.getInstance().getLocalIdManager();
    }

    public static void getLocalPointersIn(Object obj, ArrayList<JSONObject> arrayList) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if ("Pointer".equals(jSONObject.opt("__type")) && jSONObject.has("localId")) {
                arrayList.add(jSONObject);
                return;
            } else {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    getLocalPointersIn(jSONObject.get(itKeys.next()), arrayList);
                }
            }
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                getLocalPointersIn(jSONArray.get(i10), arrayList);
            }
        }
    }

    public static boolean isValidCommandJSONObject(JSONObject jSONObject) {
        return jSONObject.has("httpPath");
    }

    public static boolean isValidOldFormatCommandJSONObject(JSONObject jSONObject) {
        return jSONObject.has("op");
    }

    private void maybeChangeServerOperation() {
        String objectId;
        if (this.localId == null || (objectId = getLocalIdManager().getObjectId(this.localId)) == null) {
            return;
        }
        this.localId = null;
        String str = this.httpPath + "/".concat(objectId);
        this.httpPath = str;
        this.url = createUrl(str);
        if (this.httpPath.startsWith("classes") && this.method == ParseHttpRequest.Method.POST) {
            this.method = ParseHttpRequest.Method.PUT;
        }
    }

    public static String toDeterministicString(Object obj) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer();
        addToStringer(jSONStringer, obj);
        return jSONStringer.toString();
    }

    public void addAdditionalHeaders(ParseHttpRequest.Builder builder) {
        String str = this.installationId;
        if (str != null) {
            builder.addHeader("X-Parse-Installation-Id", str);
        }
        String str2 = this.sessionToken;
        if (str2 != null) {
            builder.addHeader("X-Parse-Session-Token", str2);
        }
        String str3 = this.masterKey;
        if (str3 != null) {
            builder.addHeader("X-Parse-Master-Key", str3);
        }
    }

    @Override // com.parse.ParseRequest
    public Task<JSONObject> executeAsync(ParseHttpClient parseHttpClient, ProgressCallback progressCallback, ProgressCallback progressCallback2, Task<Void> task) {
        resolveLocalIds();
        return super.executeAsync(parseHttpClient, progressCallback, progressCallback2, task);
    }

    public String getCacheKey() {
        String deterministicString;
        JSONObject jSONObject = this.jsonParameters;
        if (jSONObject != null) {
            try {
                deterministicString = toDeterministicString(jSONObject);
            } catch (JSONException e10) {
                throw new RuntimeException(e10.getMessage());
            }
        } else {
            deterministicString = "";
        }
        if (this.sessionToken != null) {
            StringBuilder sbE = C4.b.e(deterministicString);
            sbE.append(this.sessionToken);
            deterministicString = sbE.toString();
        }
        String string = this.method.toString();
        String strMd5 = ParseDigestUtils.md5(this.httpPath);
        String strMd6 = ParseDigestUtils.md5(deterministicString);
        StringBuilder sbC = B6.a.c("ParseRESTCommand.", string, ".", strMd5, ".");
        sbC.append(strMd6);
        return sbC.toString();
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getOperationSetUUID() {
        return this.operationSetUUID;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    @Override // com.parse.ParseRequest
    public ParseHttpBody newBody(ProgressCallback progressCallback) {
        JSONObject jSONObject = this.jsonParameters;
        if (jSONObject == null) {
            throw new IllegalArgumentException(d.b("Trying to execute a ", this.method.toString(), " command without body parameters."));
        }
        try {
            ParseHttpRequest.Method method = this.method;
            if (method == ParseHttpRequest.Method.GET || method == ParseHttpRequest.Method.DELETE) {
                jSONObject = new JSONObject(this.jsonParameters.toString());
                jSONObject.put("_method", this.method.toString());
            }
            return new ParseByteArrayHttpBody(jSONObject.toString(), "application/json");
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    @Override // com.parse.ParseRequest
    public ParseHttpRequest newRequest(ParseHttpRequest.Method method, String str, ProgressCallback progressCallback) {
        ParseHttpRequest.Method method2;
        ParseHttpRequest.Builder builder = new ParseHttpRequest.Builder((this.jsonParameters == null || method == (method2 = ParseHttpRequest.Method.POST) || method == ParseHttpRequest.Method.PUT) ? super.newRequest(method, str, progressCallback) : super.newRequest(method2, str, progressCallback));
        addAdditionalHeaders(builder);
        return builder.build();
    }

    @Override // com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) {
        InputStream content = null;
        try {
            try {
                content = parseHttpResponse.getContent();
                String str = new String(ParseIOUtils.toByteArray(content));
                ParseIOUtils.closeQuietly(content);
                int statusCode = parseHttpResponse.getStatusCode();
                if (statusCode < 200 || statusCode >= 600) {
                    return Task.forError(newPermanentException(-1, str));
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (statusCode < 400 || statusCode >= 500) {
                        return statusCode >= 500 ? Task.forError(newTemporaryException(jSONObject.optInt("code"), jSONObject.optString("error"))) : Task.forResult(jSONObject);
                    }
                    return Task.forError(newPermanentException(jSONObject.optInt("code"), jSONObject.optString("error")));
                } catch (JSONException e10) {
                    return Task.forError(newTemporaryException("bad json response", e10));
                }
            } catch (IOException e11) {
                Task<JSONObject> taskForError = Task.forError(e11);
                ParseIOUtils.closeQuietly(content);
                return taskForError;
            }
        } catch (Throwable th) {
            ParseIOUtils.closeQuietly(content);
            throw th;
        }
    }

    public void releaseLocalIds() {
        if (this.localId != null) {
            getLocalIdManager().releaseLocalIdOnDisk(this.localId);
        }
        try {
            ArrayList arrayList = new ArrayList();
            getLocalPointersIn(this.jsonParameters, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getLocalIdManager().releaseLocalIdOnDisk((String) ((JSONObject) it.next()).get("localId"));
            }
        } catch (JSONException unused) {
        }
    }

    public void resolveLocalIds() {
        try {
            ArrayList<JSONObject> arrayList = new ArrayList();
            getLocalPointersIn(this.jsonParameters, arrayList);
            for (JSONObject jSONObject : arrayList) {
                String objectId = getLocalIdManager().getObjectId((String) jSONObject.get("localId"));
                if (objectId == null) {
                    throw new IllegalStateException("Tried to serialize a command referencing a new, unsaved object.");
                }
                jSONObject.put("objectId", objectId);
                jSONObject.remove("localId");
            }
            maybeChangeServerOperation();
        } catch (JSONException unused) {
        }
    }

    public void retainLocalIds() {
        if (this.localId != null) {
            getLocalIdManager().retainLocalIdOnDisk(this.localId);
        }
        try {
            ArrayList arrayList = new ArrayList();
            getLocalPointersIn(this.jsonParameters, arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getLocalIdManager().retainLocalIdOnDisk((String) ((JSONObject) it.next()).get("localId"));
            }
        } catch (JSONException unused) {
        }
    }

    public void setLocalId(String str) {
        this.localId = str;
    }

    public void setOperationSetUUID(String str) {
        this.operationSetUUID = str;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.httpPath;
            if (str != null) {
                jSONObject.put("httpPath", str);
            }
            jSONObject.put("httpMethod", this.method.toString());
            JSONObject jSONObject2 = this.jsonParameters;
            if (jSONObject2 != null) {
                jSONObject.put("parameters", jSONObject2);
            }
            String str2 = this.sessionToken;
            if (str2 != null) {
                jSONObject.put("sessionToken", str2);
            }
            String str3 = this.localId;
            if (str3 != null) {
                jSONObject.put("localId", str3);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public ParseRESTCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        this(str, method, jSONObject, null, str2);
    }

    private ParseRESTCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2, String str3) {
        super(method, createUrl(str));
        this.httpPath = str;
        this.jsonParameters = jSONObject;
        this.localId = str2;
        this.sessionToken = str3;
    }

    public ParseRESTCommand(Init<?> init) {
        super(((Init) init).method, createUrl(((Init) init).httpPath));
        this.sessionToken = ((Init) init).sessionToken;
        this.installationId = ((Init) init).installationId;
        this.masterKey = init.masterKey;
        this.httpPath = ((Init) init).httpPath;
        this.jsonParameters = ((Init) init).jsonParameters;
        this.operationSetUUID = ((Init) init).operationSetUUID;
        this.localId = ((Init) init).localId;
    }
}
