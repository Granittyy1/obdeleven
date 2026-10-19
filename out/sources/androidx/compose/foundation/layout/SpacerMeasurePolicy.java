package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: Spacer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SpacerMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SpacerMeasurePolicy f10214a = new SpacerMeasurePolicy();

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        return h8.y1(p013b0.a.f(j) ? p013b0.a.h(j) : 0, p013b0.a.e(j) ? p013b0.a.g(j) : 0, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.SpacerMeasurePolicy$measure$1$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                return p293xa.r.f47939a;
            }
        });
    }
}
