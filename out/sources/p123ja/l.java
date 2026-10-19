package p123ja;

import Fa.d;
import p231sa.a;

/* JADX INFO: compiled from: Observable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class l<T> implements m<T> {
    @Override // p123ja.m
    public final void d(n<? super T> nVar) {
        try {
            e(nVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            d.g(th);
            a.c(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(n<? super T> nVar);
}
