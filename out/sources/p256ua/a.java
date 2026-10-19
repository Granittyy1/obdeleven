package p256ua;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p123ja.n;
import p148la.b;
import p183oa.d;

/* JADX INFO: compiled from: BehaviorSubject.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends b<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f47485h = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0542a[] f47486i = new C0542a[0];
    public static final C0542a[] j = new C0542a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f47487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<C0542a<T>[]> f47488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f47489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f47490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Throwable> f47491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47492g;

    /* JADX INFO: renamed from: ua.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BehaviorSubject.java */
    public static final class C0542a<T> implements b, d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<? super T> f47493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f47494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f47495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f47496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.internal.util.a<Object> f47497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f47498g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f47499h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f47500i;

        public C0542a(n<? super T> nVar, a<T> aVar) {
            this.f47493b = nVar;
            this.f47494c = aVar;
        }

        @Override // p183oa.d
        public final boolean a(Object obj) {
            return this.f47499h || NotificationLite.a(this.f47493b, obj);
        }

        public final void b(Object obj, long j) {
            if (this.f47499h) {
                return;
            }
            if (!this.f47498g) {
                synchronized (this) {
                    try {
                        if (this.f47499h) {
                            return;
                        }
                        if (this.f47500i == j) {
                            return;
                        }
                        if (this.f47496e) {
                            io.reactivex.internal.util.a<Object> aVar = this.f47497f;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>();
                                this.f47497f = aVar;
                            }
                            int i10 = aVar.f40980c;
                            if (i10 == 4) {
                                Object[] objArr = new Object[5];
                                aVar.f40979b[4] = objArr;
                                aVar.f40979b = objArr;
                                i10 = 0;
                            }
                            aVar.f40979b[i10] = obj;
                            aVar.f40980c = i10 + 1;
                            return;
                        }
                        this.f47495d = true;
                        this.f47498g = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            a(obj);
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f47499h;
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.f47499h) {
                return;
            }
            this.f47499h = true;
            this.f47494c.f(this);
        }
    }

    public a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f47489d = reentrantReadWriteLock.readLock();
        this.f47490e = reentrantReadWriteLock.writeLock();
        this.f47488c = new AtomicReference<>(f47486i);
        this.f47487b = new AtomicReference<>();
        this.f47491f = new AtomicReference<>();
    }

    @Override // p123ja.n
    public final void a() {
        AtomicReference<Throwable> atomicReference = this.f47491f;
        Throwable th = ExceptionHelper.f40974a;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        NotificationLite notificationLite = NotificationLite.f40975b;
        AtomicReference<C0542a<T>[]> atomicReference2 = this.f47488c;
        C0542a<T>[] c0542aArr = j;
        C0542a<T>[] andSet = atomicReference2.getAndSet(c0542aArr);
        if (andSet != c0542aArr) {
            Lock lock = this.f47490e;
            lock.lock();
            this.f47492g++;
            this.f47487b.lazySet(notificationLite);
            lock.unlock();
        }
        for (C0542a<T> c0542a : andSet) {
            c0542a.b(notificationLite, this.f47492g);
        }
    }

    @Override // p123ja.n
    public final void b(b bVar) {
        if (this.f47491f.get() != null) {
            bVar.dispose();
        }
    }

    @Override // p123ja.n
    public final void c(T t8) {
        Q3.d.I(t8, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f47491f.get() != null) {
            return;
        }
        Lock lock = this.f47490e;
        lock.lock();
        this.f47492g++;
        this.f47487b.lazySet(t8);
        lock.unlock();
        for (C0542a<T> c0542a : this.f47488c.get()) {
            c0542a.b(t8, this.f47492g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        r7 = r7.f40978a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        if (r7 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r1 >= 4) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        r3 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r3 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        if (r0.a(r3) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
    
        r7 = r7[4];
     */
    @Override // p123ja.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(p123ja.n<? super T> r7) {
        /*
            r6 = this;
            ua.a$a r0 = new ua.a$a
            r0.<init>(r7, r6)
            r7.b(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<ua.a$a<T>[]> r1 = r6.f47488c
            java.lang.Object r2 = r1.get()
            ua.a$a[] r2 = (p256ua.a.C0542a[]) r2
            ua.a$a[] r3 = p256ua.a.j
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r6.f47491f
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.f40974a
            if (r0 != r1) goto L25
            r7.a()
            goto Lb5
        L25:
            r7.onError(r0)
            goto Lb5
        L2a:
            int r3 = r2.length
            int r4 = r3 + 1
            ua.a$a[] r4 = new p256ua.a.C0542a[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L35:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto Lb8
            boolean r7 = r0.f47499h
            if (r7 == 0) goto L44
            r6.f(r0)
            goto Lb5
        L44:
            boolean r7 = r0.f47499h
            if (r7 == 0) goto L4a
            goto Lb5
        L4a:
            monitor-enter(r0)
            boolean r7 = r0.f47499h     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L55
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto Lb5
        L52:
            r7 = move-exception
            goto Lb6
        L55:
            boolean r7 = r0.f47495d     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto Lb5
        L5b:
            ua.a<T> r7 = r0.f47494c     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.locks.Lock r1 = r7.f47489d     // Catch: java.lang.Throwable -> L52
            r1.lock()     // Catch: java.lang.Throwable -> L52
            long r2 = r7.f47492g     // Catch: java.lang.Throwable -> L52
            r0.f47500i = r2     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r7 = r7.f47487b     // Catch: java.lang.Throwable -> L52
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L52
            r1.unlock()     // Catch: java.lang.Throwable -> L52
            r1 = 1
            if (r7 == 0) goto L74
            r2 = r1
            goto L75
        L74:
            r2 = r5
        L75:
            r0.f47496e = r2     // Catch: java.lang.Throwable -> L52
            r0.f47495d = r1     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto Lb5
            boolean r7 = r0.a(r7)
            if (r7 == 0) goto L83
            goto Lb5
        L83:
            boolean r7 = r0.f47499h
            if (r7 == 0) goto L88
            goto Lb5
        L88:
            monitor-enter(r0)
            io.reactivex.internal.util.a<java.lang.Object> r7 = r0.f47497f     // Catch: java.lang.Throwable -> L91
            if (r7 != 0) goto L93
            r0.f47496e = r5     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            goto Lb5
        L91:
            r7 = move-exception
            goto Lb3
        L93:
            r1 = 0
            r0.f47497f = r1     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r7 = r7.f40978a
        L99:
            if (r7 == 0) goto L83
            r1 = r5
        L9c:
            r2 = 4
            if (r1 >= r2) goto Lae
            r3 = r7[r1]
            if (r3 != 0) goto La4
            goto Lae
        La4:
            boolean r2 = r0.a(r3)
            if (r2 == 0) goto Lab
            goto L83
        Lab:
            int r1 = r1 + 1
            goto L9c
        Lae:
            r7 = r7[r2]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L99
        Lb3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            throw r7
        Lb5:
            return
        Lb6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r7
        Lb8:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L35
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p256ua.a.e(ja.n):void");
    }

    public final void f(C0542a<T> c0542a) {
        C0542a<T>[] c0542aArr;
        while (true) {
            AtomicReference<C0542a<T>[]> atomicReference = this.f47488c;
            C0542a<T>[] c0542aArr2 = atomicReference.get();
            int length = c0542aArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0542aArr2[i10] == c0542a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0542aArr = f47486i;
            } else {
                C0542a<T>[] c0542aArr3 = new C0542a[length - 1];
                System.arraycopy(c0542aArr2, 0, c0542aArr3, 0, i10);
                System.arraycopy(c0542aArr2, i10 + 1, c0542aArr3, i10, (length - i10) - 1);
                c0542aArr = c0542aArr3;
            }
            while (!atomicReference.compareAndSet(c0542aArr2, c0542aArr)) {
                if (atomicReference.get() != c0542aArr2) {
                }
            }
            return;
        }
    }

    @Override // p123ja.n
    public final void onError(Throwable th) {
        Q3.d.I(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.f47491f;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                p231sa.a.c(th);
                return;
            }
        }
        Object objB = NotificationLite.b(th);
        Serializable serializable = (Serializable) objB;
        AtomicReference<C0542a<T>[]> atomicReference2 = this.f47488c;
        C0542a<T>[] c0542aArr = j;
        C0542a<T>[] andSet = atomicReference2.getAndSet(c0542aArr);
        if (andSet != c0542aArr) {
            Lock lock = this.f47490e;
            lock.lock();
            this.f47492g++;
            this.f47487b.lazySet(serializable);
            lock.unlock();
        }
        for (C0542a<T> c0542a : andSet) {
            c0542a.b(objB, this.f47492g);
        }
    }
}
