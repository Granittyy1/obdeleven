package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p033c7.C1493f;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeCreate<T> extends p123ja.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1493f f40770b;

    public static final class Emitter<T> extends AtomicReference<p148la.b> implements p123ja.i<T>, p148la.b {
        private static final long serialVersionUID = -2467358622224974244L;
        final p123ja.j<? super T> actual;

        public Emitter(p123ja.j<? super T> jVar) {
            this.actual = jVar;
        }

        @Override // p123ja.i
        public final void a() {
            p148la.b andSet;
            p148la.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f40662b;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.actual.a();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return DisposableHelper.b(get());
        }

        @Override // p148la.b
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // p123ja.i
        public final void onError(Throwable th) {
            p148la.b andSet;
            p148la.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f40662b;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                p231sa.a.c(th);
                return;
            }
            try {
                this.actual.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p123ja.i
        public final void onSuccess(T t8) {
            p148la.b andSet;
            p148la.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f40662b;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                if (t8 == null) {
                    this.actual.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.actual.onSuccess(t8);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return C4.b.d(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public MaybeCreate(C1493f c1493f) {
        this.f40770b = c1493f;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        Emitter emitter = new Emitter(jVar);
        jVar.b(emitter);
        try {
            C1493f c1493f = this.f40770b;
            c1493f.getClass();
            I4.e eVar = new I4.e(emitter);
            p191p5.g gVar = (p191p5.g) c1493f.f22443b;
            Executor executor = (Executor) c1493f.f22444c;
            gVar.f(executor, eVar);
            gVar.d(executor, new I4.f(4, emitter));
        } catch (Throwable th) {
            Fa.d.g(th);
            emitter.onError(th);
        }
    }
}
