package com.google.gson.internal.bind;

import O.e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.f;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.c f28856b;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter<E> f28857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<? extends Collection<E>> f28858b;

        public Adapter(TypeAdapter<E> typeAdapter, f<? extends Collection<E>> fVar) {
            this.f28857a = typeAdapter;
            this.f28858b = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(M7.a aVar) throws IOException {
            if (aVar.y0() == JsonToken.j) {
                aVar.n0();
                return null;
            }
            Collection<E> collectionI = this.f28858b.i();
            aVar.b();
            while (aVar.C()) {
                collectionI.add(((TypeAdapterRuntimeTypeWrapper) this.f28857a).f28909b.read(aVar));
            }
            aVar.j();
            return collectionI;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.x();
                return;
            }
            bVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f28857a.write(bVar, it.next());
            }
            bVar.j();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f28856b = cVar;
    }

    @Override // com.google.gson.m
    public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        e.i(Collection.class.isAssignableFrom(rawType));
        Type typeH = GsonTypes.h(type, rawType, GsonTypes.e(type, rawType, Collection.class), new HashMap());
        Type type2 = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, gson.e(L7.a.get(type2)), type2), this.f28856b.b(aVar, false));
    }
}
