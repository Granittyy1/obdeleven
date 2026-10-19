package com.parse;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseParcelDecoder {
    private static final ParseParcelDecoder INSTANCE = new ParseParcelDecoder();

    public static ParseParcelDecoder get() {
        return INSTANCE;
    }

    public Object decode(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        int i10 = 0;
        switch (string) {
            case "Native":
                return parcel.readValue(null);
            case "Object":
                return decodeParseObject(parcel);
            case "JsonNull":
                return JSONObject.NULL;
            case "Operation":
                return ParseFieldOperations.decode(parcel, this);
            case "Relation":
                return new ParseRelation(parcel, this);
            case "Acl":
                return new ParseACL(parcel, this);
            case "Map":
                int i11 = parcel.readInt();
                HashMap map = new HashMap(i11);
                while (i10 < i11) {
                    map.put(parcel.readString(), decode(parcel));
                    i10++;
                }
                return map;
            case "Date":
                return ParseDateFormat.getInstance().parse(parcel.readString());
            case "File":
                return new ParseFile(parcel, this);
            case "Null":
                return null;
            case "Bytes":
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return bArr;
            case "Collection":
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (i10 < i12) {
                    arrayList.add(i10, decode(parcel));
                    i10++;
                }
                return arrayList;
            case "Pointer":
                return decodePointer(parcel);
            case "Polygon":
                return new ParsePolygon(parcel, this);
            case "GeoPoint":
                return new ParseGeoPoint(parcel, this);
            default:
                throw new RuntimeException("Could not unparcel objects from this Parcel.");
        }
    }

    public ParseObject decodeParseObject(Parcel parcel) {
        return ParseObject.createFromParcel(parcel, this);
    }

    public ParseObject decodePointer(Parcel parcel) {
        return ParseObject.createWithoutData(parcel.readString(), parcel.readString());
    }
}
