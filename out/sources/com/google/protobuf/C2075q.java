package com.google.protobuf;

import com.google.protobuf.C2075q.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2075q<T extends a<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2075q f29190d = new C2075q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f29191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29193c;

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    /* JADX INFO: compiled from: FieldSet.java */
    public interface a<T extends a<T>> extends Comparable<T> {
        WireFormat$JavaType A();
    }

    public C2075q() {
        this.f29191a = new Z(16);
    }

    public static int b(WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        int iC;
        int iW;
        int iY = 1;
        int iU = CodedOutputStream.u(i10);
        if (wireFormat$FieldType == WireFormat$FieldType.f29100d) {
            iU *= 2;
        }
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f29012b;
                iY = 8;
                return iY + iU;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f29012b;
                iY = 4;
                return iY + iU;
            case 2:
                iY = CodedOutputStream.y(((Long) obj).longValue());
                return iY + iU;
            case 3:
                iY = CodedOutputStream.y(((Long) obj).longValue());
                return iY + iU;
            case 4:
                iY = CodedOutputStream.l(((Integer) obj).intValue());
                return iY + iU;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f29012b;
                iY = 8;
                return iY + iU;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f29012b;
                iY = 4;
                return iY + iU;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f29012b;
                return iY + iU;
            case 8:
                iY = obj instanceof ByteString ? CodedOutputStream.d((ByteString) obj) : CodedOutputStream.t((String) obj);
                return iY + iU;
            case 9:
                Logger logger6 = CodedOutputStream.f29012b;
                iY = ((J) obj).c();
                return iY + iU;
            case 10:
                if (obj instanceof C2080w) {
                    iY = CodedOutputStream.n((C2080w) obj);
                } else {
                    Logger logger7 = CodedOutputStream.f29012b;
                    iC = ((J) obj).c();
                    iW = CodedOutputStream.w(iC);
                    iY = iW + iC;
                }
                return iY + iU;
            case 11:
                if (obj instanceof ByteString) {
                    iY = CodedOutputStream.d((ByteString) obj);
                } else {
                    Logger logger8 = CodedOutputStream.f29012b;
                    iC = ((byte[]) obj).length;
                    iW = CodedOutputStream.w(iC);
                    iY = iW + iC;
                }
                return iY + iU;
            case 12:
                iY = CodedOutputStream.w(((Integer) obj).intValue());
                return iY + iU;
            case 13:
                iY = obj instanceof C2078u.a ? CodedOutputStream.l(((C2078u.a) obj).a()) : CodedOutputStream.l(((Integer) obj).intValue());
                return iY + iU;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f29012b;
                iY = 4;
                return iY + iU;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f29012b;
                iY = 8;
                return iY + iU;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iY = CodedOutputStream.w((iIntValue >> 31) ^ (iIntValue << 1));
                return iY + iU;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iY = CodedOutputStream.y((jLongValue >> 63) ^ (jLongValue << 1));
                return iY + iU;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.A();
        throw null;
    }

    public static <T extends a<T>> boolean h(Map.Entry<T, Object> entry) {
        entry.getKey().A();
        throw null;
    }

    public static void m(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.f29100d) {
            codedOutputStream.R(i10, 3);
            ((J) obj).g(codedOutputStream);
            codedOutputStream.R(i10, 4);
            return;
        }
        codedOutputStream.R(i10, wireFormat$FieldType.b());
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                codedOutputStream.I(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.G(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.K(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.I(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.G(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.A(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.Q((String) obj);
                } else {
                    codedOutputStream.E((ByteString) obj);
                }
                break;
            case 9:
                ((J) obj).g(codedOutputStream);
                break;
            case 10:
                codedOutputStream.M((J) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.C(bArr.length, bArr);
                } else {
                    codedOutputStream.E((ByteString) obj);
                }
                break;
            case 12:
                codedOutputStream.T(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof C2078u.a)) {
                    codedOutputStream.K(((Integer) obj).intValue());
                } else {
                    codedOutputStream.K(((C2078u.a) obj).a());
                }
                break;
            case 14:
                codedOutputStream.G(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.I(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2075q<T> clone() {
        C2075q<T> c2075q = new C2075q<>();
        Z z10 = this.f29191a;
        if (z10.f29118c.size() > 0) {
            Map.Entry<Object, Object> entryC = z10.c(0);
            c2075q.l((a) entryC.getKey(), entryC.getValue());
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
        if (!it.hasNext()) {
            c2075q.f29193c = this.f29193c;
            return c2075q;
        }
        Map.Entry<Object, Object> next = it.next();
        c2075q.l((a) next.getKey(), next.getValue());
        throw null;
    }

    public final int e() {
        Z z10;
        int i10 = 0;
        int iC = 0;
        while (true) {
            z10 = this.f29191a;
            if (i10 >= z10.f29118c.size()) {
                break;
            }
            Map.Entry<Object, Object> entryC = z10.c(i10);
            iC += c((a) entryC.getKey(), entryC.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : z10.e()) {
            iC += c((a) entry.getKey(), entry.getValue());
        }
        return iC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2075q) {
            return this.f29191a.equals(((C2075q) obj).f29191a);
        }
        return false;
    }

    public final boolean f() {
        return this.f29191a.isEmpty();
    }

    public final boolean g() {
        Z z10 = this.f29191a;
        if (z10.f29118c.size() > 0) {
            h(z10.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
        if (!it.hasNext()) {
            return true;
        }
        h(it.next());
        throw null;
    }

    public final int hashCode() {
        return this.f29191a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> i() {
        boolean z10 = this.f29193c;
        Z z11 = this.f29191a;
        if (!z10) {
            return ((a0.d) z11.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((a0.d) z11.entrySet()).iterator();
        C2080w.b bVar = new C2080w.b();
        bVar.f29203b = it;
        return bVar;
    }

    public final void j() {
        if (this.f29192b) {
            return;
        }
        int i10 = 0;
        while (true) {
            Z z10 = this.f29191a;
            if (i10 >= z10.f29118c.size()) {
                z10.h();
                this.f29192b = true;
                return;
            }
            Map.Entry<Object, Object> entryC = z10.c(i10);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) entryC.getValue();
                generatedMessageLite.getClass();
                U u10 = U.f29087c;
                u10.getClass();
                u10.a(generatedMessageLite.getClass()).b(generatedMessageLite);
                generatedMessageLite.C();
            }
            i10++;
        }
    }

    public final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2080w) {
            ((C2080w) value).a(null);
        }
        key.getClass();
        key.A();
        throw null;
    }

    public final void l(T t8, Object obj) {
        t8.getClass();
        t8.getClass();
        Charset charset = C2078u.f29200a;
        obj.getClass();
        throw null;
    }

    public C2075q(int i10) {
        int i11 = a0.f29116h;
        this.f29191a = new Z(0);
        j();
        j();
    }
}
