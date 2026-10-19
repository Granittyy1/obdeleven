package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HoverableNode extends androidx.compose.ui.h.c implements Y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.compose.foundation.interaction.k f9768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.foundation.interaction.g f9769q;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object Q1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        androidx.compose.foundation.interaction.g gVar;
        hoverableNode.getClass();
        if (continuationImpl instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuationImpl;
            int i10 = hoverableNode$emitEnter$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.label = i10 - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(hoverableNode, continuationImpl);
            }
        } else {
            hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(hoverableNode, continuationImpl);
        }
        Object obj = hoverableNode$emitEnter$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = hoverableNode$emitEnter$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (hoverableNode.f9769q == null) {
                gVar = new androidx.compose.foundation.interaction.g();
                androidx.compose.foundation.interaction.k kVar = hoverableNode.f9768p;
                hoverableNode$emitEnter$1.L$0 = hoverableNode;
                hoverableNode$emitEnter$1.L$1 = gVar;
                hoverableNode$emitEnter$1.label = 1;
                if (kVar.c(gVar, hoverableNode$emitEnter$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        androidx.compose.foundation.interaction.g gVar2 = (androidx.compose.foundation.interaction.g) hoverableNode$emitEnter$1.L$1;
        HoverableNode hoverableNode2 = (HoverableNode) hoverableNode$emitEnter$1.L$0;
        kotlin.b.b(obj);
        gVar = gVar2;
        hoverableNode = hoverableNode2;
        hoverableNode.f9769q = gVar;
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object R1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        hoverableNode.getClass();
        if (continuationImpl instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuationImpl;
            int i10 = hoverableNode$emitExit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(hoverableNode, continuationImpl);
            }
        } else {
            hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(hoverableNode, continuationImpl);
        }
        Object obj = hoverableNode$emitExit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = hoverableNode$emitExit$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.interaction.g gVar = hoverableNode.f9769q;
            if (gVar != null) {
                androidx.compose.foundation.interaction.h hVar = new androidx.compose.foundation.interaction.h(gVar);
                androidx.compose.foundation.interaction.k kVar = hoverableNode.f9768p;
                hoverableNode$emitExit$1.L$0 = hoverableNode;
                hoverableNode$emitExit$1.label = 1;
                if (kVar.c(hVar, hoverableNode$emitExit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hoverableNode = (HoverableNode) hoverableNode$emitExit$1.L$0;
        kotlin.b.b(obj);
        hoverableNode.f9769q = null;
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        S1();
    }

    public final void S1() {
        androidx.compose.foundation.interaction.g gVar = this.f9769q;
        if (gVar != null) {
            this.f9768p.a(new androidx.compose.foundation.interaction.h(gVar));
            this.f9769q = null;
        }
    }

    @Override // androidx.compose.ui.node.Y
    public final void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.f14030c) {
            int i10 = jVar.f14094d;
            if (androidx.compose.ui.input.pointer.k.a(i10, 4)) {
                C2680e.c(E1(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (androidx.compose.ui.input.pointer.k.a(i10, 5)) {
                C2680e.c(E1(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        S1();
    }
}
