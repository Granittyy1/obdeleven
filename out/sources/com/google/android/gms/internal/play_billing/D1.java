package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f26112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1 f26113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f26114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f26115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f26116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f26117g;

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0165 A[PHI: r0
      0x0165: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x0153, B:49:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        C1 a10;
        Field declaredField;
        boolean z10;
        boolean z11;
        Field declaredField2;
        Field field;
        C1 c10;
        Unsafe unsafeJ = j();
        f26111a = unsafeJ;
        int i10 = C1978j0.f26199a;
        f26112b = Memory.class;
        Class cls = Long.TYPE;
        boolean zS = s(cls);
        boolean zS2 = s(Integer.TYPE);
        if (unsafeJ == null) {
            a10 = null;
        } else if (zS) {
            a10 = new B1(unsafeJ);
        } else if (zS2) {
            a10 = new A1(unsafeJ);
        } else {
            a10 = null;
        }
        f26113c = a10;
        if (a10 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls2 = a10.f26109a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != Long.TYPE) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(D1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f26114d = z10;
        C1 c11 = f26113c;
        if (c11 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = c11.f26109a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z11 = true;
            } catch (Throwable th2) {
                Logger.getLogger(D1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z11 = false;
            }
        }
        f26115e = z11;
        f26116f = u(byte[].class);
        u(boolean[].class);
        a(boolean[].class);
        u(int[].class);
        a(int[].class);
        u(long[].class);
        a(long[].class);
        u(float[].class);
        a(float[].class);
        u(double[].class);
        a(double[].class);
        u(Object[].class);
        a(Object[].class);
        int i11 = C1978j0.f26199a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (c10 = f26113c) != null) {
            c10.f26109a.objectFieldOffset(field);
        }
        f26117g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f26115e) {
            f26113c.f26109a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b10) {
        Unsafe unsafe = f26113c.f26109a;
        long j10 = (-4) & j;
        int i10 = unsafe.getInt(obj, j10);
        int i11 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = f26113c.f26109a;
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (unsafe.getInt(obj, j10) & (~(255 << i10))));
    }

    public static double d(Object obj, long j) {
        return f26113c.a(obj, j);
    }

    public static float e(Object obj, long j) {
        return f26113c.b(obj, j);
    }

    public static int f(Object obj, long j) {
        return f26113c.f26109a.getInt(obj, j);
    }

    public static long g(Object obj, long j) {
        return f26113c.f26109a.getLong(obj, j);
    }

    public static Object h(Class cls) {
        try {
            return f26111a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object i(Object obj, long j) {
        return f26113c.f26109a.getObject(obj, j);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2026z1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, boolean z10) {
        f26113c.c(obj, j, z10);
    }

    public static void l(Object obj, long j, double d10) {
        f26113c.e(obj, j, d10);
    }

    public static void m(Object obj, long j, float f10) {
        f26113c.f(obj, j, f10);
    }

    public static void n(int i10, long j, Object obj) {
        f26113c.f26109a.putInt(obj, j, i10);
    }

    public static void o(Object obj, long j, long j10) {
        f26113c.f26109a.putLong(obj, j, j10);
    }

    public static void p(long j, Object obj, Object obj2) {
        f26113c.f26109a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj, long j) {
        return ((byte) ((f26113c.f26109a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj, long j) {
        return ((byte) ((f26113c.f26109a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean s(Class cls) {
        int i10 = C1978j0.f26199a;
        try {
            Class cls2 = f26112b;
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

    public static boolean t(Object obj, long j) {
        return f26113c.g(obj, j);
    }

    public static int u(Class cls) {
        if (f26115e) {
            return f26113c.f26109a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
