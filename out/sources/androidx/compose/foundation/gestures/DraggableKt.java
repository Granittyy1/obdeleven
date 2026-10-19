package androidx.compose.foundation.gestures;

import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DraggableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ia.q<A, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> f9948a = new DraggableKt$NoOpOnDragStarted$1(3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ia.q<A, Float, kotlin.coroutines.c<? super p293xa.r>, Object> f9949b = new DraggableKt$NoOpOnDragStopped$1(3, null);

    public static androidx.compose.ui.h a(androidx.compose.ui.h hVar, i iVar, Orientation orientation, boolean z10, androidx.compose.foundation.interaction.k kVar, boolean z11, Ia.q qVar, boolean z12, int i10) {
        return hVar.i(new DraggableElement(iVar, orientation, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? null : kVar, (i10 & 16) != 0 ? false : z11, f9948a, qVar, (i10 & 128) != 0 ? false : z12));
    }
}
