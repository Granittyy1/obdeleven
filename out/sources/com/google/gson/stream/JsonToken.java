package com.google.gson.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class JsonToken {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonToken f28987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonToken f28988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JsonToken f28989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JsonToken f28990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final JsonToken f28991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final JsonToken f28992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final JsonToken f28993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final JsonToken f28994i;
    public static final JsonToken j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final JsonToken f28995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ JsonToken[] f28996l;

    static {
        JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
        f28987b = jsonToken;
        JsonToken jsonToken2 = new JsonToken("END_ARRAY", 1);
        f28988c = jsonToken2;
        JsonToken jsonToken3 = new JsonToken("BEGIN_OBJECT", 2);
        f28989d = jsonToken3;
        JsonToken jsonToken4 = new JsonToken("END_OBJECT", 3);
        f28990e = jsonToken4;
        JsonToken jsonToken5 = new JsonToken("NAME", 4);
        f28991f = jsonToken5;
        JsonToken jsonToken6 = new JsonToken("STRING", 5);
        f28992g = jsonToken6;
        JsonToken jsonToken7 = new JsonToken("NUMBER", 6);
        f28993h = jsonToken7;
        JsonToken jsonToken8 = new JsonToken("BOOLEAN", 7);
        f28994i = jsonToken8;
        JsonToken jsonToken9 = new JsonToken("NULL", 8);
        j = jsonToken9;
        JsonToken jsonToken10 = new JsonToken("END_DOCUMENT", 9);
        f28995k = jsonToken10;
        f28996l = new JsonToken[]{jsonToken, jsonToken2, jsonToken3, jsonToken4, jsonToken5, jsonToken6, jsonToken7, jsonToken8, jsonToken9, jsonToken10};
    }

    public JsonToken() {
        throw null;
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) f28996l.clone();
    }
}
