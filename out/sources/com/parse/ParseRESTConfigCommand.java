package com.parse;

import com.parse.http.ParseHttpRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTConfigCommand extends ParseRESTCommand {
    public ParseRESTConfigCommand(String str, ParseHttpRequest.Method method, Map<String, ?> map, String str2) {
        super(str, method, map, str2);
    }

    public static ParseRESTConfigCommand fetchConfigCommand(String str) {
        return new ParseRESTConfigCommand("config", ParseHttpRequest.Method.GET, null, str);
    }
}
