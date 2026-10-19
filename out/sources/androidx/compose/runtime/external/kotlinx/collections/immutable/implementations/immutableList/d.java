package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PersistentVectorIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T[] f12968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<T> f12969e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f12968d = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f12969e = new h<>(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        h<T> hVar = this.f12969e;
        if (hVar.hasNext()) {
            this.f12961b++;
            return hVar.next();
        }
        int i10 = this.f12961b;
        this.f12961b = i10 + 1;
        return this.f12968d[i10 - hVar.f12962c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12961b;
        h<T> hVar = this.f12969e;
        int i11 = hVar.f12962c;
        if (i10 <= i11) {
            this.f12961b = i10 - 1;
            return hVar.previous();
        }
        int i12 = i10 - 1;
        this.f12961b = i12;
        return this.f12968d[i12 - i11];
    }
}
