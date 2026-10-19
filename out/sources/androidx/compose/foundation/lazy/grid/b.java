package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    public static final class a implements b {
        @Override // androidx.compose.foundation.lazy.grid.b
        public final ArrayList a(int i10, int i11) {
            int i12 = i10 - (2 * i11);
            int i13 = i12 / 3;
            int i14 = i12 % 3;
            ArrayList arrayList = new ArrayList(3);
            int i15 = 0;
            while (i15 < 3) {
                arrayList.add(Integer.valueOf((i15 < i14 ? 1 : 0) + i13));
                i15++;
            }
            return arrayList;
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

    ArrayList a(int i10, int i11);
}
