package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("_EventuallyPin")
class EventuallyPin extends ParseObject {
    public EventuallyPin() {
        super("_EventuallyPin");
    }

    public static Task<List<EventuallyPin>> findAllPinned(Collection<String> collection) {
        ParseQuery parseQueryOrderByAscending = new ParseQuery(EventuallyPin.class).fromPin("_eventuallyPin").ignoreACLs().orderByAscending("time");
        if (collection != null) {
            parseQueryOrderByAscending.whereNotContainedIn("uuid", collection);
        }
        return parseQueryOrderByAscending.findInBackground().onSuccessTask(new Continuation<List<EventuallyPin>, Task<List<EventuallyPin>>>() { // from class: com.parse.EventuallyPin.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<List<EventuallyPin>> then(Task<List<EventuallyPin>> task) {
                final List<EventuallyPin> result = task.getResult();
                ArrayList arrayList = new ArrayList();
                Iterator<EventuallyPin> it = result.iterator();
                while (it.hasNext()) {
                    ParseObject object = it.next().getObject();
                    if (object != null) {
                        arrayList.add(object.fetchFromLocalDatastoreAsync().makeVoid());
                    }
                }
                return Task.whenAll(arrayList).continueWithTask(new Continuation<Void, Task<List<EventuallyPin>>>() { // from class: com.parse.EventuallyPin.2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<List<EventuallyPin>> then(Task<Void> task2) {
                        return Task.forResult(result);
                    }
                });
            }
        });
    }

    public static Task<EventuallyPin> pinEventuallyCommand(ParseObject parseObject, ParseRESTCommand parseRESTCommand) {
        JSONObject jSONObject;
        int i10 = 3;
        if (parseRESTCommand.httpPath.startsWith("classes")) {
            ParseHttpRequest.Method method = parseRESTCommand.method;
            jSONObject = null;
            if (method == ParseHttpRequest.Method.POST || method == ParseHttpRequest.Method.PUT) {
                i10 = 1;
            } else if (method == ParseHttpRequest.Method.DELETE) {
                i10 = 2;
            }
        } else {
            jSONObject = parseRESTCommand.toJSONObject();
        }
        return pinEventuallyCommand(i10, parseObject, parseRESTCommand.getOperationSetUUID(), parseRESTCommand.getSessionToken(), jSONObject);
    }

    public ParseRESTCommand getCommand() throws JSONException {
        JSONObject jSONObject = getJSONObject("command");
        if (ParseRESTCommand.isValidCommandJSONObject(jSONObject)) {
            return ParseRESTCommand.fromJSONObject(jSONObject);
        }
        if (ParseRESTCommand.isValidOldFormatCommandJSONObject(jSONObject)) {
            return null;
        }
        throw new JSONException("Failed to load command from JSON.");
    }

    public ParseObject getObject() {
        return getParseObject("object");
    }

    public String getOperationSetUUID() {
        return getString("operationSetUUID");
    }

    public String getSessionToken() {
        return getString("sessionToken");
    }

    public int getType() {
        return getInt("type");
    }

    public String getUUID() {
        return getString("uuid");
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    private static Task<EventuallyPin> pinEventuallyCommand(int i10, ParseObject parseObject, String str, String str2, JSONObject jSONObject) {
        EventuallyPin eventuallyPin = new EventuallyPin();
        eventuallyPin.put("uuid", UUID.randomUUID().toString());
        eventuallyPin.put("time", new Date());
        eventuallyPin.put("type", Integer.valueOf(i10));
        if (parseObject != null) {
            eventuallyPin.put("object", parseObject);
        }
        if (str != null) {
            eventuallyPin.put("operationSetUUID", str);
        }
        if (str2 != null) {
            eventuallyPin.put("sessionToken", str2);
        }
        if (jSONObject != null) {
            eventuallyPin.put("command", jSONObject);
        }
        return eventuallyPin.pinInBackground("_eventuallyPin").continueWith(new Continuation<Void, EventuallyPin>() { // from class: com.parse.EventuallyPin.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public EventuallyPin then(Task<Void> task) {
                return EventuallyPin.this;
            }
        });
    }
}
