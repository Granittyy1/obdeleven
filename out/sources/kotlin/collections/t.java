package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t<T> implements Iterable<s<? extends T>>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<Iterator<T>> f43024b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Ia.a<? extends Iterator<? extends T>> aVar) {
        this.f43024b = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<s<T>> iterator() {
        return new u(this.f43024b.invoke());
    }
}
