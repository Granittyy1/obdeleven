package p123ja;

import Fa.d;

/* JADX INFO: compiled from: Single.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class p<T> implements r<T> {
    @Override // p123ja.r
    public final void c(q<? super T> qVar) {
        try {
            e(qVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            d.g(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(q<? super T> qVar);
}
