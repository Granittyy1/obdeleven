package androidx.lifecycle;

import com.google.android.gms.internal.measurement.M1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Lifecycling.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1381y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f17837a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17838b = new HashMap();

    public static InterfaceC1368k a(Constructor constructor, InterfaceC1375s interfaceC1375s) {
        try {
            Object objNewInstance = constructor.newInstance(interfaceC1375s);
            kotlin.jvm.internal.i.b(objNewInstance);
            return (InterfaceC1368k) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x010a A[SYNTHETIC] */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        kotlin.jvm.internal.a aVarM;
        Class cls2;
        boolean z10;
        HashMap map = f17837a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                kotlin.jvm.internal.i.b(name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.i.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.i.d(canonicalName, "substring(...)");
                }
                kotlin.jvm.internal.i.b(canonicalName);
                String strConcat = kotlin.text.m.G(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f17838b;
            if (declaredConstructor != null) {
                map2.put(cls, M1.k(declaredConstructor));
            } else {
                C1360c c1360c = C1360c.f17809c;
                HashMap map3 = c1360c.f17811b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((E) declaredMethods[i11].getAnnotation(E.class)) != null) {
                                c1360c.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i11++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1375s.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.i.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            kotlin.jvm.internal.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            aVarM = I2.e.m(cls.getInterfaces());
                            while (aVarM.hasNext()) {
                                cls2 = (Class) aVarM.next();
                                if (cls2 == null && InterfaceC1375s.class.isAssignableFrom(cls2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    kotlin.jvm.internal.i.b(cls2);
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        kotlin.jvm.internal.i.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        aVarM = I2.e.m(cls.getInterfaces());
                        while (aVarM.hasNext()) {
                            cls2 = (Class) aVarM.next();
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                kotlin.jvm.internal.i.b(cls2);
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    kotlin.jvm.internal.i.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
