package com.google.gson.internal;

import X8.m;
import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.colorspace.n;
import androidx.media3.exoplayer.E;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.d<?>> f28965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f28966b;

    public c(List list, Map map) {
        this.f28965a = map;
        this.f28966b = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    public final <T> f<T> b(L7.a<T> aVar, boolean z10) {
        f<T> bVar;
        f<T> dVar;
        String str;
        int i10 = 2;
        int i11 = 4;
        int i12 = 5;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        Map<Type, com.google.gson.d<?>> map = this.f28965a;
        com.google.gson.d<?> dVar2 = map.get(type);
        if (dVar2 != null) {
            return new m(dVar2, type);
        }
        com.google.gson.d<?> dVar3 = map.get(rawType);
        if (dVar3 != null) {
            return new n(dVar3, type);
        }
        f<T> cVar = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            bVar = new X8.n(type);
        } else {
            bVar = rawType == EnumMap.class ? new A4.b(type) : null;
        }
        if (bVar != null) {
            return bVar;
        }
        ReflectionAccessFilter.FilterResult filterResultA = g.a(rawType, this.f28966b);
        boolean zIsAbstract = Modifier.isAbstract(rawType.getModifiers());
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilter.FilterResult.f28807b;
        if (zIsAbstract) {
            dVar = null;
        } else {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(null);
                if (filterResultA != filterResult && (!g.a.f28968a.a(null, declaredConstructor) || (filterResultA == ReflectionAccessFilter.FilterResult.f28810e && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    dVar = new Z3.l("Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                } else if (filterResultA == filterResult) {
                    K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e10) {
                        str = "Failed making constructor '" + K7.a.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + K7.a.e(e10);
                    }
                    if (str != null) {
                        dVar = new S6.k(3, str);
                    } else {
                        dVar = new Y1.d(i11, declaredConstructor);
                    }
                } else {
                    dVar = new Y1.d(i11, declaredConstructor);
                }
            } catch (NoSuchMethodException unused) {
                dVar = null;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(ArrayList.class)) {
                cVar = new androidx.compose.animation.k(i10);
            } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                cVar = new b();
            } else if (rawType.isAssignableFrom(TreeSet.class)) {
                cVar = new C0936h(5);
            } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                cVar = new J4.n(5);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (rawType.isAssignableFrom(LinkedTreeMap.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || GsonTypes.f(actualTypeArguments[0]) != String.class) {
                        if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                            cVar = new B6.a();
                        } else if (rawType.isAssignableFrom(TreeMap.class)) {
                            cVar = new A8.f(7);
                        } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                            cVar = new B6.b(i11);
                        } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            cVar = new B6.c(6);
                        }
                    }
                }
                cVar = new androidx.compose.ui.graphics.colorspace.e();
            } else if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                cVar = new B6.a();
            } else if (rawType.isAssignableFrom(TreeMap.class)) {
                cVar = new A8.f(7);
            } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                cVar = new B6.b(i11);
            } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                cVar = new B6.c(6);
            }
        }
        if (cVar != null) {
            return cVar;
        }
        String strA = a(rawType);
        if (strA != null) {
            return new E(i10, strA);
        }
        if (!z10) {
            return new a("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.");
        }
        if (filterResultA == filterResult) {
            return new F1.a(i12, rawType);
        }
        return new D7.i("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final String toString() {
        return this.f28965a.toString();
    }
}
