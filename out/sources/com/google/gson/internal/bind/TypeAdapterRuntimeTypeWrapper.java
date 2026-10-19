package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f28908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f28909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f28910c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f28908a = gson;
        this.f28909b = typeAdapter;
        this.f28910c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(M7.a aVar) throws IOException {
        return this.f28909b.read(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // com.google.gson.TypeAdapter
    public final void write(M7.b bVar, T t8) throws IOException {
        TypeAdapter<T> typeAdapterA;
        Type type = this.f28910c;
        Type type2 = (t8 == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : t8.getClass();
        TypeAdapter<T> typeAdapter = this.f28909b;
        if (type2 != type) {
            TypeAdapter<T> typeAdapterE = this.f28908a.e(L7.a.get(type2));
            if (typeAdapterE instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = typeAdapter;
                while ((typeAdapter2 instanceof SerializationDelegatingTypeAdapter) && (typeAdapterA = ((SerializationDelegatingTypeAdapter) typeAdapter2).a()) != typeAdapter2) {
                    typeAdapter2 = typeAdapterA;
                }
                if (typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                    typeAdapter = typeAdapterE;
                }
            } else {
                typeAdapter = typeAdapterE;
            }
        }
        typeAdapter.write(bVar, t8);
    }
}
