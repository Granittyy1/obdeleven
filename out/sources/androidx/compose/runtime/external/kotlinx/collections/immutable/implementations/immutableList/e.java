package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PersistentVectorMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PersistentVectorBuilder<T> f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h<? extends T> f12972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12973g;

    public e(PersistentVectorBuilder<T> persistentVectorBuilder, int i10) {
        super(i10, persistentVectorBuilder.e());
        this.f12970d = persistentVectorBuilder;
        this.f12971e = persistentVectorBuilder.A();
        this.f12973g = -1;
        b();
    }

    public final void a() {
        if (this.f12971e != this.f12970d.A()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void add(T t8) {
        a();
        int i10 = this.f12961b;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        persistentVectorBuilder.add(i10, t8);
        this.f12961b++;
        this.f12962c = persistentVectorBuilder.e();
        this.f12971e = persistentVectorBuilder.A();
        this.f12973g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        Object[] objArr = persistentVectorBuilder.f12958g;
        if (objArr == null) {
            this.f12972f = null;
            return;
        }
        int i10 = (persistentVectorBuilder.f12960i - 1) & (-32);
        int i11 = this.f12961b;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (persistentVectorBuilder.f12956e / 5) + 1;
        h<? extends T> hVar = this.f12972f;
        if (hVar == null) {
            this.f12972f = new h<>(objArr, i11, i10, i12);
            return;
        }
        hVar.f12961b = i11;
        hVar.f12962c = i10;
        hVar.f12977d = i12;
        if (hVar.f12978e.length < i12) {
            hVar.f12978e = new Object[i12];
        }
        hVar.f12978e[0] = objArr;
        ?? r10 = i11 == i10 ? 1 : 0;
        hVar.f12979f = r10;
        hVar.b(i11 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12961b;
        this.f12973g = i10;
        h<? extends T> hVar = this.f12972f;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        if (hVar == null) {
            Object[] objArr = persistentVectorBuilder.f12959h;
            this.f12961b = i10 + 1;
            return (T) objArr[i10];
        }
        if (hVar.hasNext()) {
            this.f12961b++;
            return hVar.next();
        }
        Object[] objArr2 = persistentVectorBuilder.f12959h;
        int i11 = this.f12961b;
        this.f12961b = i11 + 1;
        return (T) objArr2[i11 - hVar.f12962c];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12961b;
        this.f12973g = i10 - 1;
        h<? extends T> hVar = this.f12972f;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        if (hVar == null) {
            Object[] objArr = persistentVectorBuilder.f12959h;
            int i11 = i10 - 1;
            this.f12961b = i11;
            return (T) objArr[i11];
        }
        int i12 = hVar.f12962c;
        if (i10 <= i12) {
            this.f12961b = i10 - 1;
            return hVar.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.f12959h;
        int i13 = i10 - 1;
        this.f12961b = i13;
        return (T) objArr2[i13 - i12];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f12973g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        persistentVectorBuilder.k(i10);
        int i11 = this.f12973g;
        if (i11 < this.f12961b) {
            this.f12961b = i11;
        }
        this.f12962c = persistentVectorBuilder.e();
        this.f12971e = persistentVectorBuilder.A();
        this.f12973g = -1;
        b();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator
    public final void set(T t8) {
        a();
        int i10 = this.f12973g;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f12970d;
        persistentVectorBuilder.set(i10, t8);
        this.f12971e = persistentVectorBuilder.A();
        b();
    }
}
