package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28880c = new AnonymousClass1(ToNumberPolicy.f28816b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f28881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ToNumberPolicy f28882b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ToNumberPolicy f28883b;

        public AnonymousClass1(ToNumberPolicy toNumberPolicy) {
            this.f28883b = toNumberPolicy;
        }

        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.f28883b);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberPolicy toNumberPolicy) {
        this.f28881a = gson;
        this.f28882b = toNumberPolicy;
    }

    public static m a(ToNumberPolicy toNumberPolicy) {
        return toNumberPolicy == ToNumberPolicy.f28816b ? f28880c : new AnonymousClass1(toNumberPolicy);
    }

    public final Serializable b(M7.a aVar, JsonToken jsonToken) throws IOException {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return aVar.r0();
        }
        if (iOrdinal == 6) {
            return this.f28882b.a(aVar);
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(aVar.R());
        }
        if (iOrdinal == 8) {
            aVar.n0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(M7.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        JsonToken jsonTokenY0 = aVar.y0();
        int iOrdinal = jsonTokenY0.ordinal();
        if (iOrdinal == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new LinkedTreeMap();
        }
        if (arrayList == null) {
            return b(aVar, jsonTokenY0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.C()) {
                String strJ0 = arrayList instanceof Map ? aVar.j0() : null;
                JsonToken jsonTokenY1 = aVar.y0();
                int iOrdinal2 = jsonTokenY1.ordinal();
                if (iOrdinal2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new LinkedTreeMap();
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = b(aVar, jsonTokenY1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strJ0, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.j();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.x();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.f28881a;
        gson.getClass();
        TypeAdapter typeAdapterE = gson.e(L7.a.get((Class) cls));
        if (!(typeAdapterE instanceof ObjectTypeAdapter)) {
            typeAdapterE.write(bVar, obj);
        } else {
            bVar.h();
            bVar.k();
        }
    }
}
