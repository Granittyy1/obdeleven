package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1360c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1360c f17809c = new C1360c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17810a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17811b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f17812a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f17813b;

        public a(HashMap map) {
            this.f17813b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f17812a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f17812a.put(event, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void a(List list, InterfaceC1376t interfaceC1376t, Lifecycle.Event event, InterfaceC1375s interfaceC1375s) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = (b) list.get(size);
                    bVar.getClass();
                    try {
                        int i10 = bVar.f17814a;
                        Method method = bVar.f17815b;
                        if (i10 == 0) {
                            method.invoke(interfaceC1375s, null);
                        } else if (i10 == 1) {
                            method.invoke(interfaceC1375s, interfaceC1376t);
                        } else if (i10 == 2) {
                            method.invoke(interfaceC1375s, interfaceC1376t, event);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f17815b;

        public b(Method method, int i10) {
            this.f17814a = i10;
            this.f17815b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17814a == bVar.f17814a && this.f17815b.getName().equals(bVar.f17815b.getName());
        }

        public final int hashCode() {
            return this.f17815b.getName().hashCode() + (this.f17814a * 31);
        }
    }

    public static void b(HashMap map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f17815b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f17810a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f17813b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : aVarA2.f17813b.entrySet()) {
                b(map, (b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            E e11 = (E) method.getAnnotation(E.class);
            if (e11 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1376t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                Lifecycle.Event eventValue = e11.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new b(method, i10), eventValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f17811b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }
}
