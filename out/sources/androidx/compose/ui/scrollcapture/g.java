package androidx.compose.ui.scrollcapture;

import A8.p;
import Ia.l;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.q;
import androidx.compose.ui.semantics.s;
import java.util.function.Consumer;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.B;
import p013b0.k;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f0 f15125a = J0.f(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, s sVar, kotlin.coroutines.e eVar, Consumer consumer) {
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new h[16]);
        i.a(sVar.a(), 0, new ScrollCapture$onScrollCaptureSearch$1(1, cVar, androidx.compose.runtime.collection.c.class, "add", "add(Ljava/lang/Object;)Z", 8));
        cVar.s(new p317za.a(new l[]{new l<h, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // Ia.l
            public final Comparable<?> invoke(h hVar) {
                return Integer.valueOf(hVar.f15127b);
            }
        }, new l<h, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // Ia.l
            public final Comparable<?> invoke(h hVar) {
                return Integer.valueOf(hVar.f15128c.b());
            }
        }}));
        int i10 = cVar.f12945d;
        h hVar = (h) (i10 == 0 ? null : cVar.f12943b[i10 - 1]);
        if (hVar == null) {
            return;
        }
        kotlinx.coroutines.internal.f fVarA = B.a(eVar);
        q qVar = hVar.f15126a;
        k kVar = hVar.f15128c;
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(qVar, kVar, fVarA, this, androidComposeView);
        NodeCoordinator nodeCoordinator = hVar.f15129d;
        I.f fVarH = n.h(nodeCoordinator).H(nodeCoordinator, true);
        long jC = kVar.c();
        ScrollCaptureTarget scrollCaptureTargetC = f.c(androidComposeView, g0.b(p.D(fVarH)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), composeScrollCaptureCallback);
        scrollCaptureTargetC.setScrollBounds(g0.b(kVar));
        consumer.accept(scrollCaptureTargetC);
    }
}
