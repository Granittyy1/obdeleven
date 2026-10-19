package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f29151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f29152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f29153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f29154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f29155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f29156f;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class b extends e {
        @Override // com.google.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            if (g0.f29156f) {
                return g0.h(obj, j) != 0;
            }
            return g0.i(obj, j) != 0;
        }

        @Override // com.google.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return g0.f29156f ? g0.h(obj, j) : g0.i(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.protobuf.g0.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            if (g0.f29156f) {
                g0.o(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                g0.p(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            if (g0.f29156f) {
                g0.o(obj, j, b10);
            } else {
                g0.p(obj, j, b10);
            }
        }

        @Override // com.google.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            p(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            o(Float.floatToIntBits(f10), j, obj);
        }

        @Override // com.google.protobuf.g0.e
        public final boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // com.google.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            if (g0.f29156f) {
                return g0.h(obj, j) != 0;
            }
            return g0.i(obj, j) != 0;
        }

        @Override // com.google.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return g0.f29156f ? g0.h(obj, j) : g0.i(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.protobuf.g0.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            if (g0.f29156f) {
                g0.o(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                g0.p(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            if (g0.f29156f) {
                g0.o(obj, j, b10);
            } else {
                g0.p(obj, j, b10);
            }
        }

        @Override // com.google.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            p(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            o(Float.floatToIntBits(f10), j, obj);
        }

        @Override // com.google.protobuf.g0.e
        public final boolean s() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // com.google.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            return this.f29157a.getBoolean(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return this.f29157a.getByte(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final double e(Object obj, long j) {
            return this.f29157a.getDouble(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final float f(Object obj, long j) {
            return this.f29157a.getFloat(obj, j);
        }

        @Override // com.google.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            this.f29157a.putBoolean(obj, j, z10);
        }

        @Override // com.google.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            this.f29157a.putByte(obj, j, b10);
        }

        @Override // com.google.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            this.f29157a.putDouble(obj, j, d10);
        }

        @Override // com.google.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            this.f29157a.putFloat(obj, j, f10);
        }

        @Override // com.google.protobuf.g0.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f29157a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                g0.a(th);
                return false;
            }
        }

        @Override // com.google.protobuf.g0.e
        public final boolean s() {
            Unsafe unsafe = this.f29157a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (g0.e() != null) {
                        try {
                            Class<?> cls3 = this.f29157a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            g0.a(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    g0.a(th2);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f29157a;

        public e(Unsafe unsafe) {
            this.f29157a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f29157a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f29157a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.f29157a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.f29157a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.f29157a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.f29157a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z10);

        public abstract void l(Object obj, long j, byte b10);

        public abstract void m(Object obj, long j, double d10);

        public abstract void n(Object obj, long j, float f10);

        public final void o(int i10, long j, Object obj) {
            this.f29157a.putInt(obj, j, i10);
        }

        public final void p(Object obj, long j, long j10) {
            this.f29157a.putLong(obj, j, j10);
        }

        public final void q(long j, Object obj, Object obj2) {
            this.f29157a.putObject(obj, j, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f29157a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                g0.a(th);
                return false;
            }
        }

        public abstract boolean s();
    }

    static {
        Unsafe unsafeM = m();
        f29151a = unsafeM;
        Class<?> cls = C2062d.f29135a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        e dVar = null;
        if (unsafeM != null) {
            if (!C2062d.a()) {
                dVar = new d(unsafeM);
            } else if (zF) {
                dVar = new c(unsafeM);
            } else if (zF2) {
                dVar = new b(unsafeM);
            }
        }
        f29152b = dVar;
        f29153c = dVar == null ? false : dVar.s();
        f29154d = dVar == null ? false : dVar.r();
        f29155e = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && dVar != null) {
            dVar.j(fieldE);
        }
        f29156f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(g0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f29151a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f29154d) {
            return f29152b.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f29154d) {
            f29152b.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (C2062d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class<?> cls) {
        if (!C2062d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = C2062d.f29135a;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j) {
        return f29152b.d(bArr, f29155e + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((f29152b.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((f29152b.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int j(AbstractC2059a abstractC2059a, long j) {
        return f29152b.g(abstractC2059a, j);
    }

    public static long k(AbstractC2059a abstractC2059a, long j) {
        return f29152b.h(abstractC2059a, j);
    }

    public static Object l(AbstractC2059a abstractC2059a, long j) {
        return f29152b.i(abstractC2059a, j);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j, byte b10) {
        f29152b.l(bArr, f29155e + j, b10);
    }

    public static void o(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int iG = f29152b.g(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        q(((255 & b10) << i10) | (iG & (~(255 << i10))), j10, obj);
    }

    public static void p(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        q(((255 & b10) << i10) | (f29152b.g(obj, j10) & (~(255 << i10))), j10, obj);
    }

    public static void q(int i10, long j, Object obj) {
        f29152b.o(i10, j, obj);
    }

    public static void r(Object obj, long j, long j10) {
        f29152b.p(obj, j, j10);
    }

    public static void s(long j, Object obj, Object obj2) {
        f29152b.q(j, obj, obj2);
    }
}
