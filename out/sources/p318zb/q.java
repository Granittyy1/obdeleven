package p318zb;

import com.google.gson.internal.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f49110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f49111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49113e;

    public q(C c10, Inflater inflater) {
        this.f49110b = c10;
        this.f49111c = inflater;
    }

    public final long b(C2839f sink, long j) throws IOException {
        Inflater inflater = this.f49111c;
        i.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "byteCount < 0: ").toString());
        }
        if (this.f49113e) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j == 0) {
            return 0L;
        }
        try {
            D dI0 = sink.I0(1);
            int iMin = (int) Math.min(j, 8192 - dI0.f49043c);
            boolean zNeedsInput = inflater.needsInput();
            C c10 = this.f49110b;
            if (zNeedsInput && !c10.b()) {
                D d10 = c10.f49038c.f49073b;
                i.b(d10);
                int i10 = d10.f49043c;
                int i11 = d10.f49042b;
                int i12 = i10 - i11;
                this.f49112d = i12;
                inflater.setInput(d10.f49041a, i11, i12);
            }
            int iInflate = inflater.inflate(dI0.f49041a, dI0.f49043c, iMin);
            int i13 = this.f49112d;
            if (i13 != 0) {
                int remaining = i13 - inflater.getRemaining();
                this.f49112d -= remaining;
                c10.skip(remaining);
            }
            if (iInflate > 0) {
                dI0.f49043c += iInflate;
                long j10 = iInflate;
                sink.f49074c += j10;
                return j10;
            }
            if (dI0.f49042b == dI0.f49043c) {
                sink.f49073b = dI0.a();
                E.a(dI0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f49113e) {
            return;
        }
        this.f49111c.end();
        this.f49113e = true;
        this.f49110b.close();
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) throws IOException {
        i.e(sink, "sink");
        do {
            long jB = b(sink, j);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.f49111c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f49110b.b());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49110b.f49037b.timeout();
    }
}
