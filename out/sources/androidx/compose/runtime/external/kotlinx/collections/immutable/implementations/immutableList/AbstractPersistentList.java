package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import Ia.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC2670b;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AbstractPersistentList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends AbstractC2670b<E> implements D.b<E> {

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: AbstractPersistentList.kt */
    public static final class AnonymousClass1 extends Lambda implements l<E, Boolean> {
        final /* synthetic */ Collection<E> $elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Collection<? extends E> collection) {
            super(1);
            this.$elements = collection;
        }

        @Override // Ia.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.$elements.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, D.b
    public D.b<E> addAll(Collection<? extends E> collection) {
        PersistentVectorBuilder persistentVectorBuilderI = i();
        persistentVectorBuilderI.addAll(collection);
        return persistentVectorBuilderI.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // kotlin.collections.AbstractC2670b, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, D.b
    public final D.b<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? E(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, D.b
    public final D.b<E> removeAll(Collection<? extends E> collection) {
        return F(new AnonymousClass1(collection));
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final List subList(int i10, int i11) {
        return new D.a(this, i10, i11);
    }
}
