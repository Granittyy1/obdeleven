package io.ktor.utils.io;

import Ia.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.collections.k;
import kotlinx.coroutines.InterfaceC2711v;
import p293xa.r;

/* JADX INFO: compiled from: ExceptionUtilsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExceptionUtilsJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40590a = a(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f40591b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, l<Throwable, Throwable>> f40592c = new WeakHashMap<>();

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e(Integer.valueOf(((Constructor) t10).getParameterTypes().length), Integer.valueOf(((Constructor) t8).getParameterTypes().length));
        }
    }

    public static final int a(Class<?> cls, int i10) {
        Object objA;
        kotlin.jvm.internal.l.a(cls);
        int i11 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                kotlin.jvm.internal.i.d(declaredFields, "declaredFields");
                int i12 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i12++;
                    }
                }
                i11 += i12;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objA = kotlin.b.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i11);
        Object objValueOf = Integer.valueOf(i10);
        if (objA instanceof Result.Failure) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x010b A[EDGE_INSN: B:104:0x010b->B:64:0x010b BREAK  A[LOOP:3: B:41:0x00af->B:107:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:3: B:41:0x00af->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    public static final <E extends Throwable> E b(E exception, Throwable cause) {
        Object objA;
        l<Throwable, Throwable> lVar;
        kotlin.jvm.internal.i.e(exception, "exception");
        kotlin.jvm.internal.i.e(cause, "cause");
        if (exception instanceof InterfaceC2711v) {
            try {
                objA = ((InterfaceC2711v) exception).a();
            } catch (Throwable th) {
                objA = kotlin.b.a(th);
            }
            return (E) (objA instanceof Result.Failure ? null : objA);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f40591b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        WeakHashMap<Class<? extends Throwable>, l<Throwable, Throwable>> weakHashMap = f40592c;
        try {
            l<Throwable, Throwable> lVar2 = weakHashMap.get(exception.getClass());
            lock.unlock();
            if (lVar2 != null) {
                return (E) lVar2.invoke(exception);
            }
            int i10 = 0;
            if (f40590a != a(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put((Class<? extends Throwable>) exception.getClass(), new l() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$tryCopyException$4$1
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            Throwable it = (Throwable) obj;
                            kotlin.jvm.internal.i.e(it, "it");
                            return null;
                        }
                    });
                    r rVar = r.f47939a;
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    return null;
                } finally {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            kotlin.jvm.internal.i.d(constructors, "exception.javaClass.constructors");
            l<Throwable, Throwable> lVar3 = null;
            for (final Constructor constructor : k.b0(constructors, new a())) {
                kotlin.jvm.internal.i.d(constructor, "constructor");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length == 1) {
                        Class<?> cls = parameterTypes[0];
                        if (kotlin.jvm.internal.i.a(cls, Throwable.class)) {
                            lVar = new l<Throwable, Throwable>() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Throwable invoke(Throwable th2) {
                                    Object objA2;
                                    Throwable e10 = th2;
                                    kotlin.jvm.internal.i.e(e10, "e");
                                    try {
                                        Object objNewInstance = constructor.newInstance(e10);
                                        kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        objA2 = (Throwable) objNewInstance;
                                    } catch (Throwable th3) {
                                        objA2 = kotlin.b.a(th3);
                                    }
                                    if (objA2 instanceof Result.Failure) {
                                        objA2 = null;
                                    }
                                    return (Throwable) objA2;
                                }
                            };
                        } else if (kotlin.jvm.internal.i.a(cls, String.class)) {
                            lVar = new l<Throwable, Throwable>() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Throwable invoke(Throwable th2) {
                                    Object objA2;
                                    Throwable e10 = th2;
                                    kotlin.jvm.internal.i.e(e10, "e");
                                    try {
                                        Object objNewInstance = constructor.newInstance(e10.getMessage());
                                        kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th3 = (Throwable) objNewInstance;
                                        th3.initCause(e10);
                                        objA2 = th3;
                                    } catch (Throwable th4) {
                                        objA2 = kotlin.b.a(th4);
                                    }
                                    boolean z10 = objA2 instanceof Result.Failure;
                                    Object obj = objA2;
                                    if (z10) {
                                        obj = null;
                                    }
                                    return (Throwable) obj;
                                }
                            };
                        } else {
                            lVar3 = null;
                        }
                    } else if (length == 2 && kotlin.jvm.internal.i.a(parameterTypes[0], String.class) && kotlin.jvm.internal.i.a(parameterTypes[1], Throwable.class)) {
                        lVar = new l<Throwable, Throwable>() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final Throwable invoke(Throwable th2) {
                                Object objA2;
                                Throwable e10 = th2;
                                kotlin.jvm.internal.i.e(e10, "e");
                                try {
                                    Object objNewInstance = constructor.newInstance(e10.getMessage(), e10);
                                    kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    objA2 = (Throwable) objNewInstance;
                                } catch (Throwable th3) {
                                    objA2 = kotlin.b.a(th3);
                                }
                                if (objA2 instanceof Result.Failure) {
                                    objA2 = null;
                                }
                                return (Throwable) objA2;
                            }
                        };
                    } else {
                        lVar3 = null;
                    }
                    if (lVar3 != null) {
                        break;
                    }
                } else {
                    lVar = new l<Throwable, Throwable>() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final Throwable invoke(Throwable th2) {
                            Object objA2;
                            Throwable e10 = th2;
                            kotlin.jvm.internal.i.e(e10, "e");
                            try {
                                Object objNewInstance = constructor.newInstance(null);
                                kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                Throwable th3 = (Throwable) objNewInstance;
                                th3.initCause(e10);
                                objA2 = th3;
                            } catch (Throwable th4) {
                                objA2 = kotlin.b.a(th4);
                            }
                            return (Throwable) (objA2 instanceof Result.Failure ? null : objA2);
                        }
                    };
                }
                lVar3 = lVar;
                if (lVar3 != null) {
                    break;
                    break;
                }
            }
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount2; i12++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                weakHashMap.put((Class<? extends Throwable>) exception.getClass(), lVar3 == null ? new l() { // from class: io.ktor.utils.io.ExceptionUtilsJvmKt$tryCopyException$5$1
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        Throwable it = (Throwable) obj;
                        kotlin.jvm.internal.i.e(it, "it");
                        return null;
                    }
                } : lVar3);
                r rVar2 = r.f47939a;
                while (i10 < readHoldCount2) {
                    lock3.lock();
                    i10++;
                }
                writeLock2.unlock();
                if (lVar3 != null) {
                    return (E) lVar3.invoke(cause);
                }
                return null;
            } catch (Throwable th2) {
                while (i10 < readHoldCount2) {
                    lock3.lock();
                    i10++;
                }
                writeLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
