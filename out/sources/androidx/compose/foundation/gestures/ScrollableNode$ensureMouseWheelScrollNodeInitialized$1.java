package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends AdaptedFunctionReference implements Ia.p<p013b0.p, kotlin.coroutines.c<? super p293xa.r>, Object> {
    public final Object a(long j) {
        ScrollableNode scrollableNode = (ScrollableNode) this.receiver;
        C2680e.c(scrollableNode.f9975B.c(), null, null, new ScrollableNode$onWheelScrollStopped$1(scrollableNode, j, null), 3);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final /* synthetic */ Object invoke(p013b0.p pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return a(pVar.f20496a);
    }
}
