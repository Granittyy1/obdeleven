package androidx.compose.foundation.lazy.layout;

import androidx.collection.AbstractC0881i;
import androidx.collection.C0882j;
import java.util.ArrayList;

/* JADX INFO: compiled from: LazyLayoutStickyItems.kt */
/* JADX INFO: loaded from: classes.dex */
public interface X {

    /* JADX INFO: compiled from: LazyLayoutStickyItems.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0130a f10698a = new C0130a();

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.X$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyLayoutStickyItems.kt */
        public static final class C0130a implements X {
            @Override // androidx.compose.foundation.lazy.layout.X
            public final androidx.collection.A a(int i10, int i11, AbstractC0881i abstractC0881i) {
                int i12;
                if (i11 - i10 < 0 || (i12 = abstractC0881i.f9184b) == 0) {
                    return C0882j.f9185a;
                }
                Na.i iVarJ = Na.l.J(0, i12);
                int i13 = iVarJ.f4687b;
                int i14 = iVarJ.f4688c;
                int iA = -1;
                if (i13 <= i14) {
                    while (abstractC0881i.a(i13) <= i10) {
                        iA = abstractC0881i.a(i13);
                        if (i13 == i14) {
                            break;
                        }
                        i13++;
                    }
                }
                if (iA == -1) {
                    return C0882j.f9185a;
                }
                androidx.collection.A a10 = C0882j.f9185a;
                androidx.collection.A a11 = new androidx.collection.A(1);
                a11.c(iA);
                return a11;
            }

            @Override // androidx.compose.foundation.lazy.layout.X
            public final int b(ArrayList arrayList, int i10, int i11, int i12, int i13) {
                Object obj;
                int i14;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i15);
                    if (((z) obj).getIndex() != i10) {
                        break;
                    }
                    i15++;
                }
                z zVar = (z) obj;
                if (zVar != null) {
                    long jN = zVar.n(0);
                    i14 = (int) (zVar.l() ? jN & 4294967295L : jN >> 32);
                } else {
                    i14 = Integer.MIN_VALUE;
                }
                int iMax = i12 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i12);
                return i14 != Integer.MIN_VALUE ? Math.min(iMax, i14 - i11) : iMax;
            }
        }
    }

    androidx.collection.A a(int i10, int i11, AbstractC0881i abstractC0881i);

    int b(ArrayList arrayList, int i10, int i11, int i12, int i13);
}
