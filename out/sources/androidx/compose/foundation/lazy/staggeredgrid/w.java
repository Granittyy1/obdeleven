package androidx.compose.foundation.lazy.staggeredgrid;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
public interface w {

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    public static final class a implements w {
        @Override // androidx.compose.foundation.lazy.staggeredgrid.w
        public final int[] a(int i10, int i11) {
            int i12;
            int i13 = i10 - (2 * i11);
            int i14 = i13 / 3;
            int i15 = i13 % 3;
            int[] iArr = new int[3];
            int i16 = 0;
            while (i16 < 3) {
                if (i14 < 0) {
                    i12 = 0;
                } else {
                    i12 = (i16 < i15 ? 1 : 0) + i14;
                }
                iArr[i16] = i12;
                i16++;
            }
            return iArr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -3;
        }
    }

    int[] a(int i10, int i11);
}
