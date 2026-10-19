package p318zb;

import C4.b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f49105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f49106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f49107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f49108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CRC32 f49109f;

    public p(H source) {
        i.e(source, "source");
        C c10 = new C(source);
        this.f49106c = c10;
        Inflater inflater = new Inflater(true);
        this.f49107d = inflater;
        this.f49108e = new q(c10, inflater);
        this.f49109f = new CRC32();
    }

    public static void b(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbF = b.f(str, ": actual 0x");
        sbF.append(n.W(8, C2834a.e(i11)));
        sbF.append(" != expected 0x");
        sbF.append(n.W(8, C2834a.e(i10)));
        throw new IOException(sbF.toString());
    }

    public final void c(C2839f c2839f, long j, long j10) {
        D d10 = c2839f.f49073b;
        i.b(d10);
        while (true) {
            int i10 = d10.f49043c;
            int i11 = d10.f49042b;
            if (j < i10 - i11) {
                break;
            }
            j -= (long) (i10 - i11);
            d10 = d10.f49046f;
            i.b(d10);
        }
        while (j10 > 0) {
            int i12 = (int) (((long) d10.f49042b) + j);
            int iMin = (int) Math.min(d10.f49043c - i12, j10);
            this.f49109f.update(d10.f49041a, i12, iMin);
            j10 -= (long) iMin;
            d10 = d10.f49046f;
            i.b(d10);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f49108e.close();
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) throws IOException {
        C c10;
        long j10;
        i.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b10 = this.f49105b;
        CRC32 crc32 = this.f49109f;
        C c11 = this.f49106c;
        if (b10 == 0) {
            c11.N0(10L);
            C2839f c2839f = c11.f49038c;
            byte bP = c2839f.p(3L);
            boolean z10 = ((bP >> 1) & 1) == 1;
            if (z10) {
                c(c11.f49038c, 0L, 10L);
            }
            b("ID1ID2", 8075, c11.p());
            c11.skip(8L);
            if (((bP >> 2) & 1) == 1) {
                c11.N0(2L);
                if (z10) {
                    c(c11.f49038c, 0L, 2L);
                }
                long jB0 = c2839f.B0() & 65535;
                c11.N0(jB0);
                if (z10) {
                    c(c11.f49038c, 0L, jB0);
                    j10 = jB0;
                } else {
                    j10 = jB0;
                }
                c11.skip(j10);
            }
            if (((bP >> 3) & 1) == 1) {
                c10 = c11;
                long jC = c11.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    c(c10.f49038c, 0L, jC + 1);
                }
                c10.skip(jC + 1);
            } else {
                c10 = c11;
            }
            if (((bP >> 4) & 1) == 1) {
                long jC2 = c10.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    c(c10.f49038c, 0L, jC2 + 1);
                }
                c10.skip(jC2 + 1);
            }
            if (z10) {
                b("FHCRC", c10.B0(), (short) crc32.getValue());
                crc32.reset();
            }
            this.f49105b = (byte) 1;
        } else {
            c10 = c11;
        }
        if (this.f49105b == 1) {
            long j11 = sink.f49074c;
            long jL0 = this.f49108e.l0(sink, j);
            if (jL0 != -1) {
                c(sink, j11, jL0);
                return jL0;
            }
            this.f49105b = (byte) 2;
        }
        if (this.f49105b != 2) {
            return -1L;
        }
        b("CRC", c10.q0(), (int) crc32.getValue());
        b("ISIZE", c10.q0(), (int) this.f49107d.getBytesWritten());
        this.f49105b = (byte) 3;
        if (c10.b()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49106c.f49037b.timeout();
    }
}
