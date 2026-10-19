package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: CompletableResumeNext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f40688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.b f40689c;

    /* JADX INFO: compiled from: CompletableResumeNext.java */
    public final class a implements p123ja.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.b f40690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SequentialDisposable f40691c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableResumeNext.java */
        public final class C0460a implements p123ja.b {
            public C0460a() {
            }

            @Override // p123ja.b
            public final void a() {
                a.this.f40690b.a();
            }

            @Override // p123ja.b
            public final void b(p148la.b bVar) {
                a.this.f40691c.a(bVar);
            }

            @Override // p123ja.b
            public final void onError(Throwable th) {
                a.this.f40690b.onError(th);
            }
        }

        public a(p123ja.b bVar, SequentialDisposable sequentialDisposable) {
            this.f40690b = bVar;
            this.f40691c = sequentialDisposable;
        }

        @Override // p123ja.b
        public final void a() {
            this.f40690b.a();
        }

        @Override // p123ja.b
        public final void b(p148la.b bVar) {
            this.f40691c.a(bVar);
        }

        @Override // p123ja.b
        public final void onError(Throwable th) {
            p123ja.b bVar = this.f40690b;
            try {
                f.this.f40689c.getClass();
                io.reactivex.internal.operators.completable.a aVar = io.reactivex.internal.operators.completable.a.f40671b;
                if (aVar != null) {
                    aVar.b(new C0460a());
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                nullPointerException.initCause(th);
                bVar.onError(nullPointerException);
            } catch (Throwable th2) {
                Fa.d.g(th2);
                bVar.onError(new CompositeException(th2, th));
            }
        }
    }

    public f(e eVar, B6.b bVar) {
        this.f40688b = eVar;
        this.f40689c = bVar;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        bVar.b(sequentialDisposable);
        this.f40688b.b(new a(bVar, sequentialDisposable));
    }
}
