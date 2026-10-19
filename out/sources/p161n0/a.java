package p161n0;

import A0.d;
import androidx.collection.X;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: DirectedAcyclicGraph.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f44660a = new d(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X<T, ArrayList<T>> f44661b = new X<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f44662c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f44663d = new HashSet<>();

    public final void a(T t8, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t8)) {
            return;
        }
        if (hashSet.contains(t8)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t8);
        ArrayList<T> arrayList2 = this.f44661b.get(t8);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                a(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t8);
        arrayList.add(t8);
    }
}
