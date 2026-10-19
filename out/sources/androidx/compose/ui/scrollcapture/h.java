package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.q;
import p013b0.k;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NodeCoordinator f15129d;

    public h(q qVar, int i10, k kVar, NodeCoordinator nodeCoordinator) {
        this.f15126a = qVar;
        this.f15127b = i10;
        this.f15128c = kVar;
        this.f15129d = nodeCoordinator;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f15126a + ", depth=" + this.f15127b + ", viewportBoundsInWindow=" + this.f15128c + ", coordinates=" + this.f15129d + ')';
    }
}
