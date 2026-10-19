package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.N2.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N2<MessageType extends N2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1887q2<MessageType, BuilderType> {
    private static Map<Object, N2<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected S3 zzb = S3.f25587f;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static abstract class a<MessageType extends N2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1880p2<MessageType, BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageType f25530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MessageType f25531c;

        public a(MessageType messagetype) {
            this.f25530b = messagetype;
            if (messagetype.u()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f25531c = (MessageType) messagetype.n(4);
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f25530b.n(5);
            aVar.f25531c = (MessageType) g();
            return aVar;
        }

        public final N2 f() {
            N2 n2G = g();
            n2G.getClass();
            boolean zC = true;
            byte bByteValue = ((Byte) n2G.n(1)).byteValue();
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zC = false;
                } else {
                    C3 c10 = C3.f25411c;
                    c10.getClass();
                    zC = c10.a(n2G.getClass()).c(n2G);
                    n2G.n(2);
                }
            }
            if (zC) {
                return n2G;
            }
            throw new zzmu();
        }

        public final N2 g() {
            if (!this.f25531c.u()) {
                return this.f25531c;
            }
            this.f25531c.s();
            return this.f25531c;
        }

        public final void h() {
            if (this.f25531c.u()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f25530b.n(4);
            MessageType messagetype2 = this.f25531c;
            C3 c10 = C3.f25411c;
            c10.getClass();
            c10.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.f25531c = messagetype;
        }

        public final void i(byte[] bArr, int i10, D2 d10) throws zzkb {
            if (!this.f25531c.u()) {
                MessageType messagetype = (MessageType) this.f25530b.n(4);
                MessageType messagetype2 = this.f25531c;
                C3 c10 = C3.f25411c;
                c10.getClass();
                c10.a(messagetype.getClass()).a(messagetype, messagetype2);
                this.f25531c = messagetype;
            }
            try {
                C3 c11 = C3.f25411c;
                MessageType messagetype3 = this.f25531c;
                c11.getClass();
                c11.a(messagetype3.getClass()).b(this.f25531c, bArr, 0, i10, new C1921v2(d10));
            } catch (zzkb e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkb.d();
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends N2<MessageType, BuilderType> implements InterfaceC1908t3 {
        protected G2<e> zzc = G2.f25456d;

        public final G2<e> v() {
            G2<e> g10 = this.zzc;
            if (g10.f25458b) {
                this.zzc = (G2) g10.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static class c<T extends N2<T, ?>> extends C1900s2<T> {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static class d<ContainingType extends InterfaceC1894r3, Type> extends A8.A {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static final class e implements I2<e> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.I2
        public final zzng x() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.I2
        public final zznq y() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.I2
        public final boolean z() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
    public static final enum f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25532a = {1, 2, 3, 4, 5, 6, 7};
    }

    public static <T extends N2<?, ?>> T k(Class<T> cls) {
        N2<?, ?> n10 = zzc.get(cls);
        if (n10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n10 = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (n10 == null) {
            n10 = (T) ((N2) V3.b(cls)).n(6);
            if (n10 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, n10);
        }
        return (T) n10;
    }

    public static <E> V2<E> l(V2<E> v10) {
        int size = v10.size();
        return v10.c(size == 0 ? 10 : size << 1);
    }

    public static C1811f3 m(S2 s10) {
        int size = s10.size();
        int i10 = size == 0 ? 10 : size << 1;
        C1811f3 c1811f3 = (C1811f3) s10;
        if (i10 >= c1811f3.f25706d) {
            return new C1811f3(Arrays.copyOf(c1811f3.f25705c, i10), c1811f3.f25706d, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object o(Method method, InterfaceC1894r3 interfaceC1894r3, Object... objArr) {
        try {
            return method.invoke(interfaceC1894r3, objArr);
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

    public static <T extends N2<?, ?>> void p(Class<T> cls, T t8) {
        t8.t();
        zzc.put(cls, t8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1894r3
    public final void a(zzja.a aVar) throws IOException {
        C3 c10 = C3.f25411c;
        c10.getClass();
        E3 e3A = c10.a(getClass());
        B2 b10 = aVar.f26053c;
        if (b10 == null) {
            b10 = new B2(aVar);
        }
        e3A.e(this, b10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1894r3
    public final /* synthetic */ a b() {
        return (a) n(5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1894r3
    public final int c() {
        return f(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1908t3
    public final /* synthetic */ N2 e() {
        return (N2) n(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3 c10 = C3.f25411c;
        c10.getClass();
        return c10.a(getClass()).f(this, (N2) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1887q2
    public final int f(E3 e10) {
        int i10;
        int i11;
        if (u()) {
            if (e10 == null) {
                C3 c10 = C3.f25411c;
                c10.getClass();
                i11 = c10.a(getClass()).i(this);
            } else {
                i11 = e10.i(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(J4.i.b(i11, "serialized size must be non-negative, was "));
        }
        if (h() != Integer.MAX_VALUE) {
            return h();
        }
        if (e10 == null) {
            C3 c11 = C3.f25411c;
            c11.getClass();
            i10 = c11.a(getClass()).i(this);
        } else {
            i10 = e10.i(this);
        }
        j(i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1887q2
    public final int h() {
        return this.zzd & BrazeLogger.SUPPRESS;
    }

    public final int hashCode() {
        if (u()) {
            C3 c10 = C3.f25411c;
            c10.getClass();
            return c10.a(getClass()).g(this);
        }
        if (this.zza == 0) {
            C3 c11 = C3.f25411c;
            c11.getClass();
            this.zza = c11.a(getClass()).g(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1887q2
    public final void j(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(J4.i.b(i10, "serialized size must be non-negative, was "));
        }
        this.zzd = (i10 & BrazeLogger.SUPPRESS) | (this.zzd & Integer.MIN_VALUE);
    }

    public abstract Object n(int i10);

    public final <MessageType extends N2<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType q() {
        return (BuilderType) n(5);
    }

    public final BuilderType r() {
        BuilderType buildertype = (BuilderType) n(5);
        MessageType messagetype = buildertype.f25530b;
        if (!messagetype.equals(this)) {
            if (!buildertype.f25531c.u()) {
                MessageType messagetype2 = (MessageType) messagetype.n(4);
                MessageType messagetype3 = buildertype.f25531c;
                C3 c10 = C3.f25411c;
                c10.getClass();
                c10.a(messagetype2.getClass()).a(messagetype2, messagetype3);
                buildertype.f25531c = messagetype2;
            }
            MessageType messagetype4 = buildertype.f25531c;
            C3 c11 = C3.f25411c;
            c11.getClass();
            c11.a(messagetype4.getClass()).a(messagetype4, this);
        }
        return buildertype;
    }

    public final void s() {
        C3 c10 = C3.f25411c;
        c10.getClass();
        c10.a(getClass()).d(this);
        t();
    }

    public final void t() {
        this.zzd &= BrazeLogger.SUPPRESS;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = C1901s3.f25842a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        C1901s3.b(this, sb2, 0);
        return sb2.toString();
    }

    public final boolean u() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
