package androidx.compose.ui.window;

import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.y;
import p293xa.r;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidDialog_androidKt$DialogLayout$1 implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AndroidDialog_androidKt$DialogLayout$1 f15782a = new AndroidDialog_androidKt$DialogLayout$1();

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Y yQ = list.get(i11).Q(j);
            iJ = Math.max(iJ, yQ.f14220b);
            i10 = Math.max(i10, yQ.f14221c);
            arrayList.add(yQ);
        }
        if (list.isEmpty()) {
            iJ = p013b0.a.j(j);
            i10 = p013b0.a.i(j);
        }
        return h8.y1(iJ, i10, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Y> list2 = arrayList;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Y.a.g(aVar2, list2.get(i12), 0, 0);
                }
                return r.f47939a;
            }
        });
    }
}
