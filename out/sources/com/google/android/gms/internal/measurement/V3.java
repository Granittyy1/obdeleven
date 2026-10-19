package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f25610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f25611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f25612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f25613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f25614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f25615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f25616g;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static final class a extends b {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void c(Object obj, long j, byte b10) {
            if (V3.f25616g) {
                V3.k(obj, j, b10);
            } else {
                V3.m(obj, j, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void d(Object obj, long j, double d10) {
            f(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void e(Object obj, long j, float f10) {
            b(Float.floatToIntBits(f10), j, obj);
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void g(Object obj, long j, boolean z10) {
            if (V3.f25616g) {
                V3.k(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                V3.m(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final boolean k(Object obj, long j) {
            if (V3.f25616g) {
                return ((byte) (V3.f25612c.l(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
            }
            return ((byte) (V3.f25612c.l(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f25617a;

        public b(Unsafe unsafe) {
            this.f25617a = unsafe;
        }

        public abstract double a(Object obj, long j);

        public final void b(int i10, long j, Object obj) {
            this.f25617a.putInt(obj, j, i10);
        }

        public abstract void c(Object obj, long j, byte b10);

        public abstract void d(Object obj, long j, double d10);

        public abstract void e(Object obj, long j, float f10);

        public final void f(Object obj, long j, long j10) {
            this.f25617a.putLong(obj, j, j10);
        }

        public abstract void g(Object obj, long j, boolean z10);

        public final boolean h() {
            Unsafe unsafe = this.f25617a;
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
                Unsafe unsafe2 = V3.f25610a;
                Logger.getLogger(V3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
                return false;
            }
        }

        public abstract float i(Object obj, long j);

        public final boolean j() {
            Field declaredField;
            Field declaredField2;
            Unsafe unsafe = this.f25617a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                Unsafe unsafe2 = V3.f25610a;
                Field field = null;
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField != null) {
                    field = declaredField;
                } else {
                    try {
                        declaredField2 = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField2 = null;
                    }
                    if (declaredField2 != null && declaredField2.getType() == Long.TYPE) {
                        field = declaredField2;
                    }
                }
                return field != null;
            } catch (Throwable th) {
                Unsafe unsafe3 = V3.f25610a;
                Logger.getLogger(V3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
                return false;
            }
        }

        public abstract boolean k(Object obj, long j);

        public final int l(Object obj, long j) {
            return this.f25617a.getInt(obj, j);
        }

        public final long m(Object obj, long j) {
            return this.f25617a.getLong(obj, j);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static final class c extends b {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final double a(Object obj, long j) {
            return Double.longBitsToDouble(m(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void c(Object obj, long j, byte b10) {
            if (V3.f25616g) {
                V3.k(obj, j, b10);
            } else {
                V3.m(obj, j, b10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void d(Object obj, long j, double d10) {
            f(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void e(Object obj, long j, float f10) {
            b(Float.floatToIntBits(f10), j, obj);
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final void g(Object obj, long j, boolean z10) {
            if (V3.f25616g) {
                V3.k(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                V3.m(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(l(obj, j));
        }

        @Override // com.google.android.gms.internal.measurement.V3.b
        public final boolean k(Object obj, long j) {
            if (V3.f25616g) {
                return ((byte) (V3.f25612c.l(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
            }
            return ((byte) (V3.f25612c.l(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    static {
        b aVar;
        Field declaredField;
        Field declaredField2;
        Unsafe unsafeI = i();
        f25610a = unsafeI;
        f25611b = C1907t2.f25849a;
        boolean zN = n(Long.TYPE);
        boolean zN2 = n(Integer.TYPE);
        Field field = null;
        if (unsafeI == null) {
            aVar = null;
        } else if (zN) {
            aVar = new c(unsafeI);
        } else if (zN2) {
            aVar = new a(unsafeI);
        } else {
            aVar = null;
        }
        f25612c = aVar;
        f25613d = aVar == null ? false : aVar.j();
        f25614e = aVar == null ? false : aVar.h();
        f25615f = h(byte[].class);
        h(boolean[].class);
        j(boolean[].class);
        h(int[].class);
        j(int[].class);
        h(long[].class);
        j(long[].class);
        h(float[].class);
        j(float[].class);
        h(double[].class);
        j(double[].class);
        h(Object[].class);
        j(Object[].class);
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            field = declaredField;
        } else {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                declaredField2 = null;
            }
            if (declaredField2 != null && declaredField2.getType() == Long.TYPE) {
                field = declaredField2;
            }
        }
        if (field != null && aVar != null) {
            aVar.f25617a.objectFieldOffset(field);
        }
        f25616g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static double a(Object obj, long j) {
        return f25612c.a(obj, j);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f25610a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void c(int i10, long j, Object obj) {
        f25612c.b(i10, j, obj);
    }

    public static void d(long j, Object obj, Object obj2) {
        f25612c.f25617a.putObject(obj, j, obj2);
    }

    public static void e(Object obj, long j, double d10) {
        f25612c.d(obj, j, d10);
    }

    public static void f(Object obj, long j, float f10) {
        f25612c.e(obj, j, f10);
    }

    public static float g(Object obj, long j) {
        return f25612c.i(obj, j);
    }

    public static int h(Class<?> cls) {
        if (f25614e) {
            return f25612c.f25617a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Y3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Class cls) {
        if (f25614e) {
            f25612c.f25617a.arrayIndexScale(cls);
        }
    }

    public static void k(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int iL = f25612c.l(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        c(((255 & b10) << i10) | (iL & (~(255 << i10))), j10, obj);
    }

    public static void l(Object obj, long j, boolean z10) {
        f25612c.g(obj, j, z10);
    }

    public static void m(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        c(((255 & b10) << i10) | (f25612c.l(obj, j10) & (~(255 << i10))), j10, obj);
    }

    public static boolean n(Class<?> cls) {
        try {
            Class<?> cls2 = f25611b;
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

    public static Object o(Object obj, long j) {
        return f25612c.f25617a.getObject(obj, j);
    }

    public static boolean p(Object obj, long j) {
        return f25612c.k(obj, j);
    }
}
