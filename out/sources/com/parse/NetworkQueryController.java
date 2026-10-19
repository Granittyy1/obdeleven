package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class NetworkQueryController extends AbstractQueryController {
    private final ParseHttpClient restClient;

    public NetworkQueryController(ParseHttpClient parseHttpClient) {
        this.restClient = parseHttpClient;
    }

    public <T extends ParseObject> List<T> convertFindResponse(ParseQuery.State<T> state, JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("results");
        if (jSONArray == null) {
            PLog.d("NetworkQueryController", "null results in find response");
        } else {
            String strOptString = jSONObject.optString("className", null);
            if (strOptString == null) {
                strOptString = state.className();
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                ParseObject parseObjectFromJSON = ParseObject.fromJSON(jSONArray.getJSONObject(i10), strOptString, ParseDecoder.get(), state.selectedKeys());
                arrayList.add(parseObjectFromJSON);
                ParseQuery.RelationConstraint relationConstraint = (ParseQuery.RelationConstraint) state.constraints().get("$relatedTo");
                if (relationConstraint != null) {
                    relationConstraint.getRelation().addKnownObject(parseObjectFromJSON);
                }
            }
        }
        return arrayList;
    }

    @Override // com.parse.ParseQueryController
    public <T extends ParseObject> Task<List<T>> findAsync(ParseQuery.State<T> state, ParseUser parseUser, Task<Void> task) {
        return findAsync(state, parseUser != null ? parseUser.getSessionToken() : null, task);
    }

    public <T extends ParseObject> Task<List<T>> findAsync(final ParseQuery.State<T> state, String str, Task<Void> task) {
        final long jNanoTime = System.nanoTime();
        final ParseRESTQueryCommand parseRESTQueryCommandFindCommand = ParseRESTQueryCommand.findCommand(state, str);
        final long jNanoTime2 = System.nanoTime();
        return (Task<List<T>>) parseRESTQueryCommandFindCommand.executeAsync(this.restClient, task).onSuccess((Continuation<JSONObject, TContinuationResult>) new Continuation<JSONObject, List<T>>() { // from class: com.parse.NetworkQueryController.1
            @Override // com.parse.boltsinternal.Continuation
            public List<T> then(Task<JSONObject> task2) throws Exception {
                JSONObject result = task2.getResult();
                ParseQuery.CachePolicy cachePolicy = state.cachePolicy();
                if (cachePolicy != null && cachePolicy != ParseQuery.CachePolicy.IGNORE_CACHE) {
                    ParseKeyValueCache.saveToKeyValueCache(parseRESTQueryCommandFindCommand.getCacheKey(), result.toString());
                }
                long jNanoTime3 = System.nanoTime();
                List<T> listConvertFindResponse = NetworkQueryController.this.convertFindResponse(state, task2.getResult());
                long jNanoTime4 = System.nanoTime();
                if (result.has("trace")) {
                    PLog.d("ParseQuery", String.format("Query pre-processing took %f seconds\n%s\nClient side parsing took %f seconds\n", Float.valueOf((jNanoTime2 - jNanoTime) / 1000000.0f), result.get("trace"), Float.valueOf((jNanoTime4 - jNanoTime3) / 1000000.0f)));
                }
                return listConvertFindResponse;
            }
        }, Task.BACKGROUND_EXECUTOR);
    }
}
