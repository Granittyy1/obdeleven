package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BufferIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T[] f12963d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        this.f12963d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12961b;
        this.f12961b = i10 + 1;
        return this.f12963d[i10];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12961b - 1;
        this.f12961b = i10;
        return this.f12963d[i10];
    }
}
