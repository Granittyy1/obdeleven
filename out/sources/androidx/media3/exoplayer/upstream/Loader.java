package androidx.media3.exoplayer.upstream;

import A1.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.drm.DrmSession;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import java.io.IOException;
import p114j1.k;
import p235t1.q;

/* JADX INFO: loaded from: classes.dex */
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18808d = new b(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f18809e = new b(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p284x1.a f18810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<? extends d> f18811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f18812c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb2 = new StringBuilder("Unexpected ");
            sb2.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18814b;

        public b(int i10, long j) {
            this.f18813a = i10;
            this.f18814b = j;
        }
    }

    public final class c<T extends d> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f18816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f18818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IOException f18819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18820g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Thread f18821h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18822i;
        public volatile boolean j;

        public c(Looper looper, T t8, a<T> aVar, int i10, long j) {
            super(looper);
            this.f18816c = t8;
            this.f18818e = aVar;
            this.f18815b = i10;
            this.f18817d = j;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.upstream.Loader$a, java.lang.Object] */
        public final void a(boolean z10) {
            this.j = z10;
            this.f18819f = null;
            if (hasMessages(1)) {
                this.f18822i = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f18822i = true;
                        this.f18816c.b();
                        Thread thread = this.f18821h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                Loader.this.f18811b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r10 = this.f18818e;
                r10.getClass();
                r10.t(this.f18816c, jElapsedRealtime, jElapsedRealtime - this.f18817d, true);
                this.f18818e = null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.upstream.Loader$a, java.lang.Object] */
        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f18817d;
            ?? r10 = this.f18818e;
            r10.getClass();
            r10.h(this.f18816c, jElapsedRealtime, j, this.f18820g);
            this.f18819f = null;
            Loader loader = Loader.this;
            p284x1.a aVar = loader.f18810a;
            c<? extends d> cVar = loader.f18811b;
            cVar.getClass();
            aVar.execute(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.media3.exoplayer.upstream.Loader$a, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.f18811b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f18817d;
            ?? r10 = this.f18818e;
            r10.getClass();
            if (this.f18822i) {
                r10.t(this.f18816c, jElapsedRealtime, j, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    r10.o(this.f18816c, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e10) {
                    k.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f18812c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f18819f = iOException;
            int i12 = this.f18820g + 1;
            this.f18820g = i12;
            b bVarB = r10.b(this.f18816c, jElapsedRealtime, j, iOException, i12);
            int i13 = bVarB.f18813a;
            if (i13 == 3) {
                Loader.this.f18812c = this.f18819f;
                return;
            }
            if (i13 != 2) {
                if (i13 == 1) {
                    this.f18820g = 1;
                }
                long jMin = bVarB.f18814b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f18820g - 1) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
                }
                Loader loader = Loader.this;
                p241t7.b.k(loader.f18811b == null);
                loader.f18811b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f18822i;
                    this.f18821h = Thread.currentThread();
                }
                if (!z10) {
                    Trace.beginSection("load:".concat(this.f18816c.getClass().getSimpleName()));
                    try {
                        this.f18816c.a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f18821h = null;
                    Thread.interrupted();
                }
                if (this.j) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.j) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.j) {
                    return;
                }
                k.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new UnexpectedLoaderException(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.j) {
                    return;
                }
                k.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.j) {
                    k.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    public interface d {
        void a() throws IOException;

        void b();
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.k f18824b;

        public e(androidx.media3.exoplayer.source.k kVar) {
            this.f18824b = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.media3.exoplayer.source.k kVar = this.f18824b;
            for (q qVar : kVar.f18754u) {
                qVar.n(true);
                DrmSession drmSession = qVar.f47063h;
                if (drmSession != null) {
                    drmSession.d(qVar.f47060e);
                    qVar.f47063h = null;
                    qVar.f47062g = null;
                }
            }
            p235t1.a aVar = kVar.f18747n;
            p pVar = aVar.f47001b;
            if (pVar != null) {
                pVar.a();
                aVar.f47001b = null;
            }
            aVar.f47002c = null;
        }
    }

    public Loader(p284x1.a aVar) {
        this.f18810a = aVar;
    }

    public final boolean a() {
        return this.f18811b != null;
    }

    public interface a<T extends d> {
        b b(T t8, long j, long j10, IOException iOException, int i10);

        void o(T t8, long j, long j10);

        void t(T t8, long j, long j10, boolean z10);

        default void h(T t8, long j, long j10, int i10) {
        }
    }
}
