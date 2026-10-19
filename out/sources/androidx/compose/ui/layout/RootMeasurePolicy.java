package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RootMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RootMeasurePolicy f14208b = new RootMeasurePolicy("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        int size = list.size();
        if (size == 0) {
            return h8.y1(p013b0.a.j(j), p013b0.a.i(j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar) {
                    return p293xa.r.f47939a;
                }
            });
        }
        if (size == 1) {
            final Y yQ = list.get(0).Q(j);
            return h8.y1(p013b0.b.g(yQ.f14220b, j), p013b0.b.f(yQ.f14221c, j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar) {
                    Y.a.h(aVar, yQ, 0, 0);
                    return p293xa.r.f47939a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            Y yQ2 = list.get(i10).Q(j);
            iMax = Math.max(yQ2.f14220b, iMax);
            iMax2 = Math.max(yQ2.f14221c, iMax2);
            arrayList.add(yQ2);
        }
        return h8.y1(p013b0.b.g(iMax, j), p013b0.b.f(iMax2, j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Y> list2 = arrayList;
                int size3 = list2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Y.a.h(aVar2, list2.get(i11), 0, 0);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
