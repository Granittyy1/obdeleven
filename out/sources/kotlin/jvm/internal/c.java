package kotlin.jvm.internal;

import Ia.p;
import Ia.q;
import Ia.r;
import Ia.s;
import Ia.t;
import Ia.u;
import Ia.v;
import Ia.w;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.collections.y;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Oa.c<Object>, b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Class<? extends p293xa.e<?>>, Integer> f43056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, String> f43057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f43058e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f43059b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listS = kotlin.collections.l.s(Ia.a.class, Ia.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, Ia.b.class, Ia.c.class, Ia.d.class, Ia.e.class, Ia.f.class, Ia.g.class, Ia.h.class, Ia.i.class, Ia.j.class, Ia.k.class, Ia.m.class, Ia.n.class, Ia.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listS, 10));
        int i10 = 0;
        for (Object obj : listS) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f43056c = y.w(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(AttributeType.FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb2.append(kotlin.text.n.l0('.', str, str));
            sb2.append("CompanionObject");
            Pair pair = new Pair(sb2.toString(), str.concat(".Companion"));
            map3.put(pair.c(), pair.d());
        }
        for (Map.Entry<Class<? extends p293xa.e<?>>, Integer> entry : f43056c.entrySet()) {
            Class<? extends p293xa.e<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        f43057d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.n(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key2, kotlin.text.n.l0('.', str2, str2));
        }
        f43058e = linkedHashMap;
    }

    public c(Class<?> jClass) {
        i.e(jClass, "jClass");
        this.f43059b = jClass;
    }

    @Override // Oa.c
    public final String a() {
        String str;
        Class<?> jClass = this.f43059b;
        i.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f43058e;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return kotlin.text.n.k0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return kotlin.text.n.j0('$', simpleName, simpleName);
        }
        return kotlin.text.n.k0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && p241t7.b.s(this).equals(p241t7.b.s((Oa.c) obj));
    }

    @Override // Oa.c
    public final boolean f(Object obj) {
        Class<?> jClass = this.f43059b;
        i.e(jClass, "jClass");
        Map<Class<? extends p293xa.e<?>>, Integer> map = f43056c;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return o.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = p241t7.b.s(l.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> h() {
        return this.f43059b;
    }

    public final int hashCode() {
        return p241t7.b.s(this).hashCode();
    }

    public final String i() {
        String str;
        Class<?> jClass = this.f43059b;
        i.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap<String, String> map = f43057d;
        if (!zIsArray) {
            String str2 = map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String toString() {
        return this.f43059b.toString() + " (Kotlin reflection is not available)";
    }
}
