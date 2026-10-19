package p152m1;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import p152m1.d;
import p241t7.b;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<I extends DecoderInputBuffer, O extends d, E extends DecoderException> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44565a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f44569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f44570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f44573i;
    public E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44575l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44566b = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f44576m = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f44567c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f44568d = new ArrayDeque<>();

    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a() {
            super("ExoPlayer:SimpleDecoder");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (eVar.l());
        }
    }

    public e(I[] iArr, O[] oArr) {
        this.f44569e = iArr;
        this.f44571g = iArr.length;
        for (int i10 = 0; i10 < this.f44571g; i10++) {
            ((I[]) this.f44569e)[i10] = h();
        }
        this.f44570f = oArr;
        this.f44572h = oArr.length;
        for (int i11 = 0; i11 < this.f44572h; i11++) {
            ((O[]) this.f44570f)[i11] = i();
        }
        a aVar = new a();
        this.f44565a = aVar;
        aVar.start();
    }

    @Override // p152m1.c
    public final void a() {
        synchronized (this.f44566b) {
            this.f44575l = true;
            this.f44566b.notify();
        }
        try {
            this.f44565a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p152m1.c
    public final void c(long j) {
        synchronized (this.f44566b) {
            try {
                b.k(this.f44571g == this.f44569e.length || this.f44574k);
                this.f44576m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p152m1.c
    public final Object f() throws DecoderException {
        I i10;
        synchronized (this.f44566b) {
            try {
                E e10 = this.j;
                if (e10 != null) {
                    throw e10;
                }
                b.k(this.f44573i == null);
                int i11 = this.f44571g;
                if (i11 == 0) {
                    i10 = null;
                } else {
                    I[] iArr = this.f44569e;
                    int i12 = i11 - 1;
                    this.f44571g = i12;
                    i10 = iArr[i12];
                }
                this.f44573i = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // p152m1.c
    public final void flush() {
        synchronized (this.f44566b) {
            try {
                this.f44574k = true;
                I i10 = this.f44573i;
                if (i10 != null) {
                    i10.k();
                    int i11 = this.f44571g;
                    this.f44571g = i11 + 1;
                    this.f44569e[i11] = i10;
                    this.f44573i = null;
                }
                while (!this.f44567c.isEmpty()) {
                    I iRemoveFirst = this.f44567c.removeFirst();
                    iRemoveFirst.k();
                    int i12 = this.f44571g;
                    this.f44571g = i12 + 1;
                    this.f44569e[i12] = iRemoveFirst;
                }
                while (!this.f44568d.isEmpty()) {
                    this.f44568d.removeFirst().l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p152m1.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void b(I i10) throws DecoderException {
        synchronized (this.f44566b) {
            try {
                E e10 = this.j;
                if (e10 != null) {
                    throw e10;
                }
                b.e(i10 == this.f44573i);
                this.f44567c.addLast(i10);
                if (!this.f44567c.isEmpty() && this.f44572h > 0) {
                    this.f44566b.notify();
                }
                this.f44573i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract I h();

    public abstract O i();

    public abstract E j(Throwable th);

    public abstract E k(I i10, O o10, boolean z10);

    public final boolean l() throws InterruptedException {
        boolean z10;
        E e10;
        synchronized (this.f44566b) {
            while (!this.f44575l) {
                try {
                    if (!this.f44567c.isEmpty() && this.f44572h > 0) {
                        break;
                    }
                    this.f44566b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f44575l) {
                return false;
            }
            I iRemoveFirst = this.f44567c.removeFirst();
            O[] oArr = this.f44570f;
            int i10 = this.f44572h - 1;
            this.f44572h = i10;
            O o10 = oArr[i10];
            boolean z11 = this.f44574k;
            this.f44574k = false;
            if (iRemoveFirst.g(4)) {
                o10.d(4);
            } else {
                o10.f44563c = iRemoveFirst.f17943g;
                if (iRemoveFirst.g(134217728)) {
                    o10.d(134217728);
                }
                long j = iRemoveFirst.f17943g;
                synchronized (this.f44566b) {
                    long j10 = this.f44576m;
                    z10 = j10 == -9223372036854775807L || j >= j10;
                }
                if (!z10) {
                    o10.f44564d = true;
                }
                try {
                    e10 = (E) k(iRemoveFirst, o10, z11);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) j(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) j(e12);
                }
                if (e10 != null) {
                    synchronized (this.f44566b) {
                        this.j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f44566b) {
                try {
                    if (this.f44574k || o10.f44564d) {
                        o10.l();
                    } else {
                        this.f44568d.addLast(o10);
                    }
                    iRemoveFirst.k();
                    int i11 = this.f44571g;
                    this.f44571g = i11 + 1;
                    this.f44569e[i11] = iRemoveFirst;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p152m1.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O e() throws DecoderException {
        synchronized (this.f44566b) {
            try {
                E e10 = this.j;
                if (e10 != null) {
                    throw e10;
                }
                if (this.f44568d.isEmpty()) {
                    return null;
                }
                return this.f44568d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(O o10) {
        synchronized (this.f44566b) {
            o10.k();
            int i10 = this.f44572h;
            this.f44572h = i10 + 1;
            this.f44570f[i10] = o10;
            if (!this.f44567c.isEmpty() && this.f44572h > 0) {
                this.f44566b.notify();
            }
        }
    }
}
