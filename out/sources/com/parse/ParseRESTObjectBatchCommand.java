package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTObjectBatchCommand extends ParseRESTCommand {
    private ParseRESTObjectBatchCommand(String str, ParseHttpRequest.Method method, JSONObject jSONObject, String str2) {
        super(str, method, jSONObject, str2);
    }

    public static List<Task<JSONObject>> executeBatch(ParseHttpClient parseHttpClient, List<ParseRESTObjectCommand> list, String str) {
        final int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        if (size == 1) {
            arrayList.add(list.get(0).executeAsync(parseHttpClient));
            return arrayList;
        }
        if (size > 50) {
            List listPartition = Lists.partition(list, 50);
            int size2 = listPartition.size();
            while (i10 < size2) {
                arrayList.addAll(executeBatch(parseHttpClient, (List) listPartition.get(i10), str));
                i10++;
            }
            return arrayList;
        }
        final ArrayList arrayList2 = new ArrayList(size);
        while (i10 < size) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            arrayList2.add(taskCompletionSource);
            arrayList.add(taskCompletionSource.getTask());
            i10++;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (ParseRESTObjectCommand parseRESTObjectCommand : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("method", parseRESTObjectCommand.method.toString());
                jSONObject2.put("path", new URL(ParseRESTCommand.server, parseRESTObjectCommand.httpPath).getPath());
                JSONObject jSONObject3 = parseRESTObjectCommand.jsonParameters;
                if (jSONObject3 != null) {
                    jSONObject2.put("body", jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("requests", jSONArray);
            new ParseRESTObjectBatchCommand("batch", ParseHttpRequest.Method.POST, jSONObject, str).executeAsync(parseHttpClient).continueWith(new Continuation<JSONObject, Void>() { // from class: com.parse.ParseRESTObjectBatchCommand.1
                @Override // com.parse.boltsinternal.Continuation
                public Void then(Task<JSONObject> task) throws Exception {
                    if (task.isFaulted() || task.isCancelled()) {
                        for (int i11 = 0; i11 < size; i11++) {
                            TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) arrayList2.get(i11);
                            if (task.isFaulted()) {
                                taskCompletionSource2.setError(task.getError());
                            } else {
                                taskCompletionSource2.setCancelled();
                            }
                        }
                    }
                    JSONArray jSONArray2 = task.getResult().getJSONArray("results");
                    int length = jSONArray2.length();
                    if (length != size) {
                        for (int i12 = 0; i12 < size; i12++) {
                            ((TaskCompletionSource) arrayList2.get(i12)).setError(new IllegalStateException("Batch command result count expected: " + size + " but was: " + length));
                        }
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i13);
                        TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) arrayList2.get(i13);
                        if (jSONObject4.has("success")) {
                            taskCompletionSource3.setResult(jSONObject4.getJSONObject("success"));
                        } else if (jSONObject4.has("error")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("error");
                            taskCompletionSource3.setError(new ParseException(jSONObject5.getInt("code"), jSONObject5.getString("error")));
                        }
                    }
                    return null;
                }
            });
            return arrayList;
        } catch (MalformedURLException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (JSONException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    @Override // com.parse.ParseRESTCommand, com.parse.ParseRequest
    public Task<JSONObject> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback) {
        InputStream content = null;
        try {
            try {
                content = parseHttpResponse.getContent();
                String str = new String(ParseIOUtils.toByteArray(content));
                ParseIOUtils.closeQuietly(content);
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("results", jSONArray);
                    return Task.forResult(jSONObject);
                } catch (JSONException e10) {
                    return Task.forError(newTemporaryException("bad json response", e10));
                }
            } catch (Throwable th) {
                ParseIOUtils.closeQuietly(content);
                throw th;
            }
        } catch (IOException e11) {
            Task<JSONObject> taskForError = Task.forError(e11);
            ParseIOUtils.closeQuietly(content);
            return taskForError;
        }
    }
}
