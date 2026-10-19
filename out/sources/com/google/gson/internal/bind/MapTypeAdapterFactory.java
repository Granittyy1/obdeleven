package com.google.gson.internal.bind;

import C.g;
import O.e;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.c f28872b;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter<K> f28873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeAdapter<V> f28874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f<? extends Map<K, V>> f28875c;

        public Adapter(TypeAdapter<K> typeAdapter, TypeAdapter<V> typeAdapter2, f<? extends Map<K, V>> fVar) {
            this.f28873a = typeAdapter;
            this.f28874b = typeAdapter2;
            this.f28875c = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(M7.a aVar) throws IOException {
            JsonToken jsonTokenY0 = aVar.y0();
            if (jsonTokenY0 == JsonToken.j) {
                aVar.n0();
                return null;
            }
            Map<K, V> mapI = this.f28875c.i();
            if (jsonTokenY0 == JsonToken.f28987b) {
                aVar.b();
                while (aVar.C()) {
                    aVar.b();
                    Object obj = ((TypeAdapterRuntimeTypeWrapper) this.f28873a).f28909b.read(aVar);
                    if (mapI.put(obj, ((TypeAdapterRuntimeTypeWrapper) this.f28874b).f28909b.read(aVar)) != null) {
                        throw new JsonSyntaxException(coil.intercept.a.a(obj, "duplicate key: "));
                    }
                    aVar.j();
                }
                aVar.j();
            } else {
                aVar.c();
                while (aVar.C()) {
                    g.f2280b.getClass();
                    if (aVar instanceof a) {
                        a aVar2 = (a) aVar;
                        aVar2.c1(JsonToken.f28991f);
                        Map.Entry entry = (Map.Entry) ((Iterator) aVar2.g1()).next();
                        aVar2.i1(entry.getValue());
                        aVar2.i1(new j((String) entry.getKey()));
                    } else {
                        int i10 = aVar.f4595i;
                        if (i10 == 0) {
                            i10 = aVar.i();
                        }
                        if (i10 == 13) {
                            aVar.f4595i = 9;
                        } else if (i10 == 12) {
                            aVar.f4595i = 8;
                        } else {
                            if (i10 != 14) {
                                throw aVar.b1("a name");
                            }
                            aVar.f4595i = 10;
                        }
                    }
                    Object obj2 = ((TypeAdapterRuntimeTypeWrapper) this.f28873a).f28909b.read(aVar);
                    if (mapI.put(obj2, ((TypeAdapterRuntimeTypeWrapper) this.f28874b).f28909b.read(aVar)) != null) {
                        throw new JsonSyntaxException(coil.intercept.a.a(obj2, "duplicate key: "));
                    }
                }
                aVar.k();
            }
            return mapI;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                bVar.x();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            TypeAdapter<V> typeAdapter = this.f28874b;
            bVar.h();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.p(String.valueOf(entry.getKey()));
                typeAdapter.write(bVar, entry.getValue());
            }
            bVar.k();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f28872b = cVar;
    }

    @Override // com.google.gson.m
    public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(rawType)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            e.i(Map.class.isAssignableFrom(rawType));
            Type typeH = GsonTypes.h(type, rawType, GsonTypes.e(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f28915c : gson.e(L7.a.get(type2)), type2), new TypeAdapterRuntimeTypeWrapper(gson, gson.e(L7.a.get(type3)), type3), this.f28872b.b(aVar, false));
    }
}
