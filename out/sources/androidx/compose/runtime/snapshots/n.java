package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n<T> implements ListIterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SnapshotStateList<T> f13220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13222d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13223e;

    public n(SnapshotStateList<T> snapshotStateList, int i10) {
        this.f13220b = snapshotStateList;
        this.f13221c = i10 - 1;
        this.f13223e = snapshotStateList.B();
    }

    public final void a() {
        if (this.f13220b.B() != this.f13223e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t8) {
        a();
        int i10 = this.f13221c + 1;
        SnapshotStateList<T> snapshotStateList = this.f13220b;
        snapshotStateList.add(i10, t8);
        this.f13222d = -1;
        this.f13221c++;
        this.f13223e = snapshotStateList.B();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13221c < this.f13220b.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13221c >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i10 = this.f13221c + 1;
        this.f13222d = i10;
        SnapshotStateList<T> snapshotStateList = this.f13220b;
        l.a(i10, snapshotStateList.size());
        T t8 = snapshotStateList.get(i10);
        this.f13221c = i10;
        return t8;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13221c + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i10 = this.f13221c;
        SnapshotStateList<T> snapshotStateList = this.f13220b;
        l.a(i10, snapshotStateList.size());
        int i11 = this.f13221c;
        this.f13222d = i11;
        T t8 = snapshotStateList.get(i11);
        this.f13221c--;
        return t8;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13221c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f13221c;
        SnapshotStateList<T> snapshotStateList = this.f13220b;
        snapshotStateList.remove(i10);
        this.f13221c--;
        this.f13222d = -1;
        this.f13223e = snapshotStateList.B();
    }

    @Override // java.util.ListIterator
    public final void set(T t8) {
        a();
        int i10 = this.f13222d;
        if (i10 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList<T> snapshotStateList = this.f13220b;
        snapshotStateList.set(i10, t8);
        this.f13223e = snapshotStateList.B();
    }
}
