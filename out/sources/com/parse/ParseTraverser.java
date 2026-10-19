package com.parse;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class ParseTraverser {
    private boolean traverseParseObjects = false;
    private boolean yieldRoot = false;

    private void traverseInternal(Object obj, boolean z10, IdentityHashMap<Object, Object> identityHashMap) {
        ParseUser unresolvedUser;
        if (obj == null || identityHashMap.containsKey(obj)) {
            return;
        }
        if (!z10 || visit(obj)) {
            identityHashMap.put(obj, obj);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        traverseInternal(jSONObject.get(itKeys.next()), true, identityHashMap);
                    } catch (JSONException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                return;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        traverseInternal(jSONArray.get(i10), true, identityHashMap);
                    } catch (JSONException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it = ((Map) obj).values().iterator();
                while (it.hasNext()) {
                    traverseInternal(it.next(), true, identityHashMap);
                }
                return;
            }
            if (obj instanceof List) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    traverseInternal(it2.next(), true, identityHashMap);
                }
            } else {
                if (!(obj instanceof ParseObject)) {
                    if ((obj instanceof ParseACL) && (unresolvedUser = ((ParseACL) obj).getUnresolvedUser()) != null && unresolvedUser.isCurrentUser()) {
                        traverseInternal(unresolvedUser, true, identityHashMap);
                        return;
                    }
                    return;
                }
                if (this.traverseParseObjects) {
                    ParseObject parseObject = (ParseObject) obj;
                    Iterator<String> it3 = parseObject.keySet().iterator();
                    while (it3.hasNext()) {
                        traverseInternal(parseObject.get(it3.next()), true, identityHashMap);
                    }
                }
            }
        }
    }

    public ParseTraverser setTraverseParseObjects(boolean z10) {
        this.traverseParseObjects = z10;
        return this;
    }

    public ParseTraverser setYieldRoot(boolean z10) {
        this.yieldRoot = z10;
        return this;
    }

    public void traverse(Object obj) {
        traverseInternal(obj, this.yieldRoot, new IdentityHashMap<>());
    }

    public abstract boolean visit(Object obj);
}
