package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: OptionalMethod.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f38002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class[] f38004c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.f38002a = cls;
        this.f38003b = str;
        this.f38004c = clsArr;
    }

    public static Method b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final Method a(Class<?> cls) {
        Class<?> cls2;
        Method methodB = b(cls, this.f38003b, this.f38004c);
        if (methodB == null || (cls2 = this.f38002a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    public final Object c(SSLSocket sSLSocket, Object... objArr) throws InvocationTargetException {
        Method methodA = a(sSLSocket.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f38003b + " not supported for object " + sSLSocket);
        }
        try {
            return methodA.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    public final void d(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodA = a(sSLSocket.getClass());
            if (methodA == null) {
                return;
            }
            try {
                methodA.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object e(SSLSocket sSLSocket, Object... objArr) {
        try {
            return c(sSLSocket, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
