package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class JsonElementTypeAdapter extends TypeAdapter<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f28871a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static g a(M7.a aVar, JsonToken jsonToken) throws IOException {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return new j(aVar.r0());
        }
        if (iOrdinal == 6) {
            return new j(new LazilyParsedNumber(aVar.r0()));
        }
        if (iOrdinal == 7) {
            return new j(Boolean.valueOf(aVar.R()));
        }
        if (iOrdinal == 8) {
            aVar.n0();
            return h.f28825b;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    public static void b(M7.b bVar, g gVar) throws IOException {
        if (gVar == null || (gVar instanceof h)) {
            bVar.x();
            return;
        }
        boolean z10 = gVar instanceof j;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + gVar);
            }
            j jVar = (j) gVar;
            Serializable serializable = jVar.f28986b;
            if (serializable instanceof Number) {
                bVar.f0(jVar.s());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.m0(jVar.k());
                return;
            } else {
                bVar.j0(jVar.e());
                return;
            }
        }
        boolean z11 = gVar instanceof e;
        if (z11) {
            bVar.c();
            if (!z11) {
                throw new IllegalStateException("Not a JSON Array: " + gVar);
            }
            Iterator<g> it = ((e) gVar).f28824b.iterator();
            while (it.hasNext()) {
                b(bVar, it.next());
            }
            bVar.j();
            return;
        }
        if (!(gVar instanceof i)) {
            throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
        }
        bVar.h();
        Iterator it2 = ((LinkedTreeMap.b) gVar.d().f28826b.entrySet()).iterator();
        while (((LinkedTreeMap.d) it2).hasNext()) {
            Map.Entry entryA = ((LinkedTreeMap.b.a) it2).a();
            bVar.p((String) entryA.getKey());
            b(bVar, (g) entryA.getValue());
        }
        bVar.k();
    }

    @Override // com.google.gson.TypeAdapter
    public final g read(M7.a aVar) throws IOException {
        g eVar;
        g eVar2;
        g gVar;
        g gVar2;
        if (aVar instanceof a) {
            a aVar2 = (a) aVar;
            JsonToken jsonTokenY0 = aVar2.y0();
            if (jsonTokenY0 != JsonToken.f28991f && jsonTokenY0 != JsonToken.f28988c && jsonTokenY0 != JsonToken.f28990e && jsonTokenY0 != JsonToken.f28995k) {
                g gVar3 = (g) aVar2.g1();
                aVar2.Z0();
                return gVar3;
            }
            throw new IllegalStateException("Unexpected " + jsonTokenY0 + " when reading a JsonElement.");
        }
        JsonToken jsonTokenY1 = aVar.y0();
        int iOrdinal = jsonTokenY1.ordinal();
        if (iOrdinal == 0) {
            aVar.b();
            eVar = new e();
        } else if (iOrdinal != 2) {
            eVar = null;
        } else {
            aVar.c();
            eVar = new i();
        }
        if (eVar == null) {
            return a(aVar, jsonTokenY1);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.C()) {
                String strJ0 = eVar instanceof i ? aVar.j0() : null;
                JsonToken jsonTokenY2 = aVar.y0();
                int iOrdinal2 = jsonTokenY2.ordinal();
                if (iOrdinal2 == 0) {
                    aVar.b();
                    eVar2 = new e();
                } else if (iOrdinal2 != 2) {
                    eVar2 = null;
                } else {
                    aVar.c();
                    eVar2 = new i();
                }
                boolean z10 = eVar2 != null;
                if (eVar2 == null) {
                    eVar2 = a(aVar, jsonTokenY2);
                }
                if (eVar instanceof e) {
                    e eVar3 = (e) eVar;
                    if (eVar2 == null) {
                        eVar3.getClass();
                        gVar2 = h.f28825b;
                    } else {
                        gVar2 = eVar2;
                    }
                    eVar3.f28824b.add(gVar2);
                } else {
                    i iVar = (i) eVar;
                    if (eVar2 == null) {
                        iVar.getClass();
                        gVar = h.f28825b;
                    } else {
                        gVar = eVar2;
                    }
                    iVar.f28826b.put(strJ0, gVar);
                }
                if (z10) {
                    arrayDeque.addLast(eVar);
                    eVar = eVar2;
                }
            } else {
                if (eVar instanceof e) {
                    aVar.j();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return eVar;
                }
                eVar = (g) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(M7.b bVar, g gVar) throws IOException {
        b(bVar, gVar);
    }
}
