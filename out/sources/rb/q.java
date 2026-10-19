package rb;

import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import p318zb.B;
import p318zb.C2839f;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f46653g = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f46654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f46655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b.C0526b f46658f;

    public q(B sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f46654b = sink;
        C2839f c2839f = new C2839f();
        this.f46655c = c2839f;
        this.f46656d = 16384;
        this.f46658f = new b.C0526b(c2839f);
    }

    public final synchronized void Q(int i10, long j) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        c(i10, 4, 8, 0);
        this.f46654b.c((int) j);
        this.f46654b.flush();
    }

    public final synchronized void W(int i10, int i11, boolean z10) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        c(0, 8, 6, z10 ? 1 : 0);
        this.f46654b.c(i10);
        this.f46654b.c(i11);
        this.f46654b.flush();
    }

    public final synchronized void b(t peerSettings) throws IOException {
        try {
            kotlin.jvm.internal.i.e(peerSettings, "peerSettings");
            if (this.f46657e) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            int i10 = this.f46656d;
            int i11 = peerSettings.f46666a;
            if ((i11 & 32) != 0) {
                i10 = peerSettings.f46667b[5];
            }
            this.f46656d = i10;
            if (((i11 & 2) != 0 ? peerSettings.f46667b[1] : -1) != -1) {
                b.C0526b c0526b = this.f46658f;
                int i12 = (i11 & 2) != 0 ? peerSettings.f46667b[1] : -1;
                c0526b.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = c0526b.f46538e;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        c0526b.f46536c = Math.min(c0526b.f46536c, iMin);
                    }
                    c0526b.f46537d = true;
                    c0526b.f46538e = iMin;
                    int i14 = c0526b.f46542i;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            a[] aVarArr = c0526b.f46539f;
                            Q3.d.w(aVarArr, null, 0, aVarArr.length);
                            c0526b.f46540g = c0526b.f46539f.length - 1;
                            c0526b.f46541h = 0;
                            c0526b.f46542i = 0;
                        } else {
                            c0526b.a(i14 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f46654b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(int i10, int i11, int i12, int i13) throws IOException {
        Level level = Level.FINE;
        Logger logger = f46653g;
        if (logger.isLoggable(level)) {
            c.f46543a.getClass();
            logger.fine(c.a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f46656d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f46656d + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = p172nb.b.f45026a;
        B b10 = this.f46654b;
        kotlin.jvm.internal.i.e(b10, "<this>");
        b10.E((i11 >>> 16) & 255);
        b10.E((i11 >>> 8) & 255);
        b10.E(i11 & 255);
        b10.E(i12 & 255);
        b10.E(i13 & 255);
        b10.c(i10 & BrazeLogger.SUPPRESS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f46657e = true;
        this.f46654b.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        this.f46654b.flush();
    }

    public final synchronized void h(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (errorCode.a() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, bArr.length + 8, 7, 0);
        this.f46654b.c(i10);
        this.f46654b.c(errorCode.a());
        if (bArr.length != 0) {
            this.f46654b.w0(bArr);
        }
        this.f46654b.flush();
    }

    public final synchronized void i(boolean z10, int i10, ArrayList arrayList) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        this.f46658f.d(arrayList);
        long j = this.f46655c.f49074c;
        long jMin = Math.min(this.f46656d, j);
        int i11 = j == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        c(i10, (int) jMin, 1, i11);
        this.f46654b.t0(this.f46655c, jMin);
        if (j > jMin) {
            long j10 = j - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f46656d, j10);
                j10 -= jMin2;
                c(i10, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f46654b.t0(this.f46655c, jMin2);
            }
        }
    }

    public final synchronized void j(int i10, ErrorCode errorCode) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (errorCode.a() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i10, 4, 3, 0);
        this.f46654b.c(errorCode.a());
        this.f46654b.flush();
    }

    public final synchronized void v(boolean z10, int i10, C2839f c2839f, int i11) throws IOException {
        if (this.f46657e) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        c(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            kotlin.jvm.internal.i.b(c2839f);
            this.f46654b.t0(c2839f, i11);
        }
    }
}
