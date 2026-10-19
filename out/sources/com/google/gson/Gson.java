package com.google.gson;

import D9.o;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Gson {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f28790l = c.f28820d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final FieldNamingPolicy f28791m = FieldNamingPolicy.f28788b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ToNumberPolicy f28792n = ToNumberPolicy.f28816b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ToNumberPolicy f28793o = ToNumberPolicy.f28817c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<L7.a<?>, TypeAdapter<?>>> f28794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f28795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.c f28796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f28797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<m> f28798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Type, d<?>> f28799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f28801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<m> f28802i;
    public final List<m> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f28803k;

    /* JADX INFO: renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(M7.a aVar) throws IOException {
            if (aVar.y0() != JsonToken.j) {
                return Double.valueOf(aVar.S());
            }
            aVar.n0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                bVar.x();
                return;
            }
            double dDoubleValue = number2.doubleValue();
            Gson.a(dDoubleValue);
            bVar.R(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(M7.a aVar) throws IOException {
            if (aVar.y0() != JsonToken.j) {
                return Float.valueOf((float) aVar.S());
            }
            aVar.n0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Number number) throws IOException {
            Number numberValueOf = number;
            if (numberValueOf == null) {
                bVar.x();
                return;
            }
            float fFloatValue = numberValueOf.floatValue();
            Gson.a(fFloatValue);
            if (!(numberValueOf instanceof Float)) {
                numberValueOf = Float.valueOf(fFloatValue);
            }
            bVar.f0(numberValueOf);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.Gson$3, reason: invalid class name */
    class AnonymousClass3 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(M7.a aVar) throws IOException {
            if (aVar.y0() != JsonToken.j) {
                return Long.valueOf(aVar.f0());
            }
            aVar.n0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                bVar.x();
            } else {
                bVar.j0(number2.toString());
            }
        }
    }

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TypeAdapter<T> f28806a = null;

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public final TypeAdapter<T> a() {
            TypeAdapter<T> typeAdapter = this.f28806a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(M7.a aVar) throws IOException {
            TypeAdapter<T> typeAdapter = this.f28806a;
            if (typeAdapter != null) {
                return typeAdapter.read(aVar);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, T t8) throws IOException {
            TypeAdapter<T> typeAdapter = this.f28806a;
            if (typeAdapter == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            typeAdapter.write(bVar, t8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.f28827d;
        Map mapEmptyMap = Collections.emptyMap();
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        this(excluder, f28791m, mapEmptyMap, f28790l, listEmptyList, listEmptyList2, listEmptyList3, f28792n, f28793o, listEmptyList4);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(M7.a aVar, L7.a<T> aVar2) throws JsonSyntaxException, JsonIOException {
        boolean z10;
        Strictness strictness = aVar.f4589c;
        if (strictness == Strictness.f28813c) {
            aVar.f4589c = Strictness.f28812b;
        }
        try {
            try {
                try {
                    try {
                        aVar.y0();
                        z10 = false;
                        try {
                            TypeAdapter<T> typeAdapterE = e(aVar2);
                            T t8 = typeAdapterE.read(aVar);
                            Class clsW = o.w(aVar2.getRawType());
                            if (t8 != null && !clsW.isInstance(t8)) {
                                throw new ClassCastException("Type adapter '" + typeAdapterE + "' returned wrong type; requested " + aVar2.getRawType() + " but got instance of " + t8.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            Objects.requireNonNull(strictness);
                            aVar.f4589c = strictness;
                            return t8;
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new JsonSyntaxException(e);
                            }
                            Objects.requireNonNull(strictness);
                            aVar.f4589c = strictness;
                            return null;
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        } catch (Throwable th) {
            Objects.requireNonNull(strictness);
            aVar.f4589c = strictness;
            throw th;
        }
    }

    public final <T> T c(Reader reader, L7.a<T> aVar) throws JsonSyntaxException, JsonIOException {
        M7.a aVar2 = new M7.a(reader);
        aVar2.f4589c = Strictness.f28813c;
        T t8 = (T) b(aVar2, aVar);
        if (t8 != null) {
            try {
                if (aVar2.y0() != JsonToken.f28995k) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
        return t8;
    }

    public final Object d(Class cls, String str) throws JsonSyntaxException {
        L7.a aVar = L7.a.get(cls);
        if (str == null) {
            return null;
        }
        return c(new StringReader(str), aVar);
    }

    public final <T> TypeAdapter<T> e(L7.a<T> aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f28795b;
        TypeAdapter<T> typeAdapter = (TypeAdapter) concurrentHashMap.get(aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal<Map<L7.a<?>, TypeAdapter<?>>> threadLocal = this.f28794a;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set((Map<L7.a<?>, TypeAdapter<?>>) map);
            z10 = true;
        } else {
            TypeAdapter<T> typeAdapter2 = (TypeAdapter) map.get(aVar);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z10 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter);
            Iterator<m> it = this.f28798e.iterator();
            TypeAdapter<T> typeAdapterCreate = null;
            while (it.hasNext()) {
                typeAdapterCreate = it.next().create(this, aVar);
                if (typeAdapterCreate != null) {
                    if (futureTypeAdapter.f28806a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    futureTypeAdapter.f28806a = typeAdapterCreate;
                    map.put(aVar, typeAdapterCreate);
                    break;
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (typeAdapterCreate != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return typeAdapterCreate;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    public final <T> TypeAdapter<T> f(m mVar, L7.a<T> aVar) {
        Objects.requireNonNull(mVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.f28797d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        if (mVar == JsonAdapterAnnotationTypeAdapterFactory.f28867d) {
            mVar = jsonAdapterAnnotationTypeAdapterFactory;
        } else {
            Class<? super T> rawType = aVar.getRawType();
            ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.f28870c;
            m mVar2 = (m) concurrentHashMap.get(rawType);
            if (mVar2 == null) {
                I7.a aVar2 = (I7.a) rawType.getAnnotation(I7.a.class);
                if (aVar2 != null) {
                    Class<?> clsValue = aVar2.value();
                    if (m.class.isAssignableFrom(clsValue)) {
                        m mVar3 = (m) jsonAdapterAnnotationTypeAdapterFactory.f28869b.b(L7.a.get((Class) clsValue), true).i();
                        m mVar4 = (m) concurrentHashMap.putIfAbsent(rawType, mVar3);
                        if (mVar4 != null) {
                            mVar3 = mVar4;
                        }
                        if (mVar3 == mVar) {
                            mVar = jsonAdapterAnnotationTypeAdapterFactory;
                        }
                    }
                }
            } else if (mVar2 == mVar) {
                mVar = jsonAdapterAnnotationTypeAdapterFactory;
            }
        }
        boolean z10 = false;
        for (m mVar5 : this.f28798e) {
            if (z10) {
                TypeAdapter<T> typeAdapterCreate = mVar5.create(this, aVar);
                if (typeAdapterCreate != null) {
                    return typeAdapterCreate;
                }
            } else if (mVar5 == mVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return e(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public final M7.b g(Writer writer) throws IOException {
        M7.b bVar = new M7.b(writer);
        bVar.C(this.f28801h);
        bVar.j = this.f28800g;
        bVar.M(Strictness.f28813c);
        bVar.f4614l = false;
        return bVar;
    }

    public final String h(Object obj) {
        if (obj == null) {
            h hVar = h.f28825b;
            StringWriter stringWriter = new StringWriter();
            try {
                i(hVar, g(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            j(obj, cls, g(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public final void i(h hVar, M7.b bVar) throws JsonIOException {
        Strictness strictness = bVar.f4612i;
        boolean z10 = bVar.j;
        boolean z11 = bVar.f4614l;
        bVar.j = this.f28800g;
        bVar.f4614l = false;
        if (strictness == Strictness.f28813c) {
            bVar.f4612i = Strictness.f28812b;
        }
        try {
            try {
                try {
                    TypeAdapters.f28937z.write(bVar, hVar);
                    bVar.M(strictness);
                    bVar.j = z10;
                    bVar.f4614l = z11;
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            bVar.M(strictness);
            bVar.j = z10;
            bVar.f4614l = z11;
            throw th;
        }
    }

    public final void j(Object obj, Class cls, M7.b bVar) throws JsonIOException {
        TypeAdapter typeAdapterE = e(L7.a.get((Type) cls));
        Strictness strictness = bVar.f4612i;
        if (strictness == Strictness.f28813c) {
            bVar.f4612i = Strictness.f28812b;
        }
        boolean z10 = bVar.j;
        boolean z11 = bVar.f4614l;
        bVar.j = this.f28800g;
        bVar.f4614l = false;
        try {
            try {
                typeAdapterE.write(bVar, obj);
                bVar.M(strictness);
                bVar.j = z10;
                bVar.f4614l = z11;
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            bVar.M(strictness);
            bVar.j = z10;
            bVar.f4614l = z11;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f28798e + ",instanceCreators:" + this.f28796c + "}";
    }

    public Gson(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, c cVar, List list, List list2, List list3, ToNumberPolicy toNumberPolicy, ToNumberPolicy toNumberPolicy2, List list4) {
        m mVarA;
        this.f28794a = new ThreadLocal<>();
        this.f28795b = new ConcurrentHashMap();
        this.f28799f = map;
        com.google.gson.internal.c cVar2 = new com.google.gson.internal.c(list4, map);
        this.f28796c = cVar2;
        this.f28800g = true;
        this.f28801h = cVar;
        this.f28802i = list;
        this.j = list2;
        this.f28803k = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f28911A);
        arrayList.add(ObjectTypeAdapter.a(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f28927p);
        arrayList.add(TypeAdapters.f28919g);
        arrayList.add(TypeAdapters.f28916d);
        arrayList.add(TypeAdapters.f28917e);
        arrayList.add(TypeAdapters.f28918f);
        final TypeAdapter<Number> typeAdapter = TypeAdapters.f28922k;
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new AnonymousClass2()));
        if (toNumberPolicy2 == ToNumberPolicy.f28817c) {
            mVarA = NumberTypeAdapter.f28877b;
        } else {
            mVarA = NumberTypeAdapter.a(toNumberPolicy2);
        }
        arrayList.add(mVarA);
        arrayList.add(TypeAdapters.f28920h);
        arrayList.add(TypeAdapters.f28921i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final AtomicLong read(M7.a aVar) throws IOException {
                return new AtomicLong(((Number) typeAdapter.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, AtomicLong atomicLong) throws IOException {
                typeAdapter.write(bVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final AtomicLongArray read(M7.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.b();
                while (aVar.C()) {
                    arrayList2.add(Long.valueOf(((Number) typeAdapter.read(aVar)).longValue()));
                }
                aVar.j();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList2.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                bVar.c();
                int length = atomicLongArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    typeAdapter.write(bVar, Long.valueOf(atomicLongArray2.get(i10)));
                }
                bVar.j();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.j);
        arrayList.add(TypeAdapters.f28923l);
        arrayList.add(TypeAdapters.f28928q);
        arrayList.add(TypeAdapters.f28929r);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f28924m));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f28925n));
        arrayList.add(TypeAdapters.a(LazilyParsedNumber.class, TypeAdapters.f28926o));
        arrayList.add(TypeAdapters.f28930s);
        arrayList.add(TypeAdapters.f28931t);
        arrayList.add(TypeAdapters.f28933v);
        arrayList.add(TypeAdapters.f28934w);
        arrayList.add(TypeAdapters.f28936y);
        arrayList.add(TypeAdapters.f28932u);
        arrayList.add(TypeAdapters.f28914b);
        arrayList.add(DefaultDateTypeAdapter.f28859c);
        arrayList.add(TypeAdapters.f28935x);
        if (com.google.gson.internal.sql.a.f28982a) {
            arrayList.add(com.google.gson.internal.sql.a.f28984c);
            arrayList.add(com.google.gson.internal.sql.a.f28983b);
            arrayList.add(com.google.gson.internal.sql.a.f28985d);
        }
        arrayList.add(ArrayTypeAdapter.f28853c);
        arrayList.add(TypeAdapters.f28913a);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f28797d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f28912B);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f28798e = Collections.unmodifiableList(arrayList);
    }
}
