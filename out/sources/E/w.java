package E;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i10 = this.f2965d;
        this.f2965d = i10 + 2;
        return (K) this.f2963b[i10];
    }
}
