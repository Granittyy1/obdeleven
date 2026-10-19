package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LinksTextMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<Boolean> f11203a;

    public LinksTextMeasurePolicy(Ia.a<Boolean> aVar) {
        this.f11203a = aVar;
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, final List<? extends androidx.compose.ui.layout.D> list, long j) {
        return h8.y1(p013b0.a.h(j), p013b0.a.g(j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                ArrayList arrayListF = BasicTextKt.f(list, this.f11203a);
                if (arrayListF != null) {
                    int size = arrayListF.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Pair pair = (Pair) arrayListF.get(i10);
                        Y y10 = (Y) pair.a();
                        Ia.a aVar3 = (Ia.a) pair.b();
                        Y.a.f(aVar2, y10, aVar3 != null ? ((p013b0.j) aVar3.invoke()).f20484a : 0L);
                    }
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
