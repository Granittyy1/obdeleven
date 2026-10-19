package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C1079c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: androidx.compose.material.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1028d implements androidx.compose.foundation.gestures.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<Object> f11880b;

    /* JADX INFO: renamed from: androidx.compose.material.d$a */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class a implements androidx.compose.foundation.gestures.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Object> f11881a;

        public a(AnchoredDraggableState<Object> anchoredDraggableState) {
            this.f11881a = anchoredDraggableState;
        }

        @Override // androidx.compose.foundation.gestures.h
        public final void a(float f10) {
            AnchoredDraggableState<Object> anchoredDraggableState = this.f11881a;
            C1027c c1027c = anchoredDraggableState.f11680n;
            C1079c0 c1079c0 = anchoredDraggableState.j;
            c1027c.a(Na.l.C((Float.isNaN(c1079c0.j()) ? 0.0f : c1079c0.j()) + f10, anchoredDraggableState.d().b(), anchoredDraggableState.d().f()), 0.0f);
        }
    }

    public C1028d(AnchoredDraggableState<Object> anchoredDraggableState) {
        this.f11880b = anchoredDraggableState;
        this.f11879a = new a(anchoredDraggableState);
    }

    @Override // androidx.compose.foundation.gestures.i
    public final Object a(Ia.p pVar, kotlin.coroutines.c cVar) throws Throwable {
        Object objA = this.f11880b.a(MutatePriority.f9811c, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), (ContinuationImpl) cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }
}
