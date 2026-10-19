package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class U extends androidx.compose.ui.h.c implements androidx.compose.ui.relocation.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f14970p;

    @Override // androidx.compose.ui.relocation.a
    public final Object g1(NodeCoordinator nodeCoordinator, Ia.a aVar, ContinuationImpl continuationImpl) {
        long jG0 = nodeCoordinator.g0(0L);
        I.f fVar = (I.f) aVar.invoke();
        I.f fVarH = fVar != null ? fVar.h(jG0) : null;
        if (fVarH != null) {
            this.f14970p.requestRectangleOnScreen(androidx.compose.ui.graphics.g0.a(fVarH), false);
        }
        return p293xa.r.f47939a;
    }
}
