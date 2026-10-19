package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f43081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43082b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f43083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43084c;

        public a(b<T> bVar) {
            this.f43083b = bVar.f43081a.iterator();
            this.f43084c = bVar.f43082b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f43084c;
                it = this.f43083b;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f43084c--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.f43084c;
                it = this.f43083b;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f43084c--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        this.f43081a = gVar;
        this.f43082b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public final g<T> a(int i10) {
        int i11 = this.f43082b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f43081a, i11);
    }

    @Override // kotlin.sequences.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
