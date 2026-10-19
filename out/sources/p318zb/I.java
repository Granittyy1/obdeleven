package p318zb;

import com.google.gson.internal.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49052d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f49055c;

    public I a() {
        this.f49053a = false;
        return this;
    }

    public I b() {
        this.f49055c = 0L;
        return this;
    }

    public long c() {
        if (this.f49053a) {
            return this.f49054b;
        }
        throw new IllegalStateException("No deadline");
    }

    public I d(long j) {
        this.f49053a = true;
        this.f49054b = j;
        return this;
    }

    public boolean e() {
        return this.f49053a;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f49053a && this.f49054b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public I g(long j, TimeUnit unit) {
        i.e(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "timeout < 0: ").toString());
        }
        this.f49055c = unit.toNanos(j);
        return this;
    }

    public long h() {
        return this.f49055c;
    }

    /* JADX INFO: compiled from: Timeout.kt */
    public static final class a extends I {
        @Override // p318zb.I
        public final I g(long j, TimeUnit unit) {
            i.e(unit, "unit");
            return this;
        }

        @Override // p318zb.I
        public final void f() {
        }

        @Override // p318zb.I
        public final I d(long j) {
            return this;
        }
    }
}
