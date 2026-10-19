package com.google.protobuf;

import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2066h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29159b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29160c = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2067i f29161d;

    /* JADX INFO: renamed from: com.google.protobuf.h$a */
    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class a extends AbstractC2066h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f29162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f29165h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f29166i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f29167k = BrazeLogger.SUPPRESS;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f29162e = bArr;
            this.f29163f = i11 + i10;
            this.f29165h = i10;
            this.f29166i = i10;
        }

        public final long A() throws IOException {
            int i10 = this.f29165h;
            if (this.f29163f - i10 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f29165h = i10 + 8;
            byte[] bArr = this.f29162e;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public final int B() throws IOException {
            int i10;
            int i11 = this.f29165h;
            int i12 = this.f29163f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f29162e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f29165h = i13;
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
                    this.f29165h = i14;
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
            int i10 = this.f29165h;
            int i11 = this.f29163f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f29162e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f29165h = i12;
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
                    this.f29165h = i13;
                    return j;
                }
            }
            return D();
        }

        public final long D() throws IOException {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f29165h;
                if (i11 == this.f29163f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f29165h = i11 + 1;
                byte b10 = this.f29162e[i11];
                j |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void E() {
            int i10 = this.f29163f + this.f29164g;
            this.f29163f = i10;
            int i11 = i10 - this.f29166i;
            int i12 = this.f29167k;
            if (i11 <= i12) {
                this.f29164g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f29164g = i13;
            this.f29163f = i10 - i13;
        }

        public final void F(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f29163f;
                int i12 = this.f29165h;
                if (i10 <= i11 - i12) {
                    this.f29165h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final void a(int i10) throws InvalidProtocolBufferException {
            if (this.j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int b() {
            return this.f29165h - this.f29166i;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean c() throws IOException {
            return this.f29165h == this.f29163f;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final void e(int i10) {
            this.f29167k = i10;
            E();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int f(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            int iB = b() + i10;
            if (iB < 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int i11 = this.f29167k;
            if (iB > i11) {
                throw InvalidProtocolBufferException.h();
            }
            this.f29167k = iB;
            E();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean g() throws IOException {
            return C() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // com.google.protobuf.AbstractC2066h
        public final ByteString h() throws IOException {
            byte[] bArrCopyOfRange;
            int iB = B();
            byte[] bArr = this.f29162e;
            if (iB > 0) {
                int i10 = this.f29163f;
                int i11 = this.f29165h;
                if (iB <= i10 - i11) {
                    ByteString byteStringG = ByteString.g(bArr, i11, iB);
                    this.f29165h += iB;
                    return byteStringG;
                }
            }
            if (iB == 0) {
                return ByteString.f29007b;
            }
            if (iB > 0) {
                int i12 = this.f29163f;
                int i13 = this.f29165h;
                if (iB <= i12 - i13) {
                    int i14 = iB + i13;
                    this.f29165h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iB <= 0) {
                        throw InvalidProtocolBufferException.h();
                    }
                    if (iB == 0) {
                        throw InvalidProtocolBufferException.e();
                    }
                    bArrCopyOfRange = C2078u.f29201b;
                }
            } else {
                if (iB <= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (iB == 0) {
                    throw InvalidProtocolBufferException.e();
                }
                bArrCopyOfRange = C2078u.f29201b;
            }
            ByteString byteString = ByteString.f29007b;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final double i() throws IOException {
            return Double.longBitsToDouble(A());
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int j() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int k() throws IOException {
            return z();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long l() throws IOException {
            return A();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final float m() throws IOException {
            return Float.intBitsToFloat(z());
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int n() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long o() throws IOException {
            return C();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int p() throws IOException {
            return z();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long q() throws IOException {
            return A();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int r() throws IOException {
            int iB = B();
            return (-(iB & 1)) ^ (iB >>> 1);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long s() throws IOException {
            long jC = C();
            return (-(jC & 1)) ^ (jC >>> 1);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final String t() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f29163f;
                int i11 = this.f29165h;
                if (iB <= i10 - i11) {
                    String str = new String(this.f29162e, i11, iB, C2078u.f29200a);
                    this.f29165h += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw InvalidProtocolBufferException.e();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final String u() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f29163f;
                int i11 = this.f29165h;
                if (iB <= i10 - i11) {
                    String strA = Utf8.f29090a.a(this.f29162e, i11, iB);
                    this.f29165h += iB;
                    return strA;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int v() throws IOException {
            if (c()) {
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

        @Override // com.google.protobuf.AbstractC2066h
        public final int w() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long x() throws IOException {
            return C();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean y(int i10) throws IOException {
            int iV;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f29163f - this.f29165h;
                byte[] bArr = this.f29162e;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f29165h;
                        this.f29165h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.d();
                }
                while (i12 < 10) {
                    int i15 = this.f29165h;
                    if (i15 == this.f29163f) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f29165h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.d();
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
                    throw InvalidProtocolBufferException.c();
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
            int i10 = this.f29165h;
            if (this.f29163f - i10 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f29165h = i10 + 4;
            byte[] bArr = this.f29162e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$b */
    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class b extends AbstractC2066h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InputStream f29168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f29169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f29171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f29172i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f29173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f29174l = BrazeLogger.SUPPRESS;

        public b(InputStream inputStream) {
            C2078u.a(inputStream, MetricTracker.Object.INPUT);
            this.f29168e = inputStream;
            this.f29169f = new byte[4096];
            this.f29170g = 0;
            this.f29172i = 0;
            this.f29173k = 0;
        }

        public final byte[] A(int i10) throws IOException {
            if (i10 == 0) {
                return C2078u.f29201b;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            int i11 = this.f29173k;
            int i12 = this.f29172i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f29160c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f29174l;
            if (i13 > i14) {
                J((i14 - i11) - i12);
                throw InvalidProtocolBufferException.h();
            }
            int i15 = this.f29170g - i12;
            int i16 = i10 - i15;
            InputStream inputStream = this.f29168e;
            if (i16 >= 4096) {
                try {
                    if (i16 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.f();
                    throw e10;
                }
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29169f, this.f29172i, bArr, 0, i15);
            this.f29173k += this.f29170g;
            this.f29172i = 0;
            this.f29170g = 0;
            while (i15 < i10) {
                try {
                    int i17 = inputStream.read(bArr, i15, i10 - i15);
                    if (i17 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f29173k += i17;
                    i15 += i17;
                } catch (InvalidProtocolBufferException e11) {
                    e11.f();
                    throw e11;
                }
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
                    int i12 = this.f29168e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f29173k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int C() throws IOException {
            int i10 = this.f29172i;
            if (this.f29170g - i10 < 4) {
                I(4);
                i10 = this.f29172i;
            }
            this.f29172i = i10 + 4;
            byte[] bArr = this.f29169f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long D() throws IOException {
            int i10 = this.f29172i;
            if (this.f29170g - i10 < 8) {
                I(8);
                i10 = this.f29172i;
            }
            this.f29172i = i10 + 8;
            byte[] bArr = this.f29169f;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public final int E() throws IOException {
            int i10;
            int i11 = this.f29172i;
            int i12 = this.f29170g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f29169f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f29172i = i13;
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
                    this.f29172i = i14;
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
            int i10 = this.f29172i;
            int i11 = this.f29170g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f29169f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f29172i = i12;
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
                    this.f29172i = i13;
                    return j;
                }
            }
            return G();
        }

        public final long G() throws IOException {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f29172i == this.f29170g) {
                    I(1);
                }
                int i11 = this.f29172i;
                this.f29172i = i11 + 1;
                byte b10 = this.f29169f[i11];
                j |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void H() {
            int i10 = this.f29170g + this.f29171h;
            this.f29170g = i10;
            int i11 = this.f29173k + i10;
            int i12 = this.f29174l;
            if (i11 <= i12) {
                this.f29171h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f29171h = i13;
            this.f29170g = i10 - i13;
        }

        public final void I(int i10) throws IOException {
            if (K(i10)) {
                return;
            }
            if (i10 <= (this.f29160c - this.f29173k) - this.f29172i) {
                throw InvalidProtocolBufferException.h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void J(int i10) throws IOException {
            int i11 = this.f29170g;
            int i12 = this.f29172i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f29172i = i12 + i10;
                return;
            }
            InputStream inputStream = this.f29168e;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            int i13 = this.f29173k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f29174l;
            if (i15 > i16) {
                J((i16 - i13) - i12);
                throw InvalidProtocolBufferException.h();
            }
            this.f29173k = i14;
            int i17 = i11 - i12;
            this.f29170g = 0;
            this.f29172i = 0;
            while (i17 < i10) {
                long j = i10 - i17;
                try {
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i17 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f();
                        throw e10;
                    }
                } catch (Throwable th) {
                    this.f29173k += i17;
                    H();
                    throw th;
                }
            }
            this.f29173k += i17;
            H();
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f29170g;
            int i19 = i18 - this.f29172i;
            this.f29172i = i18;
            I(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f29170g;
                if (i20 <= i21) {
                    this.f29172i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f29172i = i21;
                    I(1);
                }
            }
        }

        public final boolean K(int i10) throws IOException {
            int i11 = this.f29172i;
            int i12 = i11 + i10;
            int i13 = this.f29170g;
            if (i12 <= i13) {
                throw new IllegalStateException(J4.i.c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.f29160c;
            int i15 = this.f29173k;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f29174l) {
                return false;
            }
            byte[] bArr = this.f29169f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f29173k += i11;
                this.f29170g -= i11;
                this.f29172i = 0;
            }
            int i16 = this.f29170g;
            int iMin = Math.min(bArr.length - i16, (this.f29160c - this.f29173k) - i16);
            InputStream inputStream = this.f29168e;
            try {
                int i17 = inputStream.read(bArr, i16, iMin);
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 <= 0) {
                    return false;
                }
                this.f29170g += i17;
                H();
                if (this.f29170g >= i10) {
                    return true;
                }
                return K(i10);
            } catch (InvalidProtocolBufferException e10) {
                e10.f();
                throw e10;
            }
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final void a(int i10) throws InvalidProtocolBufferException {
            if (this.j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int b() {
            return this.f29173k + this.f29172i;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean c() throws IOException {
            return this.f29172i == this.f29170g && !K(1);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final void e(int i10) {
            this.f29174l = i10;
            H();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int f(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            int i11 = this.f29173k + this.f29172i + i10;
            int i12 = this.f29174l;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.h();
            }
            this.f29174l = i11;
            H();
            return i12;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean g() throws IOException {
            return F() != 0;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final ByteString h() throws IOException {
            int iE = E();
            int i10 = this.f29170g;
            int i11 = this.f29172i;
            int i12 = i10 - i11;
            byte[] bArr = this.f29169f;
            if (iE <= i12 && iE > 0) {
                ByteString byteStringG = ByteString.g(bArr, i11, iE);
                this.f29172i += iE;
                return byteStringG;
            }
            if (iE == 0) {
                return ByteString.f29007b;
            }
            byte[] bArrA = A(iE);
            if (bArrA != null) {
                return ByteString.g(bArrA, 0, bArrA.length);
            }
            int i13 = this.f29172i;
            int i14 = this.f29170g;
            int length = i14 - i13;
            this.f29173k += i14;
            this.f29172i = 0;
            this.f29170g = 0;
            ArrayList<byte[]> arrayListB = B(iE - length);
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListB) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f29007b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final double i() throws IOException {
            return Double.longBitsToDouble(D());
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int j() throws IOException {
            return E();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int k() throws IOException {
            return C();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long l() throws IOException {
            return D();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final float m() throws IOException {
            return Float.intBitsToFloat(C());
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int n() throws IOException {
            return E();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long o() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int p() throws IOException {
            return C();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long q() throws IOException {
            return D();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int r() throws IOException {
            int iE = E();
            return (-(iE & 1)) ^ (iE >>> 1);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long s() throws IOException {
            long jF = F();
            return (-(jF & 1)) ^ (jF >>> 1);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final String t() throws IOException {
            int iE = E();
            byte[] bArr = this.f29169f;
            if (iE > 0) {
                int i10 = this.f29170g;
                int i11 = this.f29172i;
                if (iE <= i10 - i11) {
                    String str = new String(bArr, i11, iE, C2078u.f29200a);
                    this.f29172i += iE;
                    return str;
                }
            }
            if (iE == 0) {
                return "";
            }
            if (iE > this.f29170g) {
                return new String(z(iE), C2078u.f29200a);
            }
            I(iE);
            String str2 = new String(bArr, this.f29172i, iE, C2078u.f29200a);
            this.f29172i += iE;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final String u() throws IOException {
            int iE = E();
            int i10 = this.f29172i;
            int i11 = this.f29170g;
            int i12 = i11 - i10;
            byte[] bArrZ = this.f29169f;
            if (iE <= i12 && iE > 0) {
                this.f29172i = i10 + iE;
            } else {
                if (iE == 0) {
                    return "";
                }
                i10 = 0;
                if (iE <= i11) {
                    I(iE);
                    this.f29172i = iE;
                } else {
                    bArrZ = z(iE);
                }
            }
            return Utf8.f29090a.a(bArrZ, i10, iE);
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final int v() throws IOException {
            if (c()) {
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

        @Override // com.google.protobuf.AbstractC2066h
        public final int w() throws IOException {
            return E();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final long x() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.AbstractC2066h
        public final boolean y(int i10) throws IOException {
            int iV;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f29170g - this.f29172i;
                byte[] bArr = this.f29169f;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f29172i;
                        this.f29172i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.d();
                }
                while (i12 < 10) {
                    if (this.f29172i == this.f29170g) {
                        I(1);
                    }
                    int i15 = this.f29172i;
                    this.f29172i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.d();
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
                    throw InvalidProtocolBufferException.c();
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
            int i11 = this.f29172i;
            int i12 = this.f29170g;
            int length = i12 - i11;
            this.f29173k += i12;
            this.f29172i = 0;
            this.f29170g = 0;
            ArrayList<byte[]> arrayListB = B(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29169f, i11, bArr, 0, length);
            for (byte[] bArr2 : arrayListB) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    public static a d(byte[] bArr, int i10, int i11, boolean z10) {
        a aVar = new a(bArr, i10, i11, z10);
        try {
            aVar.f(i11);
            return aVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int b();

    public abstract boolean c() throws IOException;

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
