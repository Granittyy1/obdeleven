package D;

import Ia.l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b<E> extends List, Collection, Ja.a {
    b<E> E(int i10);

    b<E> F(l<? super E, Boolean> lVar);

    @Override // java.util.List
    b<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection
    b<E> add(E e10);

    @Override // java.util.List, java.util.Collection
    b<E> addAll(Collection<? extends E> collection);

    PersistentVectorBuilder i();

    @Override // java.util.List, java.util.Collection
    b<E> remove(E e10);

    @Override // java.util.List, java.util.Collection
    b<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    b<E> set(int i10, E e10);
}
