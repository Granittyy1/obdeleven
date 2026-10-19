package rb;

import com.braze.support.BrazeLogger;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p318zb.C;
import p318zb.C2839f;
import p318zb.H;
import p318zb.I;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f46619e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f46620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f46621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb.b.a f46622d;

    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class a {
        public static int a(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(A8.f.d(i12, i10, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(Http2::class.java.name)");
        f46619e = logger;
    }

    public o(C source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f46620b = source;
        b bVar = new b(source);
        this.f46621c = bVar;
        this.f46622d = new rb.b.a(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    public final boolean b(boolean z10, d.c cVar) throws IOException {
        ErrorCode errorCode;
        int iK;
        ByteString debugData;
        d dVar;
        p[] pVarArr;
        int length;
        p pVar;
        C c10 = this.f46620b;
        int i10 = 0;
        try {
            c10.N0(9L);
            int iT = p172nb.b.t(c10);
            if (iT > 16384) {
                throw new IOException(J4.i.b(iT, "FRAME_SIZE_ERROR: "));
            }
            int i11 = c10.readByte() & 255;
            byte b10 = c10.readByte();
            int i12 = b10 & 255;
            int iK2 = c10.k();
            int i13 = iK2 & BrazeLogger.SUPPRESS;
            Level level = Level.FINE;
            Logger logger = f46619e;
            if (logger.isLoggable(level)) {
                c.f46543a.getClass();
                logger.fine(c.a(true, i13, iT, i11, i12));
            }
            if (z10 && i11 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                c.f46543a.getClass();
                String[] strArr = c.f46545c;
                sb2.append(i11 < strArr.length ? strArr[i11] : p172nb.b.i("0x%02x", Integer.valueOf(i11)));
                throw new IOException(sb2.toString());
            }
            ErrorCode errorCode2 = null;
            switch (i11) {
                case 0:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (b10 & 1) != 0;
                    if ((b10 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    i10 = (8 & b10) != 0 ? c10.readByte() & 255 : 0;
                    cVar.a(z11, i13, c10, a.a(iT, i12, i10));
                    c10.skip(i10);
                    return true;
                case 1:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (b10 & 1) != 0;
                    i10 = (8 & b10) != 0 ? c10.readByte() & 255 : 0;
                    if ((b10 & 32) != 0) {
                        h(cVar, i13);
                        iT -= 5;
                    }
                    cVar.c(z12, i13, c(a.a(iT, i12, i10), i10, i12, i13));
                    return true;
                case 2:
                    if (iT != 5) {
                        throw new IOException(J4.i.c(iT, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    h(cVar, i13);
                    return true;
                case 3:
                    if (iT != 4) {
                        throw new IOException(J4.i.c(iT, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iK3 = c10.k();
                    ErrorCode[] errorCodeArrValues = ErrorCode.values();
                    int length2 = errorCodeArrValues.length;
                    while (true) {
                        if (i10 < length2) {
                            errorCode = errorCodeArrValues[i10];
                            if (errorCode.a() != iK3) {
                                i10++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(J4.i.b(iK3, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    d dVar2 = d.this;
                    dVar2.getClass();
                    if (i13 == 0 || (iK2 & 1) != 0) {
                        p pVarI = dVar2.i(i13);
                        if (pVarI != null) {
                            pVarI.j(errorCode);
                        }
                    } else {
                        dVar2.j.c(new l(dVar2.f46551d + '[' + i13 + "] onReset", dVar2, i13, errorCode), 0L);
                    }
                    return true;
                case 4:
                    if (i13 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) == 0) {
                        if (iT % 6 != 0) {
                            throw new IOException(J4.i.b(iT, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        t tVar = new t();
                        Na.g gVarI = Na.l.I(6, Na.l.J(0, iT));
                        int i14 = gVarI.f4687b;
                        int i15 = gVarI.f4688c;
                        int i16 = gVarI.f4689d;
                        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                            while (true) {
                                short sP = c10.p();
                                byte[] bArr = p172nb.b.f45026a;
                                int i17 = sP & 65535;
                                iK = c10.k();
                                if (i17 != 2) {
                                    if (i17 == 3) {
                                        i17 = 4;
                                    } else if (i17 == 4) {
                                        if (iK < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i17 = 7;
                                    } else if (i17 == 5 && (iK < 16384 || iK > 16777215)) {
                                    }
                                } else if (iK != 0 && iK != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                tVar.c(i17, iK);
                                if (i14 != i15) {
                                    i14 += i16;
                                }
                            }
                            throw new IOException(J4.i.b(iK, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        d dVar3 = d.this;
                        dVar3.f46556i.c(new h(Q8.d.a(new StringBuilder(), dVar3.f46551d, " applyAndAckSettings"), cVar, tVar), 0L);
                    } else if (iT != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    return true;
                case 5:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    i10 = (8 & b10) != 0 ? c10.readByte() & 255 : 0;
                    cVar.d(c10.k() & BrazeLogger.SUPPRESS, c(a.a(iT - 4, i12, i10), i10, i12, i13));
                    return true;
                case 6:
                    if (iT != 8) {
                        throw new IOException(J4.i.b(iT, "TYPE_PING length != 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int iK4 = c10.k();
                    int iK5 = c10.k();
                    if ((b10 & 1) != 0) {
                        d dVar4 = d.this;
                        synchronized (dVar4) {
                            try {
                                if (iK4 == 1) {
                                    dVar4.f46559m++;
                                } else if (iK4 != 2) {
                                    if (iK4 == 3) {
                                        dVar4.notifyAll();
                                    }
                                    p293xa.r rVar = p293xa.r.f47939a;
                                } else {
                                    dVar4.f46561o++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        d.this.f46556i.c(new g(Q8.d.a(new StringBuilder(), d.this.f46551d, " ping"), d.this, iK4, iK5), 0L);
                    }
                    return true;
                case 7:
                    if (iT < 8) {
                        throw new IOException(J4.i.b(iT, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int iK6 = c10.k();
                    int iK7 = c10.k();
                    int i18 = iT - 8;
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if (errorCode3.a() == iK7) {
                            errorCode2 = errorCode3;
                            if (errorCode2 != null) {
                                throw new IOException(J4.i.b(iK7, "TYPE_GOAWAY unexpected error code: "));
                            }
                            debugData = ByteString.f45705d;
                            if (i18 > 0) {
                                debugData = c10.i(i18);
                            }
                            kotlin.jvm.internal.i.e(debugData, "debugData");
                            debugData.e();
                            dVar = d.this;
                            synchronized (dVar) {
                                Object[] array = dVar.f46550c.values().toArray(new p[0]);
                                dVar.f46554g = true;
                                p293xa.r rVar2 = p293xa.r.f47939a;
                            }
                            pVarArr = (p[]) array;
                            length = pVarArr.length;
                            while (i10 < length) {
                                pVar = pVarArr[i10];
                                if (pVar.f46629a <= iK6 && pVar.g()) {
                                    pVar.j(ErrorCode.REFUSED_STREAM);
                                    d.this.i(pVar.f46629a);
                                }
                                i10++;
                            }
                            return true;
                        }
                    }
                    if (errorCode2 != null) {
                        throw new IOException(J4.i.b(iK7, "TYPE_GOAWAY unexpected error code: "));
                    }
                    debugData = ByteString.f45705d;
                    if (i18 > 0) {
                        debugData = c10.i(i18);
                    }
                    kotlin.jvm.internal.i.e(debugData, "debugData");
                    debugData.e();
                    dVar = d.this;
                    synchronized (dVar) {
                        Object[] array2 = dVar.f46550c.values().toArray(new p[0]);
                        dVar.f46554g = true;
                        p293xa.r rVar3 = p293xa.r.f47939a;
                        pVarArr = (p[]) array2;
                        length = pVarArr.length;
                        while (i10 < length) {
                            pVar = pVarArr[i10];
                            if (pVar.f46629a <= iK6) {
                            }
                            i10++;
                        }
                        return true;
                    }
                case 8:
                    if (iT != 4) {
                        throw new IOException(J4.i.b(iT, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long jK = ((long) c10.k()) & 2147483647L;
                    if (jK == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i13 == 0) {
                        d dVar5 = d.this;
                        synchronized (dVar5) {
                            dVar5.f46568v += jK;
                            dVar5.notifyAll();
                            p293xa.r rVar4 = p293xa.r.f47939a;
                        }
                    } else {
                        p pVarH = d.this.h(i13);
                        if (pVarH != null) {
                            synchronized (pVarH) {
                                pVarH.f46634f += jK;
                                if (jK > 0) {
                                    pVarH.notifyAll();
                                }
                                p293xa.r rVar5 = p293xa.r.f47939a;
                            }
                        }
                    }
                    return true;
                default:
                    c10.skip(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final List<rb.a> c(int i10, int i11, int i12, int i13) throws IOException {
        b bVar = this.f46621c;
        bVar.f46627f = i10;
        bVar.f46624c = i10;
        bVar.f46628g = i11;
        bVar.f46625d = i12;
        bVar.f46626e = i13;
        while (true) {
            rb.b.a aVar = this.f46622d;
            C c10 = aVar.f46529c;
            boolean zB = c10.b();
            ArrayList arrayList = aVar.f46528b;
            if (zB) {
                List<rb.a> listO0 = kotlin.collections.q.o0(arrayList);
                arrayList.clear();
                return listO0;
            }
            byte b10 = c10.readByte();
            byte[] bArr = p172nb.b.f45026a;
            int i14 = b10 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = aVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    rb.a[] aVarArr = rb.b.f46525a;
                    if (i15 <= aVarArr.length - 1) {
                        arrayList.add(aVarArr[i15]);
                    }
                }
                int length = aVar.f46531e + 1 + (i15 - rb.b.f46525a.length);
                if (length >= 0) {
                    rb.a[] aVarArr2 = aVar.f46530d;
                    if (length < aVarArr2.length) {
                        rb.a aVar2 = aVarArr2[length];
                        kotlin.jvm.internal.i.b(aVar2);
                        arrayList.add(aVar2);
                    }
                }
                throw new IOException(J4.i.b(iE, "Header index too large "));
            }
            if (i14 == 64) {
                rb.a[] aVarArr3 = rb.b.f46525a;
                ByteString byteStringD = aVar.d();
                rb.b.a(byteStringD);
                aVar.c(new rb.a(byteStringD, aVar.d()));
            } else if ((b10 & 64) == 64) {
                aVar.c(new rb.a(aVar.b(aVar.e(i14, 63) - 1), aVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = aVar.e(i14, 31);
                aVar.f46527a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + aVar.f46527a);
                }
                int i16 = aVar.f46533g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        rb.a[] aVarArr4 = aVar.f46530d;
                        Q3.d.w(aVarArr4, null, 0, aVarArr4.length);
                        aVar.f46531e = aVar.f46530d.length - 1;
                        aVar.f46532f = 0;
                        aVar.f46533g = 0;
                    } else {
                        aVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                rb.a[] aVarArr5 = rb.b.f46525a;
                ByteString byteStringD2 = aVar.d();
                rb.b.a(byteStringD2);
                arrayList.add(new rb.a(byteStringD2, aVar.d()));
            } else {
                arrayList.add(new rb.a(aVar.b(aVar.e(i14, 15) - 1), aVar.d()));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46620b.close();
    }

    public final void h(d.c cVar, int i10) throws IOException {
        C c10 = this.f46620b;
        c10.k();
        c10.readByte();
        byte[] bArr = p172nb.b.f45026a;
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class b implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f46623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f46628g;

        public b(C source) {
            kotlin.jvm.internal.i.e(source, "source");
            this.f46623b = source;
        }

        @Override // p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            int i10;
            int iK;
            kotlin.jvm.internal.i.e(sink, "sink");
            do {
                int i11 = this.f46627f;
                C c10 = this.f46623b;
                if (i11 != 0) {
                    long jL0 = c10.l0(sink, Math.min(j, i11));
                    if (jL0 == -1) {
                        return -1L;
                    }
                    this.f46627f -= (int) jL0;
                    return jL0;
                }
                c10.skip(this.f46628g);
                this.f46628g = 0;
                if ((this.f46625d & 4) != 0) {
                    return -1L;
                }
                i10 = this.f46626e;
                int iT = p172nb.b.t(c10);
                this.f46627f = iT;
                this.f46624c = iT;
                int i12 = c10.readByte() & 255;
                this.f46625d = c10.readByte() & 255;
                Logger logger = o.f46619e;
                if (logger.isLoggable(Level.FINE)) {
                    c cVar = c.f46543a;
                    int i13 = this.f46626e;
                    int i14 = this.f46624c;
                    int i15 = this.f46625d;
                    cVar.getClass();
                    logger.fine(c.a(true, i13, i14, i12, i15));
                }
                iK = c10.k() & BrazeLogger.SUPPRESS;
                this.f46626e = iK;
                if (i12 != 9) {
                    throw new IOException(i12 + " != TYPE_CONTINUATION");
                }
            } while (iK == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // p318zb.H
        public final I timeout() {
            return this.f46623b.f49037b.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
