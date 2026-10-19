package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutBeyondBoundsState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0977l {
    public static final List<Integer> a(InterfaceC0985u interfaceC0985u, G g10, C0973h c0973h) {
        Na.i iVar;
        if (c0973h.f10720a.f12945d == 0 && g10.f10583b.isEmpty()) {
            return EmptyList.f42983b;
        }
        ArrayList arrayList = new ArrayList();
        androidx.compose.runtime.collection.c<C0973h.a> cVar = c0973h.f10720a;
        if (cVar.f12945d != 0) {
            int i10 = cVar.f12945d;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C0973h.a[] aVarArr = cVar.f12943b;
            int i11 = aVarArr[0].f10721a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = aVarArr[i12].f10721a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                p245u.c.a("negative minIndex");
            }
            int i14 = cVar.f12945d;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C0973h.a[] aVarArr2 = cVar.f12943b;
            int i15 = aVarArr2[0].f10722b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = aVarArr2[i16].f10722b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            iVar = new Na.i(i11, Math.min(i15, interfaceC0985u.b() - 1), 1);
        } else {
            iVar = Na.i.f4694e;
        }
        int size = g10.f10583b.size();
        for (int i18 = 0; i18 < size; i18++) {
            G.a aVar = (G.a) g10.get(i18);
            int iK = kotlinx.coroutines.C.k(aVar.getIndex(), interfaceC0985u, aVar.getKey());
            int i19 = iVar.f4687b;
            if ((iK > iVar.f4688c || i19 > iK) && iK >= 0 && iK < interfaceC0985u.b()) {
                arrayList.add(Integer.valueOf(iK));
            }
        }
        int i20 = iVar.f4687b;
        int i21 = iVar.f4688c;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }
}
