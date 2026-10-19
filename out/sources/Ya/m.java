package Ya;

import com.voltasit.obdeleven.domain.usecases.device.u;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import p037cb.A0;
import p037cb.C1526g0;
import p037cb.C1553z;
import p037cb.N;
import p037cb.U;
import p037cb.X;
import p037cb.r0;
import p037cb.s0;
import p114j1.C2479a;

/* JADX INFO: compiled from: SerializersJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            kotlin.jvm.internal.i.d(rawType, "getRawType(...)");
            return a(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.i.d(upperBounds, "getUpperBounds(...)");
            Object objP = kotlin.collections.k.P(upperBounds);
            kotlin.jvm.internal.i.d(objP, "first(...)");
            return a((Type) objP);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.i.d(genericComponentType, "getGenericComponentType(...)");
            return a(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.l.a(type.getClass()));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    public static final <T> b<T> b(C.g gVar, Class<T> cls, List<? extends b<Object>> list) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Class<?> cls2;
        Object obj2;
        b<T> bVar;
        b<T> bVar2;
        b<T> fVar;
        Class<?> cls3;
        Object obj3;
        Field field;
        k kVar;
        b<T> bVarJ;
        b<T> bVar3 = null;
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        b[] args = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        kotlin.jvm.internal.i.e(cls, "<this>");
        kotlin.jvm.internal.i.e(args, "args");
        if (cls.isEnum() && cls.getAnnotation(k.class) == null && cls.getAnnotation(c.class) == null) {
            T[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            kotlin.jvm.internal.i.d(canonicalName, "getCanonicalName(...)");
            kotlin.jvm.internal.i.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            fVar = new C1553z<>(canonicalName, (Enum[]) enumConstants);
            bVar = null;
        } else {
            b[] bVarArr2 = (b[]) Arrays.copyOf(args, args.length);
            try {
                Field declaredField = cls.getDeclaredField("Companion");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
            } catch (Throwable unused) {
                obj = null;
            }
            b<T> bVarJ2 = obj == null ? null : u.j(obj, (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length));
            if (bVarJ2 != null) {
                bVar = null;
                fVar = bVarJ2;
            } else {
                String canonicalName2 = cls.getCanonicalName();
                if (canonicalName2 == null || kotlin.text.m.I(canonicalName2, "java.", false) || kotlin.text.m.I(canonicalName2, "kotlin.", false)) {
                    bVar3 = null;
                } else {
                    Field[] declaredFields = cls.getDeclaredFields();
                    kotlin.jvm.internal.i.d(declaredFields, "getDeclaredFields(...)");
                    int length = declaredFields.length;
                    Field field2 = null;
                    int i10 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i10 >= length) {
                            if (!z10) {
                                break;
                            }
                            break;
                        }
                        Field field3 = declaredFields[i10];
                        if (kotlin.jvm.internal.i.a(field3.getName(), "INSTANCE") && kotlin.jvm.internal.i.a(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                            if (!z10) {
                                z10 = true;
                                field2 = field3;
                            }
                        }
                        i10++;
                        field2 = null;
                        break;
                    }
                    if (field2 != null) {
                        Object obj4 = field2.get(null);
                        Method[] methods = cls.getMethods();
                        kotlin.jvm.internal.i.d(methods, "getMethods(...)");
                        int length2 = methods.length;
                        Method method = null;
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i11 >= length2) {
                                if (!z11) {
                                    break;
                                }
                                break;
                            }
                            Method method2 = methods[i11];
                            if (kotlin.jvm.internal.i.a(method2.getName(), "serializer")) {
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                kotlin.jvm.internal.i.d(parameterTypes, "getParameterTypes(...)");
                                if (parameterTypes.length == 0 && kotlin.jvm.internal.i.a(method2.getReturnType(), b.class)) {
                                    if (!z11) {
                                        z11 = true;
                                        method = method2;
                                    }
                                }
                            }
                            i11++;
                            method = null;
                            break;
                        }
                        if (method == null) {
                            bVar3 = null;
                        } else {
                            Object objInvoke = method.invoke(obj4, null);
                            if (objInvoke instanceof b) {
                                bVar3 = (b) objInvoke;
                            } else {
                                bVar3 = null;
                            }
                        }
                    }
                }
                if (bVar3 != null) {
                    fVar = bVar3;
                    bVar = null;
                } else {
                    b[] bVarArr3 = (b[]) Arrays.copyOf(args, args.length);
                    Class<?>[] declaredClasses = cls.getDeclaredClasses();
                    kotlin.jvm.internal.i.d(declaredClasses, "getDeclaredClasses(...)");
                    int length3 = declaredClasses.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length3) {
                            cls2 = null;
                            break;
                        }
                        cls2 = declaredClasses[i12];
                        if (cls2.getAnnotation(X.class) != null) {
                            break;
                        }
                        i12++;
                    }
                    if (cls2 == null) {
                        obj2 = null;
                    } else {
                        try {
                            Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                            declaredField2.setAccessible(true);
                            obj2 = declaredField2.get(null);
                        } catch (Throwable unused2) {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null || (bVarJ = u.j(obj2, (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length))) == null) {
                        try {
                            Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                            kotlin.jvm.internal.i.d(declaredClasses2, "getDeclaredClasses(...)");
                            int length4 = declaredClasses2.length;
                            Class<?> cls4 = null;
                            int i13 = 0;
                            boolean z12 = false;
                            while (true) {
                                if (i13 >= length4) {
                                    if (z12) {
                                        cls3 = cls4;
                                        break;
                                    }
                                } else {
                                    Class<?> cls5 = declaredClasses2[i13];
                                    if (cls5.getSimpleName().equals("$serializer")) {
                                        if (!z12) {
                                            z12 = true;
                                            cls4 = cls5;
                                        }
                                    }
                                    i13++;
                                }
                                cls3 = null;
                                break;
                            }
                            if (cls3 == null || (field = cls3.getField("INSTANCE")) == null) {
                                bVar = null;
                                obj3 = null;
                            } else {
                                bVar = null;
                                try {
                                    obj3 = field.get(null);
                                } catch (NoSuchFieldException unused3) {
                                }
                            }
                            bVar2 = obj3 instanceof b ? (b) obj3 : bVar;
                        } catch (NoSuchFieldException unused4) {
                            bVar = null;
                        }
                        fVar = bVar2;
                    } else {
                        fVar = bVarJ;
                        bVar = null;
                    }
                    if (fVar == null) {
                        fVar = (cls.getAnnotation(c.class) == null && ((kVar = (k) cls.getAnnotation(k.class)) == null || !kotlin.jvm.internal.l.a(kVar.with()).equals(kotlin.jvm.internal.l.a(f.class)))) ? bVar : new f(kotlin.jvm.internal.l.a(cls));
                    }
                }
            }
        }
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(cls);
        MapBuilder mapBuilder = r0.f22649a;
        b<T> bVar4 = (b) r0.f22649a.get(cVarA);
        if (bVar4 != null) {
            return bVar4;
        }
        b<T> bVarO = gVar.O(cVarA, list);
        if (bVarO == null) {
            return cls.isInterface() ? new f(kotlin.jvm.internal.l.a(cls)) : bVar;
        }
        return bVarO;
    }

    public static final b<Object> c(C.g gVar, Type type, boolean z10) {
        ArrayList<b> arrayList;
        b<Object> bVarC;
        b<Object> bVarC2;
        Oa.c cVarA;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                kotlin.jvm.internal.i.d(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) kotlin.collections.k.P(upperBounds);
            }
            kotlin.jvm.internal.i.b(genericComponentType);
            if (z10) {
                bVarC2 = C2479a.n(gVar, genericComponentType);
            } else {
                kotlin.jvm.internal.i.e(gVar, "<this>");
                bVarC2 = c(gVar, genericComponentType, false);
                if (bVarC2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                kotlin.jvm.internal.i.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                cVarA = kotlin.jvm.internal.l.a((Class) rawType);
            } else {
                if (!(genericComponentType instanceof Oa.c)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + kotlin.jvm.internal.l.a(genericComponentType.getClass()));
                }
                cVarA = (Oa.c) genericComponentType;
            }
            kotlin.jvm.internal.i.c(cVarA, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new s0(cVarA, bVarC2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(gVar, cls, EmptyList.f42983b);
            }
            Class<?> componentType = cls.getComponentType();
            kotlin.jvm.internal.i.d(componentType, "getComponentType(...)");
            if (z10) {
                bVarC = C2479a.n(gVar, componentType);
            } else {
                kotlin.jvm.internal.i.e(gVar, "<this>");
                bVarC = c(gVar, componentType, false);
                if (bVarC == null) {
                    return null;
                }
            }
            return new s0(kotlin.jvm.internal.l.a(componentType), bVarC);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                kotlin.jvm.internal.i.d(upperBounds2, "getUpperBounds(...)");
                Object objP = kotlin.collections.k.P(upperBounds2);
                kotlin.jvm.internal.i.d(objP, "first(...)");
                return c(gVar, (Type) objP, true);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.l.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        kotlin.jvm.internal.i.c(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.i.b(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                kotlin.jvm.internal.i.b(type2);
                arrayList.add(C2479a.n(gVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                kotlin.jvm.internal.i.b(type3);
                kotlin.jvm.internal.i.e(gVar, "<this>");
                b<Object> bVarC3 = c(gVar, type3, false);
                if (bVarC3 == null) {
                    return null;
                }
                arrayList.add(bVarC3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            b elementSerializer = (b) arrayList.get(0);
            kotlin.jvm.internal.i.e(elementSerializer, "elementSerializer");
            return new N(elementSerializer);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return Za.a.a((b) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return Za.a.b((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            b keySerializer = (b) arrayList.get(0);
            b valueSerializer = (b) arrayList.get(1);
            kotlin.jvm.internal.i.e(keySerializer, "keySerializer");
            kotlin.jvm.internal.i.e(valueSerializer, "valueSerializer");
            return new U(keySerializer, valueSerializer);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            b keySerializer2 = (b) arrayList.get(0);
            b valueSerializer2 = (b) arrayList.get(1);
            kotlin.jvm.internal.i.e(keySerializer2, "keySerializer");
            kotlin.jvm.internal.i.e(valueSerializer2, "valueSerializer");
            return new C1526g0(keySerializer2, valueSerializer2);
        }
        if (Triple.class.isAssignableFrom(cls2)) {
            b aSerializer = (b) arrayList.get(0);
            b bSerializer = (b) arrayList.get(1);
            b cSerializer = (b) arrayList.get(2);
            kotlin.jvm.internal.i.e(aSerializer, "aSerializer");
            kotlin.jvm.internal.i.e(bSerializer, "bSerializer");
            kotlin.jvm.internal.i.e(cSerializer, "cSerializer");
            return new A0(aSerializer, bSerializer, cSerializer);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        for (b bVar : arrayList) {
            kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(bVar);
        }
        return b(gVar, cls2, arrayList2);
    }
}
