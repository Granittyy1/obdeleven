package F9;

import J4.i;
import com.braze.support.BrazeLogger;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p237t3.x;
import p318zb.B;
import p318zb.C;
import p318zb.C2839f;
import p318zb.H;
import p318zb.I;

/* JADX INFO: compiled from: Http2.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f3307a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f3308b;

    /* JADX INFO: compiled from: Http2.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f3315a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f3316b = new String[64];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String[] f3317c = new String[256];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f3317c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f3316b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i12 = iArr[0];
            strArr2[i12 | 8] = Q8.d.a(new StringBuilder(), strArr2[i12], "|PADDED");
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr2[i13];
                int i15 = iArr[0];
                String[] strArr3 = f3316b;
                int i16 = i15 | i14;
                strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr3[i15]);
                sb2.append('|');
                strArr3[i16 | 8] = Q8.d.a(sb2, strArr3[i14], "|PADDED");
            }
            while (true) {
                String[] strArr4 = f3316b;
                if (i10 >= strArr4.length) {
                    return;
                }
                if (strArr4[i10] == null) {
                    strArr4[i10] = f3317c[i10];
                }
                i10++;
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0066  */
        public static String a(boolean z10, int i10, int i11, byte b10, byte b11) {
            String strReplace;
            String str = b10 < 10 ? f3315a[b10] : String.format("0x%02x", Byte.valueOf(b10));
            if (b11 == 0) {
                strReplace = "";
            } else {
                String[] strArr = f3317c;
                if (b10 == 2 || b10 == 3) {
                    strReplace = strArr[b11];
                } else if (b10 == 4 || b10 == 6) {
                    strReplace = b11 == 1 ? "ACK" : strArr[b11];
                } else if (b10 == 7 || b10 == 8) {
                    strReplace = strArr[b11];
                } else {
                    String str2 = b11 < 64 ? f3316b[b11] : strArr[b11];
                    if (b10 != 5 || (b11 & 4) == 0) {
                        strReplace = (b10 != 0 || (b11 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                    } else {
                        strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                    }
                }
            }
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), str, strReplace);
        }
    }

    /* JADX INFO: compiled from: Http2.java */
    public static final class c implements F9.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f3318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f3319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final F9.d.a f3320d;

        public c(C c10) {
            this.f3318b = c10;
            a aVar = new a(c10);
            this.f3319c = aVar;
            this.f3320d = new F9.d.a(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b(io.grpc.okhttp.d.RunnableC0396d runnableC0396d) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            C c10 = this.f3318b;
            int i10 = 0;
            int i11 = 0;
            try {
                c10.N0(9L);
                int iA = e.a(c10);
                if (iA < 0 || iA > 16384) {
                    e.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                    throw null;
                }
                byte b10 = (byte) (c10.readByte() & 255);
                byte b11 = (byte) (c10.readByte() & 255);
                int iK = c10.k() & BrazeLogger.SUPPRESS;
                Logger logger = e.f3307a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.a(true, iK, iA, b10, b11));
                }
                switch (b10) {
                    case 0:
                        boolean z10 = (b11 & 1) != 0;
                        if ((b11 & 32) != 0) {
                            e.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short s10 = (b11 & 8) != 0 ? (short) (c10.readByte() & 255) : (short) 0;
                        runnableC0396d.a(z10, iK, c10, e.b(iA, b11, s10));
                        c10.skip(s10);
                        return true;
                    case 1:
                        if (iK == 0) {
                            e.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z11 = (b11 & 1) != 0;
                        short s11 = (b11 & 8) != 0 ? (short) (c10.readByte() & 255) : (short) 0;
                        if ((b11 & 32) != 0) {
                            c10.k();
                            c10.readByte();
                            iA -= 5;
                        }
                        runnableC0396d.c(z11, iK, c(e.b(iA, b11, s11), s11, b11, iK));
                        return true;
                    case 2:
                        if (iA != 5) {
                            e.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                            throw null;
                        }
                        if (iK == 0) {
                            e.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        c10.k();
                        c10.readByte();
                        return true;
                    case 3:
                        if (iA != 4) {
                            e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iA));
                            throw null;
                        }
                        if (iK == 0) {
                            e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int iK2 = c10.k();
                        ErrorCode[] errorCodeArrValues = ErrorCode.values();
                        int length = errorCodeArrValues.length;
                        while (true) {
                            if (i11 < length) {
                                errorCode = errorCodeArrValues[i11];
                                if (errorCode.httpCode != iK2) {
                                    i11++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            runnableC0396d.f(iK, errorCode);
                            return true;
                        }
                        e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iK2));
                        throw null;
                    case 4:
                        if (iK != 0) {
                            e.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((b11 & 1) == 0) {
                            if (iA % 6 != 0) {
                                e.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iA));
                                throw null;
                            }
                            x xVar = new x();
                            for (int i12 = 0; i12 < iA; i12 += 6) {
                                short sP = c10.p();
                                int iK3 = c10.k();
                                switch (sP) {
                                    case 1:
                                    case 6:
                                        break;
                                    case 2:
                                        if (iK3 != 0 && iK3 != 1) {
                                            e.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                    case 3:
                                        sP = 4;
                                        break;
                                    case 4:
                                        if (iK3 < 0) {
                                            e.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        sP = 7;
                                        break;
                                        break;
                                    case 5:
                                        if (iK3 < 16384 || iK3 > 16777215) {
                                            e.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iK3));
                                            throw null;
                                        }
                                        break;
                                    default:
                                        continue;
                                        break;
                                }
                                xVar.b(sP, iK3);
                            }
                            runnableC0396d.g(xVar);
                            int i13 = xVar.f47255a;
                            int i14 = i13 & 2;
                            int[] iArr = (int[]) xVar.f47256b;
                            if ((i14 != 0 ? iArr[1] : -1) >= 0) {
                                int i15 = (i13 & 2) != 0 ? iArr[1] : -1;
                                F9.d.a aVar = this.f3320d;
                                aVar.f3296c = i15;
                                aVar.f3297d = i15;
                                int i16 = aVar.f3301h;
                                if (i15 < i16) {
                                    if (i15 == 0) {
                                        Arrays.fill(aVar.f3298e, (Object) null);
                                        aVar.f3299f = aVar.f3298e.length - 1;
                                        aVar.f3300g = 0;
                                        aVar.f3301h = 0;
                                    } else {
                                        aVar.a(i16 - i15);
                                    }
                                }
                            }
                        } else if (iA != 0) {
                            e.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    case 5:
                        if (iK == 0) {
                            e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short s12 = (b11 & 8) != 0 ? (short) (c10.readByte() & 255) : (short) 0;
                        runnableC0396d.e(c(e.b(iA - 4, b11, s12), s12, b11, iK), iK, c10.k() & BrazeLogger.SUPPRESS);
                        return true;
                    case 6:
                        if (iA != 8) {
                            e.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        if (iK == 0) {
                            runnableC0396d.d(c10.k(), c10.k(), (b11 & 1) != 0);
                            return true;
                        }
                        e.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    case 7:
                        if (iA < 8) {
                            e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        if (iK != 0) {
                            e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int iK4 = c10.k();
                        int iK5 = c10.k();
                        int i17 = iA - 8;
                        ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                        int length2 = errorCodeArrValues2.length;
                        while (true) {
                            if (i10 < length2) {
                                errorCode2 = errorCodeArrValues2[i10];
                                if (errorCode2.httpCode != iK5) {
                                    i10++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 == null) {
                            e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iK5));
                            throw null;
                        }
                        ByteString byteStringI = ByteString.f45705d;
                        if (i17 > 0) {
                            byteStringI = c10.i(i17);
                        }
                        runnableC0396d.b(iK4, errorCode2, byteStringI);
                        return true;
                    case 8:
                        if (iA != 4) {
                            e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        long jK = ((long) c10.k()) & 2147483647L;
                        if (jK != 0) {
                            runnableC0396d.h(iK, jK);
                            return true;
                        }
                        e.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    default:
                        c10.skip(iA);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final ArrayList c(int i10, short s10, byte b10, int i11) throws IOException {
            a aVar = this.f3319c;
            aVar.f3313f = i10;
            aVar.f3310c = i10;
            aVar.f3314g = s10;
            aVar.f3311d = b10;
            aVar.f3312e = i11;
            while (true) {
                F9.d.a aVar2 = this.f3320d;
                C c10 = aVar2.f3295b;
                boolean zB = c10.b();
                ArrayList arrayList = aVar2.f3294a;
                if (zB) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    return arrayList2;
                }
                byte b11 = c10.readByte();
                int i12 = b11 & 255;
                if (i12 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b11 & 128) == 128) {
                    int iE = aVar2.e(i12, 127);
                    int i13 = iE - 1;
                    if (i13 >= 0) {
                        F9.c[] cVarArr = F9.d.f3292b;
                        if (i13 <= cVarArr.length - 1) {
                            arrayList.add(cVarArr[i13]);
                        }
                    }
                    int length = aVar2.f3299f + 1 + (i13 - F9.d.f3292b.length);
                    if (length >= 0) {
                        F9.c[] cVarArr2 = aVar2.f3298e;
                        if (length <= cVarArr2.length - 1) {
                            arrayList.add(cVarArr2[length]);
                        }
                    }
                    throw new IOException(i.b(iE, "Header index too large "));
                }
                if (i12 == 64) {
                    ByteString byteStringD = aVar2.d();
                    F9.d.a(byteStringD);
                    aVar2.c(new F9.c(byteStringD, aVar2.d()));
                } else if ((b11 & 64) == 64) {
                    aVar2.c(new F9.c(aVar2.b(aVar2.e(i12, 63) - 1), aVar2.d()));
                } else if ((b11 & 32) == 32) {
                    int iE2 = aVar2.e(i12, 31);
                    aVar2.f3297d = iE2;
                    if (iE2 < 0 || iE2 > aVar2.f3296c) {
                        throw new IOException("Invalid dynamic table size update " + aVar2.f3297d);
                    }
                    int i14 = aVar2.f3301h;
                    if (iE2 < i14) {
                        if (iE2 == 0) {
                            Arrays.fill(aVar2.f3298e, (Object) null);
                            aVar2.f3299f = aVar2.f3298e.length - 1;
                            aVar2.f3300g = 0;
                            aVar2.f3301h = 0;
                        } else {
                            aVar2.a(i14 - iE2);
                        }
                    }
                } else if (i12 == 16 || i12 == 0) {
                    ByteString byteStringD2 = aVar2.d();
                    F9.d.a(byteStringD2);
                    arrayList.add(new F9.c(byteStringD2, aVar2.d()));
                } else {
                    arrayList.add(new F9.c(aVar2.b(aVar2.e(i12, 15) - 1), aVar2.d()));
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f3318b.close();
        }
    }

    /* JADX INFO: compiled from: Http2.java */
    public static final class d implements F9.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f3321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2839f f3322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final F9.d.b f3323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3325f;

        public d(B b10) {
            this.f3321b = b10;
            C2839f c2839f = new C2839f();
            this.f3322c = c2839f;
            this.f3323d = new F9.d.b(c2839f);
            this.f3324e = 16384;
        }

        @Override // F9.b
        public final synchronized void D(x xVar) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            int i10 = this.f3324e;
            if ((xVar.f47255a & 32) != 0) {
                i10 = ((int[]) xVar.f47256b)[5];
            }
            this.f3324e = i10;
            b(0, 0, (byte) 4, (byte) 1);
            this.f3321b.flush();
        }

        @Override // F9.b
        public final synchronized void F() throws IOException {
            try {
                if (this.f3325f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                Logger logger = e.f3307a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + e.f3308b.f());
                }
                this.f3321b.w0(e.f3308b.u());
                this.f3321b.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // F9.b
        public final synchronized void K(ErrorCode errorCode, byte[] bArr) throws IOException {
            try {
                if (this.f3325f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                if (errorCode.httpCode == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f3321b.c(0);
                this.f3321b.c(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.f3321b.w0(bArr);
                }
                this.f3321b.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // F9.b
        public final int M0() {
            return this.f3324e;
        }

        @Override // F9.b
        public final synchronized void Q(int i10, long j) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            b(i10, 4, (byte) 8, (byte) 0);
            this.f3321b.c((int) j);
            this.f3321b.flush();
        }

        @Override // F9.b
        public final synchronized void W(int i10, int i11, boolean z10) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            b(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f3321b.c(i10);
            this.f3321b.c(i11);
            this.f3321b.flush();
        }

        @Override // F9.b
        public final synchronized void W0(boolean z10, int i10, ArrayList arrayList) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            c(z10, i10, arrayList);
        }

        @Override // F9.b
        public final synchronized void Y0(int i10, ErrorCode errorCode) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            b(i10, 4, (byte) 3, (byte) 0);
            this.f3321b.c(errorCode.httpCode);
            this.f3321b.flush();
        }

        public final void b(int i10, int i11, byte b10, byte b11) throws IOException {
            Logger logger = e.f3307a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.a(false, i10, i11, b10, b11));
            }
            int i12 = this.f3324e;
            if (i11 > i12) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(A8.f.d(i12, i11, "FRAME_SIZE_ERROR length > ", ": "));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException(i.b(i10, "reserved bit set: "));
            }
            B b12 = this.f3321b;
            b12.E((i11 >>> 16) & 255);
            b12.E((i11 >>> 8) & 255);
            b12.E(i11 & 255);
            b12.E(b10 & 255);
            b12.E(b11 & 255);
            b12.c(i10 & BrazeLogger.SUPPRESS);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public final void c(boolean z10, int i10, ArrayList arrayList) throws IOException {
            int length;
            int length2;
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            F9.d.b bVar = this.f3323d;
            bVar.getClass();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                F9.c cVar = (F9.c) arrayList.get(i11);
                ByteString byteStringT = cVar.f3288a.t();
                Integer num = F9.d.f3293c.get(byteStringT);
                ByteString byteString = cVar.f3289b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = length2;
                        length2 = -1;
                    } else {
                        F9.c[] cVarArr = F9.d.f3292b;
                        if (cVarArr[iIntValue].f3289b.equals(byteString)) {
                            length = length2;
                        } else if (cVarArr[length2].f3289b.equals(byteString)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i12 = bVar.f3305d + 1;
                    while (true) {
                        F9.c[] cVarArr2 = bVar.f3303b;
                        if (i12 >= cVarArr2.length) {
                            break;
                        }
                        if (cVarArr2[i12].f3288a.equals(byteStringT)) {
                            if (bVar.f3303b[i12].f3289b.equals(byteString)) {
                                length2 = (i12 - bVar.f3305d) + F9.d.f3292b.length;
                                break;
                            } else if (length == -1) {
                                length = (i12 - bVar.f3305d) + F9.d.f3292b.length;
                            }
                        }
                        i12++;
                    }
                }
                if (length2 != -1) {
                    bVar.c(length2, 127, 128);
                } else if (length == -1) {
                    bVar.f3302a.Z0(64);
                    bVar.b(byteStringT);
                    bVar.b(byteString);
                    bVar.a(cVar);
                } else if (!byteStringT.q(F9.d.f3291a) || F9.c.f3287h.equals(byteStringT)) {
                    bVar.c(length, 63, 64);
                    bVar.b(byteString);
                    bVar.a(cVar);
                } else {
                    bVar.c(length, 15, 0);
                    bVar.b(byteString);
                }
            }
            C2839f c2839f = this.f3322c;
            long j = c2839f.f49074c;
            int iMin = (int) Math.min(this.f3324e, j);
            long j10 = iMin;
            byte b10 = j == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            b(i10, iMin, (byte) 1, b10);
            B b11 = this.f3321b;
            b11.t0(c2839f, j10);
            if (j > j10) {
                long j11 = j - j10;
                while (j11 > 0) {
                    int iMin2 = (int) Math.min(this.f3324e, j11);
                    long j12 = iMin2;
                    j11 -= j12;
                    b(i10, iMin2, (byte) 9, j11 == 0 ? (byte) 4 : (byte) 0);
                    b11.t0(c2839f, j12);
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f3325f = true;
            this.f3321b.close();
        }

        @Override // F9.b
        public final synchronized void flush() throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.f3321b.flush();
        }

        @Override // F9.b
        public final synchronized void n(x xVar) throws IOException {
            int i10;
            try {
                if (this.f3325f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                int i11 = 0;
                b(0, Integer.bitCount(xVar.f47255a) * 6, (byte) 4, (byte) 0);
                while (i11 < 10) {
                    if (xVar.a(i11)) {
                        if (i11 == 4) {
                            i10 = 3;
                        } else {
                            i10 = i11 == 7 ? 4 : i11;
                        }
                        this.f3321b.h(i10);
                        this.f3321b.c(((int[]) xVar.f47256b)[i11]);
                    }
                    i11++;
                }
                this.f3321b.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // F9.b
        public final synchronized void v(boolean z10, int i10, C2839f c2839f, int i11) throws IOException {
            if (this.f3325f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            b(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
            if (i11 > 0) {
                this.f3321b.t0(c2839f, i11);
            }
        }
    }

    static {
        ByteString byteString = ByteString.f45705d;
        f3308b = ByteString.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(C c10) throws IOException {
        return (c10.readByte() & 255) | ((c10.readByte() & 255) << 16) | ((c10.readByte() & 255) << 8);
    }

    public static int b(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: compiled from: Http2.java */
    public static final class a implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f3309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f3311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public short f3314g;

        public a(C c10) {
            this.f3309b = c10;
        }

        @Override // p318zb.H
        public final long l0(C2839f c2839f, long j) throws IOException {
            int i10;
            int iK;
            do {
                int i11 = this.f3313f;
                C c10 = this.f3309b;
                if (i11 != 0) {
                    long jL0 = c10.l0(c2839f, Math.min(j, i11));
                    if (jL0 == -1) {
                        return -1L;
                    }
                    this.f3313f -= (int) jL0;
                    return jL0;
                }
                c10.skip(this.f3314g);
                this.f3314g = (short) 0;
                if ((this.f3311d & 4) != 0) {
                    return -1L;
                }
                i10 = this.f3312e;
                int iA = e.a(c10);
                this.f3313f = iA;
                this.f3310c = iA;
                byte b10 = (byte) (c10.readByte() & 255);
                this.f3311d = (byte) (c10.readByte() & 255);
                Logger logger = e.f3307a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.a(true, this.f3312e, this.f3310c, b10, this.f3311d));
                }
                iK = c10.k() & BrazeLogger.SUPPRESS;
                this.f3312e = iK;
                if (b10 != 9) {
                    e.c("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                    throw null;
                }
            } while (iK == i10);
            e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // p318zb.H
        public final I timeout() {
            return this.f3309b.f49037b.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
