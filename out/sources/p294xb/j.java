package p294xb;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.i;
import okio.ByteString;
import p241t7.b;
import p318zb.B;
import p318zb.C2834a;
import p318zb.C2839f;
import p318zb.C2842i;
import p318zb.D;

/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f48002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f48003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2839f f48007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2839f f48008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48009i;
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f48010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2839f.a f48011l;

    public j(B sink, Random random, boolean z10, boolean z11, long j) {
        i.e(sink, "sink");
        this.f48002b = sink;
        this.f48003c = random;
        this.f48004d = z10;
        this.f48005e = z11;
        this.f48006f = j;
        this.f48007g = new C2839f();
        this.f48008h = sink.f49034c;
        this.f48010k = new byte[4];
        this.f48011l = new C2839f.a();
    }

    public final void b(int i10, ByteString byteString) throws IOException {
        if (this.f48009i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        int iE = byteString.e();
        if (iE > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C2839f c2839f = this.f48008h;
        c2839f.Z0(i10 | 128);
        c2839f.Z0(iE | 128);
        byte[] bArr = this.f48010k;
        i.b(bArr);
        this.f48003c.nextBytes(bArr);
        c2839f.P0(bArr);
        if (iE > 0) {
            long j = c2839f.f49074c;
            c2839f.K0(byteString);
            C2839f.a aVar = this.f48011l;
            i.b(aVar);
            c2839f.M(aVar);
            aVar.c(j);
            h.a(aVar, bArr);
            aVar.close();
        }
        this.f48002b.flush();
    }

    public final void c(int i10, ByteString byteString) throws IOException {
        if (this.f48009i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f = this.f48007g;
        c2839f.K0(byteString);
        int i11 = i10 | 128;
        if (this.f48004d && byteString.e() >= this.f48006f) {
            a aVar = this.j;
            if (aVar == null) {
                aVar = new a(this.f48005e);
                this.j = aVar;
            }
            C2839f c2839f2 = aVar.f47941c;
            if (c2839f2.f49074c != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f47940b) {
                aVar.f47942d.reset();
            }
            long j = c2839f.f49074c;
            C2842i c2842i = aVar.f47943e;
            c2842i.t0(c2839f, j);
            c2842i.flush();
            ByteString byteString2 = b.f47944a;
            if (c2839f2.c0(c2839f2.f49074c - ((long) byteString2.e()), byteString2)) {
                long j10 = c2839f2.f49074c - ((long) 4);
                C2839f.a aVarM = c2839f2.M(C2834a.f49060a);
                try {
                    aVarM.b(j10);
                    b.n(aVarM, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.n(aVarM, th);
                        throw th2;
                    }
                }
            } else {
                c2839f2.Z0(0);
            }
            c2839f.t0(c2839f2, c2839f2.f49074c);
            i11 = i10 | 192;
        }
        long j11 = c2839f.f49074c;
        C2839f c2839f3 = this.f48008h;
        c2839f3.Z0(i11);
        if (j11 <= 125) {
            c2839f3.Z0(((int) j11) | 128);
        } else if (j11 <= 65535) {
            c2839f3.Z0(254);
            c2839f3.d1((int) j11);
        } else {
            c2839f3.Z0(255);
            D dI0 = c2839f3.I0(8);
            int i12 = dI0.f49043c;
            byte[] bArr = dI0.f49041a;
            bArr[i12] = (byte) ((j11 >>> 56) & 255);
            bArr[i12 + 1] = (byte) ((j11 >>> 48) & 255);
            bArr[i12 + 2] = (byte) ((j11 >>> 40) & 255);
            bArr[i12 + 3] = (byte) ((j11 >>> 32) & 255);
            bArr[i12 + 4] = (byte) ((j11 >>> 24) & 255);
            bArr[i12 + 5] = (byte) ((j11 >>> 16) & 255);
            bArr[i12 + 6] = (byte) ((j11 >>> 8) & 255);
            bArr[i12 + 7] = (byte) (j11 & 255);
            dI0.f49043c = i12 + 8;
            c2839f3.f49074c += 8;
        }
        byte[] bArr2 = this.f48010k;
        i.b(bArr2);
        this.f48003c.nextBytes(bArr2);
        c2839f3.P0(bArr2);
        if (j11 > 0) {
            C2839f.a aVar2 = this.f48011l;
            i.b(aVar2);
            c2839f.M(aVar2);
            aVar2.c(0L);
            h.a(aVar2, bArr2);
            aVar2.close();
        }
        c2839f3.t0(c2839f, j11);
        B b10 = this.f48002b;
        if (b10.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f4 = b10.f49034c;
        long j12 = c2839f4.f49074c;
        if (j12 > 0) {
            b10.f49033b.t0(c2839f4, j12);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        a aVar = this.j;
        if (aVar != null) {
            aVar.close();
        }
    }
}
