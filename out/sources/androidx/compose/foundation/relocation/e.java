package androidx.compose.foundation.relocation;

import I.f;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1197s;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B;
import p013b0.l;
import p293xa.r;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h.c implements androidx.compose.ui.relocation.a, InterfaceC1197s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ContentInViewNode f11026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11027q;

    public static final f Q1(e eVar, InterfaceC1170p interfaceC1170p, Ia.a aVar) {
        f fVar;
        if (!eVar.f13997o || !eVar.f11027q) {
            return null;
        }
        NodeCoordinator nodeCoordinatorE = C1185f.e(eVar);
        if (!interfaceC1170p.c()) {
            interfaceC1170p = null;
        }
        if (interfaceC1170p == null || (fVar = (f) aVar.invoke()) == null) {
            return null;
        }
        f fVarH = nodeCoordinatorE.H(interfaceC1170p, false);
        return fVar.h((((long) Float.floatToRawIntBits(fVarH.f3758b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fVarH.f3757a)) << 32));
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.relocation.a
    public final Object g1(final NodeCoordinator nodeCoordinator, final Ia.a aVar, ContinuationImpl continuationImpl) {
        Object objD = B.d(new BringIntoViewResponderNode$bringIntoView$2(this, nodeCoordinator, aVar, new Ia.a<f>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final f invoke() {
                f fVarQ1 = e.Q1(this.this$0, nodeCoordinator, aVar);
                if (fVarQ1 == null) {
                    return null;
                }
                ContentInViewNode contentInViewNode = this.this$0.f11026p;
                if (l.b(contentInViewNode.f9916x, 0L)) {
                    p245u.c.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return fVarQ1.h(contentInViewNode.V1(fVarQ1, contentInViewNode.f9916x) ^ (-9223372034707292160L));
            }
        }, null), continuationImpl);
        return objD == CoroutineSingletons.f43038b ? objD : r.f47939a;
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void o0(NodeCoordinator nodeCoordinator) {
        this.f11027q = true;
    }
}
