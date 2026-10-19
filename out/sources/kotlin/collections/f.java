package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMutableSet.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class f<E> extends AbstractSet<E> implements Set<E>, Ja.e {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
