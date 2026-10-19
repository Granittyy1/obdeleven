package Z;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: LocaleList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Collection<b>, Ja.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f7671d = new c(EmptyList.f42983b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f7672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7673c;

    public c(List<b> list) {
        this.f7672b = list;
        this.f7673c = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f7672b.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return this.f7672b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return i.a(this.f7672b, ((c) obj).f7672b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f7672b.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7672b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.f7672b.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7673c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    public final String toString() {
        return Q8.d.b(new StringBuilder("LocaleList(localeList="), this.f7672b, ')');
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.d.b(this, tArr);
    }
}
