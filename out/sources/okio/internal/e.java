package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.i;
import p318zb.C2839f;
import p318zb.H;
import p318zb.n;

/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45723e;

    public e(H h8, long j, boolean z10) {
        super(h8);
        this.f45721c = j;
        this.f45722d = z10;
    }

    @Override // p318zb.n, p318zb.H
    public final long l0(C2839f sink, long j) throws IOException {
        i.e(sink, "sink");
        long j10 = this.f45723e;
        long j11 = this.f45721c;
        if (j10 > j11) {
            j = 0;
        } else if (this.f45722d) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j = Math.min(j, j12);
        }
        long jL0 = super.l0(sink, j);
        if (jL0 != -1) {
            this.f45723e += jL0;
        }
        long j13 = this.f45723e;
        if ((j13 >= j11 || jL0 != -1) && j13 <= j11) {
            return jL0;
        }
        if (jL0 > 0 && j13 > j11) {
            long j14 = sink.f49074c - (j13 - j11);
            C2839f c2839f = new C2839f();
            c2839f.k0(sink);
            sink.t0(c2839f, j14);
            c2839f.b();
        }
        StringBuilder sbF = J4.n.f("expected ", " bytes but got ", j11);
        sbF.append(this.f45723e);
        throw new IOException(sbF.toString());
    }
}
