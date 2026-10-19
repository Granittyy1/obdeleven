package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Y;
import java.util.List;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EmptyMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EmptyMeasurePolicy f11098a = new EmptyMeasurePolicy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ia.l<Y.a, p293xa.r> f11099b = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.text.EmptyMeasurePolicy$placementBlock$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar) {
            return p293xa.r.f47939a;
        }
    };

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        return h8.y1(p013b0.a.h(j), p013b0.a.g(j), kotlin.collections.y.p(), f11099b);
    }
}
