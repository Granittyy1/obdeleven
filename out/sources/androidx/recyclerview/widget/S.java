package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: ViewTypeStorage.java */
/* JADX INFO: loaded from: classes.dex */
public interface S {

    /* JADX INFO: compiled from: ViewTypeStorage.java */
    public static class a implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<B> f19749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19750b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.S$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewTypeStorage.java */
        public class C0198a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SparseIntArray f19751a = new SparseIntArray(1);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SparseIntArray f19752b = new SparseIntArray(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final B f19753c;

            public C0198a(B b10) {
                this.f19753c = b10;
            }

            @Override // androidx.recyclerview.widget.S.b
            public final int a(int i10) {
                SparseIntArray sparseIntArray = this.f19752b;
                int iIndexOfKey = sparseIntArray.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                StringBuilder sbE = A8.f.e(i10, "requested global type ", " does not belong to the adapter:");
                sbE.append(this.f19753c.f19488c);
                throw new IllegalStateException(sbE.toString());
            }

            @Override // androidx.recyclerview.widget.S.b
            public final int b(int i10) {
                SparseIntArray sparseIntArray = this.f19751a;
                int iIndexOfKey = sparseIntArray.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return sparseIntArray.valueAt(iIndexOfKey);
                }
                a aVar = a.this;
                int i11 = aVar.f19750b;
                aVar.f19750b = i11 + 1;
                aVar.f19749a.put(i11, this.f19753c);
                sparseIntArray.put(i10, i11);
                this.f19752b.put(i11, i10);
                return i11;
            }
        }

        @Override // androidx.recyclerview.widget.S
        public final B a(int i10) {
            B b10 = this.f19749a.get(i10);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalArgumentException(J4.i.b(i10, "Cannot find the wrapper for global view type "));
        }

        @Override // androidx.recyclerview.widget.S
        public final b b(B b10) {
            return new C0198a(b10);
        }
    }

    /* JADX INFO: compiled from: ViewTypeStorage.java */
    public interface b {
        int a(int i10);

        int b(int i10);
    }

    B a(int i10);

    b b(B b10);
}
