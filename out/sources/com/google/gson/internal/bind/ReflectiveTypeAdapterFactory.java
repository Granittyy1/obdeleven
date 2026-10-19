package com.google.gson.internal.bind;

import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.text.font.s;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.f;
import com.google.gson.internal.g;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.c f28884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FieldNamingPolicy f28885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Excluder f28886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f28887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f28888f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    public class AnonymousClass1<T> extends TypeAdapter<T> {
        @Override // com.google.gson.TypeAdapter
        public final T read(M7.a aVar) throws IOException {
            aVar.Z0();
            return null;
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, T t8) throws IOException {
            bVar.x();
        }
    }

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f28889a;

        public Adapter(b bVar) {
            this.f28889a = bVar;
        }

        public abstract A a();

        public abstract T b(A a10);

        public abstract void c(A a10, M7.a aVar, a aVar2) throws IllegalAccessException, IOException;

        @Override // com.google.gson.TypeAdapter
        public final T read(M7.a aVar) throws IOException {
            if (aVar.y0() == JsonToken.j) {
                aVar.n0();
                return null;
            }
            A a10 = a();
            Map<String, a> map = this.f28889a.f28899a;
            try {
                aVar.c();
                while (aVar.C()) {
                    a aVar2 = map.get(aVar.j0());
                    if (aVar2 == null) {
                        aVar.Z0();
                    } else {
                        c(a10, aVar, aVar2);
                    }
                }
                aVar.k();
                return b(a10);
            } catch (IllegalAccessException e10) {
                K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, T t8) throws IOException {
            if (t8 == null) {
                bVar.x();
                return;
            }
            bVar.h();
            try {
                Iterator<a> it = this.f28889a.f28900b.iterator();
                while (it.hasNext()) {
                    it.next().c(bVar, t8);
                }
                bVar.k();
            } catch (IllegalAccessException e10) {
                K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HashMap f28891e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor<T> f28892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f28893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f28894d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f28891e = map;
        }

        public RecordAdapter(Class<T> cls, b bVar, boolean z10) {
            super(bVar);
            this.f28894d = new HashMap();
            K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
            Constructor<T> constructorB = abstractC0062a.b(cls);
            this.f28892b = constructorB;
            if (z10) {
                ReflectiveTypeAdapterFactory.a(null, constructorB);
            } else {
                K7.a.f(constructorB);
            }
            String[] strArrC = abstractC0062a.c(cls);
            for (int i10 = 0; i10 < strArrC.length; i10++) {
                this.f28894d.put(strArrC[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f28892b.getParameterTypes();
            this.f28893c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f28893c[i11] = f28891e.get(parameterTypes[i11]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object[] a() {
            return (Object[]) this.f28893c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object b(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.f28892b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e10) {
                K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + K7.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + K7.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + K7.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e13.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(Object[] objArr, M7.a aVar, a aVar2) throws IllegalAccessException, IOException {
            Object[] objArr2 = objArr;
            HashMap map = this.f28894d;
            String str = aVar2.f28897c;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                aVar2.a(aVar, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + K7.a.b(this.f28892b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f28896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28897c;

        public a(String str, Field field) {
            this.f28895a = str;
            this.f28896b = field;
            this.f28897c = field.getName();
        }

        public abstract void a(M7.a aVar, int i10, Object[] objArr) throws JsonParseException, IOException;

        public abstract void b(M7.a aVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void c(M7.b bVar, Object obj) throws IllegalAccessException, IOException;
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f28898c = new b(Collections.emptyList(), Collections.emptyMap());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, a> f28899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<a> f28900b;

        public b(List list, Map map) {
            this.f28899a = map;
            this.f28900b = list;
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c cVar, FieldNamingPolicy fieldNamingPolicy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f28884b = cVar;
        this.f28885c = fieldNamingPolicy;
        this.f28886d = excluder;
        this.f28887e = jsonAdapterAnnotationTypeAdapterFactory;
        this.f28888f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!g.a.f28968a.a(obj, accessibleObject)) {
            throw new JsonIOException(s.b(K7.a.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + K7.a.c(field) + " and " + K7.a.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[LOOP:2: B:89:0x01c5->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e6  */
    public final b c(Gson gson, L7.a<?> aVar, Class<?> cls, boolean z10, boolean z11) {
        boolean z12;
        Method method;
        I7.b bVar;
        List listAsList;
        String strA;
        List<String> listSingletonList;
        String str;
        L7.a<?> aVar2;
        Class<? super Object> rawType;
        boolean z13;
        int modifiers;
        boolean z14;
        I7.a aVar3;
        L7.a<?> aVar4;
        String str2;
        boolean z15;
        TypeAdapter<?> typeAdapterE;
        boolean z16;
        L7.a<?> aVar5;
        TypeAdapter<?> typeAdapter;
        c cVar;
        String str3;
        a aVar6;
        a aVar7;
        TypeAdapter<?> typeAdapterRuntimeTypeWrapper;
        if (cls.isInterface()) {
            return b.f28898c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        L7.a<?> aVar8 = aVar;
        boolean z17 = z10;
        Class<?> rawType2 = cls;
        while (rawType2 != Object.class) {
            Field[] declaredFields = rawType2.getDeclaredFields();
            boolean z18 = false;
            if (rawType2 != cls && declaredFields.length > 0) {
                ReflectionAccessFilter.FilterResult filterResultA = g.a(rawType2, this.f28888f);
                if (filterResultA == ReflectionAccessFilter.FilterResult.f28810e) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z17 = filterResultA == ReflectionAccessFilter.FilterResult.f28809d;
            }
            boolean z19 = z17;
            int length = declaredFields.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zD = d(field, true);
                boolean zD2 = d(field, z18);
                if (zD || zD2) {
                    if (z11) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            z12 = z18;
                        } else {
                            Method methodA = K7.a.f4367a.a(rawType2, field);
                            if (!z19) {
                                K7.a.f(methodA);
                            }
                            if (methodA.getAnnotation(I7.b.class) != null && field.getAnnotation(I7.b.class) == null) {
                                throw new JsonIOException(d.b("@SerializedName on ", K7.a.d(methodA, z18), " is not supported"));
                            }
                            z12 = zD2;
                            method = methodA;
                        }
                        if (!z19 && method == null) {
                            K7.a.f(field);
                        }
                        Type typeH = GsonTypes.h(aVar8.getType(), rawType2, field.getGenericType(), new HashMap());
                        bVar = (I7.b) field.getAnnotation(I7.b.class);
                        if (bVar == null) {
                            strA = this.f28885c.a(field);
                            listAsList = Collections.emptyList();
                        } else {
                            String strValue = bVar.value();
                            listAsList = Arrays.asList(bVar.alternate());
                            strA = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            listSingletonList = Collections.singletonList(strA);
                        } else {
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(strA);
                            arrayList.addAll(listAsList);
                            listSingletonList = arrayList;
                        }
                        str = (String) listSingletonList.get(0);
                        aVar2 = L7.a.get(typeH);
                        rawType = aVar2.getRawType();
                        if (rawType == null && rawType.isPrimitive()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        aVar3 = (I7.a) field.getAnnotation(I7.a.class);
                        if (aVar3 != null) {
                            aVar4 = aVar2;
                            str2 = str;
                            z15 = false;
                            typeAdapterE = this.f28887e.a(this.f28884b, gson, aVar4, aVar3, false);
                        } else {
                            aVar4 = aVar2;
                            str2 = str;
                            z15 = false;
                            typeAdapterE = null;
                        }
                        if (typeAdapterE != null) {
                            z16 = true;
                        } else {
                            z16 = z15;
                        }
                        aVar5 = aVar4;
                        if (typeAdapterE == null) {
                            typeAdapterE = gson.e(aVar5);
                        }
                        if (zD) {
                            if (z16) {
                                typeAdapterRuntimeTypeWrapper = typeAdapterE;
                            } else {
                                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapterE, aVar5.getType());
                            }
                            typeAdapter = typeAdapterRuntimeTypeWrapper;
                        } else {
                            typeAdapter = typeAdapterE;
                        }
                        cVar = new c(str2, field, z19, method, typeAdapter, typeAdapterE, z13, z14);
                        if (z12) {
                            for (String str4 : listSingletonList) {
                                aVar7 = (a) linkedHashMap.put(str4, cVar);
                                if (aVar7 == null) {
                                    b(cls, str4, aVar7.f28896b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zD) {
                            str3 = str2;
                            aVar6 = (a) linkedHashMap2.put(str3, cVar);
                            if (aVar6 == null) {
                                b(cls, str3, aVar6.f28896b, field);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        z12 = zD2;
                    }
                    method = null;
                    if (!z19) {
                        K7.a.f(field);
                    }
                    Type typeH2 = GsonTypes.h(aVar8.getType(), rawType2, field.getGenericType(), new HashMap());
                    bVar = (I7.b) field.getAnnotation(I7.b.class);
                    if (bVar == null) {
                        strA = this.f28885c.a(field);
                        listAsList = Collections.emptyList();
                    } else {
                        String strValue2 = bVar.value();
                        listAsList = Arrays.asList(bVar.alternate());
                        strA = strValue2;
                    }
                    if (listAsList.isEmpty()) {
                        listSingletonList = Collections.singletonList(strA);
                    } else {
                        ArrayList arrayList2 = new ArrayList(listAsList.size() + 1);
                        arrayList2.add(strA);
                        arrayList2.addAll(listAsList);
                        listSingletonList = arrayList2;
                    }
                    str = (String) listSingletonList.get(0);
                    aVar2 = L7.a.get(typeH2);
                    rawType = aVar2.getRawType();
                    if (rawType == null) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    aVar3 = (I7.a) field.getAnnotation(I7.a.class);
                    if (aVar3 != null) {
                        aVar4 = aVar2;
                        str2 = str;
                        z15 = false;
                        typeAdapterE = this.f28887e.a(this.f28884b, gson, aVar4, aVar3, false);
                    } else {
                        aVar4 = aVar2;
                        str2 = str;
                        z15 = false;
                        typeAdapterE = null;
                    }
                    if (typeAdapterE != null) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    aVar5 = aVar4;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(aVar5);
                    }
                    if (zD) {
                        if (z16) {
                            typeAdapterRuntimeTypeWrapper = typeAdapterE;
                        } else {
                            typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapterE, aVar5.getType());
                        }
                        typeAdapter = typeAdapterRuntimeTypeWrapper;
                    } else {
                        typeAdapter = typeAdapterE;
                    }
                    cVar = new c(str2, field, z19, method, typeAdapter, typeAdapterE, z13, z14);
                    if (z12) {
                        while (r1.hasNext()) {
                            aVar7 = (a) linkedHashMap.put(str4, cVar);
                            if (aVar7 == null) {
                                b(cls, str4, aVar7.f28896b, field);
                                throw null;
                            }
                        }
                    }
                    if (zD) {
                        str3 = str2;
                        aVar6 = (a) linkedHashMap2.put(str3, cVar);
                        if (aVar6 == null) {
                            b(cls, str3, aVar6.f28896b, field);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i10 = i10;
                    length = length;
                    z15 = z18;
                }
                i10++;
                z18 = z15;
                length = length;
            }
            aVar8 = L7.a.get(GsonTypes.h(aVar8.getType(), rawType2, rawType2.getGenericSuperclass(), new HashMap()));
            rawType2 = aVar8.getRawType();
            z17 = z19;
        }
        return new b(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }

    @Override // com.google.gson.m
    public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new AnonymousClass1();
        }
        ReflectionAccessFilter.FilterResult filterResultA = g.a(rawType, this.f28888f);
        if (filterResultA != ReflectionAccessFilter.FilterResult.f28810e) {
            boolean z10 = filterResultA == ReflectionAccessFilter.FilterResult.f28809d;
            return K7.a.f4367a.d(rawType) ? new RecordAdapter(rawType, c(gson, aVar, rawType, z10, true), z10) : new FieldReflectionAdapter(this.f28884b.b(aVar, true), c(gson, aVar, rawType, z10, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final boolean d(Field field, boolean z10) {
        boolean z11;
        Excluder excluder = this.f28886d;
        excluder.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || excluder.a(field.getType(), z10)) {
            z11 = true;
        } else {
            List<com.google.gson.a> list = z10 ? excluder.f28828b : excluder.f28829c;
            if (!list.isEmpty()) {
                Iterator<com.google.gson.a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b()) {
                            z11 = true;
                        }
                    }
                }
            }
            z11 = false;
        }
        return !z11;
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<T> f28890b;

        public FieldReflectionAdapter(f<T> fVar, b bVar) {
            super(bVar);
            this.f28890b = fVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final T a() {
            return this.f28890b.i();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(T t8, M7.a aVar, a aVar2) throws IllegalAccessException, IOException {
            aVar2.b(aVar, t8);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final T b(T t8) {
            return t8;
        }
    }
}
