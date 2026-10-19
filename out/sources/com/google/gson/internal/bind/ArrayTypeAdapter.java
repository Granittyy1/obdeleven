package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.GsonTypes;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28853c = new m() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            Type type = aVar.getType();
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.e(L7.a.get(genericComponentType)), GsonTypes.f(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<E> f28854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<E> f28855b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f28855b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f28854a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final Object read(M7.a aVar) throws IOException {
        if (aVar.y0() == JsonToken.j) {
            aVar.n0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.C()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f28855b).f28909b.read(aVar));
        }
        aVar.j();
        int size = arrayList.size();
        Class<E> cls = this.f28854a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.x();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f28855b.write(bVar, (E) Array.get(obj, i10));
        }
        bVar.j();
    }
}
