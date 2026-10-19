package p318zb;

import A8.f;
import J4.n;
import Q3.d;
import com.braze.support.BrazeLogger;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import okio.ByteString;
import okio.SegmentedByteString;

/* JADX INFO: renamed from: zb.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2839f implements InterfaceC2841h, InterfaceC2840g, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f49073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f49074c;

    /* JADX INFO: renamed from: zb.f$a */
    /* JADX INFO: compiled from: Buffer.kt */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2839f f49075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f49076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public D f49077d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f49079f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f49078e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f49080g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49081h = -1;

        public final void b(long j) {
            C2839f c2839f = this.f49075b;
            if (c2839f == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f49076c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j10 = c2839f.f49074c;
            if (j <= j10) {
                if (j < 0) {
                    throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "newSize < 0: ").toString());
                }
                long j11 = j10 - j;
                while (j11 > 0) {
                    D d10 = c2839f.f49073b;
                    i.b(d10);
                    D d11 = d10.f49047g;
                    i.b(d11);
                    int i10 = d11.f49043c;
                    long j12 = i10 - d11.f49042b;
                    if (j12 > j11) {
                        d11.f49043c = i10 - ((int) j11);
                        break;
                    } else {
                        c2839f.f49073b = d11.a();
                        E.a(d11);
                        j11 -= j12;
                    }
                }
                this.f49077d = null;
                this.f49078e = j;
                this.f49079f = null;
                this.f49080g = -1;
                this.f49081h = -1;
            } else if (j > j10) {
                long j13 = j - j10;
                int i11 = 1;
                boolean z10 = true;
                for (long j14 = 0; j13 > j14; j14 = 0) {
                    D dI0 = c2839f.I0(i11);
                    int iMin = (int) Math.min(j13, 8192 - dI0.f49043c);
                    int i12 = dI0.f49043c + iMin;
                    dI0.f49043c = i12;
                    j13 -= (long) iMin;
                    if (z10) {
                        this.f49077d = dI0;
                        this.f49078e = j10;
                        this.f49079f = dI0.f49041a;
                        this.f49080g = i12 - iMin;
                        this.f49081h = i12;
                        z10 = false;
                    }
                    i11 = 1;
                }
            }
            c2839f.f49074c = j;
        }

        public final int c(long j) {
            C2839f c2839f = this.f49075b;
            if (c2839f == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j10 = c2839f.f49074c;
                if (j <= j10) {
                    if (j == -1 || j == j10) {
                        this.f49077d = null;
                        this.f49078e = j;
                        this.f49079f = null;
                        this.f49080g = -1;
                        this.f49081h = -1;
                        return -1;
                    }
                    D d10 = c2839f.f49073b;
                    D d11 = this.f49077d;
                    long j11 = 0;
                    if (d11 != null) {
                        long j12 = this.f49078e - ((long) (this.f49080g - d11.f49042b));
                        if (j12 > j) {
                            j10 = j12;
                            d11 = d10;
                            d10 = d11;
                        } else {
                            j11 = j12;
                        }
                    } else {
                        d11 = d10;
                    }
                    if (j10 - j > j - j11) {
                        while (true) {
                            i.b(d11);
                            long j13 = ((long) (d11.f49043c - d11.f49042b)) + j11;
                            if (j < j13) {
                                break;
                            }
                            d11 = d11.f49046f;
                            j11 = j13;
                        }
                    } else {
                        while (j10 > j) {
                            i.b(d10);
                            d10 = d10.f49047g;
                            i.b(d10);
                            j10 -= (long) (d10.f49043c - d10.f49042b);
                        }
                        d11 = d10;
                        j11 = j10;
                    }
                    if (this.f49076c) {
                        i.b(d11);
                        if (d11.f49044d) {
                            byte[] bArr = d11.f49041a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            i.d(bArrCopyOf, "copyOf(...)");
                            D d12 = new D(bArrCopyOf, d11.f49042b, d11.f49043c, false, true);
                            if (c2839f.f49073b == d11) {
                                c2839f.f49073b = d12;
                            }
                            d11.b(d12);
                            D d13 = d12.f49047g;
                            i.b(d13);
                            d13.a();
                            d11 = d12;
                        }
                    }
                    this.f49077d = d11;
                    this.f49078e = j;
                    i.b(d11);
                    this.f49079f = d11.f49041a;
                    int i10 = d11.f49042b + ((int) (j - j11));
                    this.f49080g = i10;
                    int i11 = d11.f49043c;
                    this.f49081h = i11;
                    return i11 - i10;
                }
            }
            StringBuilder sbF = n.f("offset=", " > size=", j);
            sbF.append(c2839f.f49074c);
            throw new ArrayIndexOutOfBoundsException(sbF.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f49075b == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f49075b = null;
            this.f49077d = null;
            this.f49078e = -1L;
            this.f49079f = null;
            this.f49080g = -1;
            this.f49081h = -1;
        }
    }

    /* JADX INFO: renamed from: zb.f$c */
    /* JADX INFO: compiled from: Buffer.kt */
    public static final class c extends OutputStream {
        public c() {
        }

        public final String toString() {
            return C2839f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            C2839f.this.Z0(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i10, int i11) {
            i.e(data, "data");
            C2839f.this.S0(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }
    }

    @Override // p318zb.InterfaceC2841h
    public final byte[] A() {
        return N(this.f49074c);
    }

    public final ByteString A0(int i10) {
        if (i10 == 0) {
            return ByteString.f45705d;
        }
        C2834a.b(this.f49074c, 0L, i10);
        D d10 = this.f49073b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            i.b(d10);
            int i14 = d10.f49043c;
            int i15 = d10.f49042b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            d10 = d10.f49046f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        D d11 = this.f49073b;
        int i16 = 0;
        while (i11 < i10) {
            i.b(d11);
            bArr[i16] = d11.f49041a;
            i11 += d11.f49043c - d11.f49042b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = d11.f49042b;
            d11.f49044d = true;
            i16++;
            d11 = d11.f49046f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final long B(ByteString targetBytes) {
        i.e(targetBytes, "targetBytes");
        return x(0L, targetBytes);
    }

    @Override // p318zb.InterfaceC2841h
    public final short B0() throws EOFException {
        short sN0 = n0();
        a aVar = C2834a.f49060a;
        return (short) (((sN0 & 255) << 8) | ((65280 & sN0) >>> 8));
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g E(int i10) {
        Z0(i10);
        return this;
    }

    @Override // p318zb.InterfaceC2841h
    public final long F0() throws EOFException {
        long jM0 = m0();
        a aVar = C2834a.f49060a;
        return ((jM0 & 255) << 56) | (((-72057594037927936L) & jM0) >>> 56) | ((71776119061217280L & jM0) >>> 40) | ((280375465082880L & jM0) >>> 24) | ((1095216660480L & jM0) >>> 8) | ((4278190080L & jM0) << 8) | ((16711680 & jM0) << 24) | ((65280 & jM0) << 40);
    }

    @Override // p318zb.InterfaceC2841h
    public final int H(x options) throws EOFException {
        i.e(options, "options");
        int iB = okio.internal.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        skip(options.f49118b[iB].e());
        return iB;
    }

    public final D I0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d10 = this.f49073b;
        if (d10 == null) {
            D dB = E.b();
            this.f49073b = dB;
            dB.f49047g = dB;
            dB.f49046f = dB;
            return dB;
        }
        D d11 = d10.f49047g;
        i.b(d11);
        if (d11.f49043c + i10 <= 8192 && d11.f49045e) {
            return d11;
        }
        D dB2 = E.b();
        d11.b(dB2);
        return dB2;
    }

    public final void K0(ByteString byteString) {
        i.e(byteString, "byteString");
        byteString.w(this, byteString.e());
    }

    public final a M(a unsafeCursor) {
        i.e(unsafeCursor, "unsafeCursor");
        byte[] bArr = okio.internal.a.f45712a;
        if (unsafeCursor == C2834a.f49060a) {
            unsafeCursor = new a();
        }
        if (unsafeCursor.f49075b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f49075b = this;
        unsafeCursor.f49076c = true;
        return unsafeCursor;
    }

    public final byte[] N(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount: ").toString());
        }
        if (this.f49074c < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        U(bArr);
        return bArr;
    }

    @Override // p318zb.InterfaceC2841h
    public final void N0(long j) throws EOFException {
        if (this.f49074c < j) {
            throw new EOFException();
        }
    }

    public final void P0(byte[] source) {
        i.e(source, "source");
        S0(source, 0, source.length);
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g Q0(long j) {
        a1(j);
        return this;
    }

    public final ByteString R(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount: ").toString());
        }
        if (this.f49074c < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(N(j));
        }
        ByteString byteStringA0 = A0((int) j);
        skip(j);
        return byteStringA0;
    }

    public final long S() throws EOFException {
        if (this.f49074c == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j = 0;
        long j10 = -7;
        boolean z11 = false;
        do {
            D d10 = this.f49073b;
            i.b(d10);
            int i11 = d10.f49042b;
            int i12 = d10.f49043c;
            while (true) {
                if (i11 >= i12) {
                    break;
                }
                byte b10 = d10.f49041a[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i13 < j10)) {
                        C2839f c2839f = new C2839f();
                        c2839f.a1(j);
                        c2839f.Z0(b10);
                        if (!z10) {
                            c2839f.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c2839f.r0()));
                    }
                    j = (j * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j10--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f49073b = d10.a();
                E.a(d10);
            } else {
                d10.f49042b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f49073b != null);
        long j11 = this.f49074c - ((long) i10);
        this.f49074c = j11;
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j : -j;
        }
        if (j11 == 0) {
            throw new EOFException();
        }
        StringBuilder sbF = C4.b.f(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbF.append(C2834a.d(p(0L)));
        throw new NumberFormatException(sbF.toString());
    }

    public final void S0(byte[] source, int i10, int i11) {
        i.e(source, "source");
        long j = i11;
        C2834a.b(source.length, i10, j);
        int i12 = i11 + i10;
        while (i10 < i12) {
            D dI0 = I0(1);
            int iMin = Math.min(i12 - i10, 8192 - dI0.f49043c);
            int i13 = i10 + iMin;
            d.l(dI0.f49043c, i10, i13, source, dI0.f49041a);
            dI0.f49043c += iMin;
            i10 = i13;
        }
        this.f49074c += j;
    }

    public final void U(byte[] sink) throws EOFException {
        i.e(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // p318zb.InterfaceC2840g
    public final OutputStream U0() {
        return new c();
    }

    @Override // p318zb.InterfaceC2841h
    public final InputStream X0() {
        return new b();
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g Z(String str) {
        f1(str);
        return this;
    }

    public final void Z0(int i10) {
        D dI0 = I0(1);
        int i11 = dI0.f49043c;
        dI0.f49043c = i11 + 1;
        dI0.f49041a[i11] = (byte) i10;
        this.f49074c++;
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g a(byte[] bArr, int i10, int i11) {
        S0(bArr, i10, i11);
        return this;
    }

    public final void a1(long j) {
        boolean z10;
        byte[] bArr;
        if (j == 0) {
            Z0(48);
            return;
        }
        int i10 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                f1("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i10 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i10 = 2;
                }
            } else if (j < 1000000) {
                i10 = j < 100000 ? 5 : 6;
            } else {
                i10 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i10 = j < 1000000000 ? 9 : 10;
            } else {
                i10 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i10 = j < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        D dI0 = I0(i10);
        int i11 = dI0.f49043c + i10;
        while (true) {
            bArr = dI0.f49041a;
            if (j == 0) {
                break;
            }
            long j10 = 10;
            i11--;
            bArr[i11] = okio.internal.a.f45712a[(int) (j % j10)];
            j /= j10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        dI0.f49043c += i10;
        this.f49074c += (long) i10;
    }

    public final void b() throws EOFException {
        skip(this.f49074c);
    }

    public final void b1(long j) {
        if (j == 0) {
            Z0(48);
            return;
        }
        long j10 = (j >>> 1) | j;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        D dI0 = I0(i10);
        int i11 = dI0.f49043c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            dI0.f49041a[i12] = okio.internal.a.f45712a[(int) (15 & j)];
            j >>>= 4;
        }
        dI0.f49043c += i10;
        this.f49074c += (long) i10;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2839f clone() {
        C2839f c2839f = new C2839f();
        if (this.f49074c != 0) {
            D d10 = this.f49073b;
            i.b(d10);
            D dC = d10.c();
            c2839f.f49073b = dC;
            dC.f49047g = dC;
            dC.f49046f = dC;
            for (D d11 = d10.f49046f; d11 != d10; d11 = d11.f49046f) {
                D d12 = dC.f49047g;
                i.b(d12);
                i.b(d11);
                d12.b(d11.c());
            }
            c2839f.f49074c = this.f49074c;
        }
        return c2839f;
    }

    @Override // p318zb.InterfaceC2841h
    public final boolean c0(long j, ByteString bytes) {
        i.e(bytes, "bytes");
        int iE = bytes.e();
        if (j < 0 || iE < 0 || this.f49074c - j < iE || bytes.e() < iE) {
            return false;
        }
        for (int i10 = 0; i10 < iE; i10++) {
            if (p(((long) i10) + j) != bytes.k(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void c1(int i10) {
        D dI0 = I0(4);
        int i11 = dI0.f49043c;
        byte[] bArr = dI0.f49041a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        dI0.f49043c = i11 + 4;
        this.f49074c += 4;
    }

    @Override // p318zb.InterfaceC2841h
    public final String d0(Charset charset) {
        return o0(this.f49074c, charset);
    }

    public final void d1(int i10) {
        D dI0 = I0(2);
        int i11 = dI0.f49043c;
        byte[] bArr = dI0.f49041a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        dI0.f49043c = i11 + 2;
        this.f49074c += 2;
    }

    public final void e1(String string, int i10, int i11, Charset charset) {
        i.e(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(f.d(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbE = f.e(i11, "endIndex > string.length: ", " > ");
            sbE.append(string.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (charset.equals(kotlin.text.a.f43120b)) {
            g1(string, i10, i11);
            return;
        }
        String strSubstring = string.substring(i10, i11);
        i.d(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        i.d(bytes, "getBytes(...)");
        S0(bytes, 0, bytes.length);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2839f) {
                long j = this.f49074c;
                C2839f c2839f = (C2839f) obj;
                if (j == c2839f.f49074c) {
                    if (j != 0) {
                        D d10 = this.f49073b;
                        i.b(d10);
                        D d11 = c2839f.f49073b;
                        i.b(d11);
                        int i10 = d10.f49042b;
                        int i11 = d11.f49042b;
                        long j10 = 0;
                        while (j10 < this.f49074c) {
                            long jMin = Math.min(d10.f49043c - i10, d11.f49043c - i11);
                            long j11 = 0;
                            while (j11 < jMin) {
                                int i12 = i10 + 1;
                                byte b10 = d10.f49041a[i10];
                                int i13 = i11 + 1;
                                if (b10 == d11.f49041a[i11]) {
                                    j11++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == d10.f49043c) {
                                D d12 = d10.f49046f;
                                i.b(d12);
                                i10 = d12.f49042b;
                                d10 = d12;
                            }
                            if (i11 == d11.f49043c) {
                                d11 = d11.f49046f;
                                i.b(d11);
                                i11 = d11.f49042b;
                            }
                            j10 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f0() throws EOFException {
        int i10;
        if (this.f49074c == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j = 0;
        do {
            D d10 = this.f49073b;
            i.b(d10);
            int i12 = d10.f49042b;
            int i13 = d10.f49043c;
            while (i12 < i13) {
                byte b10 = d10.f49041a[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(C2834a.d(b10)));
                        }
                        z10 = true;
                        break;
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C2839f c2839f = new C2839f();
                    c2839f.b1(j);
                    c2839f.Z0(b10);
                    throw new NumberFormatException("Number too large: ".concat(c2839f.r0()));
                }
                j = (j << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f49073b = d10.a();
                E.a(d10);
            } else {
                d10.f49042b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f49073b != null);
        this.f49074c -= (long) i11;
        return j;
    }

    public final void f1(String string) {
        i.e(string, "string");
        g1(string, 0, string.length());
    }

    @Override // p318zb.InterfaceC2841h
    public final boolean g(long j) {
        return this.f49074c >= j;
    }

    public final void g1(String string, int i10, int i11) {
        char cCharAt;
        i.e(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(f.d(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbE = f.e(i11, "endIndex > string.length: ", " > ");
            sbE.append(string.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                D dI0 = I0(1);
                int i12 = dI0.f49043c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = dI0.f49041a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = dI0.f49043c;
                int i15 = (i12 + i10) - i14;
                dI0.f49043c = i14 + i15;
                this.f49074c += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    D dI1 = I0(2);
                    int i16 = dI1.f49043c;
                    byte[] bArr2 = dI1.f49041a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    dI1.f49043c = i16 + 2;
                    this.f49074c += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    D dI2 = I0(3);
                    int i17 = dI2.f49043c;
                    byte[] bArr3 = dI2.f49041a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    dI2.f49043c = i17 + 3;
                    this.f49074c += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Z0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        D dI3 = I0(4);
                        int i20 = dI3.f49043c;
                        byte[] bArr4 = dI3.f49041a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        dI3.f49043c = i20 + 4;
                        this.f49074c += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final long h() {
        long j = this.f49074c;
        if (j == 0) {
            return 0L;
        }
        D d10 = this.f49073b;
        i.b(d10);
        D d11 = d10.f49047g;
        i.b(d11);
        int i10 = d11.f49043c;
        if (i10 < 8192 && d11.f49045e) {
            j -= (long) (i10 - d11.f49042b);
        }
        return j;
    }

    public final void h1(int i10) {
        if (i10 < 128) {
            Z0(i10);
            return;
        }
        if (i10 < 2048) {
            D dI0 = I0(2);
            int i11 = dI0.f49043c;
            byte[] bArr = dI0.f49041a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            dI0.f49043c = i11 + 2;
            this.f49074c += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            Z0(63);
            return;
        }
        if (i10 < 65536) {
            D dI1 = I0(3);
            int i12 = dI1.f49043c;
            byte[] bArr2 = dI1.f49041a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            dI1.f49043c = i12 + 3;
            this.f49074c += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(C2834a.e(i10)));
        }
        D dI2 = I0(4);
        int i13 = dI2.f49043c;
        byte[] bArr3 = dI2.f49041a;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        dI2.f49043c = i13 + 4;
        this.f49074c += 4;
    }

    public final int hashCode() {
        D d10 = this.f49073b;
        if (d10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = d10.f49043c;
            for (int i12 = d10.f49042b; i12 < i11; i12++) {
                i10 = (i10 * 31) + d10.f49041a[i12];
            }
            d10 = d10.f49046f;
            i.b(d10);
        } while (d10 != this.f49073b);
        return i10;
    }

    public final void i(C2839f out, long j, long j10) {
        i.e(out, "out");
        C2834a.b(this.f49074c, j, j10);
        if (j10 == 0) {
            return;
        }
        out.f49074c += j10;
        D d10 = this.f49073b;
        while (true) {
            i.b(d10);
            long j11 = d10.f49043c - d10.f49042b;
            if (j < j11) {
                break;
            }
            j -= j11;
            d10 = d10.f49046f;
        }
        while (j10 > 0) {
            i.b(d10);
            D dC = d10.c();
            int i10 = dC.f49042b + ((int) j);
            dC.f49042b = i10;
            dC.f49043c = Math.min(i10 + ((int) j10), dC.f49043c);
            D d11 = out.f49073b;
            if (d11 == null) {
                dC.f49047g = dC;
                dC.f49046f = dC;
                out.f49073b = dC;
            } else {
                D d12 = d11.f49047g;
                i.b(d12);
                d12.b(dC);
            }
            j10 -= (long) (dC.f49043c - dC.f49042b);
            d10 = d10.f49046f;
            j = 0;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j() {
        return this.f49074c == 0;
    }

    public final int j0() throws EOFException {
        if (this.f49074c < 4) {
            throw new EOFException();
        }
        D d10 = this.f49073b;
        i.b(d10);
        int i10 = d10.f49042b;
        int i11 = d10.f49043c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = d10.f49041a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = i13 | (bArr[i12] & 255);
        this.f49074c -= 4;
        if (i14 == i11) {
            this.f49073b = d10.a();
            E.a(d10);
        } else {
            d10.f49042b = i14;
        }
        return i15;
    }

    @Override // p318zb.InterfaceC2840g
    public final long k0(H source) throws IOException {
        i.e(source, "source");
        long j = 0;
        while (true) {
            long jL0 = source.l0(this, 8192L);
            if (jL0 == -1) {
                return j;
            }
            j += jL0;
        }
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) {
        i.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
        }
        long j10 = this.f49074c;
        if (j10 == 0) {
            return -1L;
        }
        if (j > j10) {
            j = j10;
        }
        sink.t0(this, j);
        return j;
    }

    public final long m0() throws EOFException {
        if (this.f49074c < 8) {
            throw new EOFException();
        }
        D d10 = this.f49073b;
        i.b(d10);
        int i10 = d10.f49042b;
        int i11 = d10.f49043c;
        if (i11 - i10 < 8) {
            return ((((long) j0()) & 4294967295L) << 32) | (4294967295L & ((long) j0()));
        }
        byte[] bArr = d10.f49041a;
        int i12 = i10 + 7;
        long j = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j10 = j | (((long) bArr[i12]) & 255);
        this.f49074c -= 8;
        if (i13 == i11) {
            this.f49073b = d10.a();
            E.a(d10);
        } else {
            d10.f49042b = i13;
        }
        return j10;
    }

    public final short n0() throws EOFException {
        if (this.f49074c < 2) {
            throw new EOFException();
        }
        D d10 = this.f49073b;
        i.b(d10);
        int i10 = d10.f49042b;
        int i11 = d10.f49043c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i12 = i10 + 1;
        byte[] bArr = d10.f49041a;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f49074c -= 2;
        if (i14 == i11) {
            this.f49073b = d10.a();
            E.a(d10);
        } else {
            d10.f49042b = i14;
        }
        return (short) i15;
    }

    @Override // p318zb.InterfaceC2841h
    public final long o(InterfaceC2840g interfaceC2840g) throws IOException {
        long j = this.f49074c;
        if (j > 0) {
            interfaceC2840g.t0(this, j);
        }
        return j;
    }

    public final String o0(long j, Charset charset) throws EOFException {
        i.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount: ").toString());
        }
        if (this.f49074c < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        D d10 = this.f49073b;
        i.b(d10);
        int i10 = d10.f49042b;
        if (((long) i10) + j > d10.f49043c) {
            return new String(N(j), charset);
        }
        int i11 = (int) j;
        String str = new String(d10.f49041a, i10, i11, charset);
        int i12 = d10.f49042b + i11;
        d10.f49042b = i12;
        this.f49074c -= j;
        if (i12 == d10.f49043c) {
            this.f49073b = d10.a();
            E.a(d10);
        }
        return str;
    }

    public final byte p(long j) {
        C2834a.b(this.f49074c, j, 1L);
        D d10 = this.f49073b;
        if (d10 == null) {
            i.b(null);
            throw null;
        }
        long j10 = this.f49074c;
        if (j10 - j < j) {
            while (j10 > j) {
                d10 = d10.f49047g;
                i.b(d10);
                j10 -= (long) (d10.f49043c - d10.f49042b);
            }
            return d10.f49041a[(int) ((((long) d10.f49042b) + j) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i10 = d10.f49043c;
            int i11 = d10.f49042b;
            long j12 = ((long) (i10 - i11)) + j11;
            if (j12 > j) {
                return d10.f49041a[(int) ((((long) i11) + j) - j11)];
            }
            d10 = d10.f49046f;
            i.b(d10);
            j11 = j12;
        }
    }

    @Override // p318zb.InterfaceC2841h
    public final int q0() throws EOFException {
        int iJ0 = j0();
        a aVar = C2834a.f49060a;
        return ((iJ0 & 255) << 24) | (((-16777216) & iJ0) >>> 24) | ((16711680 & iJ0) >>> 8) | ((65280 & iJ0) << 8);
    }

    public final String r0() {
        return o0(this.f49074c, kotlin.text.a.f43120b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        i.e(sink, "sink");
        D d10 = this.f49073b;
        if (d10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), d10.f49043c - d10.f49042b);
        sink.put(d10.f49041a, d10.f49042b, iMin);
        int i10 = d10.f49042b + iMin;
        d10.f49042b = i10;
        this.f49074c -= (long) iMin;
        if (i10 == d10.f49043c) {
            this.f49073b = d10.a();
            E.a(d10);
        }
        return iMin;
    }

    @Override // p318zb.InterfaceC2841h
    public final byte readByte() throws EOFException {
        if (this.f49074c == 0) {
            throw new EOFException();
        }
        D d10 = this.f49073b;
        i.b(d10);
        int i10 = d10.f49042b;
        int i11 = d10.f49043c;
        int i12 = i10 + 1;
        byte b10 = d10.f49041a[i10];
        this.f49074c--;
        if (i12 == i11) {
            this.f49073b = d10.a();
            E.a(d10);
        } else {
            d10.f49042b = i12;
        }
        return b10;
    }

    public final long s(byte b10, long j, long j10) {
        D d10;
        long j11 = 0;
        if (0 > j || j > j10) {
            throw new IllegalArgumentException(("size=" + this.f49074c + " fromIndex=" + j + " toIndex=" + j10).toString());
        }
        long j12 = this.f49074c;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j == j10 || (d10 = this.f49073b) == null) {
            return -1L;
        }
        if (j12 - j < j) {
            while (j12 > j) {
                d10 = d10.f49047g;
                i.b(d10);
                j12 -= (long) (d10.f49043c - d10.f49042b);
            }
            while (j12 < j10) {
                int iMin = (int) Math.min(d10.f49043c, (((long) d10.f49042b) + j10) - j12);
                for (int i10 = (int) ((((long) d10.f49042b) + j) - j12); i10 < iMin; i10++) {
                    if (d10.f49041a[i10] == b10) {
                        return ((long) (i10 - d10.f49042b)) + j12;
                    }
                }
                j12 += (long) (d10.f49043c - d10.f49042b);
                d10 = d10.f49046f;
                i.b(d10);
                j = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = ((long) (d10.f49043c - d10.f49042b)) + j11;
            if (j13 > j) {
                break;
            }
            d10 = d10.f49046f;
            i.b(d10);
            j11 = j13;
        }
        while (j11 < j10) {
            int iMin2 = (int) Math.min(d10.f49043c, (((long) d10.f49042b) + j10) - j11);
            for (int i11 = (int) ((((long) d10.f49042b) + j) - j11); i11 < iMin2; i11++) {
                if (d10.f49041a[i11] == b10) {
                    return ((long) (i11 - d10.f49042b)) + j11;
                }
            }
            j11 += (long) (d10.f49043c - d10.f49042b);
            d10 = d10.f49046f;
            i.b(d10);
            j = j11;
        }
        return -1L;
    }

    public final int s0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f49074c == 0) {
            throw new EOFException();
        }
        byte bP = p(0L);
        if ((bP & 128) == 0) {
            i10 = bP & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bP & 224) == 192) {
            i10 = bP & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bP & 240) == 224) {
            i10 = bP & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bP & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bP & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j = i11;
        if (this.f49074c < j) {
            StringBuilder sbE = f.e(i11, "size < ", ": ");
            sbE.append(this.f49074c);
            sbE.append(" (to read code point prefixed 0x");
            sbE.append(C2834a.d(bP));
            sbE.append(')');
            throw new EOFException(sbE.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j10 = i13;
            byte bP2 = p(j10);
            if ((bP2 & 192) != 128) {
                skip(j10);
                return 65533;
            }
            i10 = (i10 << 6) | (bP2 & 63);
        }
        skip(j);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // p318zb.InterfaceC2841h
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            D d10 = this.f49073b;
            if (d10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, d10.f49043c - d10.f49042b);
            long j10 = iMin;
            this.f49074c -= j10;
            j -= j10;
            int i10 = d10.f49042b + iMin;
            d10.f49042b = i10;
            if (i10 == d10.f49043c) {
                this.f49073b = d10.a();
                E.a(d10);
            }
        }
    }

    @Override // p318zb.F
    public final void t0(C2839f source, long j) {
        D dB;
        i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C2834a.b(source.f49074c, 0L, j);
        while (j > 0) {
            D d10 = source.f49073b;
            i.b(d10);
            int i10 = d10.f49043c;
            D d11 = source.f49073b;
            i.b(d11);
            long j10 = i10 - d11.f49042b;
            int i11 = 0;
            if (j < j10) {
                D d12 = this.f49073b;
                D d13 = d12 != null ? d12.f49047g : null;
                if (d13 != null && d13.f49045e) {
                    if ((((long) d13.f49043c) + j) - ((long) (d13.f49044d ? 0 : d13.f49042b)) <= 8192) {
                        D d14 = source.f49073b;
                        i.b(d14);
                        d14.d(d13, (int) j);
                        source.f49074c -= j;
                        this.f49074c += j;
                        return;
                    }
                }
                D d15 = source.f49073b;
                i.b(d15);
                int i12 = (int) j;
                if (i12 <= 0 || i12 > d15.f49043c - d15.f49042b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    dB = d15.c();
                } else {
                    dB = E.b();
                    int i13 = d15.f49042b;
                    d.s(d15.f49041a, dB.f49041a, 0, i13, i13 + i12, 2);
                }
                dB.f49043c = dB.f49042b + i12;
                d15.f49042b += i12;
                D d16 = d15.f49047g;
                i.b(d16);
                d16.b(dB);
                source.f49073b = dB;
            }
            D d17 = source.f49073b;
            i.b(d17);
            long j11 = d17.f49043c - d17.f49042b;
            source.f49073b = d17.a();
            D d18 = this.f49073b;
            if (d18 == null) {
                this.f49073b = d17;
                d17.f49047g = d17;
                d17.f49046f = d17;
            } else {
                D d19 = d18.f49047g;
                i.b(d19);
                d19.b(d17);
                D d20 = d17.f49047g;
                if (d20 == d17) {
                    throw new IllegalStateException("cannot compact");
                }
                i.b(d20);
                if (d20.f49045e) {
                    int i14 = d17.f49043c - d17.f49042b;
                    D d21 = d17.f49047g;
                    i.b(d21);
                    int i15 = 8192 - d21.f49043c;
                    D d22 = d17.f49047g;
                    i.b(d22);
                    if (!d22.f49044d) {
                        D d23 = d17.f49047g;
                        i.b(d23);
                        i11 = d23.f49042b;
                    }
                    if (i14 <= i15 + i11) {
                        D d24 = d17.f49047g;
                        i.b(d24);
                        d17.d(d24, i14);
                        d17.a();
                        E.a(d17);
                    }
                }
            }
            source.f49074c -= j11;
            this.f49074c += j11;
            j -= j11;
        }
    }

    @Override // p318zb.H
    public final I timeout() {
        return I.f49052d;
    }

    public final String toString() {
        return y0().toString();
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g w0(byte[] bArr) {
        P0(bArr);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        i.e(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            D dI0 = I0(1);
            int iMin = Math.min(i10, 8192 - dI0.f49043c);
            source.get(dI0.f49041a, dI0.f49043c, iMin);
            i10 -= iMin;
            dI0.f49043c += iMin;
        }
        this.f49074c += (long) iRemaining;
        return iRemaining;
    }

    public final long x(long j, ByteString targetBytes) {
        int i10;
        int i11;
        int i12;
        int i13;
        i.e(targetBytes, "targetBytes");
        long j10 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "fromIndex < 0: ").toString());
        }
        D d10 = this.f49073b;
        if (d10 == null) {
            return -1L;
        }
        long j11 = this.f49074c;
        if (j11 - j < j) {
            while (j11 > j) {
                d10 = d10.f49047g;
                i.b(d10);
                j11 -= (long) (d10.f49043c - d10.f49042b);
            }
            if (targetBytes.e() == 2) {
                byte bK = targetBytes.k(0);
                byte bK2 = targetBytes.k(1);
                while (j11 < this.f49074c) {
                    i12 = (int) ((((long) d10.f49042b) + j) - j11);
                    int i14 = d10.f49043c;
                    while (i12 < i14) {
                        byte b10 = d10.f49041a[i12];
                        if (b10 == bK || b10 == bK2) {
                            i13 = d10.f49042b;
                        } else {
                            i12++;
                        }
                    }
                    j11 += (long) (d10.f49043c - d10.f49042b);
                    d10 = d10.f49046f;
                    i.b(d10);
                    j = j11;
                }
                return -1L;
            }
            byte[] bArrJ = targetBytes.j();
            while (j11 < this.f49074c) {
                i12 = (int) ((((long) d10.f49042b) + j) - j11);
                int i15 = d10.f49043c;
                while (i12 < i15) {
                    byte b11 = d10.f49041a[i12];
                    for (byte b12 : bArrJ) {
                        if (b11 == b12) {
                            i13 = d10.f49042b;
                        }
                    }
                    i12++;
                }
                j11 += (long) (d10.f49043c - d10.f49042b);
                d10 = d10.f49046f;
                i.b(d10);
                j = j11;
            }
            return -1L;
            return ((long) (i12 - i13)) + j11;
        }
        while (true) {
            long j12 = ((long) (d10.f49043c - d10.f49042b)) + j10;
            if (j12 > j) {
                break;
            }
            d10 = d10.f49046f;
            i.b(d10);
            j10 = j12;
        }
        if (targetBytes.e() == 2) {
            byte bK3 = targetBytes.k(0);
            byte bK4 = targetBytes.k(1);
            while (j10 < this.f49074c) {
                i10 = (int) ((((long) d10.f49042b) + j) - j10);
                int i16 = d10.f49043c;
                while (i10 < i16) {
                    byte b13 = d10.f49041a[i10];
                    if (b13 == bK3 || b13 == bK4) {
                        i11 = d10.f49042b;
                    } else {
                        i10++;
                    }
                }
                j10 += (long) (d10.f49043c - d10.f49042b);
                d10 = d10.f49046f;
                i.b(d10);
                j = j10;
            }
            return -1L;
        }
        byte[] bArrJ2 = targetBytes.j();
        while (j10 < this.f49074c) {
            i10 = (int) ((((long) d10.f49042b) + j) - j10);
            int i17 = d10.f49043c;
            while (i10 < i17) {
                byte b14 = d10.f49041a[i10];
                for (byte b15 : bArrJ2) {
                    if (b14 == b15) {
                        i11 = d10.f49042b;
                    }
                }
                i10++;
            }
            j10 += (long) (d10.f49043c - d10.f49042b);
            d10 = d10.f49046f;
            i.b(d10);
            j = j10;
        }
        return -1L;
        return ((long) (i10 - i11)) + j10;
    }

    public final ByteString y0() {
        long j = this.f49074c;
        if (j <= 2147483647L) {
            return A0((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f49074c).toString());
    }

    @Override // p318zb.InterfaceC2840g
    public final /* bridge */ /* synthetic */ InterfaceC2840g z0(ByteString byteString) {
        K0(byteString);
        return this;
    }

    /* JADX INFO: renamed from: zb.f$b */
    /* JADX INFO: compiled from: Buffer.kt */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C2839f.this.f49074c, BrazeLogger.SUPPRESS);
        }

        @Override // java.io.InputStream
        public final int read() {
            C2839f c2839f = C2839f.this;
            if (c2839f.f49074c > 0) {
                return c2839f.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return C2839f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i10, int i11) {
            i.e(sink, "sink");
            return C2839f.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public final int read(byte[] sink, int i10, int i11) {
        i.e(sink, "sink");
        C2834a.b(sink.length, i10, i11);
        D d10 = this.f49073b;
        if (d10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, d10.f49043c - d10.f49042b);
        int i12 = d10.f49042b;
        d.l(i10, i12, i12 + iMin, d10.f49041a, sink);
        int i13 = d10.f49042b + iMin;
        d10.f49042b = i13;
        this.f49074c -= (long) iMin;
        if (i13 == d10.f49043c) {
            this.f49073b = d10.a();
            E.a(d10);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p318zb.F
    public final void close() {
    }

    @Override // p318zb.InterfaceC2841h
    public final C2839f f() {
        return this;
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() {
    }
}
