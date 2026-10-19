package com.parse;

import java.util.HashMap;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
public class ParseFbHelper {
    public static void linkFb(z zVar, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("id", str);
        map.put("access_token", str2);
        map.put("expiration_date", str3);
        zVar.putAuthData("facebook", map);
    }

    public static void unlinkFb(z zVar) {
        zVar.putAuthData("facebook", null);
    }
}
