package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1318h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17240b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17241c = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1319i f17242d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class a extends AbstractC1318h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f17243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f17247i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f17248k = BrazeLogger.SUPPRESS;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f17243e = bArr;
            this.f17244f = i11 + i10;
            this.f17246h = i10;
            this.f17247i = i10;
        }

        public final long A() throws IOException {
            int i10 = this.f17246h;
            if (this.f17244f - i10 < 8) {
                throw InvalidProtocolBufferException.g();
            }
            this.f17246h = i10 + 8;
            byte[] bArr = this.f17243e;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public final int B() throws IOException {
            int i10;
            int i11 = this.f17246h;
            int i12 = this.f17244f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f17243e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f17246h = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f17246h = i14;
                    return i10;
                }
            }
            return (int) D();
        }

        public final long C() throws IOException {
            long j;
            long j10;
            long j11;
            long j12;
            int i10 = this.f17246h;
            int i11 = this.f17244f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f17243e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f17246h = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j12 = (-2080896) ^ i18;
                            } else {
                                long j13 = i18;
                                i13 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i17]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i13]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j = j11 ^ j14;
                            }
                            i13 = i17;
                            j = j12;
                        }
                    }
                    this.f17246h = i13;
                    return j;
                }
            }
            return D();
        }

        public final long D() throws IOException {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f17246h;
                if (i11 == this.f17244f) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f17246h = i11 + 1;
                byte b10 = this.f17243e[i11];
                j |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void E() {
            int i10 = this.f17244f + this.f17245g;
            this.f17244f = i10;
            int i11 = i10 - this.f17247i;
            int i12 = this.f17248k;
            if (i11 <= i12) {
                this.f17245g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f17245g = i13;
            this.f17244f = i10 - i13;
        }

        public final void F(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f17244f;
                int i12 = this.f17246h;
                if (i10 <= i11 - i12) {
                    this.f17246h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final void a(int i10) throws InvalidProtocolBufferException {
            if (this.j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int c() {
            return this.f17246h - this.f17247i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean d() throws IOException {
            return this.f17246h == this.f17244f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final void e(int i10) {
            this.f17248k = i10;
            E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int f(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int iC = c() + i10;
            int i11 = this.f17248k;
            if (iC > i11) {
                throw InvalidProtocolBufferException.g();
            }
            this.f17248k = iC;
            E();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean g() throws IOException {
            return C() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final ByteString h() throws IOException {
            byte[] bArrCopyOfRange;
            int iB = B();
            byte[] bArr = this.f17243e;
            if (iB > 0) {
                int i10 = this.f17244f;
                int i11 = this.f17246h;
                if (iB <= i10 - i11) {
                    ByteString byteStringE = ByteString.e(bArr, i11, iB);
                    this.f17246h += iB;
                    return byteStringE;
                }
            }
            if (iB == 0) {
                return ByteString.f17095b;
            }
            if (iB > 0) {
                int i12 = this.f17244f;
                int i13 = this.f17246h;
                if (iB <= i12 - i13) {
                    int i14 = iB + i13;
                    this.f17246h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iB <= 0) {
                        throw InvalidProtocolBufferException.g();
                    }
                    if (iB == 0) {
                        throw InvalidProtocolBufferException.d();
                    }
                    bArrCopyOfRange = C1330u.f17281b;
                }
            } else {
                if (iB <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                if (iB == 0) {
                    throw InvalidProtocolBufferException.d();
                }
                bArrCopyOfRange = C1330u.f17281b;
            }
            ByteString byteString = ByteString.f17095b;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final double i() throws IOException {
            return Double.longBitsToDouble(A());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int j() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int k() throws IOException {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long l() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final float m() throws IOException {
            return Float.intBitsToFloat(z());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int n() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long o() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int p() throws IOException {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long q() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int r() throws IOException {
            int iB = B();
            return (-(iB & 1)) ^ (iB >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long s() throws IOException {
            return AbstractC1318h.b(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final String t() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f17244f;
                int i11 = this.f17246h;
                if (iB <= i10 - i11) {
                    String str = new String(this.f17243e, i11, iB, C1330u.f17280a);
                    this.f17246h += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final String u() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f17244f;
                int i11 = this.f17246h;
                if (iB <= i10 - i11) {
                    String strA = Utf8.f17175a.a(this.f17243e, i11, iB);
                    this.f17246h += iB;
                    return strA;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int v() throws IOException {
            if (d()) {
                this.j = 0;
                return 0;
            }
            int iB = B();
            this.j = iB;
            if ((iB >>> 3) != 0) {
                return iB;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int w() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long x() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean y(int i10) throws IOException {
            int iV;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f17244f - this.f17246h;
                byte[] bArr = this.f17243e;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f17246h;
                        this.f17246h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i12 < 10) {
                    int i15 = this.f17246h;
                    if (i15 == this.f17244f) {
                        throw InvalidProtocolBufferException.g();
                    }
                    this.f17246h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            }
            if (i11 == 1) {
                F(8);
                return true;
            }
            if (i11 == 2) {
                F(B());
                return true;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw InvalidProtocolBufferException.b();
                }
                F(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }

        public final int z() throws IOException {
            int i10 = this.f17246h;
            if (this.f17244f - i10 < 4) {
                throw InvalidProtocolBufferException.g();
            }
            this.f17246h = i10 + 4;
            byte[] bArr = this.f17243e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class b extends AbstractC1318h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final FileInputStream f17249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f17250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17252h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17253i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f17254k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17255l = BrazeLogger.SUPPRESS;

        public b(FileInputStream fileInputStream) {
            Charset charset = C1330u.f17280a;
            this.f17249e = fileInputStream;
            this.f17250f = new byte[4096];
            this.f17251g = 0;
            this.f17253i = 0;
            this.f17254k = 0;
        }

        public final byte[] A(int i10) throws IOException {
            if (i10 == 0) {
                return C1330u.f17281b;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f17254k;
            int i12 = this.f17253i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f17241c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f17255l;
            if (i13 > i14) {
                J((i14 - i11) - i12);
                throw InvalidProtocolBufferException.g();
            }
            int i15 = this.f17251g - i12;
            int i16 = i10 - i15;
            FileInputStream fileInputStream = this.f17249e;
            if (i16 >= 4096 && i16 > fileInputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f17250f, this.f17253i, bArr, 0, i15);
            this.f17254k += this.f17251g;
            this.f17253i = 0;
            this.f17251g = 0;
            while (i15 < i10) {
                int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f17254k += i17;
                i15 += i17;
            }
            return bArr;
        }

        public final ArrayList B(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f17249e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.g();
                    }
                    this.f17254k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int C() throws IOException {
            int i10 = this.f17253i;
            if (this.f17251g - i10 < 4) {
                I(4);
                i10 = this.f17253i;
            }
            this.f17253i = i10 + 4;
            byte[] bArr = this.f17250f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long D() throws IOException {
            int i10 = this.f17253i;
            if (this.f17251g - i10 < 8) {
                I(8);
                i10 = this.f17253i;
            }
            this.f17253i = i10 + 8;
            byte[] bArr = this.f17250f;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public final int E() throws IOException {
            int i10;
            int i11 = this.f17253i;
            int i12 = this.f17251g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f17250f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f17253i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f17253i = i14;
                    return i10;
                }
            }
            return (int) G();
        }

        public final long F() throws IOException {
            long j;
            long j10;
            long j11;
            long j12;
            int i10 = this.f17253i;
            int i11 = this.f17251g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f17250f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f17253i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j12 = (-2080896) ^ i18;
                            } else {
                                long j13 = i18;
                                i13 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i17]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i13]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j = j11 ^ j14;
                            }
                            i13 = i17;
                            j = j12;
                        }
                    }
                    this.f17253i = i13;
                    return j;
                }
            }
            return G();
        }

        public final long G() throws IOException {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f17253i == this.f17251g) {
                    I(1);
                }
                int i11 = this.f17253i;
                this.f17253i = i11 + 1;
                byte b10 = this.f17250f[i11];
                j |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public final void H() {
            int i10 = this.f17251g + this.f17252h;
            this.f17251g = i10;
            int i11 = this.f17254k + i10;
            int i12 = this.f17255l;
            if (i11 <= i12) {
                this.f17252h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f17252h = i13;
            this.f17251g = i10 - i13;
        }

        public final void I(int i10) throws IOException {
            if (K(i10)) {
                return;
            }
            if (i10 <= (this.f17241c - this.f17254k) - this.f17253i) {
                throw InvalidProtocolBufferException.g();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void J(int i10) throws IOException {
            int i11 = this.f17251g;
            int i12 = this.f17253i;
            int i13 = i11 - i12;
            if (i10 <= i13 && i10 >= 0) {
                this.f17253i = i12 + i10;
                return;
            }
            FileInputStream fileInputStream = this.f17249e;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i14 = this.f17254k;
            int i15 = i14 + i12;
            int i16 = i15 + i10;
            int i17 = this.f17255l;
            if (i16 > i17) {
                J((i17 - i14) - i12);
                throw InvalidProtocolBufferException.g();
            }
            this.f17254k = i15;
            this.f17251g = 0;
            this.f17253i = 0;
            while (i13 < i10) {
                long j = i10 - i13;
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (Throwable th) {
                    this.f17254k += i13;
                    H();
                    throw th;
                }
            }
            this.f17254k += i13;
            H();
            if (i13 >= i10) {
                return;
            }
            int i18 = this.f17251g;
            int i19 = i18 - this.f17253i;
            this.f17253i = i18;
            I(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f17251g;
                if (i20 <= i21) {
                    this.f17253i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f17253i = i21;
                    I(1);
                }
            }
        }

        public final boolean K(int i10) throws IOException {
            int i11 = this.f17253i;
            int i12 = i11 + i10;
            int i13 = this.f17251g;
            if (i12 <= i13) {
                throw new IllegalStateException(J4.i.c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.f17254k;
            int i15 = this.f17241c;
            if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f17255l) {
                return false;
            }
            byte[] bArr = this.f17250f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f17254k += i11;
                this.f17251g -= i11;
                this.f17253i = 0;
            }
            int i16 = this.f17251g;
            int iMin = Math.min(bArr.length - i16, (i15 - this.f17254k) - i16);
            FileInputStream fileInputStream = this.f17249e;
            int i17 = fileInputStream.read(bArr, i16, iMin);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f17251g += i17;
            H();
            if (this.f17251g >= i10) {
                return true;
            }
            return K(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final void a(int i10) throws InvalidProtocolBufferException {
            if (this.j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int c() {
            return this.f17254k + this.f17253i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean d() throws IOException {
            return this.f17253i == this.f17251g && !K(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final void e(int i10) {
            this.f17255l = i10;
            H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int f(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f17254k + this.f17253i + i10;
            int i12 = this.f17255l;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.g();
            }
            this.f17255l = i11;
            H();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean g() throws IOException {
            return F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final ByteString h() throws IOException {
            int iE = E();
            int i10 = this.f17251g;
            int i11 = this.f17253i;
            int i12 = i10 - i11;
            byte[] bArr = this.f17250f;
            if (iE <= i12 && iE > 0) {
                ByteString byteStringE = ByteString.e(bArr, i11, iE);
                this.f17253i += iE;
                return byteStringE;
            }
            if (iE == 0) {
                return ByteString.f17095b;
            }
            byte[] bArrA = A(iE);
            if (bArrA != null) {
                return ByteString.e(bArrA, 0, bArrA.length);
            }
            int i13 = this.f17253i;
            int i14 = this.f17251g;
            int length = i14 - i13;
            this.f17254k += i14;
            this.f17253i = 0;
            this.f17251g = 0;
            ArrayList<byte[]> arrayListB = B(iE - length);
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListB) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f17095b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final double i() throws IOException {
            return Double.longBitsToDouble(D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int j() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int k() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long l() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final float m() throws IOException {
            return Float.intBitsToFloat(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int n() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long o() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int p() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long q() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int r() throws IOException {
            int iE = E();
            return (-(iE & 1)) ^ (iE >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long s() throws IOException {
            return AbstractC1318h.b(F());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final String t() throws IOException {
            int iE = E();
            byte[] bArr = this.f17250f;
            if (iE > 0) {
                int i10 = this.f17251g;
                int i11 = this.f17253i;
                if (iE <= i10 - i11) {
                    String str = new String(bArr, i11, iE, C1330u.f17280a);
                    this.f17253i += iE;
                    return str;
                }
            }
            if (iE == 0) {
                return "";
            }
            if (iE > this.f17251g) {
                return new String(z(iE), C1330u.f17280a);
            }
            I(iE);
            String str2 = new String(bArr, this.f17253i, iE, C1330u.f17280a);
            this.f17253i += iE;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final String u() throws IOException {
            int iE = E();
            int i10 = this.f17253i;
            int i11 = this.f17251g;
            int i12 = i11 - i10;
            byte[] bArrZ = this.f17250f;
            if (iE <= i12 && iE > 0) {
                this.f17253i = i10 + iE;
            } else {
                if (iE == 0) {
                    return "";
                }
                i10 = 0;
                if (iE <= i11) {
                    I(iE);
                    this.f17253i = iE;
                } else {
                    bArrZ = z(iE);
                }
            }
            return Utf8.f17175a.a(bArrZ, i10, iE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int v() throws IOException {
            if (d()) {
                this.j = 0;
                return 0;
            }
            int iE = E();
            this.j = iE;
            if ((iE >>> 3) != 0) {
                return iE;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final int w() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final long x() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1318h
        public final boolean y(int i10) throws IOException {
            int iV;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f17251g - this.f17253i;
                byte[] bArr = this.f17250f;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f17253i;
                        this.f17253i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i12 < 10) {
                    if (this.f17253i == this.f17251g) {
                        I(1);
                    }
                    int i15 = this.f17253i;
                    this.f17253i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            }
            if (i11 == 1) {
                J(8);
                return true;
            }
            if (i11 == 2) {
                J(E());
                return true;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw InvalidProtocolBufferException.b();
                }
                J(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] z(int i10) throws IOException {
            byte[] bArrA = A(i10);
            if (bArrA != null) {
                return bArrA;
            }
            int i11 = this.f17253i;
            int i12 = this.f17251g;
            int length = i12 - i11;
            this.f17254k += i12;
            this.f17253i = 0;
            this.f17251g = 0;
            ArrayList<byte[]> arrayListB = B(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f17250f, i11, bArr, 0, length);
            for (byte[] bArr2 : arrayListB) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int c();

    public abstract boolean d() throws IOException;

    public abstract void e(int i10);

    public abstract int f(int i10) throws InvalidProtocolBufferException;

    public abstract boolean g() throws IOException;

    public abstract ByteString h() throws IOException;

    public abstract double i() throws IOException;

    public abstract int j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract float m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract String t() throws IOException;

    public abstract String u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract boolean y(int i10) throws IOException;
}
