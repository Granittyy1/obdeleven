package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseAddUniqueOperation implements ParseFieldOperation {
    protected final LinkedHashSet<Object> objects;

    public ParseAddUniqueOperation(Collection<?> collection) {
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        this.objects = linkedHashSet;
        linkedHashSet.addAll(collection);
    }

    @Override // com.parse.ParseFieldOperation
    public Object apply(Object obj, String str) {
        if (obj == null) {
            return new ArrayList(this.objects);
        }
        if (obj instanceof JSONArray) {
            return new JSONArray((Collection) apply(ParseFieldOperations.jsonArrayAsArrayList((JSONArray) obj), str));
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        ArrayList arrayList = new ArrayList((List) obj);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof ParseObject) {
                map.put(((ParseObject) arrayList.get(i10)).getObjectId(), Integer.valueOf(i10));
            }
        }
        for (Object obj2 : this.objects) {
            if (obj2 instanceof ParseObject) {
                String objectId = ((ParseObject) obj2).getObjectId();
                if (objectId != null && map.containsKey(objectId)) {
                    arrayList.set(((Integer) map.get(objectId)).intValue(), obj2);
                } else if (!arrayList.contains(obj2)) {
                    arrayList.add(obj2);
                }
            } else if (!arrayList.contains(obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // com.parse.ParseFieldOperation
    public ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation) {
        if (parseFieldOperation == null) {
            return this;
        }
        if (parseFieldOperation instanceof ParseDeleteOperation) {
            return new ParseSetOperation(this.objects);
        }
        if (!(parseFieldOperation instanceof ParseSetOperation)) {
            if (parseFieldOperation instanceof ParseAddUniqueOperation) {
                return new ParseAddUniqueOperation((List) apply(new ArrayList(((ParseAddUniqueOperation) parseFieldOperation).objects), null));
            }
            throw new IllegalArgumentException("Operation is invalid after previous operation.");
        }
        Object value = ((ParseSetOperation) parseFieldOperation).getValue();
        if ((value instanceof JSONArray) || (value instanceof List)) {
            return new ParseSetOperation(apply(value, null));
        }
        throw new IllegalArgumentException("You can only add an item to a List or JSONArray.");
    }

    @Override // com.parse.ParseFieldOperation
    public JSONObject encode(ParseEncoder parseEncoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__op", "AddUnique");
        jSONObject.put("objects", parseEncoder.encode(new ArrayList(this.objects)));
        return jSONObject;
    }

    @Override // com.parse.ParseFieldOperation
    public void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeString("AddUnique");
        parcel.writeInt(this.objects.size());
        Iterator<Object> it = this.objects.iterator();
        while (it.hasNext()) {
            parseParcelEncoder.encode(it.next(), parcel);
        }
    }
}
