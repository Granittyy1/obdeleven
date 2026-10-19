package io.intercom.android.sdk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;

/* JADX INFO: compiled from: AuthToken.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthTokenKt {
    public static final Map<String, String> toMap(List<AuthToken> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        List<AuthToken> list2 = list;
        int iN = x.n(kotlin.collections.m.y(list2, 10));
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (AuthToken authToken : list2) {
            Pair pair = new Pair(authToken.getName(), authToken.getToken());
            linkedHashMap.put(pair.c(), pair.d());
        }
        return linkedHashMap;
    }
}
