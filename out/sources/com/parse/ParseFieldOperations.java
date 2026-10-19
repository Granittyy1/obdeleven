package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class ParseFieldOperations {
    private static Map<String, ParseFieldOperationFactory> opDecoderMap = new HashMap();

    public interface ParseFieldOperationFactory {
        ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder);

        ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) throws JSONException;
    }

    public static ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) throws JSONException {
        String strOptString = jSONObject.optString("__op");
        ParseFieldOperationFactory parseFieldOperationFactory = opDecoderMap.get(strOptString);
        if (parseFieldOperationFactory != null) {
            return parseFieldOperationFactory.decode(jSONObject, parseDecoder);
        }
        throw new RuntimeException(B7.b.c("Unable to decode operation of type ", strOptString));
    }

    public static ArrayList<Object> jsonArrayAsArrayList(JSONArray jSONArray) {
        ArrayList<Object> arrayList = new ArrayList<>(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.get(i10));
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
        return arrayList;
    }

    private static void registerDecoder(String str, ParseFieldOperationFactory parseFieldOperationFactory) {
        opDecoderMap.put(str, parseFieldOperationFactory);
    }

    public static void registerDefaultDecoders() {
        registerDecoder("Batch", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.1
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) throws JSONException {
                JSONArray jSONArray = jSONObject.getJSONArray("ops");
                ParseFieldOperation parseFieldOperationMergeWithPrevious = null;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    parseFieldOperationMergeWithPrevious = ParseFieldOperations.decode(jSONArray.getJSONObject(i10), parseDecoder).mergeWithPrevious(parseFieldOperationMergeWithPrevious);
                }
                return parseFieldOperationMergeWithPrevious;
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return ParseFieldOperations.decode(parcel, parseParcelDecoder).mergeWithPrevious(ParseFieldOperations.decode(parcel, parseParcelDecoder));
            }
        });
        registerDecoder("Delete", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.2
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return ParseDeleteOperation.getInstance();
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return ParseDeleteOperation.getInstance();
            }
        });
        registerDecoder("Increment", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.3
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseIncrementOperation((Number) parseDecoder.decode(jSONObject.opt("amount")));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return new ParseIncrementOperation((Number) parseParcelDecoder.decode(parcel));
            }
        });
        registerDecoder("Add", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.4
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseAddOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    arrayList.add(i11, parseParcelDecoder.decode(parcel));
                }
                return new ParseAddOperation(arrayList);
            }
        });
        registerDecoder("AddUnique", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.5
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseAddUniqueOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    arrayList.add(i11, parseParcelDecoder.decode(parcel));
                }
                return new ParseAddUniqueOperation(arrayList);
            }
        });
        registerDecoder("Remove", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.6
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRemoveOperation((Collection) parseDecoder.decode(jSONObject.opt("objects")));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    arrayList.add(i11, parseParcelDecoder.decode(parcel));
                }
                return new ParseRemoveOperation(arrayList);
            }
        });
        registerDecoder("AddRelation", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.7
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRelationOperation(new HashSet((List) parseDecoder.decode(jSONObject.optJSONArray("objects"))), null);
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i10 = parcel.readInt();
                HashSet hashSet = new HashSet(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    hashSet.add((ParseObject) parseParcelDecoder.decode(parcel));
                }
                return new ParseRelationOperation(hashSet, null);
            }
        });
        registerDecoder("RemoveRelation", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.8
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return new ParseRelationOperation(null, new HashSet((List) parseDecoder.decode(jSONObject.optJSONArray("objects"))));
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                int i10 = parcel.readInt();
                HashSet hashSet = new HashSet(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    hashSet.add((ParseObject) parseParcelDecoder.decode(parcel));
                }
                return new ParseRelationOperation(null, hashSet);
            }
        });
        registerDecoder("Set", new ParseFieldOperationFactory() { // from class: com.parse.ParseFieldOperations.9
            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(JSONObject jSONObject, ParseDecoder parseDecoder) {
                return null;
            }

            @Override // com.parse.ParseFieldOperations.ParseFieldOperationFactory
            public ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
                return new ParseSetOperation(parseParcelDecoder.decode(parcel));
            }
        });
    }

    public static ParseFieldOperation decode(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        String string = parcel.readString();
        ParseFieldOperationFactory parseFieldOperationFactory = opDecoderMap.get(string);
        if (parseFieldOperationFactory != null) {
            return parseFieldOperationFactory.decode(parcel, parseParcelDecoder);
        }
        throw new RuntimeException(B7.b.c("Unable to decode operation of type ", string));
    }
}
