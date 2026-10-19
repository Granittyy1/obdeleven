package com.parse;

import android.os.Parcel;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class ParseObjectParcelEncoder extends ParseParcelEncoder {
    private Set<String> ids;

    public ParseObjectParcelEncoder() {
        this.ids = new HashSet();
    }

    private String getObjectOrLocalId(ParseObject parseObject) {
        return parseObject.getObjectId() != null ? parseObject.getObjectId() : parseObject.getOrCreateLocalId();
    }

    @Override // com.parse.ParseParcelEncoder
    public void encodeParseObject(ParseObject parseObject, Parcel parcel) {
        String objectOrLocalId = getObjectOrLocalId(parseObject);
        if (this.ids.contains(objectOrLocalId)) {
            encodePointer(parseObject.getClassName(), objectOrLocalId, parcel);
        } else {
            this.ids.add(objectOrLocalId);
            super.encodeParseObject(parseObject, parcel);
        }
    }

    public ParseObjectParcelEncoder(ParseObject parseObject) {
        HashSet hashSet = new HashSet();
        this.ids = hashSet;
        hashSet.add(getObjectOrLocalId(parseObject));
    }
}
