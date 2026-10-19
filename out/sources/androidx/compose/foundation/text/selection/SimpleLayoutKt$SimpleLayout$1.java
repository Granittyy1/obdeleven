package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SimpleLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleLayoutKt$SimpleLayout$1 implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleLayoutKt$SimpleLayout$1 f11551a = new SimpleLayoutKt$SimpleLayout$1();

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Y yQ = list.get(i10).Q(j);
            iMax = Math.max(iMax, yQ.f14220b);
            iMax2 = Math.max(iMax2, yQ.f14221c);
            arrayList.add(yQ);
        }
        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Y> list2 = arrayList;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    aVar2.d(list2.get(i11), 0, 0, 0.0f);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
