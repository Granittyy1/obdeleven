package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f12974d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i10, Object obj) {
        super(i10, 1);
        this.f12974d = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12961b++;
        return this.f12974d;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f12961b--;
        return this.f12974d;
    }
}
