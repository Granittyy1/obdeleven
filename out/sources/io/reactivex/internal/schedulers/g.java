package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p123ja.o;

/* JADX INFO: compiled from: TrampolineScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40941a = 0;

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f40942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f40943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f40944d;

        public a(Runnable runnable, c cVar, long j) {
            this.f40942b = runnable;
            this.f40943c = cVar;
            this.f40944d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f40943c.f40952e) {
                return;
            }
            c cVar = this.f40943c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.getClass();
            long jConvert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
            long j = this.f40944d;
            if (j > jConvert) {
                try {
                    Thread.sleep(j - jConvert);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    p231sa.a.c(e10);
                    return;
                }
            }
            if (this.f40943c.f40952e) {
                return;
            }
            this.f40942b.run();
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f40945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f40947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f40948e;

        public b(Runnable runnable, Long l10, int i10) {
            this.f40945b = runnable;
            this.f40946c = l10.longValue();
            this.f40947d = i10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i10;
            b bVar2 = bVar;
            long j = bVar2.f40946c;
            long j10 = this.f40946c;
            int i11 = 0;
            if (j10 < j) {
                i10 = -1;
            } else {
                i10 = j10 > j ? 1 : 0;
            }
            if (i10 != 0) {
                return i10;
            }
            int i12 = this.f40947d;
            int i13 = bVar2.f40947d;
            if (i12 < i13) {
                i11 = -1;
            } else if (i12 > i13) {
                i11 = 1;
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: TrampolineScheduler.java */
    public static final class c extends o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f40949b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f40950c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f40951d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f40952e;

        /* JADX INFO: compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f40953b;

            public a(b bVar) {
                this.f40953b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f40953b.f40948e = true;
                c.this.f40949b.remove(this.f40953b);
            }
        }

        @Override // ja.o.b
        public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(0L) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return c(new a(runnable, this, millis), millis);
        }

        @Override // ja.o.b
        public final void b(Runnable runnable) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
        }

        public final p148la.b c(Runnable runnable, long j) {
            boolean z10 = this.f40952e;
            EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
            if (z10) {
                return emptyDisposable;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.f40951d.incrementAndGet());
            this.f40949b.add(bVar);
            if (this.f40950c.getAndIncrement() != 0) {
                return io.reactivex.disposables.a.a(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f40952e) {
                b bVarPoll = this.f40949b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f40950c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return emptyDisposable;
                    }
                } else if (!bVarPoll.f40948e) {
                    bVarPoll.f40945b.run();
                }
            }
            this.f40949b.clear();
            return emptyDisposable;
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40952e;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40952e = true;
        }
    }

    static {
        new g();
    }

    @Override // p123ja.o
    public final o.b a() {
        return new c();
    }

    @Override // p123ja.o
    public final p148la.b b(Runnable runnable) {
        runnable.run();
        return EmptyDisposable.f40664b;
    }

    @Override // p123ja.o
    public final p148la.b c(Runnable runnable, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(0L);
            runnable.run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            p231sa.a.c(e10);
        }
        return EmptyDisposable.f40664b;
    }
}
