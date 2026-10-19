package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C1091i0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.v;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements List<T>, Ja.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SnapshotStateList<T> f13227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13230e;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    public static final class a implements ListIterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f13231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<T> f13232c;

        public a(Ref$IntRef ref$IntRef, r<T> rVar) {
            this.f13231b = ref$IntRef;
            this.f13232c = rVar;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f13231b.element < this.f13232c.f13230e - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f13231b.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Ref$IntRef ref$IntRef = this.f13231b;
            int i10 = ref$IntRef.element + 1;
            r<T> rVar = this.f13232c;
            l.a(i10, rVar.f13230e);
            ref$IntRef.element = i10;
            return rVar.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f13231b.element + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Ref$IntRef ref$IntRef = this.f13231b;
            int i10 = ref$IntRef.element;
            r<T> rVar = this.f13232c;
            l.a(i10, rVar.f13230e);
            ref$IntRef.element = i10 - 1;
            return rVar.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f13231b.element;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public r(SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        this.f13227b = snapshotStateList;
        this.f13228c = i10;
        this.f13229d = snapshotStateList.B();
        this.f13230e = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t8) {
        e();
        int i10 = this.f13228c + this.f13230e;
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        snapshotStateList.add(i10, t8);
        this.f13230e++;
        this.f13229d = snapshotStateList.B();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.f13230e, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        if (this.f13230e > 0) {
            e();
            SnapshotStateList<T> snapshotStateList = this.f13227b;
            int i11 = this.f13228c;
            int i12 = this.f13230e + i11;
            snapshotStateList.getClass();
            do {
                synchronized (l.f13216a) {
                    SnapshotStateList.a aVar = snapshotStateList.f13163b;
                    kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    SnapshotStateList.a aVar2 = (SnapshotStateList.a) SnapshotKt.i(aVar);
                    i10 = aVar2.f13165d;
                    bVar = aVar2.f13164c;
                    p293xa.r rVar = p293xa.r.f47939a;
                }
                kotlin.jvm.internal.i.b(bVar);
                PersistentVectorBuilder persistentVectorBuilderI = bVar.i();
                persistentVectorBuilderI.subList(i11, i12).clear();
                D.b bVarQ = persistentVectorBuilderI.q();
                if (kotlin.jvm.internal.i.a(bVarQ, bVar)) {
                    break;
                }
                SnapshotStateList.a aVar3 = snapshotStateList.f13163b;
                kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f13154c) {
                    gVarK = SnapshotKt.k();
                    zQ = SnapshotStateList.q((SnapshotStateList.a) SnapshotKt.w(aVar3, snapshotStateList, gVarK), i10, bVarQ, true);
                }
                SnapshotKt.n(gVarK, snapshotStateList);
            } while (!zQ);
            this.f13230e = 0;
            this.f13229d = this.f13227b.B();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        if (this.f13227b.B() != this.f13229d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final T get(int i10) {
        e();
        l.a(i10, this.f13230e);
        return this.f13227b.get(this.f13228c + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        e();
        int i10 = this.f13230e;
        int i11 = this.f13228c;
        Iterator<Integer> it = Na.l.J(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iA = ((v) it).a();
            if (kotlin.jvm.internal.i.a(obj, this.f13227b.get(iA))) {
                return iA - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13230e == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        int i10 = this.f13230e;
        int i11 = this.f13228c;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (kotlin.jvm.internal.i.a(obj, this.f13227b.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        e();
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        int i11 = this.f13228c;
        int i12 = this.f13230e + i11;
        int size = snapshotStateList.size();
        do {
            synchronized (l.f13216a) {
                SnapshotStateList.a aVar = snapshotStateList.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                SnapshotStateList.a aVar2 = (SnapshotStateList.a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            PersistentVectorBuilder persistentVectorBuilderI = bVar.i();
            persistentVectorBuilderI.subList(i11, i12).retainAll(collection);
            D.b bVarQ = persistentVectorBuilderI.q();
            if (kotlin.jvm.internal.i.a(bVarQ, bVar)) {
                break;
            }
            SnapshotStateList.a aVar3 = snapshotStateList.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = SnapshotStateList.q((SnapshotStateList.a) SnapshotKt.w(aVar3, snapshotStateList, gVarK), i10, bVarQ, true);
            }
            SnapshotKt.n(gVarK, snapshotStateList);
        } while (!zQ);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f13229d = this.f13227b.B();
            this.f13230e -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i10, T t8) {
        l.a(i10, this.f13230e);
        e();
        int i11 = i10 + this.f13228c;
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        T t10 = snapshotStateList.set(i11, t8);
        this.f13229d = snapshotStateList.B();
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13230e;
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f13230e)) {
            C1091i0.a("fromIndex or toIndex are out of bounds");
        }
        e();
        int i12 = this.f13228c;
        return new r(this.f13227b, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        e();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i10 - 1;
        return new a(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.d.b(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        e();
        int i11 = i10 + this.f13228c;
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        boolean zAddAll = snapshotStateList.addAll(i11, collection);
        if (zAddAll) {
            this.f13230e = collection.size() + this.f13230e;
            this.f13229d = snapshotStateList.B();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i10) {
        e();
        int i11 = this.f13228c + i10;
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        T tRemove = snapshotStateList.remove(i11);
        this.f13230e--;
        this.f13229d = snapshotStateList.B();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i10, T t8) {
        e();
        int i11 = this.f13228c + i10;
        SnapshotStateList<T> snapshotStateList = this.f13227b;
        snapshotStateList.add(i11, t8);
        this.f13230e++;
        this.f13229d = snapshotStateList.B();
    }
}
