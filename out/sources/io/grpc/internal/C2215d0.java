package io.grpc.internal;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JsonParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2215d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f37530a = Logger.getLogger(C2215d0.class.getName());

    public static Object a(M7.a aVar) throws IOException {
        A8.p.p("unexpected end of JSON", aVar.C());
        int iOrdinal = aVar.y0().ordinal();
        if (iOrdinal == 0) {
            aVar.b();
            ArrayList arrayList = new ArrayList();
            while (aVar.C()) {
                arrayList.add(a(aVar));
            }
            A8.p.p("Bad token: " + aVar.x(false), aVar.y0() == JsonToken.f28988c);
            aVar.j();
            return Collections.unmodifiableList(arrayList);
        }
        if (iOrdinal == 2) {
            aVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.C()) {
                linkedHashMap.put(aVar.j0(), a(aVar));
            }
            A8.p.p("Bad token: " + aVar.x(false), aVar.y0() == JsonToken.f28990e);
            aVar.k();
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (iOrdinal == 5) {
            return aVar.r0();
        }
        if (iOrdinal == 6) {
            return Double.valueOf(aVar.S());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(aVar.R());
        }
        if (iOrdinal == 8) {
            aVar.n0();
            return null;
        }
        throw new IllegalStateException("Bad token: " + aVar.x(false));
    }
}
