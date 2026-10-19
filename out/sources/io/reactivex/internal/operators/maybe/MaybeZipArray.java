package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeZipArray<T, R> extends p123ja.h<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.k<? extends T>[] f40791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.C0521a f40792c;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements p148la.b {
        private static final long serialVersionUID = -5556924161382950569L;
        final p123ja.j<? super R> actual;
        final ZipMaybeObserver<T>[] observers;
        final Object[] values;
        final p183oa.c<? super Object[], ? extends R> zipper;

        public ZipCoordinator(p123ja.j jVar, int i10, qa.a.C0521a c0521a) {
            super(i10);
            this.actual = jVar;
            this.zipper = c0521a;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zipMaybeObserverArr[i11] = new ZipMaybeObserver<>(this, i11);
            }
            this.observers = zipMaybeObserverArr;
            this.values = new Object[i10];
        }

        public final void a(int i10) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.observers;
            int length = zipMaybeObserverArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                ZipMaybeObserver<T> zipMaybeObserver = zipMaybeObserverArr[i11];
                zipMaybeObserver.getClass();
                DisposableHelper.a(zipMaybeObserver);
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                }
                ZipMaybeObserver<T> zipMaybeObserver2 = zipMaybeObserverArr[i10];
                zipMaybeObserver2.getClass();
                DisposableHelper.a(zipMaybeObserver2);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return get() <= 0;
        }

        @Override // p148la.b
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.observers) {
                    zipMaybeObserver.getClass();
                    DisposableHelper.a(zipMaybeObserver);
                }
            }
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        public ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i10) {
            this.parent = zipCoordinator;
            this.index = i10;
        }

        @Override // p123ja.j
        public final void a() {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            int i10 = this.index;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.a(i10);
                zipCoordinator.actual.a();
            }
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            DisposableHelper.f(this, bVar);
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            int i10 = this.index;
            if (zipCoordinator.getAndSet(0) <= 0) {
                p231sa.a.c(th);
            } else {
                zipCoordinator.a(i10);
                zipCoordinator.actual.onError(th);
            }
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            zipCoordinator.values[this.index] = t8;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object objApply = zipCoordinator.zipper.apply(zipCoordinator.values);
                    Q3.d.I(objApply, "The zipper returned a null value");
                    zipCoordinator.actual.onSuccess(objApply);
                } catch (Throwable th) {
                    Fa.d.g(th);
                    zipCoordinator.actual.onError(th);
                }
            }
        }
    }

    public final class a implements p183oa.c<T, R> {
        public a() {
        }

        @Override // p183oa.c, p311z4.f
        public final R apply(T t8) throws Exception {
            return (R) MaybeZipArray.this.f40792c.apply(new Object[]{t8});
        }
    }

    public MaybeZipArray(p123ja.k[] kVarArr, qa.a.C0521a c0521a) {
        this.f40791b = kVarArr;
        this.f40792c = c0521a;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super R> jVar) {
        p123ja.k<? extends T>[] kVarArr = this.f40791b;
        int length = kVarArr.length;
        if (length == 1) {
            kVarArr[0].a(new j.a(jVar, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(jVar, length, this.f40792c);
        jVar.b(zipCoordinator);
        for (int i10 = 0; i10 < length && !zipCoordinator.d(); i10++) {
            p123ja.k<? extends T> kVar = kVarArr[i10];
            if (kVar == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (zipCoordinator.getAndSet(0) <= 0) {
                    p231sa.a.c(nullPointerException);
                    return;
                } else {
                    zipCoordinator.a(i10);
                    zipCoordinator.actual.onError(nullPointerException);
                    return;
                }
            }
            kVar.a(zipCoordinator.observers[i10]);
        }
    }
}
