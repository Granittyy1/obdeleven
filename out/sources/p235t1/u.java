package p235t1;

import B7.b;
import android.util.SparseArray;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes.dex */
public final class u<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f47099c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f47098b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47097a = -1;

    public u(b bVar) {
        this.f47099c = bVar;
    }

    public final V a(int i10) {
        SparseArray<V> sparseArray;
        if (this.f47097a == -1) {
            this.f47097a = 0;
        }
        while (true) {
            int i11 = this.f47097a;
            sparseArray = this.f47098b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f47097a--;
        }
        while (this.f47097a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f47097a + 1)) {
            this.f47097a++;
        }
        return sparseArray.valueAt(this.f47097a);
    }
}
