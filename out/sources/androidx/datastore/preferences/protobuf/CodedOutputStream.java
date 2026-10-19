package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends AbstractC1316f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f17101b = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f17102c = g0.f17235e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1320j f17103a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static abstract class a extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f17104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17106f;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f17104d = bArr;
            this.f17105e = bArr.length;
        }

        public final void W(int i10) {
            int i11 = this.f17106f;
            int i12 = i11 + 1;
            this.f17106f = i12;
            byte[] bArr = this.f17104d;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f17106f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f17106f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f17106f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void X(long j) {
            int i10 = this.f17106f;
            int i11 = i10 + 1;
            this.f17106f = i11;
            byte[] bArr = this.f17104d;
            bArr[i10] = (byte) (j & 255);
            int i12 = i10 + 2;
            this.f17106f = i12;
            bArr[i11] = (byte) ((j >> 8) & 255);
            int i13 = i10 + 3;
            this.f17106f = i13;
            bArr[i12] = (byte) ((j >> 16) & 255);
            int i14 = i10 + 4;
            this.f17106f = i14;
            bArr[i13] = (byte) (255 & (j >> 24));
            int i15 = i10 + 5;
            this.f17106f = i15;
            bArr[i14] = (byte) (((int) (j >> 32)) & 255);
            int i16 = i10 + 6;
            this.f17106f = i16;
            bArr[i15] = (byte) (((int) (j >> 40)) & 255);
            int i17 = i10 + 7;
            this.f17106f = i17;
            bArr[i16] = (byte) (((int) (j >> 48)) & 255);
            this.f17106f = i10 + 8;
            bArr[i17] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void Y(int i10, int i11) {
            Z((i10 << 3) | i11);
        }

        public final void Z(int i10) {
            boolean z10 = CodedOutputStream.f17102c;
            byte[] bArr = this.f17104d;
            if (z10) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.f17106f;
                    this.f17106f = i11 + 1;
                    g0.m(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                int i12 = this.f17106f;
                this.f17106f = i12 + 1;
                g0.m(bArr, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                int i13 = this.f17106f;
                this.f17106f = i13 + 1;
                bArr[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            int i14 = this.f17106f;
            this.f17106f = i14 + 1;
            bArr[i14] = (byte) i10;
        }

        public final void a0(long j) {
            boolean z10 = CodedOutputStream.f17102c;
            byte[] bArr = this.f17104d;
            if (z10) {
                while ((j & (-128)) != 0) {
                    int i10 = this.f17106f;
                    this.f17106f = i10 + 1;
                    g0.m(bArr, i10, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i11 = this.f17106f;
                this.f17106f = i11 + 1;
                g0.m(bArr, i11, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i12 = this.f17106f;
                this.f17106f = i12 + 1;
                bArr[i12] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i13 = this.f17106f;
            this.f17106f = i13 + 1;
            bArr[i13] = (byte) j;
        }
    }

    public static class b extends CodedOutputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f17107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17109f;

        public b(int i10, byte[] bArr) {
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f17107d = bArr;
            this.f17109f = 0;
            this.f17108e = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(byte b10) throws IOException {
            try {
                byte[] bArr = this.f17107d;
                int i10 = this.f17109f;
                this.f17109f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(this.f17108e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i10, boolean z10) throws IOException {
            R(i10, 0);
            A(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i10, byte[] bArr) throws IOException {
            T(i10);
            W(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i10, ByteString byteString) throws IOException {
            R(i10, 2);
            E(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(ByteString byteString) throws IOException {
            T(byteString.size());
            byteString.A(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(int i10, int i11) throws IOException {
            R(i10, 5);
            G(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i10) throws IOException {
            try {
                byte[] bArr = this.f17107d;
                int i11 = this.f17109f;
                int i12 = i11 + 1;
                this.f17109f = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f17109f = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f17109f = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f17109f = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(this.f17108e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i10, long j) throws IOException {
            R(i10, 1);
            I(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) throws IOException {
            try {
                byte[] bArr = this.f17107d;
                int i10 = this.f17109f;
                int i11 = i10 + 1;
                this.f17109f = i11;
                bArr[i10] = (byte) (((int) j) & 255);
                int i12 = i10 + 2;
                this.f17109f = i12;
                bArr[i11] = (byte) (((int) (j >> 8)) & 255);
                int i13 = i10 + 3;
                this.f17109f = i13;
                bArr[i12] = (byte) (((int) (j >> 16)) & 255);
                int i14 = i10 + 4;
                this.f17109f = i14;
                bArr[i13] = (byte) (((int) (j >> 24)) & 255);
                int i15 = i10 + 5;
                this.f17109f = i15;
                bArr[i14] = (byte) (((int) (j >> 32)) & 255);
                int i16 = i10 + 6;
                this.f17109f = i16;
                bArr[i15] = (byte) (((int) (j >> 40)) & 255);
                int i17 = i10 + 7;
                this.f17109f = i17;
                bArr[i16] = (byte) (((int) (j >> 48)) & 255);
                this.f17109f = i10 + 8;
                bArr[i17] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(this.f17108e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(int i10, int i11) throws IOException {
            R(i10, 0);
            K(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i10) throws IOException {
            if (i10 >= 0) {
                T(i10);
            } else {
                V(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(int i10, I i11, X x10) throws IOException {
            R(i10, 2);
            T(((AbstractC1311a) i11).h(x10));
            x10.i(i11, this.f17103a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(I i10) throws IOException {
            T(i10.c());
            i10.e(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(int i10, I i11) throws IOException {
            R(1, 3);
            S(2, i10);
            R(3, 2);
            M(i11);
            R(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i10, ByteString byteString) throws IOException {
            R(1, 3);
            S(2, i10);
            D(3, byteString);
            R(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i10, String str) throws IOException {
            R(i10, 2);
            Q(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(String str) throws IOException {
            int i10 = this.f17109f;
            try {
                int iW = CodedOutputStream.w(str.length() * 3);
                int iW2 = CodedOutputStream.w(str.length());
                int i11 = this.f17108e;
                byte[] bArr = this.f17107d;
                if (iW2 == iW) {
                    int i12 = i10 + iW2;
                    this.f17109f = i12;
                    int iB = Utf8.f17175a.b(str, bArr, i12, i11 - i12);
                    this.f17109f = i10;
                    T((iB - i10) - iW2);
                    this.f17109f = iB;
                } else {
                    T(Utf8.b(str));
                    int i13 = this.f17109f;
                    this.f17109f = Utf8.f17175a.b(str, bArr, i13, i11 - i13);
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                this.f17109f = i10;
                z(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(int i10, int i11) throws IOException {
            T((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i10, int i11) throws IOException {
            R(i10, 0);
            T(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i10) throws IOException {
            boolean z10 = CodedOutputStream.f17102c;
            int i11 = this.f17108e;
            byte[] bArr = this.f17107d;
            if (z10 && !C1314d.a()) {
                int i12 = this.f17109f;
                if (i11 - i12 >= 5) {
                    if ((i10 & (-128)) == 0) {
                        this.f17109f = i12 + 1;
                        g0.m(bArr, i12, (byte) i10);
                        return;
                    }
                    this.f17109f = i12 + 1;
                    g0.m(bArr, i12, (byte) (i10 | 128));
                    int i13 = i10 >>> 7;
                    if ((i13 & (-128)) == 0) {
                        int i14 = this.f17109f;
                        this.f17109f = i14 + 1;
                        g0.m(bArr, i14, (byte) i13);
                        return;
                    }
                    int i15 = this.f17109f;
                    this.f17109f = i15 + 1;
                    g0.m(bArr, i15, (byte) (i13 | 128));
                    int i16 = i10 >>> 14;
                    if ((i16 & (-128)) == 0) {
                        int i17 = this.f17109f;
                        this.f17109f = i17 + 1;
                        g0.m(bArr, i17, (byte) i16);
                        return;
                    }
                    int i18 = this.f17109f;
                    this.f17109f = i18 + 1;
                    g0.m(bArr, i18, (byte) (i16 | 128));
                    int i19 = i10 >>> 21;
                    if ((i19 & (-128)) == 0) {
                        int i20 = this.f17109f;
                        this.f17109f = i20 + 1;
                        g0.m(bArr, i20, (byte) i19);
                        return;
                    } else {
                        int i21 = this.f17109f;
                        this.f17109f = i21 + 1;
                        g0.m(bArr, i21, (byte) (i19 | 128));
                        int i22 = this.f17109f;
                        this.f17109f = i22 + 1;
                        g0.m(bArr, i22, (byte) (i10 >>> 28));
                        return;
                    }
                }
            }
            while ((i10 & (-128)) != 0) {
                try {
                    int i23 = this.f17109f;
                    this.f17109f = i23 + 1;
                    bArr[i23] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(i11), 1), e10);
                }
            }
            int i24 = this.f17109f;
            this.f17109f = i24 + 1;
            bArr[i24] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(int i10, long j) throws IOException {
            R(i10, 0);
            V(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(long j) throws IOException {
            boolean z10 = CodedOutputStream.f17102c;
            int i10 = this.f17108e;
            byte[] bArr = this.f17107d;
            if (z10 && i10 - this.f17109f >= 10) {
                while ((j & (-128)) != 0) {
                    int i11 = this.f17109f;
                    this.f17109f = i11 + 1;
                    g0.m(bArr, i11, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i12 = this.f17109f;
                this.f17109f = i12 + 1;
                g0.m(bArr, i12, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i13 = this.f17109f;
                    this.f17109f = i13 + 1;
                    bArr[i13] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(i10), 1), e10);
                }
            }
            int i14 = this.f17109f;
            this.f17109f = i14 + 1;
            bArr[i14] = (byte) j;
        }

        public final void W(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f17107d, this.f17109f, i11);
                this.f17109f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17109f), Integer.valueOf(this.f17108e), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1316f
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            W(bArr, i10, i11);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final androidx.datastore.core.j.b f17110g;

        public c(androidx.datastore.core.j.b bVar, int i10) {
            super(i10);
            this.f17110g = bVar;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(byte b10) throws IOException {
            if (this.f17106f == this.f17105e) {
                b0();
            }
            int i10 = this.f17106f;
            this.f17106f = i10 + 1;
            this.f17104d[i10] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i10, boolean z10) throws IOException {
            c0(11);
            Y(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.f17106f;
            this.f17106f = i11 + 1;
            this.f17104d[i11] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i10, byte[] bArr) throws IOException {
            T(i10);
            d0(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(int i10, ByteString byteString) throws IOException {
            R(i10, 2);
            E(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(ByteString byteString) throws IOException {
            T(byteString.size());
            byteString.A(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(int i10, int i11) throws IOException {
            c0(14);
            Y(i10, 5);
            W(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i10) throws IOException {
            c0(4);
            W(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(int i10, long j) throws IOException {
            c0(18);
            Y(i10, 1);
            X(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(long j) throws IOException {
            c0(8);
            X(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(int i10, int i11) throws IOException {
            c0(20);
            Y(i10, 0);
            if (i11 >= 0) {
                Z(i11);
            } else {
                a0(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i10) throws IOException {
            if (i10 >= 0) {
                T(i10);
            } else {
                V(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(int i10, I i11, X x10) throws IOException {
            R(i10, 2);
            T(((AbstractC1311a) i11).h(x10));
            x10.i(i11, this.f17103a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(I i10) throws IOException {
            T(i10.c());
            i10.e(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void N(int i10, I i11) throws IOException {
            R(1, 3);
            S(2, i10);
            R(3, 2);
            M(i11);
            R(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void O(int i10, ByteString byteString) throws IOException {
            R(1, 3);
            S(2, i10);
            D(3, byteString);
            R(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void P(int i10, String str) throws IOException {
            R(i10, 2);
            Q(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Q(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.w(length);
                int i10 = iW + length;
                int i11 = this.f17105e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = Utf8.f17175a.b(str, bArr, 0, length);
                    T(iB);
                    d0(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f17106f) {
                    b0();
                }
                int iW2 = CodedOutputStream.w(str.length());
                int i12 = this.f17106f;
                byte[] bArr2 = this.f17104d;
                try {
                    try {
                        if (iW2 == iW) {
                            int i13 = i12 + iW2;
                            this.f17106f = i13;
                            int iB2 = Utf8.f17175a.b(str, bArr2, i13, i11 - i13);
                            this.f17106f = i12;
                            Z((iB2 - i12) - iW2);
                            this.f17106f = iB2;
                        } else {
                            int iB3 = Utf8.b(str);
                            Z(iB3);
                            this.f17106f = Utf8.f17175a.b(str, bArr2, this.f17106f, iB3);
                        }
                    } catch (Utf8.UnpairedSurrogateException e10) {
                        this.f17106f = i12;
                        throw e10;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                z(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void R(int i10, int i11) throws IOException {
            T((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void S(int i10, int i11) throws IOException {
            c0(20);
            Y(i10, 0);
            Z(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T(int i10) throws IOException {
            c0(5);
            Z(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U(int i10, long j) throws IOException {
            c0(20);
            Y(i10, 0);
            a0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V(long j) throws IOException {
            c0(10);
            a0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1316f
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            d0(bArr, i10, i11);
        }

        public final void b0() throws IOException {
            this.f17110g.write(this.f17104d, 0, this.f17106f);
            this.f17106f = 0;
        }

        public final void c0(int i10) throws IOException {
            if (this.f17105e - this.f17106f < i10) {
                b0();
            }
        }

        public final void d0(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f17106f;
            int i13 = this.f17105e;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f17104d;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f17106f += i11;
                return;
            }
            System.arraycopy(bArr, i10, bArr2, i12, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f17106f = i13;
            b0();
            if (i16 > i13) {
                this.f17110g.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, bArr2, 0, i16);
                this.f17106f = i16;
            }
        }
    }

    public static int b(int i10) {
        return u(i10) + 1;
    }

    public static int c(int i10, ByteString byteString) {
        return d(byteString) + u(i10);
    }

    public static int d(ByteString byteString) {
        int size = byteString.size();
        return w(size) + size;
    }

    public static int e(int i10) {
        return u(i10) + 8;
    }

    public static int f(int i10, int i11) {
        return l(i11) + u(i10);
    }

    public static int g(int i10) {
        return u(i10) + 4;
    }

    public static int h(int i10) {
        return u(i10) + 8;
    }

    public static int i(int i10) {
        return u(i10) + 4;
    }

    @Deprecated
    public static int j(int i10, I i11, X x10) {
        return ((AbstractC1311a) i11).h(x10) + (u(i10) * 2);
    }

    public static int k(int i10, int i11) {
        return l(i11) + u(i10);
    }

    public static int l(int i10) {
        if (i10 >= 0) {
            return w(i10);
        }
        return 10;
    }

    public static int m(int i10, long j) {
        return y(j) + u(i10);
    }

    public static int n(C1332w c1332w) {
        int iC;
        if (c1332w.f17285b != null) {
            iC = c1332w.f17285b.size();
        } else {
            iC = c1332w.f17284a != null ? c1332w.f17284a.c() : 0;
        }
        return w(iC) + iC;
    }

    public static int o(int i10) {
        return u(i10) + 4;
    }

    public static int p(int i10) {
        return u(i10) + 8;
    }

    public static int q(int i10, int i11) {
        return w((i11 >> 31) ^ (i11 << 1)) + u(i10);
    }

    public static int r(int i10, long j) {
        return y((j >> 63) ^ (j << 1)) + u(i10);
    }

    public static int s(int i10, String str) {
        return t(str) + u(i10);
    }

    public static int t(String str) {
        int length;
        try {
            length = Utf8.b(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(C1330u.f17280a).length;
        }
        return w(length) + length;
    }

    public static int u(int i10) {
        return w(i10 << 3);
    }

    public static int v(int i10, int i11) {
        return w(i11) + u(i10);
    }

    public static int w(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int x(int i10, long j) {
        return y(j) + u(i10);
    }

    public static int y(long j) {
        int i10;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j) != 0) {
            i10 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A(byte b10) throws IOException;

    public abstract void B(int i10, boolean z10) throws IOException;

    public abstract void C(int i10, byte[] bArr) throws IOException;

    public abstract void D(int i10, ByteString byteString) throws IOException;

    public abstract void E(ByteString byteString) throws IOException;

    public abstract void F(int i10, int i11) throws IOException;

    public abstract void G(int i10) throws IOException;

    public abstract void H(int i10, long j) throws IOException;

    public abstract void I(long j) throws IOException;

    public abstract void J(int i10, int i11) throws IOException;

    public abstract void K(int i10) throws IOException;

    public abstract void L(int i10, I i11, X x10) throws IOException;

    public abstract void M(I i10) throws IOException;

    public abstract void N(int i10, I i11) throws IOException;

    public abstract void O(int i10, ByteString byteString) throws IOException;

    public abstract void P(int i10, String str) throws IOException;

    public abstract void Q(String str) throws IOException;

    public abstract void R(int i10, int i11) throws IOException;

    public abstract void S(int i10, int i11) throws IOException;

    public abstract void T(int i10) throws IOException;

    public abstract void U(int i10, long j) throws IOException;

    public abstract void V(long j) throws IOException;

    public final void z(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f17101b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(C1330u.f17280a);
        try {
            T(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }
}
