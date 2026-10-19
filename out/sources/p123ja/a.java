package p123ja;

import Fa.d;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.e;

/* JADX INFO: compiled from: Completable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {
    @Override // p123ja.c
    public final void b(b bVar) {
        try {
            f(bVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            d.g(th);
            p231sa.a.c(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final CompletableConcatArray c(a aVar) {
        return new CompletableConcatArray(new c[]{this, aVar});
    }

    public final e d(p183oa.a aVar) {
        return new e(this, qa.a.f46191d, aVar);
    }

    public final EmptyCompletableObserver e() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        b(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public abstract void f(b bVar);
}
