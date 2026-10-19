package com.parse;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ParseAnonymousUtils {
    public static Map<String, String> getAuthData() {
        HashMap map = new HashMap();
        map.put("id", UUID.randomUUID().toString());
        return map;
    }

    public static boolean isLinked(ParseUser parseUser) {
        return parseUser.isLinked("anonymous");
    }
}
