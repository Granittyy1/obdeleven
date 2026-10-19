package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Orientation f9950A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9951B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Ia.q<? super A, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> f9952C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Ia.q<? super A, ? super Float, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> f9953D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9954E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f9955z;

    public DraggableNode() {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object X1(Ia.p<? super Ia.l<? super f.b, p293xa.r>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        i iVar = this.f9955z;
        MutatePriority mutatePriority = MutatePriority.f9810b;
        Object objA = iVar.a(new DraggableNode$drag$2(pVar, this, null), cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void Y1(long j) {
        if (!this.f13997o || kotlin.jvm.internal.i.a(this.f9952C, DraggableKt.f9948a)) {
            return;
        }
        C2680e.c(E1(), null, CoroutineStart.f43169e, new DraggableNode$onDragStarted$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void Z1(long j) {
        if (!this.f13997o || kotlin.jvm.internal.i.a(this.f9953D, DraggableKt.f9949b)) {
            return;
        }
        C2680e.c(E1(), null, CoroutineStart.f43169e, new DraggableNode$onDragStopped$1(this, j, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean a2() {
        return this.f9951B;
    }
}
