package p141l2;

import O.h;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: NavType.android.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class L<T> {
    public static final L<float[]> FloatArrayType;
    public static final L<List<Float>> FloatListType;
    public static final L<String[]> StringArrayType;
    public static final L<List<String>> StringListType;
    public static final L<String> StringType;
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final b Companion = new b();
    public static final L<Integer> IntType = new C2742l(false);
    public static final L<Integer> ReferenceType = new a(false);
    public static final L<int[]> IntArrayType = new C2740j(true);
    public static final L<List<Integer>> IntListType = new C2741k(true);
    public static final L<Long> LongType = new C2745o(false);
    public static final L<long[]> LongArrayType = new C2743m(true);
    public static final L<List<Long>> LongListType = new C2744n(true);
    public static final L<Float> FloatType = new C2738h(0, false);
    public static final L<Boolean> BoolType = new C2734d(false);
    public static final L<boolean[]> BoolArrayType = new C2732b(true);
    public static final L<List<Boolean>> BoolListType = new C2733c(true);

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class a extends L<Integer> {
        @Override // p141l2.L
        public final Integer get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            return Integer.valueOf(p248u2.b.a(bundle, key));
        }

        @Override // p141l2.L
        public final String getName() {
            return Name.REFER;
        }

        @Override // p141l2.L
        public final Integer parseValue(String value) {
            int i10;
            i.e(value, "value");
            if (m.I(value, "0x", false)) {
                String strSubstring = value.substring(2);
                i.d(strSubstring, "substring(...)");
                h.c(16);
                i10 = Integer.parseInt(strSubstring, 16);
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        @Override // p141l2.L
        public final void put(Bundle bundle, String key, Integer num) {
            int iIntValue = num.intValue();
            i.e(bundle, "bundle");
            i.e(key, "key");
            bundle.putInt(key, iIntValue);
        }
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class b {
        public static L a(String str, String str2) {
            L l10 = L.IntType;
            if (!i.a(l10.getName(), str)) {
                l10 = L.IntArrayType;
                if (!i.a(l10.getName(), str)) {
                    l10 = L.IntListType;
                    if (!i.a(l10.getName(), str)) {
                        l10 = L.LongType;
                        if (!i.a(l10.getName(), str)) {
                            l10 = L.LongArrayType;
                            if (!i.a(l10.getName(), str)) {
                                l10 = L.LongListType;
                                if (!i.a(l10.getName(), str)) {
                                    l10 = L.BoolType;
                                    if (!i.a(l10.getName(), str)) {
                                        l10 = L.BoolArrayType;
                                        if (!i.a(l10.getName(), str)) {
                                            l10 = L.BoolListType;
                                            if (!i.a(l10.getName(), str)) {
                                                l10 = L.StringType;
                                                if (!i.a(l10.getName(), str)) {
                                                    l10 = L.StringArrayType;
                                                    if (!i.a(l10.getName(), str)) {
                                                        l10 = L.StringListType;
                                                        if (!i.a(l10.getName(), str)) {
                                                            l10 = L.FloatType;
                                                            if (!i.a(l10.getName(), str)) {
                                                                l10 = L.FloatArrayType;
                                                                if (!i.a(l10.getName(), str)) {
                                                                    l10 = L.FloatListType;
                                                                    if (!i.a(l10.getName(), str)) {
                                                                        l10 = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (l10 != null) {
                return l10;
            }
            L<Integer> l11 = L.ReferenceType;
            if (i.a(l11.getName(), str)) {
                return l11;
            }
            if (str == null || str.length() == 0) {
                return L.StringType;
            }
            try {
                String strConcat = (!m.I(str, ".", false) || str2 == null) ? str : str2.concat(str);
                boolean zC = m.C(str, "[]", false);
                if (zC) {
                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                    i.d(strConcat, "substring(...)");
                }
                L lC = c(Class.forName(strConcat), zC);
                if (lC != null) {
                    return lC;
                }
                throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public static L b(Object obj) {
            L l10;
            if (obj instanceof Integer) {
                l10 = L.IntType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof int[]) {
                l10 = L.IntArrayType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Long) {
                l10 = L.LongType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof long[]) {
                l10 = L.LongArrayType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Float) {
                l10 = L.FloatType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof float[]) {
                l10 = L.FloatArrayType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Boolean) {
                l10 = L.BoolType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof boolean[]) {
                l10 = L.BoolArrayType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if ((obj instanceof String) || obj == null) {
                l10 = L.StringType;
                i.c(l10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else {
                l10 = null;
            }
            if (l10 != null) {
                return l10;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                L<String[]> l11 = L.StringArrayType;
                i.c(l11, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return l11;
            }
            i.b(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    i.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new d(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                i.b(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    i.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new f(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new e(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new c(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new g(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        public static L c(Class cls, boolean z10) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z10 ? new d(cls) : new e(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z10) {
                return new c(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z10 ? new f(cls) : new g(cls);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class c<D extends Enum<?>> extends g<D> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<D> f44264b;

        public c(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f44264b = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // l2.L.g, p141l2.L
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D parseValue(String value) {
            D d10;
            i.e(value, "value");
            Class<D> cls = this.f44264b;
            D[] enumConstants = cls.getEnumConstants();
            i.d(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (m.D(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder sbA = C7.g.a("Enum value ", value, " not found for type ");
            sbA.append(cls.getName());
            sbA.append('.');
            throw new IllegalArgumentException(sbA.toString());
        }

        @Override // l2.L.g, p141l2.L
        public final String getName() {
            return this.f44264b.getName();
        }
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class d<D extends Parcelable> extends L<D[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<D[]> f44265a;

        public d(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f44265a = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            return i.a(this.f44265a, ((d) obj).f44265a);
        }

        @Override // p141l2.L
        public final Object get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        @Override // p141l2.L
        public final String getName() {
            return this.f44265a.getName();
        }

        public final int hashCode() {
            return this.f44265a.hashCode();
        }

        @Override // p141l2.L
        public final Object parseValue(String value) {
            i.e(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p141l2.L
        public final void put(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            i.e(bundle, "bundle");
            i.e(key, "key");
            this.f44265a.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        @Override // p141l2.L
        public final boolean valueEquals(Object obj, Object obj2) {
            return Q3.d.j((Parcelable[]) obj, (Parcelable[]) obj2);
        }
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class e<D> extends L<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<D> f44266a;

        public e(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f44266a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !e.class.equals(obj.getClass())) {
                return false;
            }
            return i.a(this.f44266a, ((e) obj).f44266a);
        }

        @Override // p141l2.L
        public final D get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            return (D) bundle.get(key);
        }

        @Override // p141l2.L
        public final String getName() {
            return this.f44266a.getName();
        }

        public final int hashCode() {
            return this.f44266a.hashCode();
        }

        @Override // p141l2.L
        public final D parseValue(String value) {
            i.e(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // p141l2.L
        public final void put(Bundle bundle, String key, D d10) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            this.f44266a.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static final class f<D extends Serializable> extends L<D[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<D[]> f44267a;

        public f(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f44267a = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !f.class.equals(obj.getClass())) {
                return false;
            }
            return i.a(this.f44267a, ((f) obj).f44267a);
        }

        @Override // p141l2.L
        public final Object get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        @Override // p141l2.L
        public final String getName() {
            return this.f44267a.getName();
        }

        public final int hashCode() {
            return this.f44267a.hashCode();
        }

        @Override // p141l2.L
        public final Object parseValue(String value) {
            i.e(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // p141l2.L
        public final void put(Bundle bundle, String key, Object obj) {
            ?? r10 = (Serializable[]) obj;
            i.e(bundle, "bundle");
            i.e(key, "key");
            this.f44267a.cast(r10);
            bundle.putSerializable(key, r10);
        }

        @Override // p141l2.L
        public final boolean valueEquals(Object obj, Object obj2) {
            return Q3.d.j((Serializable[]) obj, (Serializable[]) obj2);
        }
    }

    static {
        boolean z10 = true;
        FloatArrayType = new C2736f(0, z10);
        FloatListType = new C2737g(0, z10);
        StringType = new C2738h(1, z10);
        StringArrayType = new C2736f(1, z10);
        StringListType = new C2737g(1, z10);
    }

    public L(boolean z10) {
        this.isNullableAllowed = z10;
    }

    public static L<?> fromArgType(String str, String str2) {
        b bVar = Companion;
        if (str != null && str.startsWith("java")) {
            try {
                String str3 = "j$" + str.substring(4);
                bVar.getClass();
                return b.a(str3, str2);
            } catch (RuntimeException e10) {
                if (!(e10.getCause() instanceof ClassNotFoundException)) {
                    throw e10;
                }
            }
        }
        bVar.getClass();
        return b.a(str, str2);
    }

    public static final L<Object> inferFromValue(String value) {
        Companion.getClass();
        i.e(value, "value");
        try {
            try {
                try {
                    try {
                        L<Integer> l10 = IntType;
                        l10.parseValue(value);
                        return l10;
                    } catch (IllegalArgumentException unused) {
                        L<String> l11 = StringType;
                        i.c(l11, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return l11;
                    }
                } catch (IllegalArgumentException unused2) {
                    L<Long> l12 = LongType;
                    l12.parseValue(value);
                    return l12;
                }
            } catch (IllegalArgumentException unused3) {
                L<Boolean> l13 = BoolType;
                l13.parseValue(value);
                return l13;
            }
        } catch (IllegalArgumentException unused4) {
            L<Float> l14 = FloatType;
            l14.parseValue(value);
            return l14;
        }
    }

    public static final L<Object> inferFromValueType(Object obj) {
        Companion.getClass();
        return b.b(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final T parseAndPut(Bundle bundle, String key, String value) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        i.e(value, "value");
        T value2 = parseValue(value);
        put(bundle, key, value2);
        return value2;
    }

    public abstract T parseValue(String str);

    public T parseValue(String value, T t8) {
        i.e(value, "value");
        return parseValue(value);
    }

    public abstract void put(Bundle bundle, String str, T t8);

    public String serializeAsValue(T t8) {
        return String.valueOf(t8);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t8, T t10) {
        return i.a(t8, t10);
    }

    public final T parseAndPut(Bundle bundle, String key, String str, T t8) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str == null) {
            return t8;
        }
        T value = parseValue(str, t8);
        put(bundle, key, value);
        return value;
    }

    /* JADX INFO: compiled from: NavType.android.kt */
    public static class g<D extends Serializable> extends L<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<D> f44268a;

        public g(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.f44268a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // p141l2.L
        /* JADX INFO: renamed from: a */
        public D parseValue(String value) {
            i.e(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return i.a(this.f44268a, ((g) obj).f44268a);
        }

        @Override // p141l2.L
        public final Object get(Bundle bundle, String key) {
            i.e(bundle, "bundle");
            i.e(key, "key");
            return (Serializable) bundle.get(key);
        }

        @Override // p141l2.L
        public String getName() {
            return this.f44268a.getName();
        }

        public final int hashCode() {
            return this.f44268a.hashCode();
        }

        @Override // p141l2.L
        public final void put(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            i.e(bundle, "bundle");
            i.e(key, "key");
            i.e(value, "value");
            this.f44268a.cast(value);
            bundle.putSerializable(key, value);
        }

        public g(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f44268a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
