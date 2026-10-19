package com.parse;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class KnownParseObjectDecoder extends ParseDecoder {
    private Map<String, ParseObject> fetchedObjects;

    public KnownParseObjectDecoder(Map<String, ParseObject> map) {
        this.fetchedObjects = map;
    }

    @Override // com.parse.ParseDecoder
    public ParseObject decodePointer(String str, String str2) {
        Map<String, ParseObject> map = this.fetchedObjects;
        return (map == null || !map.containsKey(str2)) ? super.decodePointer(str, str2) : this.fetchedObjects.get(str2);
    }
}
