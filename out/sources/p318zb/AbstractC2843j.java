package p318zb;

import com.google.gson.internal.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: zb.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2843j implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f49089d = new ReentrantLock();

    /* JADX INFO: renamed from: zb.j$a */
    /* JADX INFO: compiled from: FileHandle.kt */
    public static final class a implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2843j f49090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f49091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f49092d;

        public a(AbstractC2843j fileHandle, long j) {
            i.e(fileHandle, "fileHandle");
            this.f49090b = fileHandle;
            this.f49091c = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f49092d) {
                return;
            }
            this.f49092d = true;
            AbstractC2843j abstractC2843j = this.f49090b;
            ReentrantLock reentrantLock = abstractC2843j.f49089d;
            reentrantLock.lock();
            try {
                int i10 = abstractC2843j.f49088c - 1;
                abstractC2843j.f49088c = i10;
                if (i10 == 0 && abstractC2843j.f49087b) {
                    r rVar = r.f47939a;
                    reentrantLock.unlock();
                    abstractC2843j.b();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            long j10;
            long j11;
            i.e(sink, "sink");
            if (this.f49092d) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j12 = this.f49091c;
            AbstractC2843j abstractC2843j = this.f49090b;
            abstractC2843j.getClass();
            if (j < 0) {
                throw new IllegalArgumentException(b.b(j, "byteCount < 0: ").toString());
            }
            long j13 = j + j12;
            long j14 = j12;
            while (true) {
                if (j14 < j13) {
                    D dI0 = sink.I0(1);
                    int i10 = dI0.f49043c;
                    int iC = abstractC2843j.c(j14, dI0.f49041a, i10, (int) Math.min(j13 - j14, 8192 - i10));
                    if (iC == -1) {
                        if (dI0.f49042b == dI0.f49043c) {
                            sink.f49073b = dI0.a();
                            E.a(dI0);
                        }
                        if (j12 == j14) {
                            j11 = -1;
                            j10 = -1;
                            break;
                        }
                    } else {
                        dI0.f49043c += iC;
                        long j15 = iC;
                        j14 += j15;
                        sink.f49074c += j15;
                    }
                }
                j10 = j14 - j12;
                j11 = -1;
                break;
            }
            if (j10 != j11) {
                this.f49091c += j10;
            }
            return j10;
        }

        @Override // p318zb.H
        public final I timeout() {
            return I.f49052d;
        }
    }

    public abstract void b() throws IOException;

    public abstract int c(long j, byte[] bArr, int i10, int i11) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f49089d;
        reentrantLock.lock();
        try {
            if (this.f49087b) {
                reentrantLock.unlock();
                return;
            }
            this.f49087b = true;
            if (this.f49088c != 0) {
                reentrantLock.unlock();
                return;
            }
            r rVar = r.f47939a;
            reentrantLock.unlock();
            b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract long h() throws IOException;

    public final long i() throws IOException {
        ReentrantLock reentrantLock = this.f49089d;
        reentrantLock.lock();
        try {
            if (this.f49087b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            r rVar = r.f47939a;
            reentrantLock.unlock();
            return h();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final a j(long j) throws IOException {
        ReentrantLock reentrantLock = this.f49089d;
        reentrantLock.lock();
        try {
            if (this.f49087b) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f49088c++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
