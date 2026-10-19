package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f17231a = Logger.getLogger(g0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f17232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f17233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f17234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f17235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f17236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f17237g;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
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
        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            if (g0.f17237g) {
                return g0.g(obj, j) != 0;
            }
            return g0.h(obj, j) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return g0.f17237g ? g0.g(obj, j) : g0.h(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            if (g0.f17237g) {
                g0.n(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                g0.o(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            if (g0.f17237g) {
                g0.n(obj, j, b10);
            } else {
                g0.o(obj, j, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            p(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            o(Float.floatToIntBits(f10), j, obj);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            if (g0.f17237g) {
                return g0.g(obj, j) != 0;
            }
            return g0.h(obj, j) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return g0.f17237g ? g0.g(obj, j) : g0.h(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            if (g0.f17237g) {
                g0.n(obj, j, z10 ? (byte) 1 : (byte) 0);
            } else {
                g0.o(obj, j, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            if (g0.f17237g) {
                g0.n(obj, j, b10);
            } else {
                g0.o(obj, j, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            p(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            o(Float.floatToIntBits(f10), j, obj);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final boolean c(Object obj, long j) {
            return this.f17238a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final byte d(Object obj, long j) {
            return this.f17238a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final double e(Object obj, long j) {
            return this.f17238a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final float f(Object obj, long j) {
            return this.f17238a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void k(Object obj, long j, boolean z10) {
            this.f17238a.putBoolean(obj, j, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void l(Object obj, long j, byte b10) {
            this.f17238a.putByte(obj, j, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void m(Object obj, long j, double d10) {
            this.f17238a.putDouble(obj, j, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public final void n(Object obj, long j, float f10) {
            this.f17238a.putFloat(obj, j, f10);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f17238a;

        public e(Unsafe unsafe) {
            this.f17238a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f17238a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f17238a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.f17238a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.f17238a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.f17238a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.f17238a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z10);

        public abstract void l(Object obj, long j, byte b10);

        public abstract void m(Object obj, long j, double d10);

        public abstract void n(Object obj, long j, float f10);

        public final void o(int i10, long j, Object obj) {
            this.f17238a.putInt(obj, j, i10);
        }

        public final void p(Object obj, long j, long j10) {
            this.f17238a.putLong(obj, j, j10);
        }

        public final void q(long j, Object obj, Object obj2) {
            this.f17238a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z10;
        boolean z11;
        e eVar;
        Unsafe unsafeL = l();
        f17232b = unsafeL;
        Class<?> cls = C1314d.f17215a;
        Class cls2 = Long.TYPE;
        boolean zE = e(cls2);
        Class cls3 = Integer.TYPE;
        boolean zE2 = e(cls3);
        e dVar = null;
        if (unsafeL != null) {
            if (!C1314d.a()) {
                dVar = new d(unsafeL);
            } else if (zE) {
                dVar = new c(unsafeL);
            } else if (zE2) {
                dVar = new b(unsafeL);
            }
        }
        f17233c = dVar;
        if (unsafeL == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = unsafeL.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("getLong", Object.class, cls2);
                if (d() == null) {
                    z10 = false;
                } else {
                    if (!C1314d.a()) {
                        cls4.getMethod("getByte", cls2);
                        cls4.getMethod("putByte", cls2, Byte.TYPE);
                        cls4.getMethod("getInt", cls2);
                        cls4.getMethod("putInt", cls2, cls3);
                        cls4.getMethod("getLong", cls2);
                        cls4.getMethod("putLong", cls2, cls2);
                        cls4.getMethod("copyMemory", cls2, cls2, cls2);
                        cls4.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    }
                    z10 = true;
                }
            } catch (Throwable th) {
                f17231a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        f17234d = z10;
        Unsafe unsafe = f17232b;
        if (unsafe == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls5 = unsafe.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("arrayBaseOffset", Class.class);
                cls5.getMethod("arrayIndexScale", Class.class);
                Class cls6 = Long.TYPE;
                cls5.getMethod("getInt", Object.class, cls6);
                cls5.getMethod("putInt", Object.class, cls6, Integer.TYPE);
                cls5.getMethod("getLong", Object.class, cls6);
                cls5.getMethod("putLong", Object.class, cls6, cls6);
                cls5.getMethod("getObject", Object.class, cls6);
                cls5.getMethod("putObject", Object.class, cls6, Object.class);
                if (!C1314d.a()) {
                    cls5.getMethod("getByte", Object.class, cls6);
                    cls5.getMethod("putByte", Object.class, cls6, Byte.TYPE);
                    cls5.getMethod("getBoolean", Object.class, cls6);
                    cls5.getMethod("putBoolean", Object.class, cls6, Boolean.TYPE);
                    cls5.getMethod("getFloat", Object.class, cls6);
                    cls5.getMethod("putFloat", Object.class, cls6, Float.TYPE);
                    cls5.getMethod("getDouble", Object.class, cls6);
                    cls5.getMethod("putDouble", Object.class, cls6, Double.TYPE);
                }
                z11 = true;
            } catch (Throwable th2) {
                f17231a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z11 = false;
            }
        }
        f17235e = z11;
        f17236f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && (eVar = f17233c) != null) {
            eVar.j(fieldD);
        }
        f17237g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f17232b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class<?> cls) {
        if (f17235e) {
            return f17233c.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f17235e) {
            f17233c.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (C1314d.a()) {
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

    public static boolean e(Class<?> cls) {
        if (!C1314d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = C1314d.f17215a;
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

    public static byte f(byte[] bArr, long j) {
        return f17233c.d(bArr, f17236f + j);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((f17233c.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((f17233c.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int i(AbstractC1311a abstractC1311a, long j) {
        return f17233c.g(abstractC1311a, j);
    }

    public static long j(AbstractC1311a abstractC1311a, long j) {
        return f17233c.h(abstractC1311a, j);
    }

    public static Object k(Object obj, long j) {
        return f17233c.i(obj, j);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte[] bArr, long j, byte b10) {
        f17233c.l(bArr, f17236f + j, b10);
    }

    public static void n(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int iG = f17233c.g(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        p(((255 & b10) << i10) | (iG & (~(255 << i10))), j10, obj);
    }

    public static void o(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        p(((255 & b10) << i10) | (f17233c.g(obj, j10) & (~(255 << i10))), j10, obj);
    }

    public static void p(int i10, long j, Object obj) {
        f17233c.o(i10, j, obj);
    }

    public static void q(Object obj, long j, long j10) {
        f17233c.p(obj, j, j10);
    }

    public static void r(long j, Object obj, Object obj2) {
        f17233c.q(j, obj, obj2);
    }
}
