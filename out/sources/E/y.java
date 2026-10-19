package E;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y<K, V> extends u<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i10 = this.f2965d;
        this.f2965d = i10 + 2;
        return (V) this.f2963b[i10 + 1];
    }
}
