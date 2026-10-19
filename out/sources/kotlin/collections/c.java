package kotlin.collections;

import java.util.Collection;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<E> extends java.util.AbstractCollection<E> implements Collection<E>, Ja.b {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }
}
