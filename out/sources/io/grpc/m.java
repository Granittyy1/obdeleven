package io.grpc;

import A8.A;
import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f37780c = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f37781d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BaseEncoding f37782e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f37783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37784b;

    /* JADX INFO: compiled from: Metadata.java */
    public static class b<T> extends d<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c<T> f37785e;

        public b(String str, c cVar) {
            super(cVar, str, false);
            if (str.endsWith("-bin")) {
                throw new IllegalArgumentException(A.h("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            }
            A8.p.j(cVar, "marshaller");
            this.f37785e = cVar;
        }

        @Override // io.grpc.m.d
        public final T a(byte[] bArr) {
            return this.f37785e.b(new String(bArr, com.google.common.base.b.f27790a));
        }

        @Override // io.grpc.m.d
        public final byte[] b(T t8) {
            String strA = this.f37785e.a(t8);
            A8.p.j(strA, "null marshaller.toAsciiString()");
            return strA.getBytes(com.google.common.base.b.f27790a);
        }
    }

    /* JADX INFO: compiled from: Metadata.java */
    public interface c<T> {
        String a(T t8);

        T b(String str);
    }

    /* JADX INFO: compiled from: Metadata.java */
    public static abstract class d<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final BitSet f37786d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f37788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f37789c;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            f37786d = bitSet;
        }

        public d(Object obj, String str, boolean z10) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            A8.p.j(lowerCase, "name");
            A8.p.f("token must have at least 1 tchar", !lowerCase.isEmpty());
            if (lowerCase.equals("connection")) {
                m.f37780c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < lowerCase.length(); i10++) {
                char cCharAt = lowerCase.charAt(i10);
                if ((!z10 || cCharAt != ':' || i10 != 0) && !f37786d.get(cCharAt)) {
                    throw new IllegalArgumentException(A.h("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                }
            }
            this.f37787a = lowerCase;
            this.f37788b = lowerCase.getBytes(com.google.common.base.b.f27790a);
            this.f37789c = obj;
        }

        public abstract T a(byte[] bArr);

        public abstract byte[] b(T t8);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f37787a.equals(((d) obj).f37787a);
        }

        public final int hashCode() {
            return this.f37787a.hashCode();
        }

        public final String toString() {
            return Q8.d.a(new StringBuilder("Key{name='"), this.f37787a, "'}");
        }
    }

    /* JADX INFO: compiled from: Metadata.java */
    public static final class e<T> {
        public e() {
            throw null;
        }

        public final byte[] a() {
            synchronized (this) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Metadata.java */
    public static final class f<T> extends d<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g<T> f37790e;

        public f(String str, boolean z10, g gVar) {
            super(gVar, str, z10);
            if (str.endsWith("-bin")) {
                throw new IllegalArgumentException(A.h("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            }
            this.f37790e = gVar;
        }

        @Override // io.grpc.m.d
        public final T a(byte[] bArr) {
            return this.f37790e.b(bArr);
        }

        @Override // io.grpc.m.d
        public final byte[] b(T t8) {
            byte[] bArrA = this.f37790e.a(t8);
            A8.p.j(bArrA, "null marshaller.toAsciiString()");
            return bArrA;
        }
    }

    /* JADX INFO: compiled from: Metadata.java */
    public interface g<T> {
        byte[] a(T t8);

        T b(byte[] bArr);
    }

    static {
        BaseEncoding.c cVar = BaseEncoding.f27996a;
        Character ch = cVar.f28009d;
        BaseEncoding.c cVarG = cVar;
        if (ch != null) {
            cVarG = cVar.g(cVar.f28008c, null);
        }
        f37782e = cVarG;
    }

    public final <T> void a(d<T> dVar) {
        if (this.f37784b == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f37784b;
            if (i10 >= i12) {
                Arrays.fill(this.f37783a, i11 * 2, i12 * 2, (Object) null);
                this.f37784b = i11;
                return;
            }
            int i13 = i10 * 2;
            if (!Arrays.equals(dVar.f37788b, (byte[]) this.f37783a[i13])) {
                Object[] objArr = this.f37783a;
                int i14 = i11 * 2;
                objArr[i14] = (byte[]) objArr[i13];
                Object obj = objArr[i13 + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f37783a[i14 + 1] = obj;
                i11++;
            }
            i10++;
        }
    }

    public final void b(int i10) {
        Object[] objArr = new Object[i10];
        int i11 = this.f37784b;
        if (i11 != 0) {
            System.arraycopy(this.f37783a, 0, objArr, 0, i11 * 2);
        }
        this.f37783a = objArr;
    }

    public final <T> T c(d<T> dVar) {
        for (int i10 = this.f37784b - 1; i10 >= 0; i10--) {
            int i11 = i10 * 2;
            if (Arrays.equals(dVar.f37788b, (byte[]) this.f37783a[i11])) {
                Object obj = this.f37783a[i11 + 1];
                if (obj instanceof byte[]) {
                    return dVar.a((byte[]) obj);
                }
                e eVar = (e) obj;
                eVar.getClass();
                return dVar.a(eVar.a());
            }
        }
        return null;
    }

    public final void d(m mVar) {
        int i10 = mVar.f37784b;
        if (i10 == 0) {
            return;
        }
        Object[] objArr = this.f37783a;
        int length = objArr != null ? objArr.length : 0;
        int i11 = this.f37784b;
        int i12 = length - (i11 * 2);
        if (i11 == 0 || i12 < i10 * 2) {
            b((i10 * 2) + (i11 * 2));
        }
        System.arraycopy(mVar.f37783a, 0, this.f37783a, this.f37784b * 2, mVar.f37784b * 2);
        this.f37784b += mVar.f37784b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final <T> void e(d<T> dVar, T t8) {
        A8.p.j(dVar, "key");
        A8.p.j(t8, "value");
        int i10 = this.f37784b;
        int i11 = i10 * 2;
        if (i11 == 0) {
            b(Math.max(i10 * 4, 8));
        } else {
            Object[] objArr = this.f37783a;
            if (i11 == (objArr != null ? objArr.length : 0)) {
                b(Math.max(i10 * 4, 8));
            }
        }
        int i12 = this.f37784b;
        this.f37783a[i12 * 2] = dVar.f37788b;
        this.f37783a[(i12 * 2) + 1] = dVar.b(t8);
        this.f37784b++;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f37784b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            int i11 = i10 * 2;
            byte[] bArr = (byte[]) this.f37783a[i11];
            Charset charset = com.google.common.base.b.f27790a;
            String str = new String(bArr, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f37783a[i11 + 1];
                sb2.append(f37782e.c(obj instanceof byte[] ? (byte[]) obj : ((e) obj).a()));
            } else {
                Object obj2 = this.f37783a[i11 + 1];
                sb2.append(new String(obj2 instanceof byte[] ? (byte[]) obj2 : ((e) obj2).a(), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: compiled from: Metadata.java */
    public class a implements c<String> {
        @Override // io.grpc.m.c
        public final String a(String str) {
            return str;
        }

        @Override // io.grpc.m.c
        public final String b(String str) {
            return str;
        }
    }
}
