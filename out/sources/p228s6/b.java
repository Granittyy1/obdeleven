package p228s6;

import java.util.Set;
import p096h7.a;

/* JADX INFO: compiled from: ComponentContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    default <T> T a(Class<T> cls) {
        return (T) c(p.a(cls));
    }

    <T> p096h7.b<Set<T>> b(p<T> pVar);

    default <T> T c(p<T> pVar) {
        p096h7.b<T> bVarG = g(pVar);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default <T> p096h7.b<T> d(Class<T> cls) {
        return g(p.a(cls));
    }

    default <T> Set<T> e(p<T> pVar) {
        return b(pVar).get();
    }

    <T> a<T> f(p<T> pVar);

    <T> p096h7.b<T> g(p<T> pVar);

    default <T> a<T> h(Class<T> cls) {
        return f(p.a(cls));
    }
}
