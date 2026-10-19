package p123ja;

import Q3.d;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.i;

/* JADX INFO: compiled from: Maybe.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h<T> implements k<T> {
    public static <T> h<T> b(T t8) {
        d.I(t8, "item is null");
        return new i(t8);
    }

    @Override // p123ja.k
    public final void a(j<? super T> jVar) {
        d.I(jVar, "observer is null");
        try {
            c(jVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Fa.d.g(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(j<? super T> jVar);

    public final h e(h hVar) {
        d.I(hVar, "other is null");
        return new MaybeSwitchIfEmpty(this, hVar);
    }
}
