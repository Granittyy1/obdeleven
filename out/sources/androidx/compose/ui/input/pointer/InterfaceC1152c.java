package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.Y0;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1152c extends p013b0.c {
    Object K(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl);

    j P();

    default long Y0() {
        return 0L;
    }

    long a();

    default Object d0(long j, Ia.p pVar, ContinuationImpl continuationImpl) {
        return pVar.invoke(this, continuationImpl);
    }

    Y0 getViewConfiguration();

    default <T> Object z0(long j, Ia.p<? super InterfaceC1152c, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super T> cVar) {
        return pVar.invoke(this, cVar);
    }
}
