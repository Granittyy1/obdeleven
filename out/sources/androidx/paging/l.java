package androidx.paging;

import java.util.ArrayList;
import kotlin.collections.AbstractC2670b;

/* JADX INFO: compiled from: ItemSnapshotList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l<T> extends AbstractC2670b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19369d;

    public l(ArrayList arrayList, int i10, int i11) {
        this.f19367b = i10;
        this.f19368c = i11;
        this.f19369d = arrayList;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f19369d.size() + this.f19367b + this.f19368c;
    }

    @Override // java.util.List
    public final T get(int i10) {
        int i11 = this.f19367b;
        if (i10 >= 0 && i10 < i11) {
            return null;
        }
        ArrayList arrayList = this.f19369d;
        if (i10 < arrayList.size() + i11 && i11 <= i10) {
            return (T) arrayList.get(i10 - i11);
        }
        int size = arrayList.size() + i11;
        if (i10 < e() && size <= i10) {
            return null;
        }
        StringBuilder sbE = A8.f.e(i10, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbE.append(e());
        throw new IndexOutOfBoundsException(sbE.toString());
    }
}
