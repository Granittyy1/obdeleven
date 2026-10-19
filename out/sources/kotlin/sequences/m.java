package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f43104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<T, Boolean> f43105b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f43106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43107c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f43108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m<T> f43109e;

        public a(m<T> mVar) {
            this.f43109e = mVar;
            this.f43106b = mVar.f43104a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f43106b;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f43109e.f43105b.invoke(next).booleanValue()) {
                    this.f43107c = 1;
                    this.f43108d = next;
                    return;
                }
            }
            this.f43107c = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43107c == -1) {
                a();
            }
            return this.f43107c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f43107c == -1) {
                a();
            }
            if (this.f43107c == 0) {
                throw new NoSuchElementException();
            }
            T t8 = this.f43108d;
            this.f43108d = null;
            this.f43107c = -1;
            return t8;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(g<? extends T> gVar, Ia.l<? super T, Boolean> lVar) {
        this.f43104a = gVar;
        this.f43105b = lVar;
    }

    @Override // kotlin.sequences.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
