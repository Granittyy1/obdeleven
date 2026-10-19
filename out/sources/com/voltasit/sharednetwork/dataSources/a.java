package com.voltasit.sharednetwork.dataSources;

import Ia.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.d;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.voltasit.sharednetwork.dataSources.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpClient.kt */
    public static final class C0353a {
        public static /* synthetic */ Object a(a aVar, String str, Map map, String str2, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl, int i10) {
            if ((i10 & 2) != 0) {
                map = new HashMap();
            }
            Map map2 = map;
            if ((i10 & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            Map mapP = linkedHashMap;
            if ((i10 & 8) != 0) {
                mapP = y.p();
            }
            return aVar.b(str, str3, map2, mapP, continuationImpl);
        }

        public static /* synthetic */ Object b(a aVar, String str, HashMap map, String str2, ContinuationImpl continuationImpl, int i10) {
            if ((i10 & 2) != 0) {
                map = new HashMap();
            }
            HashMap map2 = map;
            if ((i10 & 4) != 0) {
                str2 = "";
            }
            return aVar.d(str, str2, map2, y.p(), continuationImpl);
        }
    }

    void a(String str);

    Object b(String str, String str2, Map map, Map map2, ContinuationImpl continuationImpl);

    Object c(l lVar, c cVar);

    @d
    Object d(String str, String str2, Map map, Map map2, ContinuationImpl continuationImpl);

    @d
    Object e(String str, String str2, ContinuationImpl continuationImpl);

    Object f(String str, String str2, Map map, c cVar);
}
