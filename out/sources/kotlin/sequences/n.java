package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n<T, R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f43110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<T, R> f43111b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f43112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n<T, R> f43113c;

        public a(n<T, R> nVar) {
            this.f43113c = nVar;
            this.f43112b = nVar.f43110a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f43112b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f43113c.f43111b.invoke(this.f43112b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(g<? extends T> gVar, Ia.l<? super T, ? extends R> lVar) {
        this.f43110a = gVar;
        this.f43111b = lVar;
    }

    @Override // kotlin.sequences.g
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
