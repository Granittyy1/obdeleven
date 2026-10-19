package androidx.compose.foundation;

import androidx.compose.ui.layout.X;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.P;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements Ia.p<androidx.compose.ui.focus.y, androidx.compose.ui.focus.y, p293xa.r> {
    public final void h(androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2) {
        boolean zB;
        q qVarU1;
        FocusableNode focusableNode = (FocusableNode) this.receiver;
        if (focusableNode.f13997o && (zB = yVar2.b()) != yVar.b()) {
            Ia.l<Boolean, p293xa.r> lVar = focusableNode.f9761s;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(zB));
            }
            if (zB) {
                C2680e.c(focusableNode.E1(), null, null, new FocusableNode$onFocusStateChange$1(focusableNode, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                P.a(focusableNode, new FocusableNode$retrievePinnableContainer$1(ref$ObjectRef, focusableNode));
                X x10 = (X) ref$ObjectRef.element;
                focusableNode.f9763u = x10 != null ? x10.b() : null;
                NodeCoordinator nodeCoordinator = focusableNode.f9764v;
                if (nodeCoordinator != null && nodeCoordinator.v1().f13997o && (qVarU1 = focusableNode.U1()) != null) {
                    qVarU1.Q1(focusableNode.f9764v);
                }
            } else {
                X.a aVar = focusableNode.f9763u;
                if (aVar != null) {
                    aVar.a();
                }
                focusableNode.f9763u = null;
                q qVarU2 = focusableNode.U1();
                if (qVarU2 != null) {
                    qVarU2.Q1(null);
                }
            }
            C1185f.f(focusableNode).P();
            androidx.compose.foundation.interaction.k kVar = focusableNode.f9760r;
            if (kVar != null) {
                if (!zB) {
                    androidx.compose.foundation.interaction.d dVar = focusableNode.f9762t;
                    if (dVar != null) {
                        focusableNode.T1(kVar, new androidx.compose.foundation.interaction.e(dVar));
                        focusableNode.f9762t = null;
                        return;
                    }
                    return;
                }
                androidx.compose.foundation.interaction.d dVar2 = focusableNode.f9762t;
                if (dVar2 != null) {
                    focusableNode.T1(kVar, new androidx.compose.foundation.interaction.e(dVar2));
                    focusableNode.f9762t = null;
                }
                androidx.compose.foundation.interaction.d dVar3 = new androidx.compose.foundation.interaction.d();
                focusableNode.T1(kVar, dVar3);
                focusableNode.f9762t = dVar3;
            }
        }
    }

    @Override // Ia.p
    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2) {
        h(yVar, yVar2);
        return p293xa.r.f47939a;
    }
}
