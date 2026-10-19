package p078g1;

import android.util.SparseBooleanArray;
import p114j1.A;
import p241t7.b;

/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f35273a;

    /* JADX INFO: compiled from: FlagSet.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f35274a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35275b;

        public final void a(int i10) {
            b.k(!this.f35275b);
            this.f35274a.append(i10, true);
        }

        public final m b() {
            b.k(!this.f35275b);
            this.f35275b = true;
            return new m(this.f35274a);
        }
    }

    public m(SparseBooleanArray sparseBooleanArray) {
        this.f35273a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f35273a;
        b.f(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        int i10 = A.f40996a;
        SparseBooleanArray sparseBooleanArray = this.f35273a;
        if (i10 >= 24) {
            return sparseBooleanArray.equals(mVar.f35273a);
        }
        if (sparseBooleanArray.size() != mVar.f35273a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            if (a(i11) != mVar.a(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = A.f40996a;
        SparseBooleanArray sparseBooleanArray = this.f35273a;
        if (i10 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            size = (size * 31) + a(i11);
        }
        return size;
    }
}
