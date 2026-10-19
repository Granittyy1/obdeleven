package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1327q.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1327q<T extends a<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1327q f17271d = new C1327q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f17272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17274c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* JADX INFO: compiled from: FieldSet.java */
    public interface a<T extends a<T>> extends Comparable<T> {
        WireFormat$JavaType A();
    }

    public C1327q() {
        this.f17272a = new Z(16);
    }

    public static int b(WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        int iC;
        int iW;
        int iY = 1;
        int iU = CodedOutputStream.u(i10);
        if (wireFormat$FieldType == WireFormat$FieldType.f17181c) {
            iU *= 2;
        }
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f17101b;
                iY = 8;
                return iY + iU;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f17101b;
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
                Logger logger3 = CodedOutputStream.f17101b;
                iY = 8;
                return iY + iU;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f17101b;
                iY = 4;
                return iY + iU;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f17101b;
                return iY + iU;
            case 8:
                iY = obj instanceof ByteString ? CodedOutputStream.d((ByteString) obj) : CodedOutputStream.t((String) obj);
                return iY + iU;
            case 9:
                Logger logger6 = CodedOutputStream.f17101b;
                iY = ((I) obj).c();
                return iY + iU;
            case 10:
                if (obj instanceof C1331v) {
                    iY = CodedOutputStream.n((C1331v) obj);
                } else {
                    Logger logger7 = CodedOutputStream.f17101b;
                    iC = ((I) obj).c();
                    iW = CodedOutputStream.w(iC);
                    iY = iW + iC;
                }
                return iY + iU;
            case 11:
                if (obj instanceof ByteString) {
                    iY = CodedOutputStream.d((ByteString) obj);
                } else {
                    Logger logger8 = CodedOutputStream.f17101b;
                    iC = ((byte[]) obj).length;
                    iW = CodedOutputStream.w(iC);
                    iY = iW + iC;
                }
                return iY + iU;
            case 12:
                iY = CodedOutputStream.w(((Integer) obj).intValue());
                return iY + iU;
            case 13:
                iY = obj instanceof C1330u.a ? CodedOutputStream.l(((C1330u.a) obj).a()) : CodedOutputStream.l(((Integer) obj).intValue());
                return iY + iU;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f17101b;
                iY = 4;
                return iY + iU;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f17101b;
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

    public static void l(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.f17181c) {
            codedOutputStream.R(i10, 3);
            ((I) obj).e(codedOutputStream);
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
                ((I) obj).e(codedOutputStream);
                break;
            case 10:
                codedOutputStream.M((I) obj);
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
                if (!(obj instanceof C1330u.a)) {
                    codedOutputStream.K(((Integer) obj).intValue());
                } else {
                    codedOutputStream.K(((C1330u.a) obj).a());
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
    public final C1327q<T> clone() {
        Z z10;
        C1327q<T> c1327q = new C1327q<>();
        int i10 = 0;
        while (true) {
            z10 = this.f17272a;
            if (i10 >= z10.f17199c.size()) {
                break;
            }
            Map.Entry<Object, Object> entryC = z10.c(i10);
            c1327q.k((a) entryC.getKey(), entryC.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : z10.e()) {
            c1327q.k((a) entry.getKey(), entry.getValue());
        }
        c1327q.f17274c = this.f17274c;
        return c1327q;
    }

    public final int e() {
        Z z10;
        int i10 = 0;
        int iC = 0;
        while (true) {
            z10 = this.f17272a;
            if (i10 >= z10.f17199c.size()) {
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
        if (obj instanceof C1327q) {
            return this.f17272a.equals(((C1327q) obj).f17272a);
        }
        return false;
    }

    public final boolean f() {
        return this.f17272a.isEmpty();
    }

    public final boolean g() {
        Z z10 = this.f17272a;
        if (z10.f17199c.size() > 0) {
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
        return this.f17272a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> i() {
        boolean z10 = this.f17274c;
        Z z11 = this.f17272a;
        if (!z10) {
            return ((a0.d) z11.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((a0.d) z11.entrySet()).iterator();
        C1331v.b bVar = new C1331v.b();
        bVar.f17283b = it;
        return bVar;
    }

    public final void j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1331v) {
            ((C1331v) value).a(null);
        }
        key.getClass();
        key.A();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final void k(T t8, Object obj) {
        t8.getClass();
        Charset charset = C1330u.f17280a;
        obj.getClass();
        boolean z10 = false;
        switch (r1.a()) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    z10 = true;
                }
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof C1330u.a)) {
                    z10 = true;
                }
                break;
            case MESSAGE:
                if ((obj instanceof I) || (obj instanceof C1331v)) {
                    z10 = true;
                }
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C1331v) {
            this.f17274c = true;
        }
        this.f17272a.put(t8, obj);
    }

    public C1327q(int i10) {
        int i11 = a0.f17197h;
        Z z10 = new Z(0);
        this.f17272a = z10;
        if (!this.f17273b) {
            z10.h();
            this.f17273b = true;
        }
        if (this.f17273b) {
            return;
        }
        z10.h();
        this.f17273b = true;
    }
}
