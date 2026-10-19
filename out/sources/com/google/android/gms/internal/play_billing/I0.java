package com.google.android.gms.internal.play_billing;

import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.I0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I0<MessageType extends I0<MessageType, BuilderType>, BuilderType extends E0<MessageType, BuilderType>> extends AbstractC1972h0<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2020x1 zzc = C2020x1.f26298f;

    public static final boolean f(I0 i10, boolean z10) {
        byte bByteValue = ((Byte) i10.g(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = C1985l1.f26210c.a(i10.getClass()).e(i10);
        if (z10) {
            i10.g(2);
        }
        return zE;
    }

    public static I0 j(Class cls) {
        Map map = zzb;
        I0 i10 = (I0) map.get(cls);
        if (i10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i10 = (I0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (i10 == null) {
            i10 = (I0) ((I0) D1.h(cls)).g(6);
            if (i10 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, i10);
        }
        return i10;
    }

    public static Object k(Method method, InterfaceC1967f1 interfaceC1967f1, Object... objArr) {
        try {
            return method.invoke(interfaceC1967f1, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void n(Class cls, I0 i10) {
        i10.m();
        zzb.put(cls, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1970g1
    public final /* synthetic */ I0 B() {
        return (I0) g(6);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1967f1
    public final void a(C1999q0 c1999q0) throws IOException {
        InterfaceC1994o1 interfaceC1994o1A = C1985l1.f26210c.a(getClass());
        C2004s0 c2004s0 = c1999q0.f26245b;
        if (c2004s0 == null) {
            c2004s0 = new C2004s0(c1999q0);
        }
        interfaceC1994o1A.a(this, c2004s0);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1967f1
    public final /* synthetic */ InterfaceC1964e1 b() {
        return (E0) g(5);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1967f1
    public final int d() {
        int iC;
        if (p()) {
            iC = C1985l1.f26210c.a(getClass()).c(this);
            if (iC < 0) {
                throw new IllegalStateException(J4.i.b(iC, "serialized size must be non-negative, was "));
            }
        } else {
            iC = this.zzd & BrazeLogger.SUPPRESS;
            if (iC == Integer.MAX_VALUE) {
                iC = C1985l1.f26210c.a(getClass()).c(this);
                if (iC < 0) {
                    throw new IllegalStateException(J4.i.b(iC, "serialized size must be non-negative, was "));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iC;
            }
        }
        return iC;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1972h0
    public final int e(InterfaceC1994o1 interfaceC1994o1) {
        if (p()) {
            int iC = interfaceC1994o1.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(J4.i.b(iC, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & BrazeLogger.SUPPRESS;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iC2 = interfaceC1994o1.c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(J4.i.b(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1985l1.f26210c.a(getClass()).f(this, (I0) obj);
    }

    public abstract Object g(int i10);

    public final E0 h() {
        return (E0) g(5);
    }

    public final int hashCode() {
        if (p()) {
            return C1985l1.f26210c.a(getClass()).d(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iD = C1985l1.f26210c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final E0 i() {
        E0 e10 = (E0) g(5);
        if (!e10.f26123b.equals(this)) {
            if (!e10.f26124c.p()) {
                I0 i10 = (I0) e10.f26123b.g(4);
                C1985l1.f26210c.a(i10.getClass()).g(i10, e10.f26124c);
                e10.f26124c = i10;
            }
            I0 i11 = e10.f26124c;
            C1985l1.f26210c.a(i11.getClass()).g(i11, this);
        }
        return e10;
    }

    public final void l() {
        C1985l1.f26210c.a(getClass()).b(this);
        m();
    }

    public final void m() {
        this.zzd &= BrazeLogger.SUPPRESS;
    }

    public final void o() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | BrazeLogger.SUPPRESS;
    }

    public final boolean p() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = C1973h1.f26185a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        C1973h1.c(this, sb2, 0);
        return sb2.toString();
    }
}
