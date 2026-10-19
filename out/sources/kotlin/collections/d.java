package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<E> extends AbstractList<E> implements List<E>, Ja.c {
    public abstract int e();

    public abstract E k(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return k(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
