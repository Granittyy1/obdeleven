package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f17095b = new LiteralByteString(C1330u.f17281b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f17096c;
    private int hash = 0;

    public static abstract class LeafByteString extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C1317g(this);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void A(CodedOutputStream codedOutputStream) throws IOException {
            codedOutputStream.a(this.bytes, B(), size());
        }

        public int B() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte d(int i10) {
            return this.bytes[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iS = s();
            int iS2 = literalByteString.s();
            if (iS != 0 && iS2 != 0 && iS != iS2) {
                return false;
            }
            int size = size();
            if (size > literalByteString.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > literalByteString.size()) {
                StringBuilder sbE = A8.f.e(size, "Ran off end of other: 0, ", ", ");
                sbE.append(literalByteString.size());
                throw new IllegalArgumentException(sbE.toString());
            }
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int iB = B() + size;
            int iB2 = B();
            int iB3 = literalByteString.B();
            while (iB2 < iB) {
                if (bArr[iB2] != bArr2[iB3]) {
                    return false;
                }
                iB2++;
                iB3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte g(int i10) {
            return this.bytes[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean k() {
            int iB = B();
            return Utf8.f17175a.c(this.bytes, iB, size() + iB) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int q(int i10, int i11) {
            byte[] bArr = this.bytes;
            int iB = B();
            Charset charset = C1330u.f17280a;
            for (int i12 = iB; i12 < iB + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String v() {
            return new String(this.bytes, B(), size(), C1330u.f17280a);
        }
    }

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C1317g c1317g = (C1317g) this;
            int i10 = c1317g.f17228b;
            if (i10 >= c1317g.f17229c) {
                throw new NoSuchElementException();
            }
            c1317g.f17228b = i10 + 1;
            return Byte.valueOf(c1317g.f17230d.g(i10));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public interface c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public static final class d implements c {
        @Override // androidx.datastore.preferences.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f17096c = C1314d.a() ? new d() : new b();
    }

    public static ByteString e(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        int length = bArr.length;
        if (((i12 - i10) | i10 | i12 | (length - i12)) >= 0) {
            return new LiteralByteString(f17096c.a(bArr, i10, i11));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(J4.i.c(i10, "Beginning index: ", " < 0"));
        }
        if (i12 < i10) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A8.f.d(i12, length, "End index: ", " >= "));
    }

    public abstract void A(CodedOutputStream codedOutputStream) throws IOException;

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i10);

    public final int hashCode() {
        int iQ = this.hash;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.hash = iQ;
        }
        return iQ;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C1317g(this);
    }

    public abstract boolean k();

    public abstract int q(int i10, int i11);

    public final int s() {
        return this.hash;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String v();
}
