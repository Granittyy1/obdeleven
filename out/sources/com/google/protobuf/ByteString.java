package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f29007b = new LiteralByteString(C2078u.f29201b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f29008c;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.e(i10, i10 + i11, bArr.length);
            this.bytesOffset = i10;
            this.bytesLength = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public final int G() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte d(int i10) {
            int i11 = this.bytesLength;
            if (((i11 - (i10 + 1)) | i10) >= 0) {
                return this.bytes[this.bytesOffset + i10];
            }
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(J4.i.b(i10, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A8.f.d(i10, i11, "Index > length: ", ", "));
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte k(int i10) {
            return this.bytes[this.bytesOffset + i10];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            byte[] bArr;
            int i10 = this.bytesLength;
            if (i10 == 0) {
                bArr = C2078u.f29201b;
            } else {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(this.bytes, this.bytesOffset, bArr2, 0, i10);
                bArr = bArr2;
            }
            return new LiteralByteString(bArr);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString A(int i10) {
            int iE = ByteString.e(0, i10, size());
            return iE == 0 ? ByteString.f29007b : new BoundedByteString(this.bytes, G(), iE);
        }

        @Override // com.google.protobuf.ByteString
        public final String B() {
            return new String(this.bytes, G(), size(), C2078u.f29200a);
        }

        @Override // com.google.protobuf.ByteString
        public final void C(CodedOutputStream codedOutputStream) throws IOException {
            codedOutputStream.a(this.bytes, G(), size());
        }

        public int G() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte d(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.protobuf.ByteString
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
            int iV = v();
            int iV2 = literalByteString.v();
            if (iV != 0 && iV2 != 0 && iV != iV2) {
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
            int iG = G() + size;
            int iG2 = G();
            int iG3 = literalByteString.G();
            while (iG2 < iG) {
                if (bArr[iG2] != bArr2[iG3]) {
                    return false;
                }
                iG2++;
                iG3++;
            }
            return true;
        }

        @Override // com.google.protobuf.ByteString
        public byte k(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean q() {
            int iG = G();
            return Utf8.f29090a.c(this.bytes, iG, size() + iG) == 0;
        }

        @Override // com.google.protobuf.ByteString
        public final int s(int i10, int i11) {
            byte[] bArr = this.bytes;
            int iG = G();
            Charset charset = C2078u.f29200a;
            for (int i12 = iG; i12 < iG + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C2065g c2065g = (C2065g) this;
            int i10 = c2065g.f29148b;
            if (i10 >= c2065g.f29149c) {
                throw new NoSuchElementException();
            }
            c2065g.f29148b = i10 + 1;
            return Byte.valueOf(c2065g.f29150d.k(i10));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // com.google.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public interface c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public static final class d implements c {
        @Override // com.google.protobuf.ByteString.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f29008c = C2062d.a() ? new d() : new b();
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(J4.i.c(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A8.f.d(i11, i12, "End index: ", " >= "));
    }

    public static ByteString g(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new LiteralByteString(f29008c.a(bArr, i10, i11));
    }

    public abstract ByteString A(int i10);

    public abstract String B();

    public abstract void C(CodedOutputStream codedOutputStream) throws IOException;

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iS = this.hash;
        if (iS == 0) {
            int size = size();
            iS = s(size, size);
            if (iS == 0) {
                iS = 1;
            }
            this.hash = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new C2065g(this);
    }

    public abstract byte k(int i10);

    public abstract boolean q();

    public abstract int s(int i10, int i11);

    public abstract int size();

    public final String toString() {
        String strH;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strH = S4.o.h(this);
        } else {
            strH = S4.o.h(A(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return Q8.d.a(sb2, strH, "\">");
    }

    public final int v() {
        return this.hash;
    }
}
