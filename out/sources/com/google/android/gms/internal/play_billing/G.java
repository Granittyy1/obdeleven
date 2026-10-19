package com.google.android.gms.internal.play_billing;

import com.braze.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f26126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f26127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f26128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f26129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f26130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f26131f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.M
                @Override // java.security.PrivilegedExceptionAction
                public final Object run() throws IllegalAccessException {
                    Unsafe unsafe2 = G.f26126a;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
        try {
            f26128c = unsafe.objectFieldOffset(I.class.getDeclaredField(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE));
            f26127b = unsafe.objectFieldOffset(I.class.getDeclaredField("c"));
            f26129d = unsafe.objectFieldOffset(I.class.getDeclaredField("b"));
            f26130e = unsafe.objectFieldOffset(H.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
            f26131f = unsafe.objectFieldOffset(H.class.getDeclaredField("b"));
            f26126a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final A a(C c10, A a10) {
        A a11;
        do {
            a11 = c10.f26140c;
            if (a10 == a11) {
                break;
            }
        } while (!e(c10, a11, a10));
        return a11;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final H b(C c10) {
        H h8;
        H h10 = H.f26132c;
        do {
            h8 = c10.f26141d;
            if (h10 == h8) {
                break;
            }
        } while (!g(c10, h8, h10));
        return h8;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void c(H h8, H h10) {
        f26126a.putObject(h8, f26131f, h10);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void d(H h8, Thread thread) {
        f26126a.putObject(h8, f26130e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean e(C c10, A a10, A a11) {
        return L.a(f26126a, c10, f26127b, a10, a11);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean f(I i10, Object obj, Object obj2) {
        return L.a(f26126a, i10, f26129d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean g(I i10, H h8, H h10) {
        return L.a(f26126a, i10, f26128c, h8, h10);
    }
}
