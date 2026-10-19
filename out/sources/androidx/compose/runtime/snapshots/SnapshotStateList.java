package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C1091i0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateList<T> implements o, List<T>, RandomAccess, Ja.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f13163b;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    public static final class a<T> extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public D.b<? extends T> f13164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13166e;

        public a(long j, D.b<? extends T> bVar) {
            super(j);
            this.f13164c = bVar;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(q qVar) {
            synchronized (l.f13216a) {
                kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.f13164c = ((a) qVar).f13164c;
                this.f13165d = ((a) qVar).f13165d;
                this.f13166e = ((a) qVar).f13166e;
                p293xa.r rVar = p293xa.r.f47939a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final q b() {
            return c(SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final q c(long j) {
            return new a(j, this.f13164c);
        }
    }

    public SnapshotStateList() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVar = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g.f12975c;
        g gVarK = SnapshotKt.k();
        a aVar = new a(gVarK.g(), gVar);
        if (!(gVarK instanceof GlobalSnapshot)) {
            aVar.f13226b = new a(1, gVar);
        }
        this.f13163b = aVar;
    }

    public static boolean q(a aVar, int i10, D.b bVar, boolean z10) {
        boolean z11;
        synchronized (l.f13216a) {
            try {
                int i11 = aVar.f13165d;
                if (i11 == i10) {
                    aVar.f13164c = bVar;
                    z11 = true;
                    if (z10) {
                        aVar.f13166e++;
                    }
                    aVar.f13165d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public final a<T> A() {
        a aVar = this.f13163b;
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) SnapshotKt.t(aVar, this);
    }

    public final int B() {
        a aVar = this.f13163b;
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.i(aVar)).f13166e;
    }

    public final boolean C(Ia.l<? super List<T>, Boolean> lVar) {
        int i10;
        D.b<? extends T> bVar;
        Boolean boolInvoke;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            PersistentVectorBuilder persistentVectorBuilderI = bVar.i();
            boolInvoke = lVar.invoke(persistentVectorBuilderI);
            D.b bVarQ = persistentVectorBuilderI.q();
            if (kotlin.jvm.internal.i.a(bVarQ, bVar)) {
                break;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i10, bVarQ, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t8) {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarAdd = bVar.add(t8);
            if (bVarAdd.equals(bVar)) {
                return false;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i10, bVarAdd, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i10, final Collection<? extends T> collection) {
        return C(new Ia.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i10, collection));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarK;
        a aVar = this.f13163b;
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (SnapshotKt.f13154c) {
            gVarK = SnapshotKt.k();
            a aVar2 = (a) SnapshotKt.w(aVar, this, gVarK);
            synchronized (l.f13216a) {
                aVar2.f13164c = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g.f12975c;
                aVar2.f13165d++;
                aVar2.f13166e++;
            }
        }
        SnapshotKt.n(gVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return A().f13164c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return A().f13164c.containsAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(q qVar) {
        qVar.f13226b = this.f13163b;
        this.f13163b = (a) qVar;
    }

    @Override // java.util.List
    public final T get(int i10) {
        return A().f13164c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return A().f13164c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return A().f13164c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final q k() {
        return this.f13163b;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return A().f13164c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new n(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        int i11;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        T t8 = get(i10);
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i11 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarE = bVar.E(i10);
            if (kotlin.jvm.internal.i.a(bVarE, bVar)) {
                break;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i11, bVarE, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return t8;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarRemoveAll = bVar.removeAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.i.a(bVarRemoveAll, bVar)) {
                return false;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i10, bVarRemoveAll, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection<? extends Object> collection) {
        return C(new Ia.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(((List) obj).retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public final T set(int i10, T t8) {
        int i11;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        T t10 = get(i10);
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i11 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVar2 = bVar.set(i10, t8);
            if (bVar2.equals(bVar)) {
                break;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i11, bVar2, false);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return A().f13164c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            C1091i0.a("fromIndex or toIndex are out of bounds");
        }
        return new r(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    public final String toString() {
        a aVar = this.f13163b;
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) SnapshotKt.i(aVar)).f13164c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarAddAll = bVar.addAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.i.a(bVarAddAll, bVar)) {
                return false;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i10, bVarAddAll, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new n(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.d.b(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i10, T t8) {
        int i11;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i11 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarAdd = bVar.add(i10, t8);
            if (bVarAdd.equals(bVar)) {
                return;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i11, bVarAdd, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        D.b<? extends T> bVar;
        g gVarK;
        boolean zQ;
        do {
            synchronized (l.f13216a) {
                a aVar = this.f13163b;
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) SnapshotKt.i(aVar);
                i10 = aVar2.f13165d;
                bVar = aVar2.f13164c;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.b(bVar);
            D.b<? extends T> bVarRemove = bVar.remove(obj);
            if (kotlin.jvm.internal.i.a(bVarRemove, bVar)) {
                return false;
            }
            a aVar3 = this.f13163b;
            kotlin.jvm.internal.i.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                zQ = q((a) SnapshotKt.w(aVar3, this, gVarK), i10, bVarRemove, true);
            }
            SnapshotKt.n(gVarK, this);
        } while (!zQ);
        return true;
    }
}
