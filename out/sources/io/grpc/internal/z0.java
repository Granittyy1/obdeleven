package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ReflectionLongAdderCounter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements InterfaceC2223h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f37768b = Logger.getLogger(z0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f37769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f37770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RuntimeException f37771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f37772f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37773a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i10];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f37768b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f37769c = null;
            f37770d = null;
            f37771e = new RuntimeException(th);
        } else {
            f37769c = constructor;
            f37770d = method;
            f37771e = null;
        }
        f37772f = new Object[]{1L};
    }

    public z0() {
        RuntimeException runtimeException = f37771e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f37773a = f37769c.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // io.grpc.internal.InterfaceC2223h0
    public final void a() {
        try {
            f37770d.invoke(this.f37773a, f37772f);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
