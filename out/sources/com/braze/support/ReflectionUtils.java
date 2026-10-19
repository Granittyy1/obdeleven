package com.braze.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24317b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed constructObjectQuietly";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f24319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f24318b = str;
            this.f24319c = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Could not find ");
            sb2.append(this.f24318b);
            sb2.append(" on ");
            Class cls = (Class) this.f24319c.element;
            sb2.append(cls != null ? cls.getName() : null);
            return sb2.toString();
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f24320b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Failed to find "), this.f24320b, " on ${clazz.name} or any parent classes");
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24321b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed getDeclaredMethodQuietly";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24322b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed getMethodQuietly";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24323b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed getMethodQuietly";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24324b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed invokeMethodQuietly";
        }
    }

    private ReflectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object constructObjectQuietly$default(ReflectionUtils reflectionUtils, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = EmptyList.f42983b;
        }
        if ((i10 & 4) != 0) {
            list2 = EmptyList.f42983b;
        }
        return reflectionUtils.constructObjectQuietly(str, list, list2);
    }

    public static final boolean doesMethodExist(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.i.e(className, "className");
        kotlin.jvm.internal.i.e(methodName, "methodName");
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        return getMethodQuietly(className, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length)) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Class] */
    private final Method getDeclaredMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = cls;
        while (true) {
            T t8 = ref$ObjectRef.element;
            if (t8 == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, new c(str), 2, (Object) null);
                return null;
            }
            try {
                return ((Class) t8).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, new b(str, ref$ObjectRef), 2, (Object) null);
                ref$ObjectRef.element = ((Class) ref$ObjectRef.element).getSuperclass();
            }
        }
    }

    public static final Method getMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.i.e(clazz, "clazz");
        kotlin.jvm.internal.i.e(methodName, "methodName");
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e10, e.f24322b);
            return null;
        }
    }

    public static final Pair<Boolean, Object> invokeMethodQuietly(Object obj, Method method, Object... args) {
        kotlin.jvm.internal.i.e(method, "method");
        kotlin.jvm.internal.i.e(args, "args");
        try {
            return new Pair<>(Boolean.TRUE, method.invoke(obj, Arrays.copyOf(args, args.length)));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e10, g.f24324b);
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public final Object constructObjectQuietly(String classpath, List<? extends Class<?>> parameterTypes, List<? extends Object> args) {
        kotlin.jvm.internal.i.e(classpath, "classpath");
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.i.e(args, "args");
        try {
            Class<?> cls = Class.forName(classpath);
            Class[] clsArr = (Class[]) parameterTypes.toArray(new Class[0]);
            Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] array = args.toArray(new Object[0]);
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, a.f24317b);
            return null;
        }
    }

    public static final Method getMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.i.e(className, "className");
        kotlin.jvm.internal.i.e(methodName, "methodName");
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        try {
            return getMethodQuietly(Class.forName(className), methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e10, f.f24323b);
            return null;
        }
    }

    public final Method getDeclaredMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.i.e(className, "className");
        kotlin.jvm.internal.i.e(methodName, "methodName");
        kotlin.jvm.internal.i.e(parameterTypes, "parameterTypes");
        try {
            return getDeclaredMethodQuietly(Class.forName(className), methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.D, e10, d.f24321b);
            return null;
        }
    }
}
